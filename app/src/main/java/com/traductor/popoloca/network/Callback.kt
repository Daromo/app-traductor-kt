package com.traductor.popoloca.network

import java.lang.Exception

interface Callback <T>{
    //CON LA T INDICAMOS QUE NO SABEMOS EL TIPO DE ARGUMENTO QUE SE RETORNARA O RECIBIRA
    fun onSuccess(result: T?)

    fun onFailed(exception: Exception)
}