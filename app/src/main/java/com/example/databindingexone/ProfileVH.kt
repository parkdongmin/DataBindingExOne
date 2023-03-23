package com.example.databindingexone

import androidx.recyclerview.widget.RecyclerView
import com.example.databindingexone.databinding.RcvListItemBinding

class ProfileVH(val binding : RcvListItemBinding) : RecyclerView.ViewHolder(binding.root){
    fun onBind(data : ProfileData){
        binding.user = data
    }

}