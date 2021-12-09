package com.jdvr.grupoeightunal.data.databases

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jdvr.grupoeightunal.data.databases.dao.CommentDao
import com.jdvr.grupoeightunal.data.databases.dao.ProductDao
import com.jdvr.grupoeightunal.data.databases.dao.StoreDao
import com.jdvr.grupoeightunal.data.models.Comment
import com.jdvr.grupoeightunal.data.models.Product
import com.jdvr.grupoeightunal.data.models.StoreInfo

@Database(entities = [Comment::class, Product::class, StoreInfo::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun commentDao(): CommentDao
    abstract fun productDao(): ProductDao
    abstract fun storeDao(): StoreDao

    companion object{
        @Volatile
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase{
            if (instance == null){
                synchronized(this){
                    instance = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "example.db").allowMainThreadQueries().build()
                }
            }
            return instance!!
        }
    }
}