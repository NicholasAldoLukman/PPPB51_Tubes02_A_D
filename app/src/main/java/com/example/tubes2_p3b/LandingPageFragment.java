package com.example.tubes2_p3b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public class LandingPageFragment extends Fragment {

    private final MainActivity activity;
    View view;

    public LandingPageFragment(MainActivity activity){
        this.activity=activity;
    }

    public static LandingPageFragment newInstance(MainActivity activity) {
        LandingPageFragment fragment = new LandingPageFragment(activity);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState){
        view = inflater.inflate(R.layout.landing_page,container,false);
        return view;
    }


}
