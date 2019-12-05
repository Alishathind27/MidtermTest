package com.example.alisha_765497_md;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class showDetails extends AppCompatActivity {


    EditText Name;
    EditText dRent;
    EditText days;
    EditText driverAge;
    EditText SelectedOption;
    EditText amount;
    EditText TotalPayment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        Name = findViewById(R.id.name);
        dRent = findViewById(R.id.Rent);
        days = findViewById(R.id.days);
        driverAge = findViewById(R.id.age);
        SelectedOption = findViewById(R.id.checkedOption);
        amount = findViewById(R.id.Price);
        TotalPayment = findViewById(R.id.payment);
    }
}
