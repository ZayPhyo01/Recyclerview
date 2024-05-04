package com.ui.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ui.recyclerview.adapter.FoodCartAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvFood = findViewById<RecyclerView>(R.id.rvFood)
        val foodCartAdapter = FoodCartAdapter()
        rvFood.adapter = foodCartAdapter

        foodCartAdapter.updateFoodList(
            list = listOf(
                FoodModel(
                    "Burger", "120$"
                ),
                FoodModel(
                    "Chicken", "12$"
                ),
                FoodModel(
                    "Ice cream", "10$"
                ),
                FoodModel(
                    "Donut", "12$"
                ),
                FoodModel(
                    "Juice", "8$"
                ),
                FoodModel(
                    "Burger", "120$"
                ),
                FoodModel(
                    "Chicken", "12$"
                ),
                FoodModel(
                    "Ice cream", "10$"
                ),
                FoodModel(
                    "Donut", "12$"
                ),
                FoodModel(
                    "Juice", "8$"
                ),
                FoodModel(
                    "Burger", "120$"
                ),
                FoodModel(
                    "Chicken", "12$"
                ),
                FoodModel(
                    "Ice cream", "10$"
                ),
                FoodModel(
                    "Donut", "12$"
                ),
                FoodModel(
                    "Juice", "8$"
                )
            )
        )

    }
}