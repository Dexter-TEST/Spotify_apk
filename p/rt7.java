package p.rt7;
import p.r15;
import p.ol2;
import p.we;
import java.lang.Object;
import p.j07;
import p.az5;
import java.lang.Class;
import p.a28;
import java.lang.Exception;
import p.ve;
import com.google.android.gms.common.api.Status;
import p.fp0;
import java.lang.System;
import p.ku7;
import p.qt7;
import android.os.Message;
import android.os.Handler;

public final class rt7 implements r15	// class@002558 from classes.dex
{
    public final ol2 a;
    public final int b;
    public final long c;

    public void rt7(ol2 p0,int p1,we p2,long p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p3;
    }
    public final void a(j07 p0){
       int i2;
       rt7 ort71;
       long l;
       int i3;
       int i4;
       rt7 ort7 = this;
       if (!ort7.a.g()) {
          return;
       }
       int i = 0;
       int i1 = ((ort7.c - i) > 0)? 1: 0;
       az5.H().getClass();
       rt7 a = ort7.a;
       if (p0.f()) {
          i2 = 0;
       }else if(p0.d != null){
          i3 = 100;
       }else {
          Exception uException = p0.d();
          if (uException instanceof ve) {
             ve a2 = uException.a;
             Status b = a2.b;
             Status v = ((v = a2.v) == null)? -1: v.b;
             i2 = v;
             i4 = b;
          }else {
             fp0 b1 = 101;
          }
       }
       i4 = i3;
       i2 = -1;
       if (i1) {
          ort71 = ort7.c;
          l = System.currentTimeMillis();
       }else {
          ort71 = i;
          l = ort71;
       }
       ku7 v7 = new ku7(ort7.b, 0, i2, ort71, l);
       ol2 n = a.n;
       qt7 a1 = new qt7(v7, 0, (long)5000, 100);
       n.sendMessage(n.obtainMessage(18, a));
       return;
    }
}
