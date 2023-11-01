package p.xr6;
import p.iw3;
import java.lang.Object;
import android.os.HandlerThread;
import java.lang.String;
import java.lang.Thread;
import android.os.Looper;
import p.lf7;
import p.qc4;
import android.os.Message;
import android.os.Handler;
import p.x44;
import p.yr6;
import android.util.LruCache;
import java.lang.System;

public final class xr6	// class@002cd4 from classes.dex
{
    public final iw3 a;
    public final x44 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;

    public void xr6(iw3 p0){
       super();
       this.a = p0;
       HandlerThread handlerThrea = new HandlerThread("Picasso-Stats", 10);
       handlerThrea.start();
       qc4 oqc4 = new qc4(handlerThrea.getLooper(), 2);
       oqc4.sendMessageDelayed(oqc4.obtainMessage(), 1000);
       this.b = new x44(handlerThrea.getLooper(), this, 7);
    }
    public final yr6 a(){
       xr6 oxr6 = this;
       xr6 a = oxr6.a;
       yr6 v25 = new yr6(a.a.maxSize(), a.a.size(), oxr6.c, oxr6.d, oxr6.e, oxr6.f, oxr6.g, oxr6.h, oxr6.i, oxr6.j, oxr6.k, oxr6.l, oxr6.m, System.currentTimeMillis());
       return v25;
    }
}
