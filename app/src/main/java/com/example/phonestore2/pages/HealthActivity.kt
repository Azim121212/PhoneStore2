package com.example.phonestore2.pages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phonestore2.R
import com.example.phonestore2.argenRecicleView.ArgenActivity
import com.example.phonestore2.argenRecicleView.ImgAdapter
import com.example.phonestore2.argenRecicleView.ImgModel
import com.example.phonestore2.databinding.ActivityHealthBinding
import com.example.phonestore2.map.MapsActivity

class HealthActivity : AppCompatActivity() {


    private lateinit var binding: ActivityHealthBinding
    private lateinit var adapter: ImgAdapter
    private var arrayList: ArrayList<ImgModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHealthBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        fillRecicler()
        adapter = ImgAdapter(arrayList)
        binding.recicleView.adapter = adapter

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
        binding.buttonBook.setOnClickListener {
            val iconIntent = Intent(this, BooksActivity::class.java)
            startActivity(iconIntent)
        }
        binding.groTextView.setOnClickListener {
            val mapIntent = Intent (this, MapsActivity::class.java)
            startActivity(mapIntent)
        }



    }


    private fun fillRecicler() {
        arrayList.add(ImgModel(R.drawable.run, "$1200", "Runnig"))
        arrayList.add(ImgModel(R.drawable.skakalka, "$60", "Acer Swift"))
        arrayList.add(ImgModel(R.drawable.blender, "$69", "Huawei"))
        arrayList.add(ImgModel(R.drawable.turnik, "$290", "Lenovo Legion"))
        arrayList.add(ImgModel(R.drawable.run, "$1200", "Runnig"))
        arrayList.add(ImgModel(R.drawable.skakalka, "$60", "Acer Swift"))
        arrayList.add(ImgModel(R.drawable.blender, "$69", "Huawei"))
        arrayList.add(ImgModel(R.drawable.turnik, "$290", "Lenovo Legion"))


        adapter = ImgAdapter(arrayList)
        binding.recicleView.adapter

    }
}