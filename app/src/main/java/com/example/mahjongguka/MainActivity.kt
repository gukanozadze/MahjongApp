package com.example.mahjongguka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    var opened_buttons = arrayListOf<ImageView>()
    var current_buttons = arrayListOf<ImageView>()
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
                current_buttons.add(imageView_1)
                imageView_1.contentDescription = "mahjong_icon_1"
                checkEqual(current_buttons)
            }
            R.id.imageView_2 -> {
                imageView_2.setImageResource(R.mipmap.mahjong_icon_2)
                imageView_2.contentDescription = "mahjong_icon_2"
                current_buttons.add(imageView_2)
                checkEqual(current_buttons)
            }
            R.id.imageView_3 -> {
                imageView_3.setImageResource(R.mipmap.mahjong_icon_3)
                imageView_3.contentDescription = "mahjong_icon_3"
                current_buttons.add(imageView_3)
                checkEqual(current_buttons)
            }
            R.id.imageView_4 -> {
                imageView_4.setImageResource(R.mipmap.mahjong_icon_2)
                imageView_4.contentDescription = "mahjong_icon_2"
                current_buttons.add(imageView_4)
                checkEqual(current_buttons)
            }
            R.id.imageView_5 -> {
                imageView_5.setImageResource(R.mipmap.mahjong_icon_5)
                imageView_5.contentDescription = "mahjong_icon_5"
                current_buttons.add(imageView_5)
                checkEqual(current_buttons)
            }
            R.id.imageView_6 -> {
                imageView_6.setImageResource(R.mipmap.mahjong_icon_6)
                imageView_6.contentDescription = "mahjong_icon_6"
                current_buttons.add(imageView_6)
                checkEqual(current_buttons)
            }
            R.id.imageView_7 -> {
                imageView_7.setImageResource(R.mipmap.mahjong_icon_7)
                imageView_7.contentDescription = "mahjong_icon_7"
                current_buttons.add(imageView_7)
                checkEqual(current_buttons)
            }
            R.id.imageView_8 -> {
                imageView_8.setImageResource(R.mipmap.mahjong_icon_1)
                imageView_8.contentDescription = "mahjong_icon_1"
                current_buttons.add(imageView_8)
                checkEqual(current_buttons)
            }
            R.id.imageView_9 -> {
                imageView_9.setImageResource(R.mipmap.mahjong_icon_6)
                imageView_9.contentDescription = "mahjong_icon_6"
                current_buttons.add(imageView_9)
                checkEqual(current_buttons)
            }
            R.id.imageView_10 -> {
                imageView_10.setImageResource(R.mipmap.mahjong_icon_4)
                imageView_10.contentDescription = "mahjong_icon_4"
                current_buttons.add(imageView_10)
                checkEqual(current_buttons)
            }
            R.id.imageView_11 -> {
                imageView_11.setImageResource(R.mipmap.mahjong_icon_8)
                imageView_11.contentDescription = "mahjong_icon_8"
                current_buttons.add(imageView_11)
                checkEqual(current_buttons)
            }
            R.id.imageView_12 -> {
                imageView_12.setImageResource(R.mipmap.mahjong_icon_8)
                imageView_12.contentDescription = "mahjong_icon_8"
                current_buttons.add(imageView_12)
                checkEqual(current_buttons)
            }
            R.id.imageView_13 -> {
                imageView_13.setImageResource(R.mipmap.mahjong_icon_3)
                imageView_13.contentDescription = "mahjong_icon_3"
                current_buttons.add(imageView_13)
                checkEqual(current_buttons)
            }
            R.id.imageView_14 -> {
                imageView_14.setImageResource(R.mipmap.mahjong_icon_7)
                imageView_14.contentDescription = "mahjong_icon_7"
                current_buttons.add(imageView_14)
                checkEqual(current_buttons)
            }
            R.id.imageView_15 -> {
                imageView_15.setImageResource(R.mipmap.mahjong_icon_4)
                imageView_15.contentDescription = "mahjong_icon_4"
                current_buttons.add(imageView_15)
                checkEqual(current_buttons)
            }
            R.id.imageView_16 -> {
                imageView_16.setImageResource(R.mipmap.mahjong_icon_5)
                imageView_16.contentDescription = "mahjong_icon_5"
                current_buttons.add(imageView_16)
                checkEqual(current_buttons)
            }
        }
    }

    fun checkEqual(buttons: ArrayList<ImageView>){
        if (current_buttons.size != 1 && current_buttons.size != 0){

            if (buttons[1].contentDescription == buttons[0].contentDescription){

                buttons[0].isClickable=false
                buttons[1].isClickable=false

                opened_buttons.add(buttons[0])
                opened_buttons.add(buttons[1])
                current_buttons = arrayListOf()


            }else{
                makeButtonsUnclickable()
                Handler().postDelayed(
                    {


                        buttons[0].contentDescription = "unopened"
                        buttons[1].contentDescription = "unopened"

                        buttons[0].setImageResource(R.mipmap.question_mark_icon)
                        buttons[1].setImageResource(R.mipmap.question_mark_icon)

                        current_buttons = arrayListOf()
                        makeButtonsClickable()
                    },
                    500 // value in milliseconds
                )
            }
        }
    }

    fun makeButtonsUnclickable(){
        imageView_1.isClickable = false
        imageView_2.isClickable = false
        imageView_3.isClickable = false
        imageView_4.isClickable = false
        imageView_5.isClickable = false
        imageView_6.isClickable = false
        imageView_7.isClickable = false
        imageView_8.isClickable = false
        imageView_9.isClickable = false
        imageView_10.isClickable = false
        imageView_11.isClickable = false
        imageView_12.isClickable = false
        imageView_13.isClickable = false
        imageView_14.isClickable = false
        imageView_15.isClickable = false
        imageView_16.isClickable = false


    }

    fun makeButtonsClickable(){
        imageView_1.isClickable = true
        imageView_2.isClickable = true
        imageView_3.isClickable = true
        imageView_4.isClickable = true
        imageView_5.isClickable = true
        imageView_6.isClickable = true
        imageView_7.isClickable = true
        imageView_8.isClickable = true
        imageView_9.isClickable = true
        imageView_10.isClickable = true
        imageView_11.isClickable = true
        imageView_12.isClickable = true
        imageView_13.isClickable = true
        imageView_14.isClickable = true
        imageView_15.isClickable = true
        imageView_16.isClickable = true

        for (button in opened_buttons){
            button.isClickable = false
        }
    }

    // Reset
    fun resetActivity(view: View){
        val intent = intent
        finish()
        startActivity(intent)
    }
}
