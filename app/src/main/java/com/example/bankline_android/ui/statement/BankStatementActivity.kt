package com.example.bankline_android.ui.statement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bankline_android.R
import com.example.bankline_android.databinding.ActivityBankStatementBinding

class BankStatementActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ACCOUNT_HOLDER = "com.example.bankline_android.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }

    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}