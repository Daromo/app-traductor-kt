package com.traductor.popoloca.view.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager

import com.traductor.popoloca.R
import com.traductor.popoloca.model.Image
import com.traductor.popoloca.view.adapter.ImageAdapter
import com.traductor.popoloca.viewmodel.ImageViewModel
import kotlinx.android.synthetic.main.fragment_imagen.*

/**
 * A simple [Fragment] subclass.
 */
class ImagenFragment : Fragment(){
    private lateinit var imageAdapter : ImageAdapter
    private lateinit var viewModel : ImageViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_imagen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(ImageViewModel::class.java)
        viewModel.refresh()

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

    // ImageListener
    //EVENTO CLIC
    /*override fun onConferenceClicked(conference: Image, position: Int) {
        // TODO("not implemented")
        // To change body of created functions use File | Settings | File Templates.
    }*/
}
