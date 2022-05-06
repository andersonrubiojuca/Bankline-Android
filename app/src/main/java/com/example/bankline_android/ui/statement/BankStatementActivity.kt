package com.example.bankline_android.ui.statement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bankline_android.databinding.ActivityBankStatementBinding
import com.example.bankline_android.domain.Correntista
import com.example.bankline_android.domain.Movimentacao
import com.example.bankline_android.domain.TipoMovimentacao
import java.lang.IllegalArgumentException

class BankStatementActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ACCOUNT_HOLDER = "com.example.bankline_android.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }

    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }

    private val accoutntHolder by lazy {
        intent.getParcelableExtra<Correntista>(EXTRA_ACCOUNT_HOLDER) ?: throw IllegalArgumentException()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvBankStatement.layoutManager = LinearLayoutManager(this)

        findBankStatement()
    }

    private fun findBankStatement() {
        val dataSet = ArrayList<Movimentacao>()
        dataSet.add(Movimentacao(1, "05/05/2022 09:24:55", "LOREN IPSUN", 1000.0, tipo = TipoMovimentacao.RECEITA, 1))
        dataSet.add(Movimentacao(1, "05/05/2022 09:24:55", "LOREN IPSUN", 1000.0, tipo = TipoMovimentacao.DESPESA, 1))
        dataSet.add(Movimentacao(1, "05/05/2022 09:24:55", "LOREN IPSUN", 1000.0, tipo = TipoMovimentacao.RECEITA, 1))
        dataSet.add(Movimentacao(1, "05/05/2022 09:24:55", "LOREN IPSUN", 1000.0, tipo = TipoMovimentacao.DESPESA, 1))
        dataSet.add(Movimentacao(1, "05/05/2022 09:24:55", "LOREN IPSUN", 1000.0, tipo = TipoMovimentacao.RECEITA, 1))

        binding.rvBankStatement.adapter = BankStatementAdapter(dataSet)
    }
}