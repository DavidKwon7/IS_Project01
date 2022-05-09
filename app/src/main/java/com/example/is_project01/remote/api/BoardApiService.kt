package com.example.is_project01.remote.api

import com.example.is_project01.domain.model.Board
import io.reactivex.Flowable
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface BoardApiService {

    /**
     * Get from db
     */
    @GET("/board")
    fun getBoard(): Flowable<List<Board>>

    @FormUrlEncoded
    @POST("/board")
    fun postBoard(): Flowable<List<Board>>
}