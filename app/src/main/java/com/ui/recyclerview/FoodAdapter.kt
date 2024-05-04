package com.ui.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// bridge between data and ui
class FoodAdapter : RecyclerView.Adapter<FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5000
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind()
    }

}


//view hold , ui bind
class FoodViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val ivFood: ImageView = view.findViewById(R.id.ivFood)

    fun bind() {
        // ui bind
    }
}
