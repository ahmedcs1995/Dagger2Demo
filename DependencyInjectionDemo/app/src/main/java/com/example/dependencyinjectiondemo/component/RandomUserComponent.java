package com.example.dependencyinjectiondemo.component;


import com.example.dependencyinjectiondemo.interfaces.RandomUserApplicationScope;
import com.example.dependencyinjectiondemo.interfaces.RandomUsersApi;
import com.example.dependencyinjectiondemo.module.PicassoModule;
import com.example.dependencyinjectiondemo.module.RandomUsersModule;
import com.squareup.picasso.Picasso;
import dagger.Component;

/**
 * Created by Hari on 23/11/17.
 */
@RandomUserApplicationScope
@Component(modules = {RandomUsersModule.class, PicassoModule.class})
public interface RandomUserComponent {

    RandomUsersApi getRandomUserService();

    Picasso getPicasso();
}
