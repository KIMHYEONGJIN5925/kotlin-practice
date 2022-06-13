package com.mola.twice_lecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //자동으로 스플래시에서 어떻게 메인액티비티로 넘어가냐! 핸들러를 이용한다
        //꺼진다 . 3초 뒤에
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}