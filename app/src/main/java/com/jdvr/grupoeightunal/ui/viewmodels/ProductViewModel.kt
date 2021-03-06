package com.jdvr.grupoeightunal.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jdvr.grupoeightunal.data.models.Product
import com.jdvr.grupoeightunal.data.repositories.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel(private val repo: ProductRepository): ViewModel() {
    private var _products: MutableLiveData<List<Product>> = MutableLiveData()
    val products: LiveData<List<Product>> get() = _products

    private var _selected: MutableLiveData<Product> = MutableLiveData()
    val selected: LiveData<Product> get() = _selected

    fun loadPrducts() {
        viewModelScope.launch {
            val result = repo.loadProducts()
            _products.postValue(result)
        }
    }

    fun selectProduct(product: Product){
        _selected.postValue(product)
    }
}