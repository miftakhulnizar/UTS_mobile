package com.example.tariandaerah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.betawi))
        textViewNamaDetail.text = intent.getStringExtra("nama")
        textViewdaerahDetail.text = intent.getStringExtra("daerah")
        textViewKetDetail.text = intent.getStringExtra("keterangan")

    }
}