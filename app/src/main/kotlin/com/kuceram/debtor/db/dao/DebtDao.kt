package com.kuceram.debtor.db.dao

import android.database.sqlite.SQLiteDatabase
import com.kuceram.debtor.db.dao.base.BaseDao
import com.kuceram.debtor.domain.Debt

/**
 * Created by Michal on 13.01.2017.
 */
class DebtDao() : BaseDao<Debt>() {
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(db: SQLiteDatabase) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}