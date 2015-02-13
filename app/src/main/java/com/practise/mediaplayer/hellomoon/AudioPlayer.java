package com.practise.mediaplayer.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by home on 07-02-2015.
 */
public class AudioPlayer {

    private MediaPlayer mMediaPlayer;

    public void stop()
    {
        if(mMediaPlayer!=null)
        {
            mMediaPlayer.release();
            mMediaPlayer=null;
        }

    }

    public void play(Context c)
    {
        stop();
        mMediaPlayer=MediaPlayer.create(c,R.raw.one_small_step);
        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
        mMediaPlayer.start();
    }
}
