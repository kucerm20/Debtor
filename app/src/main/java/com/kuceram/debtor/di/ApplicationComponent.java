package com.kuceram.debtor.di;

import com.kuceram.debtor.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Michal on 13.01.2017.
 */

@Singleton
@Component(modules = AppModule.class)
public interface ApplicationComponent {

}
