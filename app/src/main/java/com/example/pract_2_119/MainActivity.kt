package com.example.pract_2_119

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun showmessage(msg:String) {
        Log.i(Tag,msg)
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        showmessage("onstart is called...")
    }

    override fun onResume() {
        super.onResume()
        showmessage("onresume is called...")
    }

    override fun onStop() {
        super.onStop()
        showmessage("onstop is called...")
    }
}