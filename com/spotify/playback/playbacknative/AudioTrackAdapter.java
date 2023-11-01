package com.spotify.playback.playbacknative.AudioTrackAdapter;
import com.spotify.playback.playbacknative.AudioTrackAdapter$OnRoutingChangedListener;
import android.os.Handler;
import com.spotify.playback.playbacknative.AudioDeviceInfoFacade;

public interface abstract AudioTrackAdapter	// class@000adc from classes.dex
{

    void addOnRoutingChangedListener(AudioTrackAdapter$OnRoutingChangedListener p0,Handler p1);
    AudioDeviceInfoFacade getRoutedDevice();
    void removeOnRoutingChangedListener(AudioTrackAdapter$OnRoutingChangedListener p0);
}
