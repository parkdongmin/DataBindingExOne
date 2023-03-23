package com.example.databindingexone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databindingexone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this@MainActivity

        setRcv()
        setObserv()

    }

    fun btnClick(view : View){
        Toast.makeText(this,"hi click",Toast.LENGTH_SHORT).show()
    }

    fun setRcv(){
        val profileAdapter = ProfileAdapter(this)
        binding.mainRcv.layoutManager = LinearLayoutManager(this)
        binding.mainRcv.adapter = profileAdapter
        profileAdapter.data = listOf(
            ProfileData(profile = "이미지 url", name = "Kang", age = 26),
            ProfileData(profile = "이미지 url", name = "Kim", age = 25)
        )
        profileAdapter.notifyDataSetChanged()
    }

    fun setObserv(){
        var item : ObservableData = ObservableData()
        item.site = "Naver"
        binding.site = item

        Handler().postDelayed(Runnable {
            run {
                item.site = "Google"
            }
        },3000)
    }

}