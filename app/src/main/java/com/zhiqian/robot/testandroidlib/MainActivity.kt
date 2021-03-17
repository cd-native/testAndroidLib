package com.zhiqian.robot.testandroidlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.zhiqian.robot.testlib.TestLib
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener{
//            nice 非常好的
            TestLib.request()
//            Log.d("232323", "onCreate: 2")
        }
    }
}