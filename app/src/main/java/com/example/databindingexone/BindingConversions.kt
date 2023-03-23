package com.example.databindingexone

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object BindingConversions {
    @BindingAdapter("imageUrl")
    @JvmStatic
    fun loadImage(imageView : ImageView, url : String){

        Glide.with(imageView.context).load(url)
            .error(R.drawable.pc)
            .into(imageView)
    }
}