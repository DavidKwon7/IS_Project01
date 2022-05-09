package com.example.is_project01.presentation.features.board

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.is_project01.domain.model.Board
import com.example.is_project01.domain.use_case.GetBoardUseCase
import com.example.is_project01.domain.use_case.PostBoardUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

@HiltViewModel
class BoardViewModel @Inject constructor(
    private val getBoardUseCase: GetBoardUseCase,
    private val postBoardUseCase: PostBoardUseCase
) : ViewModel() {
    private val compositeDisposable = CompositeDisposable()

    private val _boardList = MutableLiveData<List<Board>>()
    val boardList : LiveData<List<Board>>
        get() = _boardList

    private val _error = MutableLiveData<Throwable>()
    val error: LiveData<Throwable>
        get() = _error

    // todo useCase subscribe..

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }
}


