package br.com.kssioalmeida.redminelauncher.data.service.remote.status;

import br.com.kssioalmeida.redminelauncher.data.service.remote.BaseService;
import rx.Observable;

/**
 * Created by Cassio on 12/10/2016.
 */

public class StatusServiceImpl extends BaseService {

    private IStatusService statusService;

    public static StatusServiceImpl create(){
        return new StatusServiceImpl();
    }

    private StatusServiceImpl(){
        statusService = build().create(IStatusService.class);
    }

    public Observable<RedmineStatus> getStatuses(){
        return statusService.getStatuses();
    }
}
