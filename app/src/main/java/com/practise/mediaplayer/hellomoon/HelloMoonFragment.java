package com.practise.mediaplayer.hellomoon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by home on 04-02-2015.
 */
public class HelloMoonFragment extends Fragment {

    private Button play;
    private Button stop;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_hello_moon,null);

         play=(Button) view.findViewById(R.id.btn_play);
         stop=(Button) view.findViewById(R.id.btn_stop);

        return view;
    }
}

