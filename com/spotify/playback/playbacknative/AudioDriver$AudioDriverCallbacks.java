package com.spotify.playback.playbacknative.AudioDriver$AudioDriverCallbacks;
import com.spotify.playback.playbacknative.AudioFeatures;

public interface abstract AudioDriver$AudioDriverCallbacks	// class@000acc from classes.dex
{

    void abandonAudioFocus();
    boolean maybeAbandonAudioFocus();
    boolean requestAudioFocus(AudioFeatures p0);
}
