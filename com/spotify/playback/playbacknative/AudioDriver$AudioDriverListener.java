package com.spotify.playback.playbacknative.AudioDriver$AudioDriverListener;
import java.lang.Integer;

public interface abstract AudioDriver$AudioDriverListener	// class@000acd from classes.dex
{

    void onAudioTrackCreated(int p0);
    void onAudioTrackDestroyed(int p0);
    void onFlushComplete(int p0);
    void onFlushStart(int p0);
    void onPaused(boolean p0,Integer p1);
}
