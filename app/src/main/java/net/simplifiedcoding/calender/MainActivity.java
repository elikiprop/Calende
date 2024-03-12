package net.simplifiedcoding.calender;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalendarView calendarView = findViewById(R.id.ellie);

        // Set listener to handle date selection
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayOfMonth) {
                // Display selected date in a Toast
                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                Toast.makeText(MainActivity.this, "Selected Date: " + selectedDate, Toast.LENGTH_SHORT).show();
            }
        });
    }
}