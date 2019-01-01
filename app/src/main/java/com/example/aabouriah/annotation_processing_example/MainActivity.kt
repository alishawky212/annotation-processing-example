package com.example.aabouriah.annotation_processing_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mindorks.binder.Binding
import com.mindorks.lib.annotations.BindView


class MainActivity : AppCompatActivity() {

    @BindView(R.id.text_view)
    var tvContent: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Binding.bind(this)

        tvContent!!.text = "Hello Its My First Lib"
    }
}
