package com.traductor.popoloca.network

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.traductor.popoloca.model.AlphabetLetter
import com.traductor.popoloca.model.Image
import javax.security.auth.callback.Callback

//NOMBRE DE LAS COLLECTION´s EN FIRESTORE
const val IMAGES_COLLECTION_NAME = "images"
const val LETTERS_COLLETION_NAME = "letters"

class FirestoreService{
    val firebaseFirestore = FirebaseFirestore.getInstance()
    //PERSITENCIA DE LOS DATOS
    val settings = FirebaseFirestoreSettings.Builder().setPersistenceEnabled(true).build()
    //INICIALIZADOR PARA MANTENER LOS ARCHIVOS DE MODO OFLINE
    init {
        firebaseFirestore.firestoreSettings = settings
    }

    //OBTENER LOS DATOS DE LAS IMAGENES (DEFAULT)
    fun getImages(callback: com.traductor.popoloca.network.Callback<List<Image>> ){
        firebaseFirestore.collection(IMAGES_COLLECTION_NAME)
            .orderBy("categoria")
            .get()
            .addOnSuccessListener { result ->
                for(doc in result){
                    val list = result.toObjects(Image::class.java)
                    callback.onSuccess(list)
                    break;
                }
            }
    }

    //OBTENER LOS DATOS DE LAS IMAGENES POR CATEGORIA
    fun getImages(callback: com.traductor.popoloca.network.Callback<List<Image>>, categoriaBtn: String ){
        firebaseFirestore.collection(IMAGES_COLLECTION_NAME)
            .whereEqualTo("categoria", categoriaBtn)
            .get()
            .addOnSuccessListener { result ->
                for(doc in result){
                    val list = result.toObjects(Image::class.java)
                    callback.onSuccess(list)
                    break;
                }
            }
    }
    //OBTENER LOS DATOS DE LASLETRAS DEL ALFABETO
    fun getLetter (callback: com.traductor.popoloca.network.Callback<List<AlphabetLetter>>){
        firebaseFirestore.collection(LETTERS_COLLETION_NAME)
            .orderBy("index")
            .get()
            .addOnSuccessListener { result ->
                for (doc in result){
                    val list = result.toObjects(AlphabetLetter::class.java)
                    callback.onSuccess(list)
                    break;
                }
            }
    }
}