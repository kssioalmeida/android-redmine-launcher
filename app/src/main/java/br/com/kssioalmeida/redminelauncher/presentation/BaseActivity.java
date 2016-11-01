package br.com.kssioalmeida.redminelauncher.presentation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import br.com.kssioalmeida.redminelauncher.MainApplication;
import br.com.kssioalmeida.redminelauncher.dagger.UIComponent;

/**
 * Created by Cassio on 30/10/2016.
 */

public class BaseActivity extends AppCompatActivity{
    private UIComponent component;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        component = getMainComponent().getMainComponent().uiComponent();
    }

    protected MainApplication getMainComponent(){
        return ((MainApplication) getApplication());
    }

    protected UIComponent getUIComponent(){
        return component;
    }

}
