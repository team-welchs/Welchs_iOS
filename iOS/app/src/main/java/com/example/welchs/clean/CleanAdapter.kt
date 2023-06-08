package com.example.welchs.clean

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.welchs.R
import com.example.welchs.recycler.RecycleAdapter
import com.example.welchs.recycler.RecycleData

class CleanAdapter (private val context: Context): RecyclerView.Adapter<CleanAdapter.CustomViewHolder>(){

    var datas = mutableListOf<CleanData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.clean_item, parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val maker = itemView.findViewById<TextView>(R.id.makers)
        val image = itemView.findViewById<ImageView>(R.id.image)
        val title = itemView.findViewById<TextView>(R.id.title)

        fun bind(cleanData: CleanData) {
            title.text = cleanData.title
            maker.text = cleanData.maker
            Glide.with(itemView)
                .load(cleanData.image)
                .into(image)
        }
    }
}
