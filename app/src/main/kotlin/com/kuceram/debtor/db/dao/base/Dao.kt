package com.kuceram.debtor.db.dao.base

import android.database.sqlite.SQLiteDatabase
import com.kuceram.debtor.db.AppOpenHelper

/**
 * Created by Michal on 13.01.2017.
 */
abstract class Dao() {

    private var helper: AppOpenHelper? = null

    abstract fun onCreate(db: SQLiteDatabase)

    abstract fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int)



}