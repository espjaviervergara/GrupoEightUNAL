package com.jdvr.grupoeightunal.data.repositories

import com.jdvr.grupoeightunal.data.mockups.CommentMock
import com.jdvr.grupoeightunal.data.models.Comment

class CommentRepository(private val dataSource: CommentMock) {
    suspend fun loadComments(): List<Comment> {
        return dataSource.loadComments()
    }
}