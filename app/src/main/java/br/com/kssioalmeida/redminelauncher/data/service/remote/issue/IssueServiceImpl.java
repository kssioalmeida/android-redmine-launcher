package br.com.kssioalmeida.redminelauncher.data.service.remote.issue;

import br.com.kssioalmeida.redminelauncher.data.service.remote.BaseService;
import retrofit2.http.Header;
import rx.Observable;

/**
 * Created by calmeida on 10/10/16.
 */

public class IssueServiceImpl extends BaseService {

    private IIssueService issueService;

    public static IssueServiceImpl create() {
        return new IssueServiceImpl();
    }

    private IssueServiceImpl() {
        issueService = build().create(IIssueService.class);
    }

    public Observable<RedmineIssue> getIssues() {
        return issueService.list();
    }

    public Observable<RedmineIssue> getIssues(int projectId) {
        return issueService.list(projectId);
    }

    public Observable<RedmineIssue> getIssue(int id){
        return issueService.get(id);
    }
}
