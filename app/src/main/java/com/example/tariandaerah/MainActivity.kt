package com.example.tariandaerah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.betawi,"jakarta","tarian betawi","Tarian ini cukup khas karena "+
                "penggunaan topeng yang digigit di mulut oleh para penari. Tarian ini merupakan perpaduan antara seni tari, musik, dan nyanyian."+
                "Seperti pertunjukan teater atau opera, penari menari dengan di iringi suara music dan nyanyian. Tari Topeng Betawi ini terkenal "+
                "karena lebih bersifat teatrikal dan komunikatif lewat gerakan. Dulunya Tari Topeng adalah salah satu pertunjukan teather tradisional," +
                "namun diselipkan unsur seni tari didalamnya hingga akhirnya seperti sekarang."))

        data?.add(DataModel(R.drawable.gambyong,"jawa tengah","Tarian Gambyong", "Gambyong merupakan salah satu bentuk tarian Jawa klasik "+
                "yang berasal-mula dari wilayah Surakarta dan biasanya dibawakan untuk pertunjukan atau menyambut tamu. Gambyong bukanlah satu tarian saja melainkan terdiri "+
                "dari bermacam-macam koreografi, yang paling dikenal adalah Tari Gambyong Pareanom (dengan beberapa variasi) dan Tari Gambyong Pangkur (dengan beberapa variasi)."))

        data?.add(DataModel(R.drawable.gending,"palembang","Tarian Gending", "Gending Sriwijaya merupakan lagu dan tarian tradisional masyarakat Kota Palembang, Sumatra Selatan."+
                "Melodi lagu Gending Sriwijaya diperdengarkan untuk mengiringi Tari Gending Sriwijaya. Baik lagu maupun tarian ini menggambarkan keluhuran budaya, kejayaan, dan keagungan kemaharajaan "+
                "Sriwijaya yang pernah berjaya mempersatukan wilayah Barat Nusantara."))

        data?.add(DataModel(R.drawable.gong,"Kalimantan","Tarian gong", "Tari Gong atau dapat disebut juga Tari Kancet Ledo adalah salah satu tarian Dayak Kalimantan Timur,"+
                "tepatnya dari suku Dayak Kenyah.[1] Tarian ini ditarikan seorang gadis dengan gong digunakan sebagai alat musik pengiringnya.[2] Tari ini biasanya dipertunjukkan pada saat upacara "+
                "penyambutan tamu agung atau upacara menyambut kelahiran seorang bayi kepala suku"))

        data?.add(DataModel(R.drawable.jaipong,"jawa barat","tarian jaipong", "Jaipongan merupakan garapan yang menggabungkan beberapa elemen seni tradisi Karawang seperti pencak silat,"+
                "wayang golek, topeng banjet, ketuk tilu dan lain-lain. Jaipongan di Karawang pesat pertumbuhannya di mulai tahun 1976, ditandai dengan munculnya rekaman Jaipongan SUANDA GROUP dengan instrumen"+
                "sederhana yang terdiri dari gendang, ketuk, kecrek, goong, rebab dan sinden atau juru kawih. "))

        data?.add(DataModel(R.drawable.reog,"jawa timur","Tarian reog", "Reog merupakan salah satu seni budaya yang berasal dari Jawa Timur bagian barat-laut dan Ponorogo dianggap sebagai "+
                "kota asal Reog yang sebenarnya. Gerbang kota Ponorogo dihiasi oleh sosok warok dan gemblak, dua sosok yang ikut tampil pada saat Reog dipertunjukkan. Reog adalah salah satu budaya daerah di Indonesia "+
                "yang masih sangat kental dengan hal-hal yang berbau mistik dan ilmu kebatinan yang kuat"))

        data?.add(DataModel(R.drawable.sajojo,"papua","tarian sajojo", "Tari Sajojo adalah tarian tradisional yang berasal dari daerah Papua. Tarian ini sering dijadikan penampilan di berbagai acara,"+
                "baik acara adat, budaya, maupun sekadar hiburan saja. Tarian ini sangat terkenal di Papua. Tarian ini bisa ditarikan oleh berbagai jenis kalangan, baik pria maupun wanita, tua maupun muda, karena tarian ini "+
                "termasuk tarian pergaulan."))


        data?.add(DataModel(R.drawable.saman,"aceh","Tarian saman", "ari Saman adalah sebuah tarian suku Gayo yang biasa ditampilkan untuk merayakan peristiwa-peristiwa penting dalam adat."+
                "Syair dalam tarian saman mempergunakan bahasa Gayo. Selain itu biasanya tarian ini juga ditampilkan untuk merayakan kelahiran Nabi Muhammad SAW. Dalam beberapa literatur menyebutkan  "+
                "tari Saman di Aceh didirikan dan dikembangkan oleh Syekh Saman, seorang ulama yang berasal dari Gayo di Aceh Tenggara. "))

        //Set data to Adapter
        recyclerView.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("daerah", item?.daerah)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}