package br.com.kssioalmeida.redminelauncher.data.service.remote.issue;

import java.util.List;

import br.com.kssioalmeida.redminelauncher.data.entity.Issue;

/**
 * Created by calmeida on 10/10/16.
 */

public class RedmineIssue {

    private List<Issue> issues;

    private Issue issue;

    public List<Issue> getList() {
        return issues;
    }

    public Issue getIssue() {
        return issue;
    }
}
