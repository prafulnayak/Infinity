package com.example.sss.infinity.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sss.infinity.MainActivity;
import com.example.sss.infinity.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Bookings extends Fragment {


    public Bookings() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Bookings");
        return inflater.inflate(R.layout.fragment_bookings, container, false);


    }

}
