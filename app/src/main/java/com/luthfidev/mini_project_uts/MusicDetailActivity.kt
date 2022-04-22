package com.luthfidev.mini_project_uts

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.format.DateUtils
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MusicDetailActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.detail_music_layout)

        val judul = findViewById<TextView>(R.id.judul)
        val penyanyi = findViewById<TextView>(R.id.penyanyi)
//        val durasi = findViewById<SeekBar>(R.id.seekBar)
//        val durasiVal = findViewById<TextView>(R.id.textView3)
//        val durasiValEnd = findViewById<TextView>(R.id.textView4)
        val image = findViewById<ImageView>(R.id.imageView2)
//        val back = findViewById<Button>(R.id.button)
//        val play = findViewById<Button>(R.id.button2)
//        val prev = findViewById<Button>(R.id.button4)
//        val next = findViewById<Button>(R.id.button3)

        judul.setText(intent.getStringExtra("judul"))
        penyanyi.setText(intent.getStringExtra("penyanyi"))
        image.setImageResource(R.drawable.music_dummy1)
//        durasiValEnd.setText(DateUtils.formatElapsedTime(intent.getStringExtra("durasi")!!.toLong()))


    }
}