package com.traductor.popoloca.view.ui.activities

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.airbnb.lottie.LottieAnimationView
import com.traductor.popoloca.R
import kotlinx.android.synthetic.main.activity_splashscreen.*
import kotlinx.android.synthetic.main.item_image.*

class SplashscreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val intent = Intent(this, MainActivity::class.java)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        lottieSplashScreen(animationView, R.raw.data_splash)

        animationView.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationRepeat(animation: Animator?) {
            }

            override fun onAnimationEnd(animation: Animator?) {
                println("Animacion terminada")
                startActivity(intent)
                finish()
            }

            override fun onAnimationStart(animation: Animator?) {

            }

        })

    }

    private fun lottieSplashScreen(imageView: LottieAnimationView, animation: Int){
        println("Animacion comienzo")
        imageView.playAnimation()
    }
}
