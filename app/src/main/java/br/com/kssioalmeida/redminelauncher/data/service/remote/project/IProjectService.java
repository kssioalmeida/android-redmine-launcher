package br.com.kssioalmeida.redminelauncher.data.service.remote.project;

import br.com.kssioalmeida.redminelauncher.data.entity.Project;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by calmeida on 10/2/16.
 */

public interface IProjectService {

    @GET("projects.json")
    Observable<RedmineProject> list();

    @GET("projects.json")
    Observable<Project> get(@Query("offset") int offset, @Query("limit") int limit);

    @GET("projects/{id}.json")
    Observable<Project> get(@Path("id") int id);

}
