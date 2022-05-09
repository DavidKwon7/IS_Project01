package com.example.is_project01.domain.repository

import com.example.is_project01.domain.model.Board
import io.reactivex.Flowable

interface Repository {
    fun getBoard(): Flowable<List<Board>>
    fun postBoard(): Flowable<List<Board>>
}