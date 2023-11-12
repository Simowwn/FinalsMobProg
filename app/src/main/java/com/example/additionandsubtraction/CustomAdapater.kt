package com.example.additionandsubtraction
import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapater(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapater.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context) //layout inflater class
            .inflate(R.layout.recyclerview_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        holder.imageview.setImageResource(ItemsViewModel.image)
        holder.textview.text = ItemsViewModel.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        val imageview: ImageView = itemView.findViewById(R.id.image)
        val textview : TextView = itemView.findViewById(R.id.textview)

    }
}