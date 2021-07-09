package com.example.cal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //SUMに合計値を入れる
    var SUM: Int = 0
    val avi = AviSet()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //計算を確定させる
        binding.button.setOnClickListener {
            binding.calSum.text = SUM.toString()
            if (SUM < 1000) {
                //Gランクと表示する
                binding.Rank.text = "Gランク"
            }
        }

        //全身全霊
        val ZenshinZenrei = AviSet()
        ZenshinZenrei.name = "全身全霊"
        ZenshinZenrei.score = 3
        binding.zenshinZenrei.setOnClickListener {
            SUM = avi.score!!
        }
    }
}

class AviSet() {
    var name: String? = ""
    var score: Int? = 300
    var check: Boolean = false
}




