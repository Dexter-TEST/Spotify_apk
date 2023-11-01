package p.h92;
import p.d00;
import p.mv6;
import java.util.concurrent.atomic.AtomicLong;
import p.vv7;
import p.i92;
import p.zn0;
import java.lang.Integer;
import java.lang.Object;
import p.iv6;

public abstract class h92 extends d00	// class@001806 from classes.dex
{
    public final int a;
    public int b;
    public boolean c;

    public void h92(int p0,int p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public final void a(long p0){
       h92 a;
       i92 v;
       h92 b;
       h92 b1;
       i92 v1;
       long l;
       if (mv6.f(p0)) {
          int i = 0;
          if (!(vv7.a(this, p0) - i)) {
             if (!(p0 - Long.MAX_VALUE)) {
                i92 oi92 = this;
                switch (oi92.t){
                    case 0:
                      a = oi92.a;
                      v = oi92.v;
                      b = oi92.b;
                      while (true) {
                         if (b != a) {
                            if (oi92.c == null) {
                               v.c(Integer.valueOf(b));
                               b = b + 1;
                            }
                         }else if(oi92.c != null){
                            v.onComplete();
                            break ;
                         }
                      }
                      break;
                    default:
                      a = oi92.a;
                      v = oi92.v;
                      b = oi92.b;
                      while (true) {
                         if (b != a) {
                            if (oi92.c == null) {
                               v.onNext(Integer.valueOf(b));
                               int i1 = b + 1;
                            }
                         }else if(oi92.c != null){
                            v.onComplete();
                            break ;
                         }
                      }
                }
             }else {
                v = this;
                switch (v.t){
                    case 0:
                      b = v.a;
                      b1 = v.b;
                      v1 = v.v;
                      do {
                         l = i;
                         while (true) {
                            if ((l - p0) && b1 != b) {
                               if (v.c == null) {
                                  if (v1.c(Integer.valueOf(b1))) {
                                     l = l + 1;
                                  }
                                  b1 = b1 + 1;
                               }
                            }else if(b1 == b){
                               if (v.c == null) {
                                  v1.onComplete();
                                  break ;
                               }
                            }else {
                               p0 = v.get();
                               if (!(l - p0)) {
                                  v.b = b1;
                                  p0 = - l;
                                  p0 = v.addAndGet(p0);
                                  if (p0 - i) {
                                     continue ;
                                  }
                               }
                            }
                         }
                      } while (!(p0 - i));
                      break;
                    default:
                      b = v.a;
                      b1 = v.b;
                      v1 = v.v;
                      do {
                         l = i;
                         while (true) {
                            if ((l - p0) && b1 != b) {
                               if (v.c == null) {
                                  v1.onNext(Integer.valueOf(b1));
                                  l = l + 1;
                                  int i2 = b1 + 1;
                               }
                            }else if(b1 == b){
                               if (v.c == null) {
                                  v1.onComplete();
                                  break ;
                               }
                            }else {
                               p0 = v.get();
                               if (!(l - p0)) {
                                  v.b = b1;
                                  p0 = - l;
                                  p0 = v.addAndGet(p0);
                                  if (p0 - i) {
                                     continue ;
                                  }
                               }
                            }
                         }
                      } while (!(p0 - i));
                }
             }
          }
       }
       return;
    }
    public final int b(int p0){
       return (p0 & 0x01);
    }
    public final void cancel(){
       this.c = true;
    }
    public final void clear(){
       this.b = this.a;
    }
    public final boolean isEmpty(){
       boolean b = (this.b == this.a)? true: false;
       return b;
    }
    public final Object poll(){
       h92 tb;
       Integer integer;
       if ((tb = this.b) == this.a) {
          integer = null;
       }else {
          this.b = tb + 1;
          integer = Integer.valueOf(tb);
       }
       return integer;
    }
}
