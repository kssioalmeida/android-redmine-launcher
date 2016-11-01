package br.com.kssioalmeida.redminelauncher.dagger.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Cassio on 30/10/2016.
 */
@Module
public class ApplicationModule {
    private Application application;

    public ApplicationModule(Application app){
        application = app;
    }

    @Provides
    @Singleton
    Application providesApplication(){
        return application;
    }

    @Provides
    @Singleton
    Context providesContext(Application application) {
        return application.getBaseContext();
    }
}
