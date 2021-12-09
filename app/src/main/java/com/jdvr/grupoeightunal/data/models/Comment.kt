package com.jdvr.grupoeightunal.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comments")
data class Comment (
    @PrimaryKey @ColumnInfo(name = "id") var id: String = "",
//    @PrimaryKey var id: String? = "",
    var description: String? = "",
    var author: String? = "",
    var image: String? = "",
    var date: String? = ""

)