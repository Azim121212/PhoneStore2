package com.example.phonestore2.pages

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phonestore2.R
import com.example.phonestore2.argenRecicleView.ArgenActivity
import com.example.phonestore2.argenRecicleView.ImgAdapter
import com.example.phonestore2.argenRecicleView.ImgModel
import com.example.phonestore2.databinding.ActivityBooksBinding
import com.example.phonestore2.map.MapsActivity

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityBooksBinding
private lateinit var adapter: ImgAdapter
private  var arrayList: ArrayList<ImgModel> = ArrayList()

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBooksBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
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
        arrayList.add(ImgModel(R.drawable.book_4, "$23", "Running"))
        arrayList.add(ImgModel(R.drawable.book_2, "$12", "A Novel"))
        arrayList.add(ImgModel(R.drawable.book_3, "$42", "Faire Tail"))
        arrayList.add(ImgModel(R.drawable.book_1, "$29", "How to win"))
        arrayList.add(ImgModel(R.drawable.book_4, "$23", "Running"))
        arrayList.add(ImgModel(R.drawable.book_2, "$12", "A Novel"))
        arrayList.add(ImgModel(R.drawable.book_3, "$42", "Faire Tail"))
        arrayList.add(ImgModel(R.drawable.book_1, "$29", "How to win"))

    }
}