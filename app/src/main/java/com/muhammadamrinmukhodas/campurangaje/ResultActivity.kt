package com.muhammadamrinmukhodas.campurangaje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        btn_result.setOnClickListener {
            if(rg_colors.checkedRadioButtonId != 0)
                var value = "#fff"
                when(rg_colors.checkedRadioButtonId) {
                    R.id.rad_hitam -> "#000"
                    R.id.rad_biru -> ""
                }
        }
    }
}