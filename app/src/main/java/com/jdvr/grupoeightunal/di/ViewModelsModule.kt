package com.jdvr.grupoeightunal.di

import com.jdvr.grupoeightunal.ui.viewmodels.CommentViewModel
import com.jdvr.grupoeightunal.ui.viewmodels.ProductViewModel
import com.jdvr.grupoeightunal.ui.viewmodels.SplashViewModel
import com.jdvr.grupoeightunal.ui.viewmodels.StoreViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { StoreViewModel(get()) }
    viewModel { CommentViewModel(get()) }
    viewModel { ProductViewModel(get()) }
    viewModel { SplashViewModel(get(), get(), get()) }
}