package com.example.is_project01.data.repository

import com.example.is_project01.data.source.RemoteDataSource
import com.example.is_project01.domain.model.Board
import com.example.is_project01.domain.repository.Repository
import io.reactivex.Flowable
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
) : Repository {
    override fun getBoard(): Flowable<List<Board>> =
        remoteDataSource.getBoard()


    override fun postBoard(): Flowable<List<Board>> =
        remoteDataSource.postBoard()
}