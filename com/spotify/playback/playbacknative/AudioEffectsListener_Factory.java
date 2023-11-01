package com.spotify.playback.playbacknative.AudioEffectsListener_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.content.Context;
import com.spotify.playback.playbacknative.AudioEffectsListener;

public final class AudioEffectsListener_Factory implements a02	// class@000ad5 from classes.dex
{
    private final tm5 contextProvider;

    public void AudioEffectsListener_Factory(tm5 p0){
       super();
       this.contextProvider = p0;
    }
    public static AudioEffectsListener_Factory create(tm5 p0){
       return new AudioEffectsListener_Factory(p0);
    }
    public static AudioEffectsListener newInstance(Context p0){
       return new AudioEffectsListener(p0);
    }
    public AudioEffectsListener get(){
       return AudioEffectsListener_Factory.newInstance(this.contextProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
