package p.od7;
import p.ah0;
import java.lang.Object;
import android.os.SystemClock;
import java.lang.System;

public final class od7 implements ah0	// class@0020fe from classes.dex
{
    public final int a;

    public void od7(int p0){
       this.a = p0;
       super();
    }
    public final long a(){
       switch (this.a){
           case 0:
           default:
             return System.currentTimeMillis();
       }
       return SystemClock.elapsedRealtime();
    }
}
