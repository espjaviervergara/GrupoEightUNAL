package com.jdvr.grupoeightunal.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jdvr.grupoeightunal.data.models.Product
import com.jdvr.grupoeightunal.databinding.ItemProductBinding
import com.jdvr.grupoeightunal.ui.listeners.OnProductListener
import java.util.*

class ProductAdapter(var items: List<Product>): RecyclerView.Adapter<ProductAdapter.ViewHoler>() {
    class ViewHoler(val item: ItemProductBinding): RecyclerView.ViewHolder(item.root)

    var listner: OnProductListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoler {
        return ViewHoler(
            ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        )
    }

    override fun onBindViewHolder(holder: ViewHoler, position: Int) {
       val item = items[position]
        holder.item.itemProductName.text = item.name
        holder.item.itemProductPrice.text = item.price
        Glide.with(holder.itemView).load(item.image).into(holder.item.itemProductPhoto)

        holder.item.root.setOnClickListener{
            listner?.onClick(item)
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    fun newDataSet(newData: List<Product>){
        items = newData
        notifyDataSetChanged()
    }


}