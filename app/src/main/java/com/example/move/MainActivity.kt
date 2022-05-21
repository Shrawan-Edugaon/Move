package com.example.move

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTop = findViewById<Button>(R.id.top)
        val btnButton = findViewById<Button>(R.id.bottom)
        val btnLeft = findViewById<Button>(R.id.left)
        val btnRight = findViewById<Button>(R.id.right)

        btnTop.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView) as ImageView
            val animation: Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.anim)
            image.startAnimation(animation)
        }

        btnButton.setOnClickListener {
           val image = findViewById<ImageView>(R.id.imageView) as ImageView
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.anim_bottom)
            image.startAnimation(animation)
        }

        btnLeft.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView) as ImageView
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.anim_left)
            image.startAnimation(animation)
        }

        btnRight.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView) as ImageView
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.anim_right)
            image.startAnimation(animation)
        }
    }
}