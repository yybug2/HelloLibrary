package com.gzyct.yybug.hellolibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gzyct.yybug.mylibrary.CustomUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println(CustomUtil.getMyHero())
        setContentView(R.layout.activity_main)
    }

}
