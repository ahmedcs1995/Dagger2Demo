package com.example.dependencyinjectiondemo.module;

import android.app.Activity;
import android.content.Context;
import com.example.dependencyinjectiondemo.interfaces.RandomUserApplicationScope;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

/**
 * Created by Hari on 23/11/17.
 */
@Module
public class ActivityModule {

    private final Context context;

    ActivityModule(Activity context){
        this.context = context;
    }

    @Named("activity_context")
    @RandomUserApplicationScope
    @Provides
    public Context context(){ return context; }
}
