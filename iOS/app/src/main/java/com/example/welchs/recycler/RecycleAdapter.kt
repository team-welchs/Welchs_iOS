package com.example.welchs.recycler

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.welchs.R

class RecycleAdapter (private val context: Context): RecyclerView.Adapter<RecycleAdapter.CustomViewHolder>(){

    var datas = mutableListOf<RecycleData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycle_item, parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    class CustomViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val profile = itemView.findViewById<ImageView>(R.id.profile)
        val name = itemView.findViewById<TextView>(R.id.name)
        val time = itemView.findViewById<TextView>(R.id.time)
        val email = itemView.findViewById<TextView>(R.id.email)
        val item = itemView.findViewById<ImageView>(R.id.iv)
        val title = itemView.findViewById<TextView>(R.id.title)

        fun bind(recycleData: RecycleData) {
            name.text = recycleData.name
            time.text = recycleData.time
            email.text = recycleData.email
            title.text = recycleData.title
            Glide.with(itemView)
                .load(recycleData.item)
                .into(item)
            Glide.with(itemView)
                .load(recycleData.profile)
                .into(profile)
        }
    }
}
