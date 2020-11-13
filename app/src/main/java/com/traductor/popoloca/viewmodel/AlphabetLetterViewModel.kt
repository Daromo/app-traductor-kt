package com.traductor.popoloca.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.traductor.popoloca.model.AlphabetLetter
import com.traductor.popoloca.network.Callback
import com.traductor.popoloca.network.FirestoreService
import java.lang.Exception

class AlphabetLetterViewModel : ViewModel() {
    val firestoreService = FirestoreService()
    var listLetter: MutableLiveData<List<AlphabetLetter>> = MutableLiveData()
    var isLoading = MutableLiveData<Boolean>()

    //OBTENER LOS DATOS DE FIREBASE
    fun refresh (){
        getLetterFromFirebase()
    }

    fun getLetterFromFirebase(){
        firestoreService.getLetter(object: Callback<List<AlphabetLetter>> {
            override fun onSuccess(result: List<AlphabetLetter>?) {
                listLetter.postValue(result)
                processFinished()
            }

            override fun onFailed(exception: Exception) {
                processFinished()
            }
        })
    }

    fun processFinished(){
        isLoading.value = true
    }

}