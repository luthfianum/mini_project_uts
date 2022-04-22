package com.luthfidev.mini_project_uts

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.luthfidev.mini_project_uts.MusicDetailActivity

class MusicAdapter(private val data:List<MusicModel>,private val context: Context) :
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {
    inner class MusicViewHolder(parent:View):RecyclerView.ViewHolder(parent){
        val judul = parent.findViewById<TextView>(R.id.judul)
        val penyanyi = parent.findViewById<TextView>(R.id.penyanyi)
        val like = parent.findViewById<TextView>(R.id.like)
        val image = parent.findViewById<ImageView>(R.id.image)
        val layout = parent.findViewById<CardView>(R.id.ListMusic)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.music_list_view,parent,false))
    }

    override fun getItemCount(): Int = data.count()

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.layout.setOnClickListener{ v->
            val intent = Intent( v.context, MusicDetailActivity::class.java)
            intent.putExtra("judul", data[position].getJudul())
            intent.putExtra("penyanyi", data[position].getPenyanyi())
            intent.putExtra("image", R.drawable.music_dummy1)
            intent.putExtra("durasi", data[position].getDurasi())
            context.startActivity(intent)
        }
        holder.image.setImageResource(R.drawable.music_dummy1)
        holder.judul.text = data[position].getJudul()
        holder.penyanyi.text = data[position].getPenyanyi()
        holder.like.text = data[position].getLike().toString()
    }
}

