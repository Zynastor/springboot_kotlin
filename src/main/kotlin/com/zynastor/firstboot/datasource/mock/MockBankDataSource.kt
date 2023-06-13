package com.zynastor.firstboot.datasource.mock

import com.zynastor.firstboot.datasource.BankDataSource
import com.zynastor.firstboot.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("5678", 0.0, 100)
    )
    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBank(accountNumber: String): Bank {
        TODO("Not yet implemented")
    }

}