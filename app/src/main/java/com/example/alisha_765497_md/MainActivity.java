package com.example.alisha_765497_md;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText DRent;
    TextView days;
    SeekBar seekBar;
    RadioGroup ageType;
    CheckBox checkbox;
    CheckBox CheckBox1;
    CheckBox CheckBox2;
    CheckBox CheckBox3;
    Button button;
    TextView Amount;
    TextView Totalamount;

    double C_Rent = 0;
    double daysNumber = 1;
    double price = 0;
    double tot= 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner = findViewById(R.id.choose_car);
        DRent = findViewById(R.id.daily_rent);
        days = findViewById(R.id.days_no);
        seekBar = findViewById(R.id.Show_days);
        ageType = findViewById(R.id.age);
        checkbox = findViewById(R.id.checkbox1);
        button = findViewById(R.id.btn);
        Amount = findViewById(R.id.amount);
        Totalamount = findViewById(R.id.totalamount);
        CheckBox1 = findViewById(R.id.checkbox1);
        CheckBox2 = findViewById(R.id. checkbox2);
        CheckBox3 = findViewById(R.id.checkbox3);

        final String[] prices = getResources().getStringArray(R.array.Rent);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                DRent.setText(prices[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                days.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        CheckBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

              C_Rent += 5;
              tAmount();
              Amount.setText(String.valueOf(price));
              Totalamount.setText(String.valueOf(tot));
            }
        });

       CheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
               C_Rent += 7;
               tAmount();
               Amount.setText(String.valueOf(price));
               Totalamount.setText(String.valueOf(tot));
           }
       });

       CheckBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

               C_Rent += 10;
               tAmount();
               Amount.setText(String.valueOf(price));
               Totalamount.setText(String.valueOf(tot));
           }
       });

       ageType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup radioGroup, int i) {
               switch(i){



                   case R.id.rd1:
                       C_Rent +=5;
                       tAmount();
                       Amount.setText(String.valueOf(price));
                       Totalamount.setText(String.valueOf(tot));
                       break;
                   case R.id.rd2:
                       C_Rent += 0;
                       tAmount();
                       Amount.setText(String.valueOf(price));
                       Totalamount.setText(String.valueOf(tot));
                       break;
                   case R.id.rd3:
                       C_Rent -= 10;
                       tAmount();
                       Amount.setText(String.valueOf(price));
                       Totalamount.setText(String.valueOf(tot));

                       break;
                       //jiojio
               }

           }
       });
    }




    public void tAmount()
    {
          price = C_Rent * daysNumber;
         tot =  price * 0.13;
    }

}
