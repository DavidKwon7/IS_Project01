package com.example.is_project01.presentation.di

import com.example.is_project01.data.repository.RepositoryImpl
import com.example.is_project01.data.source.RemoteDataSource
import com.example.is_project01.domain.repository.Repository
import com.example.is_project01.remote.source.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): RemoteDataSource

    @Binds
    @ViewModelScoped
    abstract fun provideRepository(repositoryImpl: RepositoryImpl): Repository
}