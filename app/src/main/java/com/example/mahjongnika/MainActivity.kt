package com.example.mahjongnika

import android.graphics.Color
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log


class MainActivity : AppCompatActivity() {

    var opened_buttons = arrayListOf<ImageView>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    // Image 1 == Image 8
    // Image 2 == Image 4
    // Image 3 == image 13
    // Image 4 == Image 2
    // Image 5 == Image 16
    // Image 6 == Image 9
    // Image 7 = Image 14
    // Image 8 == Image 1
    // Image 9 == Image 6
    // Image 10 == Image 15
    // Image 11 == Image 12
    // Image 12 == Image 11
    // Image 13 == Image 3
    // Image 14 == Image 7
    // Image 15 == Image 10
    // Image 16 == Image 5
    fun clicked(view: View){
        when(view.id) {
            R.id.imageView_1 -> {

                imageView_1.setImageResource(R.mipmap.mahjong_icon_1)
                opened_buttons.add(imageView_1)
                imageView_1.contentDescription = "mahjong_icon_1"
                checkEqual(opened_buttons)
            }
            R.id.imageView_2 -> {
                imageView_2.setImageResource(R.mipmap.mahjong_icon_2)
                imageView_2.contentDescription = "mahjong_icon_2"
                opened_buttons.add(imageView_2)
                checkEqual(opened_buttons)
            }
            R.id.imageView_3 -> {
                imageView_3.setImageResource(R.mipmap.mahjong_icon_3)
                imageView_3.contentDescription = "mahjong_icon_3"
                opened_buttons.add(imageView_3)
                checkEqual(opened_buttons)
            }
            R.id.imageView_4 -> {
                imageView_4.setImageResource(R.mipmap.mahjong_icon_2)
                imageView_4.contentDescription = "mahjong_icon_2"
                opened_buttons.add(imageView_4)
                checkEqual(opened_buttons)
            }
            R.id.imageView_5 -> {
                imageView_5.setImageResource(R.mipmap.mahjong_icon_5)
                imageView_5.contentDescription = "mahjong_icon_5"
                opened_buttons.add(imageView_5)
                checkEqual(opened_buttons)
            }
            R.id.imageView_6 -> {
                imageView_6.setImageResource(R.mipmap.mahjong_icon_6)
                imageView_6.contentDescription = "mahjong_icon_6"
                opened_buttons.add(imageView_6)
                checkEqual(opened_buttons)
            }
            R.id.imageView_7 -> {
                imageView_7.setImageResource(R.mipmap.mahjong_icon_7)
                imageView_7.contentDescription = "mahjong_icon_7"
                opened_buttons.add(imageView_7)
                checkEqual(opened_buttons)
            }
            R.id.imageView_8 -> {
                imageView_8.setImageResource(R.mipmap.mahjong_icon_1)
                imageView_8.contentDescription = "mahjong_icon_1"
                opened_buttons.add(imageView_8)
                checkEqual(opened_buttons)
            }
            R.id.imageView_9 -> {
                imageView_9.setImageResource(R.mipmap.mahjong_icon_6)
                imageView_9.contentDescription = "mahjong_icon_6"
                opened_buttons.add(imageView_9)
                checkEqual(opened_buttons)
            }
            R.id.imageView_10 -> {
                imageView_10.setImageResource(R.mipmap.mahjong_icon_4)
                imageView_10.contentDescription = "mahjong_icon_4"
                opened_buttons.add(imageView_10)
                checkEqual(opened_buttons)
            }
            R.id.imageView_11 -> {
                imageView_11.setImageResource(R.mipmap.mahjong_icon_8)
                imageView_11.contentDescription = "mahjong_icon_8"
                opened_buttons.add(imageView_11)
                checkEqual(opened_buttons)
            }
            R.id.imageView_12 -> {
                imageView_12.setImageResource(R.mipmap.mahjong_icon_8)
                imageView_12.contentDescription = "mahjong_icon_8"
                opened_buttons.add(imageView_12)
                checkEqual(opened_buttons)
            }
            R.id.imageView_13 -> {
                imageView_13.setImageResource(R.mipmap.mahjong_icon_3)
                imageView_13.contentDescription = "mahjong_icon_3"
                opened_buttons.add(imageView_13)
                checkEqual(opened_buttons)
            }
            R.id.imageView_14 -> {
                imageView_14.setImageResource(R.mipmap.mahjong_icon_7)
                imageView_14.contentDescription = "mahjong_icon_7"
                opened_buttons.add(imageView_14)
                checkEqual(opened_buttons)
            }
            R.id.imageView_15 -> {
                imageView_15.setImageResource(R.mipmap.mahjong_icon_4)
                imageView_15.contentDescription = "mahjong_icon_4"
                opened_buttons.add(imageView_15)
                checkEqual(opened_buttons)
            }
            R.id.imageView_16 -> {
                imageView_16.setImageResource(R.mipmap.mahjong_icon_5)
                imageView_16.contentDescription = "mahjong_icon_5"
                opened_buttons.add(imageView_16)
                checkEqual(opened_buttons)
            }
        }
    }

    fun checkEqual(buttons: ArrayList<ImageView>){
        // Vamowmeb tu ori sxvadasxva buttonia daklikuli da ara 1 an 0
        if (opened_buttons.size != 1 && opened_buttons.size != 0){

            // Tu Ertnairia
            if (buttons[1].contentDescription == buttons[0].contentDescription){

                // Vxdit Buttonebs unclickables tu ertnairia
                buttons[0].isClickable=false
                buttons[1].isClickable=false

                // Vagdeb arraydan moqmed buttonebs
                Log.d("GUKABEFORE", "$opened_buttons")
                opened_buttons = arrayListOf<ImageView>()
                Log.d("GUKA", "$opened_buttons")


            // Tu araa ertnairi
            }else{
                Handler().postDelayed(
                    {
                        buttons[0].contentDescription = "unopened"
                        buttons[1].contentDescription = "unopened"

                        // Surats vukeneb kitxvis nishans
                        buttons[0].setImageResource(R.mipmap.question_mark_icon)
                        buttons[1].setImageResource(R.mipmap.question_mark_icon)

                        // Vagdeb arraydan moqmed buttonebs
                        Log.d("GUKABEFORE", "$opened_buttons")
                        opened_buttons = arrayListOf<ImageView>()
                        Log.d("GUKA", "$opened_buttons")
                    },
                    400 // value in milliseconds
                )

            }

        }
    }


    // Reset
    fun resetActivity(view: View){
        val intent = intent
        finish()
        startActivity(intent)
    }
}
