package com.kuceram.debtor.di.module

import android.database.sqlite.SQLiteOpenHelper
import com.kuceram.debtor.DebtorApp
import com.kuceram.debtor.db.AppOpenHelper
import com.squareup.sqlbrite.BriteDatabase
import com.squareup.sqlbrite.SqlBrite
import dagger.Module
import dagger.Provides
import rx.schedulers.Schedulers

/**
 * Created by Michal on 13.01.2017.
 */
@Module
class AppModule(app: DebtorApp) {

    private val application: DebtorApp = app

    private var db: BriteDatabase

    init {
        val sqlBrite : SqlBrite = SqlBrite.Builder().build()
        db = sqlBrite.wrapDatabaseHelper(AppOpenHelper(app), Schedulers.io())
    }

    @Provides
    fun provideSqlBriteDatabase(): BriteDatabase {
        return db;
    }

}