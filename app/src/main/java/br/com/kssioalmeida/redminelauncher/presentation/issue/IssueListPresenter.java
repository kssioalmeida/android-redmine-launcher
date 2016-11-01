package br.com.kssioalmeida.redminelauncher.presentation.issue;

import br.com.kssioalmeida.redminelauncher.data.service.remote.issue.IssueServiceImpl;
import br.com.kssioalmeida.redminelauncher.helper.Logger;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by calmeida on 10/10/16.
 */

public class IssueListPresenter implements IssueListContract.Presenter {

    private IssueListContract.View view;

    private String lastError = "";

    private Subscription subscription;

    @Override
    public void setView(IssueListContract.View view) {
        this.view = view;
    }

    @Override
    public void loadIssues() {
        view.showWaitingLayout();

        if (subscription != null)
            subscription.unsubscribe();

        subscription = IssueServiceImpl.create().getIssues(1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnError(throwable -> {
                    Logger.debug(throwable.getMessage());

                    lastError = throwable.getMessage();
                    view.showErrorLayout();
                })
                .subscribe(
                        issues -> {
                            view.setupIssueList(issues.getList());
                            view.showSuccessLayout();
                        },
                        Throwable::printStackTrace
                );
    }

    @Override
    public void updateList() {

    }

    @Override
    public void onErrorMoreDetails() {
        Logger.debug("onErrorMoreDetails");
        view.showAlertDialog("Error", lastError);
    }
}
