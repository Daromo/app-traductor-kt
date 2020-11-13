package com.traductor.popoloca.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.firebase.firestore.FirebaseFirestore
import com.traductor.popoloca.R
import com.traductor.popoloca.model.AlphabetLetter
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configNav()
        //JSON1 GALERIAS ANIMALES
       /*val jsonArr = JSONArray("[\n"+"            " +
                "           {\n" +
                "                'namePopoloca' : 'test',\n" +
                "                'nameEspanol' : 'Perro',\n" +
                "                'categoria'   : 'animales',\n"+
                "                'image' : 'https://pbs.twimg.com/profile_images/1015273976438902784/T0gZSbTP_400x400.jpg'\n" +
                "            },\n" +
                "            {\n" +
                "                'namePopoloca' : 'test',\n" +
                "                'nameEspanol' : 'Gato',\n" +
                "                'categoria'   : 'animales',\n"+
                "                'image' : 'https://pbs.twimg.com/profile_images/1015273976438902784/T0gZSbTP_400x400.jpg'\n" +
                "            },\n" +
                "            {\n" +
                "                'namePopoloca' : 'test',\n" +
                "                'nameEspanol' : 'Oveja',\n" +
                "                'categoria'   : 'animales',\n"+
                "                'image' : 'https://pbs.twimg.com/profile_images/1015273976438902784/T0gZSbTP_400x400.jpg'\n" +
                "            },\n" +
                "            {\n" +
                "                'namePopoloca' : 'test',\n" +
                "                'nameEspanol' : 'Caballo',\n" +
                "                'categoria'   : 'animales',\n"+
                "                'image' : 'https://pbs.twimg.com/profile_images/1015273976438902784/T0gZSbTP_400x400.jpg'\n" +
                "            },\n" +
                "            {\n" +
                "                'namePopoloca' : 'test',\n" +
                "                'nameEspanol' : 'Abeja',\n" +
                "                'categoria'   : 'cosas',\n"+
                "                'image' : 'https://pbs.twimg.com/profile_images/1015273976438902784/T0gZSbTP_400x400.jpg'\n" +
                "            },\n" +
                "            {\n" +
                "                'namePopoloca' : 'test',\n" +
                "                'nameEspanol' : 'Cerdo',\n" +
                "                'categoria'   : 'cosas',\n"+
                "                'image' : 'https://pbs.twimg.com/profile_images/1015273976438902784/T0gZSbTP_400x400.jpg'\n" +
                "            },\n" +
                "            {\n" +
                "                'namePopoloca' : 'test',\n" +
                "                'nameEspanol' : 'Mariposa',\n" +
                "                'categoria'   : 'cosas',\n"+
                "                'image' : 'https://pbs.twimg.com/profile_images/1015273976438902784/T0gZSbTP_400x400.jpg'\n" +
                "            }\n" +
                "        ]")

        val firebaseFireStore = FirebaseFirestore.getInstance()
        for (i in 0 until jsonArr.length()-1){
            val aux = jsonArr.get(i) as JSONObject
            var image = Image()
            image.namePopoloca = aux.getString("namePopoloca")
            image.nameEspanol = aux.getString("nameEspanol")
            image.image = aux.getString("image")
            image.categoria= aux.getString("categoria")

            firebaseFireStore.collection("images").document().set(image)

        }*/
        //JSON2 AUDIO BOTONES
        /*val jsonArr = JSONArray("[\n" +
                "   {\n" +
                "       'letter' : 'a',\n" +
                "       'sound' : 'linkFile',\n" +
                "       'index' : 1\n" +
                "   },\n" +
                "   {\n" +
                "       'letter' : 'b',\n" +
                "       'sound' : 'linkFile',\n" +
                "       'index' : 2\n" +
                "   },\n" +
                "   {\n" +
                "       'letter' : 'c',\n" +
                "       'sound' : 'linkFile',\n" +
                "       'index' : 3 \n" +
                "   }\n" +
                "]"
        )

        val firebaseFireStore = FirebaseFirestore.getInstance()
        for (i in 0 until jsonArr.length()){
            val aux = jsonArr.get(i) as JSONObject
            var objLetter = AlphabetLetter()
            objLetter.letter = aux.getString("letter")
            objLetter.sound = aux.getString("sound")
            objLetter.index = aux.getInt("index")

            firebaseFireStore.collection("letters").document().set(objLetter)
        }*/

    }

    //ADMINISTRAR EL BOTTOMNAVIGATION
    fun configNav(){
        NavigationUI.setupWithNavController(bottom_navigation, Navigation.findNavController(this, R.id.fragContent))
    }
}
