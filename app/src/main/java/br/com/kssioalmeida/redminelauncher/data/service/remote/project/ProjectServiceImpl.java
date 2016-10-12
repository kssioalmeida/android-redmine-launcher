package br.com.kssioalmeida.redminelauncher.data.service.remote.project;

import br.com.kssioalmeida.redminelauncher.data.entity.Project;
import br.com.kssioalmeida.redminelauncher.data.service.remote.BaseService;
import rx.Observable;

/**
 * Created by calmeida on 10/2/16.
 */

public class ProjectServiceImpl extends BaseService {

    private IProjectService projectService;

    public static ProjectServiceImpl create(){
        return new ProjectServiceImpl();
    }

    private ProjectServiceImpl(){
        projectService = build().create(IProjectService.class);
    }

    public Observable<RedmineProject> getProjects(){
        return projectService.list();
    }

    public Observable<Project> getProject(int id){
        return projectService.get(id);
    }
}
