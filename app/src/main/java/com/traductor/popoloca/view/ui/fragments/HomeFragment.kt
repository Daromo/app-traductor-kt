package com.traductor.popoloca.view.ui.fragments

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

import com.traductor.popoloca.R
import com.traductor.popoloca.view.ui.activities.MainActivity

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var imgMen : ImageView
    private lateinit var imgWoman : ImageView

    private lateinit var mp : MediaPlayer

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater!!.inflate(R.layout.fragment_home, container, false)
        imgMen = view.findViewById(R.id.imgMen)
        imgWoman = view.findViewById(R.id.imgWoman)

        imgMen.setOnClickListener{ view->
            //Toast.makeText(context,"Click Imagen Hombre", Toast.LENGTH_SHORT).show()
            mp = MediaPlayer.create(context, R.raw.datsinga_ra)
            mp.start()
        }

        imgWoman.setOnClickListener{ view->
            //Toast.makeText(context,"Click Imagen Mujer", Toast.LENGTH_SHORT).show()
            mp = MediaPlayer.create(context, R.raw.bienvenidos)
            mp.start()
        }

        return view
        //return inflater.inflate(R.layout.fragment_home, container, false)
    }
}
