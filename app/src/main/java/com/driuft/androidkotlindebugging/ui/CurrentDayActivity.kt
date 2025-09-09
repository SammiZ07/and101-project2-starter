package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import java.util.Calendar
import java.util.Locale

class CurrentDayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_day)

        val tvCurrentDay: TextView = findViewById(R.id.current_day_text)

        val cal = Calendar.getInstance()
        val dayName = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())
            ?: "Unknown"

        tvCurrentDay.text = dayName
    }
}
