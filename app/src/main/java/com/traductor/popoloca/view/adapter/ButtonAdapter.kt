package com.traductor.popoloca.view.adapter

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.traductor.popoloca.R
import com.traductor.popoloca.model.AlphabetLetter
import kotlinx.android.synthetic.main.item_button.view.*

//dentro de ImageAdapter - val imageListener: ImageListener
class ButtonAdapter() : RecyclerView.Adapter<ButtonAdapter.ViewHolder>() {

    var onItemClick: ((AlphabetLetter) -> Unit)? = null
    var listAlphabetLetter = ArrayList<AlphabetLetter>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_button,parent,false))

    override fun getItemCount(): Int = listAlphabetLetter.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val letterAlphabet = listAlphabetLetter[position]
        holder.buttonLetter.text = letterAlphabet.letter
    }

    fun updateData (data: List<AlphabetLetter>){
        listAlphabetLetter.clear()
        listAlphabetLetter.addAll(data)
        notifyDataSetChanged()
    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val buttonLetter = itemView.findViewById<Button>(R.id.btnLetraAbecedario)
        //ENCARGADO DE OBTNER EL OYENTE DE LOS BOTONES
        init {
            itemView.btnLetraAbecedario.setOnClickListener {
                onItemClick?.invoke(listAlphabetLetter[adapterPosition])
            }
        }
    }

}