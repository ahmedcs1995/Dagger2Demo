package com.example.dagger2demo.component;


import com.example.dagger2demo.interfaces.ApiInterface;
import com.example.dagger2demo.interfaces.ApplicationScope;
import com.example.dagger2demo.module.RetrofitModule;

import dagger.Component;


@ApplicationScope
@Component(modules = {RetrofitModule.class})
public interface AppComponent {

    ApiInterface getApiService();

}
