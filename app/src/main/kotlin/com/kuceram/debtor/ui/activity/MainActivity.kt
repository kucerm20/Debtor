package com.kuceram.debtor.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kuceram.debtor.R
import kotlinx.android.synthetic.main.activity_main.*


/**
 * Created by Michal on 12.01.2017.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        toolbar.setTitle(R.string.title_list)

        if (savedInstanceState == null) {
            addBaseFragment()
        }
    }

    fun addBaseFragment() {

    }
}