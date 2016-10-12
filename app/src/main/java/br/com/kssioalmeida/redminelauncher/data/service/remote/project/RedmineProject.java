package br.com.kssioalmeida.redminelauncher.data.service.remote.project;

import java.util.List;

import br.com.kssioalmeida.redminelauncher.data.entity.Project;

/**
 * Created by calmeida on 10/2/16.
 */

public class RedmineProject {

    private List<Project> projects;

    private Project project;

    public List<Project> getProjects(){
        return projects;
    }

    public Project getProject(){
        return project;
    }

}
