package com.example.is_project01.data.source

import com.example.is_project01.domain.model.Board
import io.reactivex.Flowable

interface RemoteDataSource {

    fun getBoard(): Flowable<List<Board>>
    fun postBoard(): Flowable<List<Board>>

}