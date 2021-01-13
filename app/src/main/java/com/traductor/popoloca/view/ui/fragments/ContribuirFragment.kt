package com.traductor.popoloca.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.airbnb.lottie.LottieAnimationView
import com.google.firebase.firestore.FirebaseFirestore

import com.traductor.popoloca.R
import com.traductor.popoloca.model.Sugerencia
import kotlinx.android.synthetic.main.fragment_contribuir.*

class ContribuirFragment : Fragment() {
    private lateinit var btnColoborar : Button
    private lateinit var etPalabraEspanol : EditText
    private lateinit var etPalabraPopoloca : EditText
    private lateinit var lottieConfetti : LottieAnimationView

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.fragment_contribuir, container, false)


        btnColoborar = view.findViewById(R.id.btnColoborar)
        btnColoborar.setOnClickListener {
            etPalabraEspanol = view.findViewById(R.id.etWordEspanol)
            etPalabraPopoloca = view.findViewById(R.id.etWordPopoloca)

            if(etPalabraEspanol.text.toString().length > 0 || etPalabraPopoloca.text.toString().length>0){
                uploadWords(etPalabraEspanol.text.toString(), etPalabraPopoloca.text.toString())
                etPalabraEspanol.setText("")
                etPalabraPopoloca.setText("")
                lottieStartAnimation(animationConfetti,R.raw.data_confetti)
                Toast.makeText(requireActivity(),"¡Gracias por aportar!", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(requireActivity(),"Verificar campos", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

    private fun uploadWords(palabraEspanol : String, palabraPopoloca : String){
        val firebaseFireStore = FirebaseFirestore.getInstance()
        var sugerencia = Sugerencia()
        sugerencia.palabraEspanol = palabraEspanol
        sugerencia.palabraPopoloca = palabraPopoloca
        sugerencia.verficar = false
        firebaseFireStore.collection("sugerencias").document().set(sugerencia)
    }

    private fun lottieStartAnimation(imageView: LottieAnimationView, animation: Int){
        imageView.setVisibility(View.VISIBLE)
        imageView.playAnimation()
    }
}