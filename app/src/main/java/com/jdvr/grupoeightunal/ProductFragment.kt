package com.jdvr.grupoeightunal

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jdvr.grupoeightunal.databinding.FragmentProductBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ProductFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProductFragment : Fragment() {

    private var _binding: FragmentProductBinding? = null
    private val binding get() = _binding!!
    private lateinit var productAdapter: ProductAdapter
    private lateinit var productManager: GridLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_product, container, false)

        _binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        productAdapter = ProductAdapter(
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
        productAdapter.listner = object : OnProductListener {
            override fun onClick(item: Product) {
                Log.d("PRODUCT", item.name)
            }

        }
        productManager = GridLayoutManager(requireContext(), 2)
        binding.productRecycler.apply {
            adapter = productAdapter
            layoutManager = productManager
        }

    }


}