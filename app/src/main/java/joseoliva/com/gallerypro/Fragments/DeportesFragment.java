package joseoliva.com.gallerypro.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import joseoliva.com.gallerypro.R;


public class DeportesFragment extends Fragment {

    View mView;

    public DeportesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_deportes, container, false);
        return mView;
    }
}