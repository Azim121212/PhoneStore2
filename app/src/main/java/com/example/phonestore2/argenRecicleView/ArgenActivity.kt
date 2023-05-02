package com.example.phonestore2.argenRecicleView

import android.content.Intent
import android.os.Bundle
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import com.example.phonestore2.R
import com.example.phonestore2.databinding.ActivityArgenBinding
import com.example.phonestore2.map.MapsActivity
import com.example.phonestore2.pages.BooksActivity
import com.example.phonestore2.pages.CompActivity
import com.example.phonestore2.pages.HealthActivity

class ArgenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArgenBinding
    private lateinit var adapter: ImgAdapter
    private var arrayList: ArrayList<ImgModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArgenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = ImgAdapter(arrayList)
        binding.recicleView.adapter = adapter
        fillRecicler()


        binding.search.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.search.clearFocus()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }

        })


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
        arrayList.add(ImgModel(R.drawable.samsunggalaxyfirst,"$1.047","Samsung Galaxy s20 Ultra"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxysecond,"$600","Xiaomi Mi 10 Pro"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,"$1.069","Samsung Note 20 Ultra "))
        arrayList.add(ImgModel(R.drawable.book_4,"$890","Motorola One Edge"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxyfirst,"$1.047","Samsung Galaxy s20 Ultra"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxysecond,"$600","Xiaomi Mi 10 Pro"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,"$1.069","Samsung Note 20 Ultra "))
        arrayList.add(ImgModel(R.drawable.book_4,"$890","Motorola One Edge"))
   arrayList.add(ImgModel(R.drawable.book_4,"$890","Motorola One Edge"))
        adapter = ImgAdapter(arrayList)
        binding.recicleView.adapter
    }

}