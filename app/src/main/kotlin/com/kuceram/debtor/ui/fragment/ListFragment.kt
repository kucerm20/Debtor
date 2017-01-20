package com.kuceram.debtor.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kuceram.debtor.R
import com.kuceram.debtor.ui.adapter.ListAdapter
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * Created by Michal on 12.01.2017.
 */

class ListFragment : Fragment() {

    var adapter: ListAdapter = ListAdapter()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.adapter = adapter
    }



}
