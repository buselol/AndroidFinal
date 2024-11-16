package com.example.androidprofinal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout = findViewById<ConstraintLayout>(android.R.id.content).rootView as ConstraintLayout

        val navigateButton = Button(this).apply {
            text = getString(R.string.go_to_next_page)  // Ensure this string exists in strings.xml
            id = View.generateViewId()
        }

        rootLayout.addView(navigateButton)

        val constraintSet = ConstraintSet().apply {
            clone(rootLayout)
            connect(navigateButton.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 200)
            connect(navigateButton.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 0)
            connect(navigateButton.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, 0)
        }
        constraintSet.applyTo(rootLayout)

        navigateButton.setOnClickListener {
            val intent = Intent(this, SecondPageActivity::class.java)
            startActivity(intent)
        }
    }
}
