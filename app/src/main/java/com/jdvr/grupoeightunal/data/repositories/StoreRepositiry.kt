package com.jdvr.grupoeightunal.data.repositories

import com.jdvr.grupoeightunal.data.databases.dao.StoreDao
import com.jdvr.grupoeightunal.data.mockups.StoreInfoMock
import com.jdvr.grupoeightunal.data.models.StoreInfo

class StoreRepositiry(val dataSource: StoreInfoMock, private val dataSourceDb: StoreDao) {
    suspend fun loadInfo(): StoreInfo? {
//        return dataSource.loadInfo()
        return dataSourceDb.getStore()
    }

    suspend fun insertInfo(store: StoreInfo){
        val temp = dataSourceDb.getStore()
        if (temp == null) {
            dataSourceDb.insertStore(store)
        }
    }
}