package com.example.is_project01.remote.source

import com.example.is_project01.data.source.RemoteDataSource
import com.example.is_project01.domain.model.Board
import com.example.is_project01.remote.api.BoardApiService
import io.reactivex.Flowable
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: BoardApiService
) : RemoteDataSource {
    override fun getBoard(): Flowable<List<Board>> {
        return apiService.getBoard()
    }

    override fun postBoard(): Flowable<List<Board>> {
        return apiService.postBoard()
    }
}