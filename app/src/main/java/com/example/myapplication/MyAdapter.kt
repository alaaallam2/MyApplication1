package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter (private val newslist :ArrayList<news>):
    RecyclerView.Adapter<MyAdapter.MyviewHolder>() {
    private lateinit var mListener :onItemCLickListener
    interface onItemCLickListener{
        fun onItemClick(position: Int)
    }
    fun setOnItemClickListener(listener: onItemCLickListener){
        mListener =listener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val imageView =LayoutInflater.from(parent.context).inflate(R.layout.list_item,
            parent,false)

        return MyviewHolder(imageView,mListener)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentItem=newslist[position]
        holder.titleImagae.setImageResource(currentItem.titelImage)
        holder.tvHeading.text=currentItem.heading
    }

    override fun getItemCount(): Int {
        return newslist.size
    }
    class MyviewHolder(itemView: View , listener: onItemCLickListener):RecyclerView.ViewHolder(itemView){
        val titleImagae :ShapeableImageView=itemView.findViewById(R.id.titel_image)
        val tvHeading : TextView= itemView.findViewById(R.id.tvHeading)
        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }


}