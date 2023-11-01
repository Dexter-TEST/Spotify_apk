package p.aq4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Observer;
import p.bq4;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.System;

public final class aq4 extends AtomicInteger implements Disposable	// class@000fd3 from classes.dex
{
    public final Observer a;
    public final bq4 b;
    public ls0 c;
    public int t;
    public long v;
    public boolean w;

    public void aq4(Observer p0,bq4 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p1.w;
    }
    public void dispose(){
       int len;
       aq4[] b;
       if (this.w == null) {
          this.w = true;
          aq4 tb = this.b;
          while (true) {
             bq4 t = tb.t;
             aq4[] uoaq4Array = t.get();
             if (len = uoaq4Array.length) {
                int i = 0;
                int i1 = 0;
                while (true) {
                   if (i1 < len) {
                      if (uoaq4Array[i1] == this) {
                      label_0022 :
                         if (i1 >= 0) {
                            if (len == 1) {
                               b = bq4.B;
                            }else {
                               int i2 = len - 1;
                               aq4[] uoaq4Array1 = new aq4[i2];
                               System.arraycopy(uoaq4Array, i, uoaq4Array1, i, i1);
                               int i3 = i1 + 1;
                               len = len - i1;
                               len = len - true;
                               System.arraycopy(uoaq4Array, i3, uoaq4Array1, i1, len);
                               b = uoaq4Array1;
                            }
                            while (true) {
                               if (t.compareAndSet(uoaq4Array, b)) {
                                  i = 1;
                               }else {
                                  if (t.get() == uoaq4Array) {
                                     continue ;
                                  }
                               }
                               if (!i) {
                               }
                            }
                         }
                      }else {
                         i1 = i1 + 1;
                      }
                   }else {
                      i1 = -1;
                      goto label_0022 ;
                   }
                }
             }
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.w;
    }
}
