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
    private AudioPlayer audioPlayer=new AudioPlayer();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_hello_moon,null);

         play=(Button) view.findViewById(R.id.btn_play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioPlayer.play(getActivity());
            }
        });
         stop=(Button) view.findViewById(R.id.btn_stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioPlayer.stop();

            }
        });

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        audioPlayer.stop();

    }
}

