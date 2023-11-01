package p.jv4;
import p.zo0;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.atomic.AtomicReference;
import p.ir0;
import java.lang.Object;
import p.iv4;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Throwable;
import p.co5;
import java.lang.RuntimeException;
import p.iw1;
import p.hv4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.System;

public final class jv4 extends zo0	// class@001b52 from classes.dex
{
    public final ObservableSource a;
    public final AtomicReference b;

    public void jv4(ObservableSource p0){
       super();
       this.a = p0;
       this.b = new AtomicReference();
    }
    public final void a(ir0 p0){
       iv4 oiv4;
       boolean b;
       while (true) {
          jv4 tb = this.b;
          oiv4 = tb.get();
          b = false;
          if (oiv4 != null && !oiv4.isDisposed()) {
             break ;
          }else {
             iv4 oiv41 = new iv4(tb);
             while (true) {
                if (tb.compareAndSet(oiv4, oiv41)) {
                   tb = 1;
                }else {
                   if (tb.get() != oiv4) {
                      tb = 0;
                   }
                }
                if (!tb) {
                }else {
                   oiv4 = oiv41;
                }
             }
          }
       }
       if (!oiv4.a.get() && oiv4.a.compareAndSet(b, true)) {
          b = true;
       }
       p0.accept(oiv4);
       if (b) {
          this.a.subscribe(oiv4);
       }
       return;
    }
    public final void b(){
       iv4 oiv4;
       jv4 tb = this.b;
       if ((oiv4 = tb.get()) != null && oiv4.isDisposed()) {
          do {
          } while (tb.compareAndSet(oiv4, null) || tb.get() != oiv4);
       }
       return;
    }
    public final void subscribeActual(Observer p0){
       iv4 oiv4;
       int i;
       hv4[] ohv4Array;
       iv4 t;
       while (true) {
          jv4 tb = this.b;
          oiv4 = tb.get();
          i = 0;
          if (oiv4 == null) {
             iv4 oiv41 = new iv4(tb);
             while (true) {
                if (tb.compareAndSet(oiv4, oiv41)) {
                   tb = 1;
                }else {
                   if (tb.get() != oiv4) {
                      t = 0;
                   }
                }
                if (!tb) {
                }else {
                   oiv4 = oiv41;
                }
             }
          }else {
             break ;
          }
       }
       hv4 ohv4 = new hv4(p0, oiv4);
       p0.onSubscribe(ohv4);
       while (true) {
          if ((ohv4Array = oiv4.get()) != iv4.w) {
             int len = ohv4Array.length;
             int i1 = len + 1;
             hv4[] ohv4Array1 = new hv4[i1];
             System.arraycopy(ohv4Array, i, ohv4Array1, i, len);
             ohv4Array1[len] = ohv4;
             if (oiv4.compareAndSet(ohv4Array, ohv4Array1)) {
                i = 1;
             }else {
                continue ;
             }
          }
          if (i) {
             if (ohv4.isDisposed()) {
                oiv4.a(ohv4);
                break ;
             }
             break ;
          }else if((t = oiv4.t) != null){
             p0.onError(t);
          }else {
             p0.onComplete();
          }
          return;
       }
       return;
    }
}
