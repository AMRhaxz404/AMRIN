package com.muhammadamrinmukhodas.campurangaje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lbl_nama = findViewById<TextView>(R.id.lbl_nama)
        val lbl_follower_count = findViewById<TextView>(R.id.lbl_follower_count)
        val lbl_following_count = findViewById<TextView>(R.id.lbl_following_count)
        val btn_follow = findViewById<Button>(R.id.btn_follow)
        var follow_count = 2025
        var following_count = 100

        lbl_follower_count.text = follow_count.toString()
        btn_follow.setOnClickListener {
            follow_count++
            lbl_follower_count.text = follow_count.toString()
        }
    }
}