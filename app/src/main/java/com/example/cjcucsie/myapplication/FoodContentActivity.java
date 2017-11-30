package com.example.cjcucsie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cjcucsie.myapplication.dummy.FoodContent;

public class FoodContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_content);

        ContentFragment cf = (ContentFragment) getFragmentManager().findFragmentById(R.id.fragFoodContent);
        Intent it = getIntent();
        String id = it.getStringExtra("Food");
        FoodContent.FoodItem fi = FoodContent.ITEMS.get(Integer.parseInt(id)-1);

        cf.setFood(fi);
    }
}
