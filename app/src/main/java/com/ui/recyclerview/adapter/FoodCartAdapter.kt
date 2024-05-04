package com.ui.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ui.recyclerview.FoodModel
import com.ui.recyclerview.FoodViewHolder
import com.ui.recyclerview.R
import com.ui.recyclerview.viewholder.FoodCartViewHolder

class FoodCartAdapter : RecyclerView.Adapter<FoodCartViewHolder>() {

    private var foodList: List<FoodModel> = emptyList()

    fun updateFoodList(list: List<FoodModel>) {
        foodList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodCartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_view_food_cart, parent, false
        )
        return FoodCartViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodCartViewHolder, position: Int) {
        holder.bind(
            foodList[position]
        )
    }

    override fun getItemCount(): Int {
        return foodList.size
    }


}