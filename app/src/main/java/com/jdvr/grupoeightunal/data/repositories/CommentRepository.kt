package com.jdvr.grupoeightunal.data.repositories

import com.jdvr.grupoeightunal.data.databases.dao.CommentDao
import com.jdvr.grupoeightunal.data.mockups.CommentMock
import com.jdvr.grupoeightunal.data.models.Comment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CommentRepository(private val dataSource: CommentMock, private val dataSourceDb: CommentDao) {
    suspend fun loadComments(): List<Comment> {
//        return dataSource.loadComments()
        return withContext(Dispatchers.IO){
            dataSourceDb.getAllComments()
        }
    }

    suspend fun insertComments(comments: List<Comment>){
        withContext(Dispatchers.IO){
            val temp = dataSourceDb.getAllComments()
            if(temp.isEmpty()){
                dataSourceDb.insertComments(comments)
            }
        }

    }
}