package com.traductor.popoloca.Logic

class Automata {

    fun validateWord(word:String):String {

        var validate:String=word
        var state:Int=0
        var lexema:String=""
        var noValidate:String=""

        loop@ for (ind in validate.indices){

            var item:Char = validate[ind]
            var codeA:Int=item.toInt()

            when(state){

                0 ->
                    if ((codeA in 65..90)||(codeA in 97..122) ){

                        state=1
                        lexema+=codeA.toChar()

                    }else if (codeA in 48..57){

                        state=2
                        lexema+=codeA.toChar()

                    }

                    else{

                        lexema=""
                        noValidate=word
                        break@loop

                    }

                1 ->
                    if((codeA in 65..90 || codeA in 97..122)){

                        state=1
                        lexema+=codeA.toChar()

                    }
                    else if(item==' '){

                        state=0
                        lexema+=codeA.toChar()

                    }

                    else{

                        lexema=""
                        noValidate=word
                        break@loop

                    }

                2 ->
                    if(codeA in 48..57){

                        state=2
                        lexema+=codeA.toChar()

                    }

                    else{

                        lexema=""
                        noValidate=word
                        break@loop

                    }

                else->{

                    lexema=""
                    noValidate=word

                }

            }

        }

        return if(lexema.isNotEmpty()){

            WordsPopoloca.searchWord(lexema)

        }else{

            noValidate

        }

    }
}