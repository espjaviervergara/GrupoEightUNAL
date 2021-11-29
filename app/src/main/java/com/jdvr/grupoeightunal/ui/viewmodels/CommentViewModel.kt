package com.jdvr.grupoeightunal.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jdvr.grupoeightunal.data.models.Comment
import com.jdvr.grupoeightunal.data.repositories.CommentRepository
import kotlinx.coroutines.launch

class CommentViewModel(private val repo: CommentRepository): ViewModel() {
    private var _comments: MutableLiveData<List<Comment>> = MutableLiveData()
    val comments: LiveData<List<Comment>> get() = _comments

    fun loadComments(){
        viewModelScope.launch {
            var result = repo.loadComments()
            _comments.postValue(result)
        }
    }
}