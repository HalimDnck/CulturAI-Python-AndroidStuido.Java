package com.example.culturai.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.culturai.R;

public class PlaceActivity extends AppCompatActivity {

    TextView cityName, cityOne, cityTwo;
    ImageView infoBtn,goBackBtn, cityImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        cityName = findViewById(R.id.city_name);
        String data = getIntent().getExtras().getString("city");
        cityName.setText(data);

        cityOne = findViewById(R.id.city_one);
        String data1 = getIntent().getExtras().getString("day_one");
        cityOne.setText(data1);

        cityTwo = findViewById(R.id.city_two);
        String data2 = getIntent().getExtras().getString("day_two");
        cityTwo.setText(data2);

        cityImage = findViewById(R.id.city_image);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("image");
            cityImage.setImageResource(resId);
        }



        infoBtn = findViewById(R.id.main_info);
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlaceActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });

        goBackBtn = findViewById(R.id.go_back_btn);
        goBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}