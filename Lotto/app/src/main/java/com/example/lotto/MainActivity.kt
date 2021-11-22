package com.example.lotto

import android.graphics.Color
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class MainActivity : AppCompatActivity() {
    private val random = Random()
    private val nums = arrayListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottoBtn1 = findViewById<Button>(R.id.lottoBtn1)
        val lottoBtn2 = findViewById<Button>(R.id.lottoBtn2)
        val lottoBtn3 = findViewById<Button>(R.id.lottoBtn3)
        val lottoBtn4 = findViewById<Button>(R.id.lottoBtn4)
        val lottoBtn5 = findViewById<Button>(R.id.lottoBtn5)
        val lottoBtn6 = findViewById<Button>(R.id.lottoBtn6)

        findViewById<FloatingActionButton>(R.id.floatingActionButton).setOnClickListener {
            setLottoNum(lottoBtn1)
            setLottoNum(lottoBtn2)
            setLottoNum(lottoBtn3)
            setLottoNum(lottoBtn4)
            setLottoNum(lottoBtn5)
            setLottoNum(lottoBtn6)
        }
    }

    fun setLottoNum(lottoBtn: Button) {
        var num = 0
        while (true) {
            num = random.nextInt(45) + 1
            if (!nums.contains(num)) {
                nums.add(num)
                break
            }
        }

        setBtnColor(lottoBtn, num)
    }

    fun setBtnColor(lottoBtn: Button, num: Int) {
        lottoBtn.text = "${num}"
        if (num <= 10) {
            // yellow
            lottoBtn.backgroundTintList = ColorStateList.valueOf(Color.rgb(248, 224, 38))
        } else if (num <= 20) {
            // blue
            lottoBtn.backgroundTintList = ColorStateList.valueOf(Color.rgb(0, 0, 255))
        } else if (num <= 30) {
            // red
            lottoBtn.backgroundTintList = ColorStateList.valueOf(Color.rgb(255, 0, 0))
        } else if (num <= 40 ) {
            // gray
            lottoBtn.backgroundTintList = ColorStateList.valueOf(Color.rgb(86, 88, 88))
        } else {
            // green
            lottoBtn.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,255,0))
        }
    }
}