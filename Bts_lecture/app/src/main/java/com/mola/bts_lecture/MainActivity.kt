package com.mola.bts_lecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면(사진)이 클릭되었다는 것을 알아야 한다. (프로그램이)
        val image1 = findViewById<ImageView>(R.id.btsImage1)
        image1.setOnClickListener{
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면 다음화면으로 넘어가서 사진을 크게 보여준다.
            val intent1 = Intent(this, Bts1Activity::class.java)
            startActivity(intent1)
        }
        val image2 = findViewById<ImageView>(R.id.btsImage2)
        image2.setOnClickListener{
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면 다음화면으로 넘어가서 사진을 크게 보여준다.
            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }
        val image3 = findViewById<ImageView>(R.id.btsImage3)
        image3.setOnClickListener{
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면 다음화면으로 넘어가서 사진을 크게 보여준다.
            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }
        val image4 = findViewById<ImageView>(R.id.btsImage4)
        image4.setOnClickListener{
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면 다음화면으로 넘어가서 사진을 크게 보여준다.
            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }

    }
}


//val intent2 = Intent(this, Bts2Activity::class.java)
//startActivity(intent2)
//
//val intent3 = Intent(this, Bts3Activity::class.java)
//startActivity(intent3)
//
//val intent4 = Intent(this, Bts4Activity::class.java)
//startActivity(intent4)
//
//val intent5 = Intent(this, Bts5Activity::class.java)
//startActivity(intent5)
//
//val intent6 = Intent(this, Bts6Activity::class.java)
//startActivity(intent6)
//
//val intent7 = Intent(this, Bts7Activity::class.java)
//startActivity(intent7)