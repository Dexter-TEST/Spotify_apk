package p.qc4;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;
import java.lang.Object;
import p.a5;
import java.lang.Class;
import java.lang.String;
import android.graphics.Bitmap;
import p.wd5;
import p.ud5;
import java.lang.Exception;
import p.cv5;
import java.lang.StringBuilder;
import p.lf7;
import java.lang.AssertionError;
import p.e20;
import java.util.ArrayList;
import p.pc4;
import p.ln;
import java.util.concurrent.atomic.AtomicBoolean;
import p.mn;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import p.rq3;
import p.ne4;

public final class qc4 extends Handler	// class@002375 from classes.dex
{
    public final int a;

    public void qc4(){
       this.a = 0;
       super(Looper.getMainLooper());
    }
    public void qc4(Looper p0,int p1){
       this.a = p1;
       super(p0);
    }
    public final void handleMessage(Message p0){
       Message obj;
       ln x;
       mn b;
       int i3;
       int i4;
       Bitmap uBitmap;
       e20 c;
       int i = 3;
       ln oln = null;
       int i1 = 0;
       int i2 = 1;
       switch (this.a){
           case 0:
             obj = p0.obj;
             if ((p0 = p0.what) != i2) {
                if (p0 == 2) {
                   obj.a.getClass();
                }
             }else {
                pc4 a = obj.a;
                object oobject = obj.b[i1];
                if (a.t.get()) {
                   ln w = a.w;
                   x = a.x;
                   if (x.i == a) {
                      SystemClock.uptimeMillis();
                      x.i = oln;
                      x.b();
                   }
                   w.countDown();
                }else {
                   x = a.x;
                   if (x.h != a) {
                      if (x.i == a) {
                         SystemClock.uptimeMillis();
                         x.i = oln;
                         x.b();
                      }
                   }else if(x.d != null){
                      SystemClock.uptimeMillis();
                      x.h = oln;
                      if ((b = x.b) != null) {
                         if (Looper.myLooper() == Looper.getMainLooper()) {
                            b.k(oobject);
                         }else {
                            b.l(oobject);
                         }
                      }
                   }
                   a.w.countDown();
                }
                a.c = i;
             }
             break;
           case 1:
             obj = p0.what;
             String str = "Main";
             if (obj != i) {
                if (obj != 8) {
                   if (obj == 13) {
                      p0 = p0.obj;
                      i3 = p0.size();
                      i = 0;
                      while (i < i3) {
                         a5 uoa5 = p0.get(i);
                         a5 a1 = uoa5.a;
                         a1.getClass();
                         i4 = (!(i4 = uoa5.e & i2))? 1: 0;
                         uBitmap = (i4)? a1.h(uoa5.i): oln;
                         if (uBitmap != null) {
                            ud5 b1 = ud5.b;
                            a1.e(uBitmap, b1, uoa5, oln);
                            if (a1.l != null) {
                               lf7.f(str, "completed", uoa5.b.b(), "from ".append(b1).toString());
                            }
                         }else {
                            a1.f(uoa5);
                            if (a1.l != null) {
                               lf7.e(str, "resumed", uoa5.b.b());
                            }
                         }
                         i = i + 1;
                      }
                   }else {
                      throw new AssertionError("Unknown handler message received: "+p0.what);
                   }
                }else {
                   p0 = p0.obj;
                   i3 = p0.size();
                   i = 0;
                   while (i < i3) {
                      e20 uoe20 = p0.get(i);
                      e20 b2 = uoe20.b;
                      b2.getClass();
                      e20 b3 = uoe20.B;
                      uBitmap = ((c = uoe20.C) != null && !c.isEmpty())? 1: 0;
                      e20 g = (b3 == null && !uBitmap)? 0: 1;
                      if (b1) {
                         g = uoe20.G;
                         e20 d = uoe20.D;
                         uoe20 = uoe20.F;
                         if (b3 != null) {
                            b2.e(d, uoe20, b3, g);
                         }
                         if (uBitmap) {
                            int i5 = c.size();
                            for (i4 = 0; i4 < i5; i4 = i4 + 1) {
                               b2.e(d, uoe20, c.get(i4), g);
                            }
                         }
                      }
                      i = i + 1;
                   }
                }
             }else {
                p0 = p0.obj;
                if (p0.a.l != null) {
                   lf7.f(str, "canceled", p0.b.b(), "target got garbage collected");
                }
                p0.a.a(p0.d());
             }
             return;
             break;
           default:
             this.sendMessageDelayed(this.obtainMessage(), 1000);
             return;
       }
       return;
    }
}
