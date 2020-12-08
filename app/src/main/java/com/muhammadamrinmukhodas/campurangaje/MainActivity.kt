package com.muhammadamrinmukhodas.campurangaje

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.muhammadamrinmukhodas.campurangaje.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_simple_intent.setOnClickListener {
            val simpleIntent = Intent(this@MainActivity, SimpleActivity::class.java)
            startActivity(simpleIntent)
        }
        btn_intent_with_data.setOnClickListener {
            val dataIntent = Intent(this@MainActivity, ExplicitIntentActivity::class.java)
            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_NAME, "Muhammad Amrin Mukhodas")
            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_EMAIL, "amrin10122000@gmail.com")
            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_AGE, "19 Tahun")
            startActivity(dataIntent)
        }
        btn_intent_pacelable.setOnClickListener {
            val parcelIntent = Intent(this@MainActivity, ParcleActivity::class.java)
            val user = User("Muhammad Amrin Mukhodas", "amrin10122000@gmail.com", "19 Tahun")
            parcelIntent.putExtra(ParcleActivity.EXTRA_USER, user)
            startActivity(parcelIntent)
        }
        btn_implicit_intent.setOnClickListener {
            val phoneNumber = "089524526934"
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$phoneNumber"))
            intent.putExtra("sms_body", "Hello World !")
            startActivity(intent)
        }
        btn_intent_result.setOnClickListener {
            val intent = Intent()
        }
    }
}