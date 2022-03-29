package com.galindo.colormyviews

import android.R.color.holo_green_dark
import android.R.color.holo_green_light
import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Color.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(boxOne_text, boxTwo_text, boxThree_text,
                   boxFour_text, boxFive_text, constraint_layout,
                   red_button, yellow_button, green_button)

        for (item in clickableViews)
            item.setOnClickListener {
                makeColored(it)
            }

    }

    @SuppressLint("ResourceAsColor", "ResourceType")
    private fun makeColored(view: View) {
        when(view.id) {
            R.id.boxOne_text -> view.setBackgroundColor(DKGRAY)
            R.id.boxTwo_text -> view.setBackgroundColor(GRAY)

            // Using Android resource color
            R.id.boxThree_text -> view.setBackgroundResource(holo_green_light)
            R.id.boxFour_text -> view.setBackgroundResource(holo_green_dark)
            R.id.boxFive_text -> view.setBackgroundResource(holo_green_light)

            // Using Android resource color
            R.id.red_button -> boxThree_text.setBackgroundColor(RED)
            R.id.yellow_button -> boxFour_text.setBackgroundColor(YELLOW)
            R.id.green_button -> boxFive_text.setBackgroundColor(GREEN)

            else -> view.setBackgroundColor(LTGRAY)

        }
    }
}