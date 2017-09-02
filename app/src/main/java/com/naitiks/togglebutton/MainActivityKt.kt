package com.naitiks.togglebutton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton

class MainActivityKt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tb1 = findViewById(R.id.btn_toggle_1) as ToggleButton
        val tb2 = findViewById(R.id.btn_toggle_2) as ToggleButton
        val submit = findViewById(R.id.btn_submit) as Button
        submit.setOnClickListener {
            Toast.makeText(this@MainActivityKt, "Button 1: " + tb1.text.toString() +
                    "Button 2: " + tb2.text.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}
