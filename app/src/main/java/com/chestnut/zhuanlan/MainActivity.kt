package com.chestnut.zhuanlan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.chestnut.zhuanlan.util.ApiUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ApiUtils.getLatestMsg()
    }
}
