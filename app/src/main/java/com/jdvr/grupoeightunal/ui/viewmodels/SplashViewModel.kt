package com.jdvr.grupoeightunal.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jdvr.grupoeightunal.data.models.Comment
import com.jdvr.grupoeightunal.data.models.Product
import com.jdvr.grupoeightunal.data.models.StoreInfo
import com.jdvr.grupoeightunal.data.repositories.CommentRepository
import com.jdvr.grupoeightunal.data.repositories.ProductRepository
import com.jdvr.grupoeightunal.data.repositories.StoreRepositiry
import kotlinx.coroutines.launch

class SplashViewModel(private val repoStore: StoreRepositiry, private val repoComment: CommentRepository, private val repoProduct: ProductRepository ): ViewModel() {

    fun loadInformation(store: StoreInfo, comments: List<Comment>, products: List<Product>){
        viewModelScope.launch {
            repoStore.insertInfo(store)
            repoComment.insertComments(comments)
            repoProduct.insertProducts(products)
        }
    }
}