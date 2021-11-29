package com.jdvr.grupoeightunal.data.models

data class StoreInfo (
    var id: String,
    var name: String,
    var image: String,
    var address: String,
    var description: String,
    var lat: Double? = null,
    var lng: Double? = null
)