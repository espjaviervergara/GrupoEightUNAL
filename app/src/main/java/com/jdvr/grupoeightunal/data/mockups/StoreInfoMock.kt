package com.jdvr.grupoeightunal.data.mockups

import com.jdvr.grupoeightunal.data.models.StoreInfo

class StoreInfoMock {
    fun loadInfo(): StoreInfo {
        return StoreInfo (
            id = "1",
            name = "Mi Tienda",
            image = "https://siemprendes.com/wp-content/uploads/2021/01/Mi-primera-Tienda-Online.jpg",
            address = "Calle 32a bis # 34 -143",
            description = "Una tienda de barrio se define como un establecimiento atendido por una o más personas detrás de un mostrador en donde el consumidor no tiene al alcance los productos y más del 50% de las ventas son para consumir fuera del establecimiento."
        )
    }
}