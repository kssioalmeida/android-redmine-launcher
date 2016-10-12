package br.com.kssioalmeida.redminelauncher.data.service.remote.issue;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by calmeida on 10/2/16.
 */

public interface IIssueService {

    @GET("issues.json")
    Observable<RedmineIssue> list();

    @GET("issues.json")
    Observable<RedmineIssue> list(@Query("project_id") int id);

    @GET("issue/{id}.json")
    Observable<RedmineIssue> get(@Path("id") int id);
}
