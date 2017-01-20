package com.kuceram.debtor.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.kuceram.debtor.db.dao.base.BaseDao
import com.kuceram.debtor.db.dao.base.Dao
import java.util.*

/**
 * Created by Michal on 13.01.2017.
 */

class AppOpenHelper(context: Context) : SQLiteOpenHelper(context, "debtor.db", null, 1) {

    private val daoList : List<Dao> = ArrayList()


    override fun onCreate(db: SQLiteDatabase) {
        daoList.forEach { i -> i.onCreate(db) }
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        daoList.forEach { i -> i.onUpgrade(db, oldVersion, newVersion) }
    }
}
