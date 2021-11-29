package com.jdvr.grupoeightunal.data.repositories

import com.jdvr.grupoeightunal.data.mockups.StoreInfoMock
import com.jdvr.grupoeightunal.data.models.StoreInfo

class StoreRepositiry(val dataSource: StoreInfoMock) {
    suspend fun loadInfo(): StoreInfo {
        return dataSource.loadInfo()
    }
}