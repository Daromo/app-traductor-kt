package com.traductor.popoloca.view.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.textfield.TextInputEditText
<<<<<<< HEAD
import com.traductor.popoloca.Logic.Automata
import com.traductor.popoloca.Logic.DescriptionWords
=======
>>>>>>> ee785f7451e09f209f2f67746e4b5d4d4b4e47f4

import com.traductor.popoloca.R
import com.traductor.popoloca.model.AlphabetLetter
import com.traductor.popoloca.view.adapter.ButtonAdapter
import com.traductor.popoloca.view.ui.fragments.Code.Automata
import com.traductor.popoloca.view.ui.fragments.Code.DescriptionWords
import com.traductor.popoloca.viewmodel.AlphabetLetterViewModel
import kotlinx.android.synthetic.main.fragment_abecedario.*
import kotlinx.android.synthetic.main.fragment_imagen.*
import kotlinx.android.synthetic.main.fragment_traductor.*

/**
 * A simple [Fragment] subclass.
 */
class TraductorFragment : Fragment() {
    private lateinit var word: TextInputEditText
    private lateinit var result: TextView
    private lateinit var search: Button
    private lateinit var description: TextView

    private lateinit var word:TextInputEditText
    private lateinit var result: TextView
    private lateinit var search: Button
    private lateinit var description: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_traductor, container, false)
        word=view.findViewById(R.id.txtEspanol)
        result=view.findViewById(R.id.textResult)
<<<<<<< HEAD
        description= view.findViewById(R.id.textDescription)
        search=view.findViewById(R.id.btnTraductor)

        search.setOnClickListener {

            var automata= Automata()
            result.text=automata.validateWord(word.text.toString())

            description.text= DescriptionWords.descriptionW(result.text.toString())
=======
        search=view.findViewById(R.id.btnTraductor)
        description=view.findViewById(R.id.textDescription)

        search.setOnClickListener {

            var automata=Automata()
            result.text=automata.validateWord(word.text.toString())

            description.text=DescriptionWords.descriptionW(result.text.toString())
>>>>>>> ee785f7451e09f209f2f67746e4b5d4d4b4e47f4

        }
        return view
    }

}
