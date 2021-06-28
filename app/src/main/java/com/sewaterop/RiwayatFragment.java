package com.sewaterop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RiwayatFragment extends Fragment {


    public RiwayatFragment() {
        // Required empty public constructor
    }

    public static RiwayatFragment newInstance() {

        Bundle args = new Bundle();

        RiwayatFragment fragment = new RiwayatFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_riwayat, container, false);
    }

}