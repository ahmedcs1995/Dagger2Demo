package com.example.dependencyinjectiondemo.interfaces;

import javax.inject.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Hari on 23/11/17.
 */
@Scope
@Retention(RetentionPolicy.CLASS)
public @interface RandomUserApplicationScope {

}
