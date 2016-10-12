package br.com.kssioalmeida.redminelauncher.data.service.remote;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by calmeida on 10/2/16.
 */

public class BaseService {

    private final String BASE_URL = "http://192.168.2.10:3000/";

    protected Retrofit build() {

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(authInterceptor())
                .addInterceptor(httpLoggingInterceptor())
                .build();

        return new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gsonBuild()))
                .client(client)
                .baseUrl(BASE_URL).build();
    }

    private Gson gsonBuild() {

        return new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
    }

    private Interceptor httpLoggingInterceptor() {

        return new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    private Interceptor authInterceptor() {

        return chain -> {
            Request original = chain.request();
            Request request = original.newBuilder()
                    .addHeader("X-Redmine-API-Key", "d4d1b4b5e2200bad9c40c56f8e48fa70e511d5c3")
                    .method(original.method(), original.body())
                    .build();

            return chain.proceed(request);
        };
    }
}
