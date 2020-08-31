package com.example.cameraapp

import android.content.Context
import android.graphics.BitmapFactory
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.list_photo.view.*


class PhotoAdapter(private val context: Context, private val listPhoto: ArrayList<Photo>) : RecyclerView.Adapter<PhotoAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list_photo,parent,false))
    }

    override fun getItemCount(): Int = listPhoto.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val photo = listPhoto[position]
        holder.view.img_kdrama_photo.setImageBitmap(photo.photo)

    }



    class Holder(val view: View) : RecyclerView.ViewHolder(view)

}