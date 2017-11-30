package com.example.cjcucsie.myapplication;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.widget.ViewDragHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.cjcucsie.myapplication.dummy.FoodContent;

public class MainActivity extends AppCompatActivity implements FoodItemFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(FoodContent.FoodItem item) {
        View v = findViewById(R.id.frag_container);
        if(v != null)  {
            ContentFragment cf = new ContentFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            cf.setFood(item);
            ft.replace(R.id.frag_container, cf);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else {
            Intent it = new Intent();
            it.setClass(this, FoodContentActivity.class);
            it.putExtra("Food", item.id);
            startActivity(it);
        }

    }
}
