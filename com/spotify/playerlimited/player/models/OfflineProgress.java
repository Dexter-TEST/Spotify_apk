package com.spotify.playerlimited.player.models.OfflineProgress;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class OfflineProgress	// class@000b76 from classes.dex
{
    public Integer a;
    public Long b;
    public Integer c;
    public Long d;
    public Integer e;
    public Long f;
    public Boolean g;
    public Integer h;
    public Float i;
    public Long j;

    public void OfflineProgress(){
       super();
    }
    public static void getDownloadSpeed$annotations(){
    }
    public static void getPercentComplete$annotations(){
    }
    public static void getQueuedBytes$annotations(){
    }
    public static void getQueuedTracks$annotations(){
    }
    public static void getSecondsLeft$annotations(){
    }
    public static void getSyncedBytes$annotations(){
    }
    public static void getSyncedTracks$annotations(){
    }
    public static void getSyncing$annotations(){
    }
    public static void getTotalBytes$annotations(){
    }
    public static void getTotalTracks$annotations(){
    }
    public final String toString(){
       return "{queuedTracks="+this.a+", queuedBytes="+this.b+", syncedTracks="+this.c+", syncedBytes="+this.d+", totalTracks="+this.e+", totalBytes="+this.f+", syncing="+this.g+", downloadSpeed="+this.h+", percentComplete="+this.i+", secondsLeft="+this.j+'}';
    }
}
