package p.z72;
import p.d00;
import java.lang.Object;
import p.mv6;
import java.util.concurrent.atomic.AtomicLong;
import p.vv7;
import p.y72;
import p.zn0;
import java.lang.NullPointerException;
import java.lang.String;
import p.tp2;
import java.lang.Throwable;
import p.iv6;
import java.util.Objects;

public abstract class z72 extends d00	// class@002e9f from classes.dex
{
    public final Object[] a;
    public int b;
    public boolean c;

    public void z72(Object[] p0){
       super();
       this.a = p0;
    }
    public final void a(long p0){
       y72 oy72;
       z72 a;
       y72 v;
       z72 b;
       object oobject;
       int len;
       z72 b1;
       y72 v1;
       int i2;
       long l;
       object oobject1;
       long l1;
       if (mv6.f(p0)) {
          int i = 0;
          if (!(vv7.a(this, p0) - i)) {
             if (!(p0 - Long.MAX_VALUE)) {
                oy72 = this;
                switch (oy72.t){
                    case 0:
                      a = oy72.a;
                      i = a.length;
                      v = oy72.v;
                      b = oy72.b;
                      while (true) {
                         if (b != i) {
                            if (oy72.c == null) {
                               if ((oobject = a[b]) == null) {
                                  v.onError(new NullPointerException(tp2.l("The element at index ", b, " is null")));
                                  break ;
                               }else {
                                  v.c(oobject);
                                  b = b + 1;
                               }
                            }
                         }else if(oy72.c != null){
                            v.onComplete();
                            break ;
                         }
                      }
                      break;
                    default:
                      a = oy72.a;
                      i = a.length;
                      v = oy72.v;
                      b = oy72.b;
                      while (true) {
                         if (b != i) {
                            if (oy72.c == null) {
                               if ((oobject = a[b]) == null) {
                                  v.onError(new NullPointerException(tp2.l("The element at index ", b, " is null")));
                                  break ;
                               }else {
                                  v.onNext(oobject);
                                  int i1 = b + 1;
                               }
                            }
                         }else if(oy72.c != null){
                            v.onComplete();
                            break ;
                         }
                      }
                }
             }else {
                oy72 = this;
                switch (oy72.t){
                    case 0:
                      a = oy72.a;
                      len = a.length;
                      b1 = oy72.b;
                      v1 = oy72.v;
                      i2 = p0;
                      do {
                         l = i;
                         while (true) {
                            if ((l - i2) && b1 != len) {
                               if (oy72.c == null) {
                                  if ((oobject1 = a[b1]) == null) {
                                     v1.onError(new NullPointerException(tp2.l("The element at index ", b1, " is null")));
                                     break ;
                                  }else if(v1.c(oobject1)){
                                     l = l + 1;
                                  }
                                  b1 = b1 + 1;
                               }
                            }else if(b1 == len){
                               if (oy72.c == null) {
                                  v1.onComplete();
                                  break ;
                               }
                            }else {
                               i2 = oy72.get();
                               if (!(l - i2)) {
                                  oy72.b = b1;
                                  l1 = - l;
                                  l1 = oy72.addAndGet(l1);
                                  if (l1 - i) {
                                     continue ;
                                  }
                               }
                            }
                         }
                      } while (!(l1 - i));
                      break;
                    default:
                      a = oy72.a;
                      len = a.length;
                      b1 = oy72.b;
                      v1 = oy72.v;
                      i2 = p0;
                      do {
                         l = i;
                         while (true) {
                            if ((l - i2) && b1 != len) {
                               if (oy72.c == null) {
                                  if ((oobject1 = a[b1]) == null) {
                                     v1.onError(new NullPointerException(tp2.l("The element at index ", b1, " is null")));
                                     break ;
                                  }else {
                                     v1.onNext(oobject1);
                                     l = l + 1;
                                     int i3 = b1 + 1;
                                  }
                               }
                            }else if(b1 == len){
                               if (oy72.c == null) {
                                  v1.onComplete();
                                  break ;
                               }
                            }else {
                               l1 = oy72.get();
                               if (!(l - l1)) {
                                  oy72.b = b1;
                                  l1 = - l;
                                  l1 = oy72.addAndGet(l1);
                                  if (l1 - i) {
                                     continue ;
                                  }
                               }
                            }
                         }
                      } while (!(l1 - i));
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
       this.b = this.a.length;
    }
    public final boolean isEmpty(){
       boolean b = (this.b == this.a.length)? true: false;
       return b;
    }
    public final Object poll(){
       z72 tb = this.b;
       z72 ta = this.a;
       if (tb == ta.length) {
          return null;
       }
       this.b = tb + 1;
       object oobject = ta[tb];
       Objects.requireNonNull(oobject, "array element is null");
       return oobject;
    }
}
