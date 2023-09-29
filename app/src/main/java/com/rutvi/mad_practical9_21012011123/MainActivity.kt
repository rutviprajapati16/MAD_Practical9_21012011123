package com.rutvi.mad_practical9_21012011123

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation:AnimationDrawable
    lateinit var heartanimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView=findViewById<ImageView>(R.id.alarm)
        imageView.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimation=imageView.background as AnimationDrawable
        val heart : ImageView = findViewById(R.id.heart)
        heart.setBackgroundResource(R.drawable.heart_animation_list)
        heartanimation = heart.background as AnimationDrawable
    }


    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            alarmanimation.start()
            heartanimation.start()
        }
        else
            alarmanimation.stop()
            heartanimation.stop()
    }
}