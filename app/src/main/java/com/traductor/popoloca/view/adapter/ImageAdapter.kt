package com.traductor.popoloca.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.traductor.popoloca.R
import com.traductor.popoloca.model.Image

//dentro de ImageAdapter - val imageListener: ImageListener
class ImageAdapter() : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    var listImage = ArrayList<Image>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent,false))

    //NUMERO DE ELEMENTOS TOTALES
    override fun getItemCount() = listImage.size

    //MOSTRAR LOS ELEMENTOS EN LA VISTA
    override fun onBindViewHolder(holder: ImageAdapter.ViewHolder, position: Int) {
        val image = listImage[position] as com.traductor.popoloca.model.Image

        holder.tvNamePopoloca.text = image.namePopoloca
        holder.tvNameEspanol.text = image.nameEspanol
        holder.tvCategoria.text = image.categoria

        //CARGAR IMAGEN CON GLIDE
        Glide.with(holder.itemView.context)
            .load(image.image)
            .apply(RequestOptions.circleCropTransform())
            .into(holder.ivImage)
    }

    fun updateData (data: List<Image>){
        listImage.clear()
        listImage.addAll(data)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvNamePopoloca = itemView.findViewById<TextView>(R.id.tvItemNamePopoloca)
        val tvNameEspanol = itemView.findViewById<TextView>(R.id.tvItemNameEspanol)
        val tvCategoria = itemView.findViewById<TextView>(R.id.tvItemCategoria)
        val ivImage = itemView.findViewById<ImageView>(R.id.ivItemImage)
    }
}