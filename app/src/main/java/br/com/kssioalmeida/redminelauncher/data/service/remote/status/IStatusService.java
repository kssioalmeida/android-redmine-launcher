package br.com.kssioalmeida.redminelauncher.data.service.remote.status;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Cassio on 12/10/2016.
 */

public interface IStatusService {

    @GET("issue_statuses.json")
    Observable<RedmineStatus> getStatuses();
}
