package com.zynastor.firstboot.datasource.network.dto

import com.zynastor.firstboot.model.Bank

data class BankList(
    val results: Collection<Bank>
) {
}