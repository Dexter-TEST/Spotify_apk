package p.yr2;
import p.nn6;
import p.zr2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e70;
import p.we7;
import p.tr2;
import p.b57;
import p.pn;
import p.mo1;
import p.ou6;
import java.lang.Math;
import p.qc6;
import p.kp5;
import java.io.IOException;
import java.lang.Long;
import java.lang.IllegalArgumentException;

public final class yr2 implements nn6	// class@0003e3 from classes2.dex
{
    public final long a;
    public boolean b;
    public final e70 c;
    public final e70 t;
    public boolean v;
    public final zr2 w;

    public void yr2(zr2 p0,long p1,boolean p2){
       co5.o(p0, "this$0");
       this.w = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = new e70();
       this.t = new e70();
    }
    public final void b(long p0){
       this.w.b.g0(p0);
    }
    public final void close(){
       yr2 tw = this.w;
       _monitor_enter(tw);
       this.v = true;
       yr2 tt = this.t;
       e70 b = tt.b;
       tt.f();
       tw.notifyAll();
       _monitor_exit(tw);
       if ((b) > 0) {
          this.b(b);
       }
       this.w.a();
       return;
    }
    public final b57 e(){
       return this.w.k;
    }
    public final long o(e70 p0,long p1){
       zr2 n;
       long l1;
       long l2;
       yr2 oyr2 = this;
       Object obj = p0;
       long l = p1;
       co5.o(obj, "sink");
       int i = 0;
       int i1 = ((l - i) >= 0)? 1: 0;
       if (i1) {
          while (true) {
             yr2 w = oyr2.w;
             _monitor_enter(w);
             w.k.h();
             if (w.f() != null) {
                if ((n = w.n) == null) {
                   mo1 omo1 = w.f();
                   co5.i(omo1);
                   n = new ou6(omo1);
                label_0038 :
                   if (oyr2.v == null) {
                      yr2 t = oyr2.t;
                      e70 b = t.b;
                      if ((b - i) > 0) {
                         l1 = t.o(obj, Math.min(l, b));
                         l2 = w.c + l1;
                         w.c = l2;
                         l2 = l2 - w.d;
                         if (n == null) {
                            i = w.b.I.a() / 2;
                            if ((l2 - (long)i) >= 0) {
                               w.b.j0(w.a, l2);
                               w.d = w.c;
                            }
                         }
                      }else if(oyr2.b == null && n == null){
                         w.l();
                         l1 = -1;
                         l2 = 1;
                      label_0081 :
                         w.k.l();
                         _monitor_exit(w);
                         if (l2) {
                            i = 0;
                         }else if(l1 - -1){
                            break ;
                         }else if(n == null){
                            return -1;
                         }else {
                            throw n;
                         }
                      }else {
                         l1 = -1;
                      }
                      l2 = 0;
                      goto label_0081 ;
                   }else {
                      throw new IOException("stream closed");
                   }
                }else {
                   goto label_0038 ;
                }
             }else {
                n = null;
                goto label_0038 ;
             }
          }
          oyr2.b(l1);
          return l1;
       }else {
          throw new IllegalArgumentException(co5.K(Long.valueOf(p1), "byteCount < 0: ").toString());
       }
    }
}
