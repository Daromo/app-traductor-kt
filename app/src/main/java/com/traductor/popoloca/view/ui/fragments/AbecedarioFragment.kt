package com.traductor.popoloca.view.ui.fragments


import android.media.AudioAttributes
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager

import com.traductor.popoloca.R
import com.traductor.popoloca.model.AlphabetLetter
import com.traductor.popoloca.view.adapter.ButtonAdapter
import com.traductor.popoloca.viewmodel.AlphabetLetterViewModel
import kotlinx.android.synthetic.main.fragment_abecedario.*
import kotlinx.android.synthetic.main.item_button.*

/**
 * A simple [Fragment] subclass.
 */
class AbecedarioFragment : Fragment() {
    private lateinit var buttonAdapter : ButtonAdapter
    private lateinit var viewModel : AlphabetLetterViewModel
    private lateinit var mp : MediaPlayer

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_abecedario, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(AlphabetLetterViewModel::class.java)
        viewModel.refresh()

        buttonAdapter = ButtonAdapter()

        rvLetters.apply{
            layoutManager = GridLayoutManager(context,4)
            adapter = buttonAdapter

            //DEBUG CODE
            buttonAdapter.onItemClick = {alphabetLetter ->
                val myURL = alphabetLetter.sound
                Log.d("Click","LINK: "+ myURL)
                try{
                    mp = MediaPlayer.create(context, Uri.parse(myURL));
                    mp.start()
                }catch (e: Exception){
                    e.printStackTrace()
                    Log.d("Click","ERROR")
                }
            }
        }
        observeViewModel()
    }

    fun observeViewModel(){
        viewModel.listLetter.observe(this, Observer<List<AlphabetLetter>>{ letter ->
            buttonAdapter.updateData(letter)
        })
    }
}
