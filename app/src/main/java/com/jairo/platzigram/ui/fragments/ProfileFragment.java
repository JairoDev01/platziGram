package com.jairo.platzigram.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jairo.platzigram.R;
import com.jairo.platzigram.models.Picture;
import com.jairo.platzigram.ui.adapters.PictureAdapterRecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        showToolbar("",false,view);

        RecyclerView picturesRecycler = (RecyclerView)view.findViewById(R.id.picture_profile_recycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buidPictures(),R.layout.cardview_picture,getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;

    }

    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://images5.alphacoders.com/371/371897.jpg","Jairo Velásquez","4 Días", "100 me gusta"));
        pictures.add(new Picture("https://www.zonatopandroid.com/wp-content/uploads/2016/07/juegos-carros-gratis-android-iphone.jpg","Hecto Daniel","2 Días", "11"));
        pictures.add(new Picture("http://cdn.desktopwallpapers4.me/wallpapers/motorcycles/1920x1200/1/1476-suzuki-rmz-450-1920x1200-motorcycle-wallpaper.jpg","Lucas Smit","7 Días", "4 me gusta"));
        pictures.add(new Picture("http://www.diariomotor.com/imagenes/2009/01/ford-shelby-gt-500-mustang-2010-03.jpg","Jairo Velásquez","4 Días", "4"));
        pictures.add(new Picture("http://polaris.hs.llnwd.net/o40/orv/2017/img/model-overview/hero/es-mx/ace-500-indy-red-small.jpg","Jairo Velásquez","4 Días", "4"));
        return pictures;
    }

    public void showToolbar(String title, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
