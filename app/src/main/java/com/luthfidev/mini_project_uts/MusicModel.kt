package com.luthfidev.mini_project_uts

class MusicModel (judul: String, penyanyi: String, like: Int, durasi: Long, gambar: Int){
    private var judul:String
    private var penyanyi:String
    private var like:Int
    private var durasi:Long
    private var gambar:Int

    init {
        this.judul = judul
        this.penyanyi = penyanyi
        this.like = like
        this.durasi = durasi
        this.gambar = gambar
    }

    fun getJudul(): String {
        return this.judul
    }
    fun setJudul(judul: String) {
        this.judul = judul
    }

    fun getPenyanyi(): String {
        return this.penyanyi
    }
    fun setPenyanyi(penyanyi: String) {
        this.penyanyi = penyanyi
    }

    fun getLike(): Int {
        return this.like
    }
    fun setLike(like: Int) {
        this.like = like
    }

    fun getDurasi(): Long {
        return this.durasi
    }
    fun setDurasi(durasi: Long) {
        this.durasi = durasi
    }

    fun getGambar(): Int {
        return this.gambar
    }
    fun setGambar(gambar: Int) {
        this.gambar = gambar
    }
}


