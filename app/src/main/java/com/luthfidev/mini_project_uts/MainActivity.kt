package com.luthfidev.mini_project_uts

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val sepedaList = ArrayList<MusicModel>()
    private lateinit var sepedaAdapter: MusicAdapter
    val data = listOf(
        MusicModel("Title 1", "singer 1", 100, 120, R.drawable.music_dummy1),
        MusicModel("Title 2", "singer 2", 100, 120, R.drawable.music_dummy1),
        MusicModel("Title 3", "singer 3", 100, 120, R.drawable.music_dummy1),
        MusicModel("Title 4", "singer 4", 100, 120, R.drawable.music_dummy1),
        MusicModel("Title 5", "singer 5", 100, 120, R.drawable.music_dummy1),
        MusicModel("Title 1", "singer 1", 100, 120, R.drawable.music_dummy1),
        MusicModel("Title 2", "singer 2", 100, 120, R.drawable.music_dummy1),
        MusicModel("Title 3", "singer 3", 100, 120, R.drawable.music_dummy1),
        MusicModel("Title 4", "singer 4", 100, 120, R.drawable.music_dummy1),
        MusicModel("Title 5", "singer 5", 100, 120, R.drawable.music_dummy1),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.music_player_layout)
        super.onCreate(savedInstanceState)
        val musicRecycler: RecyclerView = findViewById(R.id.musicRecycler)
        musicRecycler.layoutManager = LinearLayoutManager(applicationContext)
        musicRecycler.adapter = MusicAdapter(data,this)
    }
}