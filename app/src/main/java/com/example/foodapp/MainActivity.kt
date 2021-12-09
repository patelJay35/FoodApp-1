package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  val img = arrayOf(R.drawable.food_one,R.drawable.food_two,R.drawable.food_three
        ,R.drawable.food_four,R.drawable.food_five,R.drawable.food_six)

    private val texts = arrayOf("Special Noodles", "Drink",
        "chipesFun",
        "Burger","Dal-Fry","Sandwich")

    private val desc = arrayOf("non veg",
        "Yellow Sunday","customizable",
        "Veg burger","veg",
        "Bombay grilled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img,texts,desc)
    }
}