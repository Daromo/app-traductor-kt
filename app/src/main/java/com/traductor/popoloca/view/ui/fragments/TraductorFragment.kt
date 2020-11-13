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
import com.traductor.popoloca.model.AlphabetLetter
import com.traductor.popoloca.view.adapter.ButtonAdapter
import com.traductor.popoloca.viewmodel.AlphabetLetterViewModel
import kotlinx.android.synthetic.main.fragment_abecedario.*
import kotlinx.android.synthetic.main.fragment_imagen.*

/**
 * A simple [Fragment] subclass.
 */
class TraductorFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_traductor, container, false)
    }

}
