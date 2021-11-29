package com.jdvr.grupoeightunal.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jdvr.grupoeightunal.data.models.StoreInfo
import com.jdvr.grupoeightunal.data.repositories.StoreRepositiry
import kotlinx.coroutines.launch

class StoreViewModel(private val repo: StoreRepositiry): ViewModel() {
    private var _info: MutableLiveData<StoreInfo> = MutableLiveData()
    val info: LiveData<StoreInfo> get() = _info

    fun loadInfo(){
        viewModelScope.launch {
            val result = repo.loadInfo()
            _info.postValue(result)
        }
    }
}