package com.jdvr.grupoeightunal.data.repositories

import com.jdvr.grupoeightunal.data.mockups.ProductMock
import com.jdvr.grupoeightunal.data.models.Product

class ProductRepository(private val dataSource: ProductMock) {
    suspend fun loadProducts(): List<Product>{
        return dataSource.loadProducts()
    }
}