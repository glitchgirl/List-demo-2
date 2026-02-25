package com.example.list_demo_2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        recyclerView.adapter = LanguageAdapter(languages) { selectedLanguage ->
            Toast.makeText(
                this,
                "You clicked: $selectedLanguage",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
