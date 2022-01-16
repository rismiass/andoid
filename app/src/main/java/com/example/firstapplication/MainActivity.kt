package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image = findViewById<ImageView>(R.id.imageView3)
        var name = findViewById<TextView>(R.id.textView)
        var description = findViewById<TextView>(R.id.textView3)
        var number = 0
        val lstName = listOf(R.string.high_elves, R.string.gnomes, R.string.dark_elves, R.string.norska)
        val lstImages = listOf(R.drawable.high_elves, R.drawable.gnomes, R.drawable.dark_elves, R.drawable.norska)
        val lstDesc = listOf(R.string.d_high_elves, R.string.d_gnomes, R.string.d_dark_elves, R.string.d_norska)
        image.setOnClickListener {
            number = (1+number) % lstName.size
            name.setText(lstName[number])
            description.setText(lstDesc[number])
            image.setImageResource(lstImages[number])
        }
    }

}