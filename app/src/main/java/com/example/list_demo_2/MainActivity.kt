package com.example.list_demo_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val languages = listOf(
            "Java",
            "Kotlin",
            "C#",
            "Python",
            "Swift",
            "JavaScript",
            "Go",
            "Rust"
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LanguageAdapter(languages)
    }
}
