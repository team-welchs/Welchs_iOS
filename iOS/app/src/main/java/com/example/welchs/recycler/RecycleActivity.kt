package com.example.welchs.recycler

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.welchs.R
import com.example.welchs.databinding.ActivityRecycleBinding

class RecycleActivity : AppCompatActivity() {

    lateinit var binding: ActivityRecycleBinding
    lateinit var recycleAdapter: RecycleAdapter
    val datas = mutableListOf<RecycleData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycle)

        binding.back.setOnClickListener {
            finish()
        }

        initRecycler()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initRecycler() {

        recycleAdapter = RecycleAdapter(this)
        binding.rv.adapter = recycleAdapter
        binding.rv.layoutManager = LinearLayoutManager(this)

        datas.apply {
            add(
                RecycleData(
                    profile = R.drawable.profile1,
                    name = "유현명",
                    time = "5일 전",
                    email = "aahspringaa4@gmail.com",
                    item = R.drawable.item1,
                    title = "플라스틱으로 만든 튜브 짜개"
                )
            )
            add(
                RecycleData(
                    profile = R.drawable.profile2,
                    name = "김시안",
                    time = "7일 전",
                    email = "aspringaas4@gmail.com",
                    item = R.drawable.item2,
                    title = "지구사랑 서클 키링"
                )
            )
            add(
                RecycleData(
                    profile = R.drawable.profile3,
                    name = "박상진",
                    time = "11일 전",
                    email = "hspaa4@gmail.com",
                    item = R.drawable.item3,
                    title = "양말 텀블러 백"
                )
            )
            add(
                RecycleData(
                    profile = R.drawable.profile4,
                    name = "해리케인",
                    time = "12일 전",
                    email = "aahs4@gmail.com",
                    item = R.drawable.item4,
                    title = "태블릿 메뉴판 업사이클링 우드 거치대"
                )
            )

            recycleAdapter.datas = datas
            recycleAdapter.notifyDataSetChanged()
        }
    }
}
