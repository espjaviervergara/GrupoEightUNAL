package com.jdvr.grupoeightunal.data.databases.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.jdvr.grupoeightunal.data.models.Comment

@Dao
interface CommentDao {
    @Insert
    fun insertComments(comments: List<Comment>)

    @Query("SELECT * FROM comments")
    fun getAllComments(): List<Comment>
}