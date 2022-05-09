package com.example.is_project01.presentation.features.board

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.is_project01.databinding.ItemBoardBinding
import com.example.is_project01.domain.model.Board

class BoardAdapter:RecyclerView.Adapter<BoardAdapter.BoardViewHolder>() {

    private val items = mutableListOf<Board>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return BoardViewHolder(
            ItemBoardBinding.inflate(layoutInflater)
        )
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int =
        items.size

    fun setItems(items: List<Board>) {
        this.items.clear()
        this.items.addAll(items)

        notifyDataSetChanged()
    }


    inner class BoardViewHolder(
        private val binding: ItemBoardBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(board: Board) {
            binding.tvTitle.text = board.title
            binding.tvContent.text = board.content
        }
    }
}