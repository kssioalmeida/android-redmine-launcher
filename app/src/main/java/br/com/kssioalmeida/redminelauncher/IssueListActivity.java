package br.com.kssioalmeida.redminelauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class IssueListActivity extends AppCompatActivity implements IssueListContract.View {

    @BindView(R.id.recyclerview)
    RecyclerView issueList;

    private IssueListAdapter mAdapter;
    private IssueListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);
        ButterKnife.bind(this);

        presenter = new IssueListPresenter();
        presenter.setView(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.loadIssues();
    }

    @Override
    public void setupIssueList(List list){
        LinearLayoutManager layoutManger = new LinearLayoutManager(this);
        mAdapter = new IssueListAdapter(list);

        issueList.setLayoutManager(layoutManger);
        issueList.setAdapter(mAdapter);
    }

    @Override
    public void showWaitingLayout() {

    }

    @Override
    public void showErrorLayout() {

    }

    @Override
    public void showSuccessLayout() {

    }

    @Override
    public void updateList(List list){

    }
}
