package com.kuceram.debtor.domain

import java.util.Date

/**
 * Created by Michal on 12.01.2017.
 */
data class Debt(var id: Long, var customer: Customer, var price: Long = 0, var createdAt: Date, var what: String, var description: String, var paid: Boolean, var paidAt: Date)