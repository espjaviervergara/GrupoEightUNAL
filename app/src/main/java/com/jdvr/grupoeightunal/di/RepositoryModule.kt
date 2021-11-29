package com.jdvr.grupoeightunal.di

import com.jdvr.grupoeightunal.data.repositories.CommentRepository
import com.jdvr.grupoeightunal.data.repositories.ProductRepository
import com.jdvr.grupoeightunal.data.repositories.StoreRepositiry
import org.koin.dsl.module

val repoModule = module {
    single { StoreRepositiry(get()) }
    single { CommentRepository(get()) }
    single { ProductRepository(get()) }
}