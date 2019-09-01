package com.example.dependencyinjectiondemo.module;

import android.content.Context;
import com.example.dependencyinjectiondemo.interfaces.ApplicationContext;
import com.example.dependencyinjectiondemo.interfaces.RandomUserApplicationScope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Hari on 23/11/17.
 */
@Module
public class ContextModule {

    Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @ApplicationContext
    @RandomUserApplicationScope
    @Provides
    public Context context(){ return context.getApplicationContext(); }
}
