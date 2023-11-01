package p.xa2;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import p.iv6;
import p.yf2;
import p.ya2;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import p.rn;
import p.mv6;
import p.vv7;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.yh6;
import java.lang.Throwable;
import p.co5;
import java.lang.String;
import java.util.Objects;
import java.util.Arrays;
import p.bn5;

public final class xa2 extends AtomicInteger implements kv6	// class@002c39 from classes.dex
{
    public final iv6 a;
    public final ya2[] b;
    public final yf2 c;
    public final AtomicLong t;
    public final rn v;
    public final boolean w;
    public boolean x;
    public final Object[] y;

    public void xa2(iv6 p0,yf2 p1,boolean p2,int p3,int p4){
       super();
       this.a = p0;
       this.c = p1;
       this.w = p2;
       ya2[] oya2Array = new ya2[p3];
       for (int i = 0; i < p3; i++) {
          oya2Array[i] = new ya2(this, p4);
       }
       Object[] objArray = new Object[p3];
       this.y = objArray;
       this.b = oya2Array;
       this.t = new AtomicLong();
       this.v = new rn();
       return;
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this.t, p0);
          this.c();
       }
       return;
    }
    public final void b(){
       xa2 tb = this.b;
       int len = tb.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = tb[i];
          oobject.getClass();
          mv6.b(oobject);
       }
       return;
    }
    public final void c(){
       object oobject;
       ya2 w;
       ya2 t;
       Object obj;
       int len1;
       xa2 oxa2 = this;
       if (this.getAndIncrement()) {
          return;
       }
       xa2 a = oxa2.a;
       xa2 b = oxa2.b;
       int len = b.length;
       xa2 y = oxa2.y;
       int i = 1;
       do {
          long l = oxa2.t.get();
          int i1 = 0;
          long l1 = i1;
          while (true) {
             if (v16 = l - l1) {
                if (oxa2.x != null) {
                }else if(oxa2.w == null && oxa2.v.get() != null){
                   this.b();
                   oxa2.v.e(a);
                   return;
                }else {
                   int i2 = 0;
                   int i3 = 0;
                   while (true) {
                      if (i2 < len) {
                         oobject = b[i2];
                         if (y[i2] == null) {
                            w = oobject.w;
                            obj = ((t = oobject.t) != null)? t.poll(): null;
                            int i4 = (obj == null)? 1: 0;
                            if (w != null && i4) {
                               this.b();
                               oxa2.v.e(a);
                               return;
                            }else if(!i4){
                               y[i2] = obj;
                            }else {
                               i3 = 1;
                            }
                         }
                         i2 = i2 + 1;
                      }else if(i3){
                      label_00b7 :
                         if (!v16) {
                            if (oxa2.x != null) {
                               return;
                            }else if(oxa2.w == null && oxa2.v.get() != null){
                               this.b();
                               oxa2.v.e(a);
                               return;
                            }else {
                               i2 = 0;
                               while (true) {
                                  if (i2 < len) {
                                     oobject = b[i2];
                                     if (y[i2] == null) {
                                        w = oobject.w;
                                        obj = ((t = oobject.t) != null)? t.poll(): null;
                                        int i5 = (obj == null)? 1: 0;
                                        if (w != null && i5) {
                                           this.b();
                                           oxa2.v.e(a);
                                           return;
                                        }else if(!i5){
                                           y[i2] = obj;
                                        }
                                     }
                                     i2 = i2 + 1;
                                  }
                               }
                               return;
                            }
                         }
                         if (l1 - i1) {
                            len1 = b.length;
                            for (int i6 = 0; i6 < len1; i6 = i6 + 1) {
                               b[i6].a(l1);
                            }
                            if (l - Long.MAX_VALUE) {
                               l = - l1;
                               oxa2.t.addAndGet(l);
                            }
                         }
                         len1 = - i;
                         if (!oxa2.addAndGet(len1)) {
                            return;
                         }
                         continue ;
                      }else {
                         obj = oxa2.c.apply(y.clone());
                         Objects.requireNonNull(obj, "The zipper returned a null value");
                         a.onNext(obj);
                         l1 = l1 + 1;
                         Arrays.fill(y, null);
                      }
                   }
                }
             }else {
                goto label_00b7 ;
             }
          }
       } while (!oxa2.addAndGet(len1));
    }
    public final void cancel(){
       if (this.x == null) {
          this.x = true;
          this.b();
       }
       return;
    }
    public void subscribe(bn5[] p0,int p1){
       xa2 tb = this.b;
       for (int i = 0; i < p1 && (this.x == null && (this.w != null && this.v.get() != null)); i = i + 1) {
          p0[i].subscribe(tb[i]);
       }
       return;
    }
}
