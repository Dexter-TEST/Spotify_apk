package p.fw4;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.atomic.AtomicReference;
import p.aw4;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import p.ew4;
import p.dw4;
import p.bw4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.System;

public final class fw4 implements ObservableSource	// class@00164f from classes.dex
{
    public final AtomicReference a;
    public final aw4 b;

    public void fw4(AtomicReference p0,aw4 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void subscribe(Observer p0){
       ew4 uoew4;
       bw4 uobw4;
       bw4[] uobw4Array;
       while (true) {
          fw4 ta = this.a;
          if ((uoew4 = ta.get()) == null) {
             ew4 uoew41 = new ew4(this.b.call(), ta);
             while (true) {
                if (ta.compareAndSet(null, uoew41)) {
                   ta = 1;
                }else {
                   if (ta.get() != null) {
                      uobw4 = 0;
                   }
                }
                if (!ta) {
                }else {
                   uoew4 = uoew41;
                }
             }
             uoew4.a(uobw4);
             return;
          }else {
             break ;
          }
       }
       uobw4 = new bw4(uoew4, p0);
       p0.onSubscribe(uobw4);
       while (true) {
          ew4 c = uoew4.c;
          if ((uobw4Array = c.get()) == ew4.x) {
             break ;
          }else {
             int len = uobw4Array.length;
             int i = len + 1;
             bw4[] uobw4Array1 = new bw4[i];
             System.arraycopy(uobw4Array, 0, uobw4Array1, 0, len);
             uobw4Array1[len] = uobw4;
             while (true) {
                if (c.compareAndSet(uobw4Array, uobw4Array1)) {
                   c = 1;
                }else {
                   if (c.get() != uobw4Array) {
                      c = 0;
                   }else {
                      continue ;
                   }
                }
             }
             if (c) {
             }else {
                continue ;
             }
          }
       }
       if (uobw4.isDisposed()) {
       }else {
          uoew4.a.g(uobw4);
          return;
       }
    }
}
