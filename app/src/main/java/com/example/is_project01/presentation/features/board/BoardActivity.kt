package com.example.is_project01.presentation.features.board

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.is_project01.R
import com.example.is_project01.databinding.ActivityBoardBinding
import com.example.is_project01.presentation.features.write.WriteActivity

class BoardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBoardBinding
    private val viewModel: BoardViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_board)
    }

    private fun initRecyclerView() {
        binding.recyclerView.adapter = BoardAdapter()
    }

    private fun initLiveData() {
        viewModel.boardList.observe(this) {
            (binding.recyclerView.adapter as BoardAdapter).setItems(it)
        }
    }

    private fun clickBtn() {
        binding.write.setOnClickListener {
            val intent = Intent(this, WriteActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}