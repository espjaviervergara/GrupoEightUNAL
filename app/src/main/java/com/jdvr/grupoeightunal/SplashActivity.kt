package com.jdvr.grupoeightunal

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jdvr.grupoeightunal.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_splash)

        setContentView(binding.root)

        init()
        events()

    }

    private fun init(){
        binding.splashAnimation.playAnimation()
    }

    private fun events(){
        binding.splashAnimation.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator?){

            }

            override fun onAnimationEnd(p0: Animator?){
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
                finish()

            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationRepeat(animation: Animator?) {

            }
        })
    }

}