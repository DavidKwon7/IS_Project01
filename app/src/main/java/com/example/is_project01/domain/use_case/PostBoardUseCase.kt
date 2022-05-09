package com.example.is_project01.domain.use_case

import com.example.is_project01.domain.model.Board
import com.example.is_project01.domain.repository.Repository
import io.reactivex.Flowable

class PostBoardUseCase(
    private val repository: Repository
) {
    fun execute(): Flowable<List<Board>> {
        return repository.postBoard()
    }
}