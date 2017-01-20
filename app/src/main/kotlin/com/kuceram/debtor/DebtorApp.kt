package com.kuceram.debtor

import android.app.Application
import com.kuceram.debtor.di.ApplicationComponent
import com.kuceram.debtor.di.DaggerApplicationComponent
import com.kuceram.debtor.di.module.AppModule

/**
 * Created by Michal on 12.01.2017.
 */
class DebtorApp : Application() {

    private var component: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()

        component = DaggerApplicationComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }
}