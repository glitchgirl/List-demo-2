package com.example.list_demo_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LanguageAdapter(private val languages: List<String>) :
    RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtLanguage: TextView = itemView.findViewById(R.id.txtLanguage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_language, parent, false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.txtLanguage.text = languages[position]
    }

    override fun getItemCount(): Int {
        return languages.size
    }
}

