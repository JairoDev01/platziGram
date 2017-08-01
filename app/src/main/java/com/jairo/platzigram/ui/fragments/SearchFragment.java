package com.jairo.platzigram.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.jairo.platzigram.R;

import br.com.mauker.materialsearchview.MaterialSearchView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    public static final String CONTENT_AUTHORITY = "br.com.mauker.materialsearchview.searchhistorydatabase";
    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_search, container, false);

    }


}
