package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.timessquare.CalendarPickerView
import com.squareup.timessquare.CalendarPickerView.OnDateSelectedListener
import java.util.*

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)
        val today = Date()
        val nextYear = Calendar.getInstance()
        nextYear.add(Calendar.YEAR, 1)
        val datePicker = findViewById<CalendarPickerView>(R.id.calender)
        datePicker.init(today, nextYear.time).withSelectedDate(today)
        datePicker.setOnDateSelectedListener(object : OnDateSelectedListener {
            override fun onDateSelected(date: Date) {
                // String selectedDate = DateFormat.getDateInstance(DateFormat.FULL).format(date);
                val calSelected = Calendar.getInstance()
                calSelected.time = date
                val selectedDate = ("" + calSelected[Calendar.DAY_OF_MONTH]
                        + "" + (calSelected[Calendar.MONTH] + 1)
                        + "" + calSelected[Calendar.YEAR])
                Toast.makeText(this@MainActivity13, selectedDate, Toast.LENGTH_SHORT).show()
            }

            override fun onDateUnselected(date: Date) {}
        })
    }
}