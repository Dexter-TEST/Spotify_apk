package com.spotify.playback.playbacknative.Logger$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import p.co5;
import com.spotify.playback.playbacknative.LoggerKt;
import java.util.Arrays;
import android.util.Log;
import java.lang.Throwable;

public final class Logger$Companion	// class@000ae1 from classes.dex
{

    private void Logger$Companion(){
       super();
    }
    public void Logger$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final void d(String p0,Object[] p1){
       co5.o(p0, "s");
       co5.o(p1, "args");
       LoggerKt.access$getTAG$p();
       p1 = Arrays.copyOf(p1, p1.length);
       co5.l(String.format(p0, Arrays.copyOf(p1, p1.length)), "format\(format, *args\)");
    }
    public final void e(String p0,Object[] p1){
       co5.o(p0, "s");
       co5.o(p1, "args");
       p1 = Arrays.copyOf(p1, p1.length);
       p0 = String.format(p0, Arrays.copyOf(p1, p1.length));
       co5.l(p0, "format\(format, *args\)");
       Log.e(LoggerKt.access$getTAG$p(), p0);
    }
    public final void w(String p0,Object[] p1){
       co5.o(p0, "s");
       co5.o(p1, "args");
       LoggerKt.access$getTAG$p();
       p1 = Arrays.copyOf(p1, p1.length);
       co5.l(String.format(p0, Arrays.copyOf(p1, p1.length)), "format\(format, *args\)");
    }
    public final void w(Throwable p0,String p1,Object[] p2){
       co5.o(p0, "t");
       co5.o(p1, "s");
       co5.o(p2, "args");
       LoggerKt.access$getTAG$p();
       Object[] objArray = Arrays.copyOf(p2, p2.length);
       co5.l(String.format(p1, Arrays.copyOf(objArray, objArray.length)), "format\(format, *args\)");
    }
}
