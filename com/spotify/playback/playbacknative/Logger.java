package com.spotify.playback.playbacknative.Logger;
import com.spotify.playback.playbacknative.Logger$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;

public final class Logger	// class@000ae2 from classes.dex
{
    public static final Logger$Companion Companion;

    static {
       Logger.Companion = new Logger$Companion(null);
    }
    public void Logger(){
       super();
    }
    public static final void d(String p0,Object[] p1){
       Logger.Companion.d(p0, p1);
    }
    public static final void e(String p0,Object[] p1){
       Logger.Companion.e(p0, p1);
    }
    public static final void w(String p0,Object[] p1){
       Logger.Companion.w(p0, p1);
    }
    public static final void w(Throwable p0,String p1,Object[] p2){
       Logger.Companion.w(p0, p1, p2);
    }
}
