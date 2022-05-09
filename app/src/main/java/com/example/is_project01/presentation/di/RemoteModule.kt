package com.example.is_project01.presentation.di

import com.example.is_project01.BuildConfig
import com.example.is_project01.remote.api.BoardApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    /**
     * provide [HttpLoggingInterceptor]
     */
    @Provides
    fun provideLoggingInterceptor() : HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        if (BuildConfig.DEBUG) {
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        } else {
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
        }
        return httpLoggingInterceptor
    }

    /**
     * provide [Retrofit]
     */
    @Provides
    fun provideRetrofitTest(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl("알아서 쓰기")
            .client(okHttpClient)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    /**
     * provide [ApiService]
     */
    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): BoardApiService {
        return retrofit.create(BoardApiService::class.java)
    }
}