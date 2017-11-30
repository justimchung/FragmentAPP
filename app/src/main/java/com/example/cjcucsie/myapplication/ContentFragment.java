package com.example.cjcucsie.myapplication;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cjcucsie.myapplication.dummy.FoodContent;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends Fragment {
    private FoodContent.FoodItem mfood;

    public ContentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content, container, false);
    }

    public void setFood(FoodContent.FoodItem fi) {
        this.mfood = fi;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("fragment", "detach");
        mfood = null;
    }

    @Override
    public void onStart() {
        super.onStart();
        View v = getView();
        if(v != null && mfood !=null)
        {
            ImageView ivFood = (ImageView) v.findViewById(R.id.ivFood);
            ivFood.setImageResource(mfood.imgID);
            TextView tvTitle = (TextView) v.findViewById(R.id.tvTitle);
            tvTitle.setText(mfood.title);
            TextView tvCal = (TextView) v.findViewById(R.id.tvCal);
            tvCal.setText(String.valueOf(mfood.cal));
            TextView tvDetails = (TextView) v.findViewById(R.id.tvDetails);
            tvDetails.setText(mfood.details);
        }

    }
}
