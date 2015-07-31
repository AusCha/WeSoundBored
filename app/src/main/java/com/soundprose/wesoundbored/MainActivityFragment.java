package com.soundprose.wesoundbored;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main_layout, menu);
    }

    @Override
    public void onStart()    {
        super.onStart();
    }

    @Override
    public void onResume()    {
        super.onResume();
    }

    @Override
    public void onPause()    {
        super.onPause();
    }

    @Override
    public void onStop()    {
        super.onStop();
    }

    @Override
    public void onDestroy()    {
        super.onDestroy();
    }
}
