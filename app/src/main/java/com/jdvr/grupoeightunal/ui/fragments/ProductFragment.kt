package com.jdvr.grupoeightunal.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.Observer
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.jdvr.grupoeightunal.R
import com.jdvr.grupoeightunal.data.models.Product
import com.jdvr.grupoeightunal.databinding.FragmentProductBinding
import com.jdvr.grupoeightunal.ui.adapters.ProductAdapter
import com.jdvr.grupoeightunal.ui.listeners.OnProductListener
import com.jdvr.grupoeightunal.ui.viewmodels.ProductViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import java.util.*


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

    private val productViewModel: ProductViewModel by sharedViewModel()

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
        productViewModel.loadPrducts()
        productAdapter = ProductAdapter(
            listOf()
        )
        productAdapter.listner = object : OnProductListener {
            override fun onClick(item: Product) {
                Log.d("PRODUCT", item.name)
                productViewModel.selectProduct(item)
                findNavController().navigate(R.id.action_productFragment_to_productDetailFragment)
            }

        }
        productManager = GridLayoutManager(requireContext(), 2)
        binding.productRecycler.apply {
            adapter = productAdapter
            layoutManager = productManager
        }

        observeViewModels()

    }

    private fun observeViewModels(){
        productViewModel.products.observe(viewLifecycleOwner, Observer { products ->
            productAdapter.newDataSet(products)
        })
    }


}