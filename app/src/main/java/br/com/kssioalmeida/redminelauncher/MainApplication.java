package br.com.kssioalmeida.redminelauncher;

import android.app.Application;

import br.com.kssioalmeida.redminelauncher.dagger.DaggerMainComponent;
import br.com.kssioalmeida.redminelauncher.dagger.MainComponent;
import br.com.kssioalmeida.redminelauncher.dagger.module.ApplicationModule;


/**
 * Created by Cassio on 30/10/2016.
 */

public class MainApplication extends Application {

    private MainComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        setUpDagger();
    }

    private void setUpDagger() {
        component = DaggerMainComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public MainComponent getMainComponent() {
        return component;
    }
}
