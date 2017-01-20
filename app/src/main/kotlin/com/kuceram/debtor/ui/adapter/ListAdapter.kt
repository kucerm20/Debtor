package com.kuceram.debtor.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.kuceram.debtor.domain.Debt

/**
 * Created by Michal on 12.01.2017.
 */
class ListAdapter : RecyclerView.Adapter<DebtViewHolder>() {

    var items: List<Debt>? = null

    override fun getItemCount(): Int {
        return items?.size ?: 0
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DebtViewHolder {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: DebtViewHolder?, position: Int) {
        holder!!.showDebt(items?.get(position))
    }

}

class DebtViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun showDebt(debt: Debt?) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
