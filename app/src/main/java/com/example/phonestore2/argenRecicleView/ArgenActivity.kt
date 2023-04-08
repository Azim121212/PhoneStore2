package com.example.phonestore2.argenRecicleView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.phonestore2.R
import com.example.phonestore2.databinding.ActivityArgenBinding

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
    }

    private fun fillRecicler() {
        arrayList.add(ImgModel(R.drawable.samsunggalaxyfirst,"$1,47","Samsung Galaxy s20 Ultra"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxysecond,"$600","Xiaomi Mi 10 Pro"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,"$1,069","Samsung Note 20 Ultra "))
        arrayList.add(ImgModel(R.drawable.amsungalaxyourth,"$890","Motorola One Edge"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxyfirst,"$1,47","Samsung Galaxy s20 Ultra"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxysecond,"$600","Xiaomi Mi 10 Pro"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,"$1,069","Samsung Note 20 Ultra "))
        arrayList.add(ImgModel(R.drawable.amsungalaxyourth,"$890","Motorola One Edge"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxyfirst,"$1,47","Samsung Galaxy s20 Ultra"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxysecond,"$600","Xiaomi Mi 10 Pro"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,"$1,069","Samsung Note 20 Ultra "))
        arrayList.add(ImgModel(R.drawable.amsungalaxyourth,"$890","Motorola One Edge"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxyfirst,"$1,47","Samsung Galaxy s20 Ultra"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxysecond,"$600","Xiaomi Mi 10 Pro"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,"$1,069","Samsung Note 20 Ultra "))
        arrayList.add(ImgModel(R.drawable.amsungalaxyourth,"$890","Motorola One Edge"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxyfirst,"$1,47","Samsung Galaxy s20 Ultra"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxysecond,"$600","Xiaomi Mi 10 Pro"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,"$1,069","Samsung Note 20 Ultra "))
        arrayList.add(ImgModel(R.drawable.amsungalaxyourth,"$890","Motorola One Edge"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxyfirst,"$1,47","Samsung Galaxy s20 Ultra"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxysecond,"$600","Xiaomi Mi 10 Pro"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,"$1,069","Samsung Note 20 Ultra "))
        arrayList.add(ImgModel(R.drawable.amsungalaxyourth,"$890","Motorola One Edge"))
        adapter = ImgAdapter(arrayList)
        binding.recicleView.adapter
    }
}