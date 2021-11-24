package com.example.secret_memo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // EditText 컴포넌트를 찾아서 editText 변수에 저장
        val editText = findViewById<EditText>(R.id.editTextNumberPassword)

        findViewById<Button>(R.id.button).setOnClickListener {
            // editText에서 사용자가 입력한 텍스트 가져오기
            val passwordText = editText.text.toString()

            val password = "1234"
            if (passwordText == password) {
                Log.d("Password", "통과")
            } else {
                Log.d("Password", "틀렸어요.")
            }
        }
    }
}