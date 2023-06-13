package com.zynastor.firstboot.service

import com.zynastor.firstboot.datasource.BankDataSource
import com.zynastor.firstboot.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()



    fun getBank(accountNumber: String): Bank =dataSource.retrieveBank(accountNumber)
}
