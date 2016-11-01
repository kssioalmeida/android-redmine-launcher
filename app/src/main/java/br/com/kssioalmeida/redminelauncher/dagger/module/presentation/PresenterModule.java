package br.com.kssioalmeida.redminelauncher.dagger.module.presentation;

import br.com.kssioalmeida.redminelauncher.presentation.issue.IssueListContract;
import br.com.kssioalmeida.redminelauncher.presentation.issue.IssueListPresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Cassio on 30/10/2016.
 */

@Module
public class PresenterModule {

    @Provides
    IssueListContract.Presenter providesIssueListPresenter(){
        return new IssueListPresenter();
    }

}
