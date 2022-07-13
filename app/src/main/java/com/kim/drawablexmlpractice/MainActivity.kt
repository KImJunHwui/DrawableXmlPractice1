package com.kim.drawablexmlpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.my_custom_actionbar.*

class MainActivity : AppCompatActivity() {

    lateinit var toastBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val defaultActionBar = supportActionBar!!

        defaultActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

        defaultActionBar.setCustomView(R.layout.my_custom_actionbar)

        val toolBar = defaultActionBar.customView.parent as Toolbar
        toolBar.setContentInsetsAbsolute(0,0)

        toastBtn = defaultActionBar.customView.findViewById<Button>(R.id.toastBtn)

        toastBtn.setOnClickListener {

            Toast.makeText(this, "김준휘", Toast.LENGTH_SHORT).show()
        }
    }
}