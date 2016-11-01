package br.com.kssioalmeida.redminelauncher.dagger;

import br.com.kssioalmeida.redminelauncher.dagger.module.presentation.PresenterModule;
import br.com.kssioalmeida.redminelauncher.dagger.scope.PerActivity;
import br.com.kssioalmeida.redminelauncher.presentation.issue.IssueListActivity;
import dagger.Subcomponent;

/**
 * Created by Cassio on 30/10/2016.
 */
@PerActivity
@Subcomponent(modules = {PresenterModule.class})
public interface UIComponent {
    void inject(IssueListActivity activity);
}
