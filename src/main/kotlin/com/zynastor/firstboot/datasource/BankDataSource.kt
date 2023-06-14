package com.zynastor.firstboot.datasource

import com.zynastor.firstboot.model.Bank

interface BankDataSource {
    fun retrieveBanks():Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
    fun deleteBank(accountNumber: String)
}