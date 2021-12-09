package com.jdvr.grupoeightunal.ui.activities

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jdvr.grupoeightunal.data.models.Comment
import com.jdvr.grupoeightunal.data.models.Product
import com.jdvr.grupoeightunal.data.models.StoreInfo
import com.jdvr.grupoeightunal.databinding.ActivitySplashBinding
import com.jdvr.grupoeightunal.ui.viewmodels.SplashViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private val splashViewModel: SplashViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_splash)

        setContentView(binding.root)

        init()
        events()

    }

    private fun init(){
        splashViewModel.loadInformation(
            StoreInfo (
                id = "1",
                name = "Mi Tienda",
                image = "https://siemprendes.com/wp-content/uploads/2021/01/Mi-primera-Tienda-Online.jpg",
                address = "Calle 32a bis # 34 -143",
                description = "Una tienda de barrio se define como un establecimiento atendido por una o más personas detrás de un mostrador en donde el consumidor no tiene al alcance los productos y más del 50% de las ventas son para consumir fuera del establecimiento."
            ),
            listOf(
                Comment(
                    "1",
                    "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard ",
                    "Javier Vergara",
                    "https://c8.alamy.com/compes/p53w62/miguel-de-cervantes-saavedra-1547-1616-escritor-y-dramaturgo-espanol-p53w62.jpg",
                    "27/11/20221"
                ),
                Comment(
                    "2",
                    "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard ",
                    "Farly Artunduaga",
                    "https://1.bp.blogspot.com/-G-agGW_0QxU/WPKoJMeQJYI/AAAAAAAAA0w/FfunHAO3KzsCK7Bw2x0TNC_aAiiIbZJEgCLcB/s400/gustav%2Bschmoller.jpg",
                    "27/11/20221"
                ),
                Comment(
                    "3",
                    "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard ",
                    "Camilo Fajardo",
                    "https://pymstatic.com/52669/conversions/autores-romanticismo-wide.jpg",
                    "27/11/20221"
                ),
                Comment(
                    "4",
                    "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard ",
                    "Jaime de la Ossa",
                    "https://www.lifeder.com/wp-content/uploads/2018/07/486px-Goethe_Stieler_1828.jpg",
                    "27/11/20221"
                )
            ),
            listOf(
                Product("1","Soup - Cream Of Broccoli, Dry","Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc.","https://www.emprendedores.es/wp-content/uploads/2017/02/personalizacion-1024x576.jpg","$1.20"),
                Product("2","Soup - Campbells Pasta Fagioli,Suspendisse potenti."," In eleifend quam a odio. In hac habitasse platea dictumst.","https://www.emprendedores.es/wp-content/uploads/2017/02/personalizacion-1024x576.jpg","$3.24"),
                Product("3","Lemonade - Strawberry, 591 Ml","Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam 2erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.","https://www.emprendedores.es/wp-content/uploads/2017/02/personalizacion-1024x576.jpg","$0.48"),
                Product("4","Cup - 3.5oz, Foam","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis.","https://www.emprendedores.es/wp-content/uploads/2017/02/personalizacion-1024x576.jpg","$0.97"),
                Product("5","Kale - Red","Maecenas  justo. Pellentesque viverra pede ac diam Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris. Morbi non lectus.","https://www.emprendedores.es/wp-content/uploads/2017/02/personalizacion-1024x576.jpg","$1.30"),
                Product("6","Duck - Fat","Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.","https://www.emprendedores.es/wp-content/uploads/2017/02/personalizacion-1024x576.jpg","$0.71"),
                Product("7","Foam Tray S2","Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.","https://www.emprendedores.es/wp-content/uploads/2017/02/personalizacion-1024x576.jpg","$3.37"),
                Product("8","Wine - Casillero Deldiablo","Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor.","https://www.emprendedores.es/wp-content/uploads/2017/02/personalizacion-1024x576.jpg","$9.10"),
                Product("9","Turkey - Whole Fresh","Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa.","https://www.emprendedores.es/wp-content/uploads/2017/02/personalizacion-1024x576.jpg","$4.55"),
                Product("10","Cheese - Taleggio D.o.p.","Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.","https://www.emprendedores.es/wp-content/uploads/2017/02/personalizacion-1024x576.jpg","$1.64"),

                )

        )
        binding.splashAnimation.playAnimation()
    }

    private fun events(){
        binding.splashAnimation.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator?){

            }

            override fun onAnimationEnd(p0: Animator?){
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
                finish()

            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationRepeat(animation: Animator?) {

            }
        })
    }

}