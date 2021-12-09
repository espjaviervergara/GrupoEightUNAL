package com.jdvr.grupoeightunal.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product (
    @PrimaryKey @ColumnInfo(name = "id") var id: String = "",
    var name: String? = "",
    var description: String? = "",
    var image: String? = "",
    var price: String? = ""
    )