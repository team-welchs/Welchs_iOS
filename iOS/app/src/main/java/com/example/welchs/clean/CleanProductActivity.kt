package com.example.welchs.clean

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.welchs.R
import com.example.welchs.databinding.ActivityCleanProductBinding
import com.example.welchs.databinding.ActivityRecycleBinding
import com.example.welchs.recycler.RecycleAdapter
import com.example.welchs.recycler.RecycleData

class CleanProductActivity : AppCompatActivity() {

    lateinit var binding: ActivityCleanProductBinding

    lateinit var cleanAdapter: CleanAdapter
    val datas = mutableListOf<CleanData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_clean_product)

        binding.back.setOnClickListener {
            finish()
        }
        initRecycler()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initRecycler() {

        cleanAdapter = CleanAdapter(this)
        binding.rv.adapter = cleanAdapter
        binding.rv.layoutManager = LinearLayoutManager(this)

        datas.apply {
            add(
                CleanData(
                    image = R.drawable.img,
                    title = "버려진 청바지로 만든 가방",
                    maker = "유현명"
                )
            )
            add(
                CleanData(
                    image = R.drawable.img_1,
                    title = "업사이클링 모빌",
                    maker = "김시안"
                )
            )
            add(
                CleanData(
                    image = R.drawable.img,
                    title = "캔 터치 무드등",
                    maker = "박상진"
                )
            )
            add(
                CleanData(
                    image = R.drawable.img_1,
                    title = "종이로 만든 고양이 이불",
                    maker = "박상진"
                )
            )
            add(
                CleanData(
                    image = R.drawable.img_1,
                    title = "종이로 만든 고양이 이불",
                    maker = "박상진"
                )
            )

            cleanAdapter.datas = datas
            cleanAdapter.notifyDataSetChanged()
        }
    }
}