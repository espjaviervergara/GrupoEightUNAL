package com.jdvr.grupoeightunal.di

import com.jdvr.grupoeightunal.data.mockups.CommentMock
import com.jdvr.grupoeightunal.data.mockups.ProductMock
import com.jdvr.grupoeightunal.data.mockups.StoreInfoMock
import org.koin.dsl.module

val dataSourceModule = module {
    single { CommentMock() }
    single { ProductMock() }
    single { StoreInfoMock() }
}