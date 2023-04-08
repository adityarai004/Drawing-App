package com.example.drawingapp

import android.app.Dialog
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var drawingView:DrawingView
    private lateinit var ibBrush:ImageButton
    private lateinit var ibBlack:ImageButton
    private lateinit var ibPurple:ImageButton
    private lateinit var ibRed:ImageButton
    private lateinit var ibGreen:ImageButton
    private lateinit var ibBlue:ImageButton
    private lateinit var ibBhagwa:ImageButton
    private lateinit var ibYellow:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawingView = findViewById(R.id.drawing_view)
        drawingView.setSizeForBrush(22.toFloat())
        ibBlack = findViewById(R.id.black)
        ibPurple = findViewById(R.id.purple)
        ibRed = findViewById(R.id.red)
        ibGreen = findViewById(R.id.green)
        ibBlue = findViewById(R.id.blue)
        ibBhagwa = findViewById(R.id.bhagwa)
        ibYellow = findViewById(R.id.yellow)
        ibBlack.setOnClickListener{
            drawingView.changeColor("black")
        }
        ibPurple.setOnClickListener{
            Toast.makeText(this,"Purple button clicked",Toast.LENGTH_SHORT).show()
            drawingView.changeColor("purple")
        }
        ibRed.setOnClickListener{
            Toast.makeText(this,"Red button clicked",Toast.LENGTH_SHORT).show()
            drawingView.changeColor("red")
        }
        ibGreen.setOnClickListener{
            Toast.makeText(this,"Green button clicked",Toast.LENGTH_SHORT).show()
            drawingView.changeColor("green")
        }
        ibBlue.setOnClickListener{
            Toast.makeText(this,"Blue button clicked",Toast.LENGTH_SHORT).show()
            drawingView.changeColor("blue")
        }
        ibBhagwa.setOnClickListener{
            Toast.makeText(this,"Bhagwa button clicked",Toast.LENGTH_SHORT).show()
            drawingView.changeColor("orange")
        }
        ibYellow.setOnClickListener{
            Toast.makeText(this,"Yellow button clicked",Toast.LENGTH_SHORT).show()
            drawingView.changeColor("yellow")
        }
        ibBrush = findViewById(R.id.ib_brush)
        ibBrush.setOnClickListener {
            showBrushSizeChooserDialog()
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    private fun showBrushSizeChooserDialog(){
        var dialogBox:Dialog = Dialog(this)
        dialogBox.setContentView(R.layout.dialog_brush_size)
        dialogBox.setTitle("Choose Brush Size")
        val smallBtn = dialogBox.findViewById<ImageButton>(R.id.ib_small_brush)
        val mediumBtn = dialogBox.findViewById<ImageButton>(R.id.ib_medium_brush)
        val largeBtn = dialogBox.findViewById<ImageButton>(R.id.ib_large_brush)
        smallBtn.setOnClickListener{
            drawingView.setSizeForBrush(10.toFloat())
            dialogBox.dismiss()
        }
        mediumBtn.setOnClickListener{
            drawingView.setSizeForBrush(20.toFloat())
            dialogBox.dismiss()
        }
        largeBtn.setOnClickListener{
            drawingView.setSizeForBrush(30.toFloat())
            dialogBox.dismiss()
        }
        dialogBox.show()
    }
}