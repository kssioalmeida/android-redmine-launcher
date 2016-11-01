package br.com.kssioalmeida.redminelauncher.dagger;

import br.com.kssioalmeida.redminelauncher.dagger.module.ApplicationModule;
import br.com.kssioalmeida.redminelauncher.dagger.module.network.NetworkModule;
import dagger.Component;

/**
 * Created by Cassio on 30/10/2016.
 */
@Component(modules = {
        ApplicationModule.class,
        NetworkModule.class
})
public interface MainComponent {
    UIComponent uiComponent();
}
