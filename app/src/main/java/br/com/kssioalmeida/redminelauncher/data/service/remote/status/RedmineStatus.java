package br.com.kssioalmeida.redminelauncher.data.service.remote.status;

import java.util.List;

import br.com.kssioalmeida.redminelauncher.data.entity.Status;

/**
 * Created by Cassio on 12/10/2016.
 */

public class RedmineStatus {
    private List<Status> issueStatuses;

    public List<Status> getStatuses(){
        return issueStatuses;
    }
}
