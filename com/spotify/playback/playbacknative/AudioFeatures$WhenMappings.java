package com.spotify.playback.playbacknative.AudioFeatures$WhenMappings;
import com.spotify.playback.playbacknative.AudioFeatures$AudioUsage;
import java.lang.Enum;

public final class AudioFeatures$WhenMappings	// class@000ad9 from classes.dex
{
    public static final int[] $EnumSwitchMapping$0;

    static {
       int len = AudioFeatures$AudioUsage.values().length;
       try{
          int[] ointArray = new int[len];
          ointArray[AudioFeatures$AudioUsage.MEDIA.ordinal()] = 1;
          try{
             e0[AudioFeatures$AudioUsage.ALARM.ordinal()] = 2;
             AudioFeatures$WhenMappings.$EnumSwitchMapping$0 = e0;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
