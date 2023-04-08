package com.example.drawingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var drawingView:DrawingView = findViewById(R.id.drawing_view)
        drawingView.setSizeForBrush(22.toFloat())
    }
}