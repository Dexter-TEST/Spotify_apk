package com.spotify.playback.playbacknative.AudioDeviceInfoFacadeKt;
import android.media.AudioDeviceInfo;
import java.lang.String;
import android.os.Build$VERSION;
import p.q3;

public final class AudioDeviceInfoFacadeKt	// class@000aca from classes.dex
{

    public static final String access$getAddressFrom(AudioDeviceInfo p0){
       return AudioDeviceInfoFacadeKt.getAddressFrom(p0);
    }
    private static final String getAddressFrom(AudioDeviceInfo p0){
       String str = (Build$VERSION.SDK_INT >= 28)? q3.m(p0): null;
       return str;
    }
}
