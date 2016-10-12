package br.com.kssioalmeida.redminelauncher;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.kssioalmeida.redminelauncher.data.entity.Issue;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by calmeida on 10/10/16.
 */

public class IssueListAdapter extends RecyclerView.Adapter<IssueListAdapter.ViewHolder> {

    private List<Issue> issues;

    public IssueListAdapter(List list) {
        issues = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.issues_project, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Issue issue = issues.get(position);

        holder.subject.setText(issue.getSubject());
        holder.id.setText("#" + issue.getId());
        holder.status.setText("Ainda não");
        holder.updatedOn.setText(issue.getStartDate());
    }

    @Override
    public int getItemCount() {
        return issues.size();
    }

    public void updateList(List list) {
        issues = list;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.subject)
        TextView subject;

        @BindView(R.id.id_issue)
        TextView id;

        @BindView(R.id.status)
        TextView status;

        @BindView(R.id.updated_on)
        TextView updatedOn;

        ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }
}
