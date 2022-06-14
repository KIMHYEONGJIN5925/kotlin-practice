package com.mola.val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value = "여기는 value입니다!"
        val value2 = "여기는 value2입니다!"
        var variable = "var 는 재할당 가능"
        // value = "val 는 재할당이 불가능합니다!!"
        variable = "재할당해도 문제없습니다."

        Log.e("오류를 나타내는 로그", "블라블라") // 빨간색으로 나타남
        Log.w("경고를 나타내는 로그", "블라블라")
        Log.i("정보를 나타내는 로그", "블라블라")
        Log.d("디버그를 나타내는 로그", "블라블라")
        Log.v("상세를 나타내는 로그", "블라블라")

    }
}