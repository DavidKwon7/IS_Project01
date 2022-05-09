package com.example.is_project01.presentation.features.write

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.is_project01.R
import com.example.is_project01.databinding.ActivityWriteBinding

class WriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_write)
    }

    // todo 데이터 서버로 넘겨주기
    private fun clickBtn() {
        binding.btnSubmit.setOnClickListener {
            // todo 데이터 서버로 넘겨주기
        }
    }
}