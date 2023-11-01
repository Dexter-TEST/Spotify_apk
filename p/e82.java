package p.e82;
import p.d00;
import java.util.Iterator;
import p.mv6;
import java.util.concurrent.atomic.AtomicLong;
import p.vv7;
import p.f82;
import p.zn0;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import p.iv6;
import p.co5;
import java.util.Objects;

public abstract class e82 extends d00	// class@001438 from classes.dex
{
    public Iterator a;
    public boolean b;
    public boolean c;

    public void e82(Iterator p0){
       super();
       this.a = p0;
    }
    public final void a(long p0){
       e82 a;
       f82 v;
       e82 obj;
       f82 v1;
       long l;
       Object obj1;
       if (mv6.f(p0)) {
          int i = 0;
          if (!(vv7.a(this, p0) - i)) {
             if (!(p0 - Long.MAX_VALUE)) {
                f82 uof82 = this;
                switch (uof82.t){
                    case 0:
                      a = uof82.a;
                      v = uof82.v;
                      while (uof82.b == null) {
                         obj = a.next();
                         if (uof82.b == null) {
                            if (obj == null) {
                               v.onError(new NullPointerException("Iterator.next\(\) returned a null value"));
                               break ;
                            }else {
                               v.c(obj);
                               if (uof82.b == null) {
                                  if (!a.hasNext()) {
                                     if (uof82.b == null) {
                                        v.onComplete();
                                        break ;
                                     }
                                  }
                               }
                            }
                         }
                      }
                      break;
                    default:
                      a = uof82.a;
                      v = uof82.v;
                      while (uof82.b == null) {
                         obj = a.next();
                         if (uof82.b == null) {
                            if (obj == null) {
                               v.onError(new NullPointerException("Iterator.next\(\) returned a null value"));
                               break ;
                            }else {
                               v.onNext(obj);
                               if (uof82.b == null) {
                                  if (!a.hasNext()) {
                                     if (uof82.b == null) {
                                        v.onComplete();
                                        break ;
                                     }
                                  }
                               }
                            }
                         }
                      }
                }
             }else {
                v = this;
                switch (v.t){
                    case 0:
                      obj = v.a;
                      v1 = v.v;
                      do {
                         l = i;
                         while (true) {
                            if (l - p0) {
                               if (v.b == null) {
                                  obj1 = obj.next();
                                  if (v.b == null) {
                                     if (obj1 == null) {
                                        v1.onError(new NullPointerException("Iterator.next\(\) returned a null value"));
                                        break ;
                                     }else {
                                        boolean b = v1.c(obj1);
                                        if (v.b == null) {
                                           if (!obj.hasNext()) {
                                              if (v.b == null) {
                                                 v1.onComplete();
                                                 break ;
                                              }
                                           }else if(b){
                                              l = l + 1;
                                           }
                                        }
                                     }
                                  }
                               }
                            }else {
                               p0 = v.get();
                               if (!(l - p0)) {
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
                      obj = v.a;
                      v1 = v.v;
                      do {
                         l = i;
                         while (true) {
                            if (l - p0) {
                               if (v.b == null) {
                                  obj1 = obj.next();
                                  if (v.b == null) {
                                     if (obj1 == null) {
                                        v1.onError(new NullPointerException("Iterator.next\(\) returned a null value"));
                                        break ;
                                     }else {
                                        v1.onNext(obj1);
                                        if (v.b == null) {
                                           if (!obj.hasNext()) {
                                              if (v.b == null) {
                                                 v1.onComplete();
                                                 break ;
                                              }
                                           }else {
                                              l = l + 1;
                                           }
                                        }
                                     }
                                  }
                               }
                            }else {
                               p0 = v.get();
                               if (!(l - p0)) {
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
       this.b = true;
    }
    public final void clear(){
       this.a = null;
    }
    public final boolean isEmpty(){
       e82 ta;
       if ((ta = this.a) != null) {
          if (this.c != null && !ta.hasNext()) {
             this.a = null;
          }else {
             return false;
          }
       }
       return true;
    }
    public final Object poll(){
       e82 ta = this.a;
       Object obj = null;
       if (ta == null) {
          return obj;
       }
       if (this.c == null) {
          this.c = true;
       }else if(!ta.hasNext()){
          return obj;
       }
       Object obj1 = this.a.next();
       Objects.requireNonNull(obj1, "Iterator.next\(\) returned a null value");
       return obj1;
    }
}
