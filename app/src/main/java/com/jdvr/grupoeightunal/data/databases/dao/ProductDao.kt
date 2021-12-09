package com.jdvr.grupoeightunal.data.databases.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.jdvr.grupoeightunal.data.models.Product

@Dao
interface ProductDao {
    @Insert
    fun insertProducts(products: List<Product>)

    @Query("SELECT * FROM products")
    fun getAllProducts(): List<Product>
}