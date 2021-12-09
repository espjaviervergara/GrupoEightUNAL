package com.jdvr.grupoeightunal.data.repositories

import com.jdvr.grupoeightunal.data.databases.dao.ProductDao
import com.jdvr.grupoeightunal.data.mockups.ProductMock
import com.jdvr.grupoeightunal.data.models.Product

class ProductRepository(private val dataSource: ProductMock, private val dataSourceDb: ProductDao) {
    suspend fun loadProducts(): List<Product>{
//        return dataSource.loadProducts()
        return dataSourceDb.getAllProducts()
    }

    suspend fun insertProducts(products: List<Product>){
        val temp = dataSourceDb.getAllProducts()
        if (temp.isEmpty()){
            dataSourceDb.insertProducts(products)
        }
    }
}