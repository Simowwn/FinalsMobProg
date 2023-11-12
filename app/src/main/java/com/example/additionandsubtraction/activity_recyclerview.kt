package com.example.additionandsubtraction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class activity_recyclerview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this) //vertical layout manager

        val data = ArrayList<ItemsViewModel>()

        for(i in 1 .. 20){
            data.add(ItemsViewModel(R.drawable.poro, "Item" + i))
        }

        val adapter = CustomAdapater(data)

        recyclerView.adapter = adapter
    }
}