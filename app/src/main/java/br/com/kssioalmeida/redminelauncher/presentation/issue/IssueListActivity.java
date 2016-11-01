package br.com.kssioalmeida.redminelauncher.presentation.issue;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.List;

import javax.inject.Inject;

import br.com.kssioalmeida.redminelauncher.R;
import br.com.kssioalmeida.redminelauncher.presentation.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class IssueListActivity extends BaseActivity implements IssueListContract.View, View.OnClickListener {

    @BindView(R.id.recyclerview)
    RecyclerView issueList;

    @BindView(R.id.listIssueContainer)
    LinearLayout listContainer;

    @BindView(R.id.waitingIssueLayout)
    LinearLayout waitingLayout;

    @BindView(R.id.errorIssueLayout)
    LinearLayout errorIssueLayout;

    @BindView(R.id.buttonTryAgain)
    Button btnTryAgain;

    @BindView(R.id.buttonMoreDetails)
    Button btnMoreDetails;

    private IssueListAdapter mAdapter;

    @Inject
    IssueListContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);
        ButterKnife.bind(this);
        getUIComponent().inject(this);

        presenter.setView(this);

        btnTryAgain.setOnClickListener(this);
        btnMoreDetails.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.loadIssues();
    }

    @Override
    public void setupIssueList(List list) {
        LinearLayoutManager layoutManger = new LinearLayoutManager(this);
        mAdapter = new IssueListAdapter(list);

        issueList.setLayoutManager(layoutManger);
        issueList.setAdapter(mAdapter);
    }

    @Override
    public void showWaitingLayout() {
        listContainer.setVisibility(View.GONE);
        waitingLayout.setVisibility(View.VISIBLE);
        errorIssueLayout.setVisibility(View.GONE);
    }

    @Override
    public void showErrorLayout() {
        listContainer.setVisibility(View.GONE);
        waitingLayout.setVisibility(View.GONE);
        errorIssueLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void showSuccessLayout() {
        listContainer.setVisibility(View.VISIBLE);
        waitingLayout.setVisibility(View.GONE);
        errorIssueLayout.setVisibility(View.GONE);
    }

    @Override
    public void updateList(List list) {

    }

    @Override
    public void showAlertDialog(String title, String message) {
        new AlertDialog.Builder(IssueListActivity.this)
                .setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("OK", null)
                .create().show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonTryAgain:
                presenter.loadIssues();
                break;
            case R.id.buttonMoreDetails:
                presenter.onErrorMoreDetails();
                break;
        }
    }
}
