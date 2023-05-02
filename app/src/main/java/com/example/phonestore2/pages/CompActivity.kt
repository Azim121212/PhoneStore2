package com.example.phonestore2.pages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phonestore2.R
import com.example.phonestore2.argenRecicleView.ArgenActivity
import com.example.phonestore2.argenRecicleView.ImgAdapter
import com.example.phonestore2.argenRecicleView.ImgModel
import com.example.phonestore2.databinding.ActivityCompBinding
import com.example.phonestore2.map.MapsActivity

class CompActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCompBinding
    private lateinit var adapter: ImgAdapter
    private var arrayList: ArrayList<ImgModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillRecicler()

        adapter = ImgAdapter(arrayList)
        binding.recicleView.adapter = adapter

        binding.buttonBook.setOnClickListener {
            val iconIntent = Intent(this, BooksActivity::class.java)
            startActivity(iconIntent)
        }
        binding.phoneButton.setOnClickListener {
            val iconIntent = Intent(this, ArgenActivity::class.java)
            startActivity(iconIntent)
        }
        binding.buttonHealth.setOnClickListener {
            val iconIntent = Intent(this, HealthActivity::class.java)
            startActivity(iconIntent)
        }
        binding.buttonComputer.setOnClickListener {
            val iconIntent = Intent (this,CompActivity::class.java )
            startActivity(iconIntent)
        }
        binding.groTextView.setOnClickListener {
            val mapIntent = Intent (this, MapsActivity::class.java)
            startActivity(mapIntent)
        }
    }
    private fun fillRecicler() {
        arrayList.add(ImgModel(R.drawable.img_3,"$1.500","MacBook Pro M2"))
        arrayList.add(ImgModel(R.drawable.img_1,"$600","Acer Swift"))
        arrayList.add(ImgModel(R.drawable.img_2,"$1.069","Huawei"))
        arrayList.add(ImgModel(R.drawable.lenovo,"$890","Lenovo Legion"))
        arrayList.add(ImgModel(R.drawable.img_3,"$1.500","MacBook Pro M2"))
        arrayList.add(ImgModel(R.drawable.img_1,"$600","Acer Swift"))
        arrayList.add(ImgModel(R.drawable.img_2,"$1.069","Huawei"))
        arrayList.add(ImgModel(R.drawable.lenovo,"$890","Lenovo Legion"))

        adapter = ImgAdapter(arrayList)
        binding.recicleView.adapter
    }

}