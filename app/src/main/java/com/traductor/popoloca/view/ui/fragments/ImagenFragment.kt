package com.traductor.popoloca.view.ui.fragments


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.airbnb.lottie.LottieAnimationView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

import com.traductor.popoloca.R
import com.traductor.popoloca.model.Image
import com.traductor.popoloca.view.adapter.ImageAdapter
import com.traductor.popoloca.viewmodel.ImageViewModel
import kotlinx.android.synthetic.main.activity_splashscreen.*
import kotlinx.android.synthetic.main.fragment_imagen.*

/**
 * A simple [Fragment] subclass.
 */
class ImagenFragment : Fragment(){
    private lateinit var imageAdapter : ImageAdapter
    private lateinit var viewModel : ImageViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val view : View = inflater!!.inflate(R.layout.fragment_imagen, container, false)

        val chipAnimales : Chip = view.findViewById(R.id.chip_animales)
        val chipFrutas : Chip = view.findViewById(R.id.chip_frutas)
        val chipEtapas : Chip = view.findViewById(R.id.chip_etapas)
        val chipFamilia : Chip = view.findViewById(R.id.chip_familia)
        val chipCuerpo : Chip = view.findViewById(R.id.chip_cuerpo)

        chipAnimales.setOnClickListener{view ->
            viewModel = ViewModelProviders.of(this).get(ImageViewModel::class.java)
            viewModel.refresh("animales")
        }

        chipFrutas.setOnClickListener{view ->
            viewModel = ViewModelProviders.of(this).get(ImageViewModel::class.java)
            viewModel.refresh("frutas")
        }

        chipEtapas.setOnClickListener{view ->
            viewModel = ViewModelProviders.of(this).get(ImageViewModel::class.java)
            viewModel.refresh("etapas")
        }

        chipFamilia.setOnClickListener{view ->
            viewModel = ViewModelProviders.of(this).get(ImageViewModel::class.java)
            viewModel.refresh("familia")
        }

        chipCuerpo.setOnClickListener{view ->
            viewModel = ViewModelProviders.of(this).get(ImageViewModel::class.java)
            viewModel.refresh("cuerpo")
        }

        return  view;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(ImageViewModel::class.java)
        viewModel.refresh("default")

        imageAdapter = ImageAdapter()

        rvImgages.apply{
            layoutManager = GridLayoutManager(context,2)
            adapter = imageAdapter
        }
        observeViewModel()
    }

    fun observeViewModel(){
        viewModel.listImage.observe(this, Observer<List<Image>>{image ->
            imageAdapter.updateData(image)
        })

        //OCULTAR EL PROGRESS BAR
        viewModel.isLoading.observe(this, Observer<Boolean>{
            if(it!= null){
                rlBaseImage.visibility = View.INVISIBLE
            }
        })
    }

    fun msg (){
        val toast = Toast.makeText(context,"prueba", Toast.LENGTH_SHORT).show()
    }

    private fun lottieScroll(imageView: LottieAnimationView, animation: Int){
        println("Animacion comienzo")
        imageView.playAnimation()
    }

    // ImageListener
    //EVENTO CLIC
    /*override fun onConferenceClicked(conference: Image, position: Int) {
        // TODO("not implemented")
        // To change body of created functions use File | Settings | File Templates.
    }*/
}
