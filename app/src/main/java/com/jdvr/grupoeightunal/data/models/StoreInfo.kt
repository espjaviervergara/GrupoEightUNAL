package com.jdvr.grupoeightunal.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stores")
data class StoreInfo (
    @PrimaryKey @ColumnInfo(name = "id") var id: String = "",
    var name: String? = "",
    var image: String? = "",
    var address: String? = "",
    var description: String? = "",
    var lat: Double? = null,
    var lng: Double? = null
)