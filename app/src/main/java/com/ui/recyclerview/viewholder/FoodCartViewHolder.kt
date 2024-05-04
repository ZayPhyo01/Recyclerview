package com.ui.recyclerview.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ui.recyclerview.FoodModel
import com.ui.recyclerview.R

class FoodCartViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvTitle: TextView = view.findViewById(R.id.tvTitle)
    val tvPrice: TextView = view.findViewById(R.id.tvPrice)


    fun bind(foodModel: FoodModel) {
        tvTitle.text = foodModel.title
        tvPrice.text = foodModel.price
    }
}