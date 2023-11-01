package p.iv4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.hv4;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.System;
import p.cd1;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class iv4 extends AtomicReference implements Observer, Disposable	// class@001a10 from classes.dex
{
    public final AtomicBoolean a;
    public final AtomicReference b;
    public final AtomicReference c;
    public Throwable t;
    public static final hv4[] v;
    public static final hv4[] w;

    static {
       hv4[] ohv4Array = new hv4[0];
       iv4.v = ohv4Array;
       hv4[] ohv4Array1 = new hv4[0];
       iv4.w = ohv4Array1;
    }
    public void iv4(AtomicReference p0){
       super();
       this.a = new AtomicBoolean();
       this.b = p0;
       this.c = new AtomicReference();
       this.lazySet(iv4.v);
    }
    public final void a(hv4 p0){
       int len;
       while (true) {
          hv4[] ohv4Array = this.get();
          if (!(len = ohv4Array.length)) {
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (ohv4Array[i1] == p0) {
                   label_0017 :
                      if (i1 < 0) {
                         return;
                      }
                      hv4[] v = iv4.v;
                      if (len != 1) {
                         int i2 = len - 1;
                         v = new hv4[i2];
                         System.arraycopy(ohv4Array, i, v, i, i1);
                         i = i1 + 1;
                         len = len - i1;
                         len = len - 1;
                         System.arraycopy(ohv4Array, i, v, i1, len);
                      }
                      if (this.compareAndSet(ohv4Array, v)) {
                      }
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i1 = -1;
                   goto label_0017 ;
                }
             }
             return;
          }
       }
       return;
    }
    public void dispose(){
       iv4 tb;
       this.getAndSet(iv4.w);
       do {
          tb = this.b;
       } while (tb.compareAndSet(this, null) || tb.get() != this);
       cd1.a(this.c);
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == iv4.w)? true: false;
       return b;
    }
    public final void onComplete(){
       this.c.lazySet(cd1.a);
       hv4[] andSet = this.getAndSet(iv4.w);
       int len = andSet.length;
       for (int i = 0; i < len; i = i + 1) {
          andSet[i].a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       iv4 tc = this.c;
       cd1 a = cd1.a;
       if (tc.get() != a) {
          this.t = p0;
          tc.lazySet(a);
          hv4[] andSet = this.getAndSet(iv4.w);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             andSet[i].a.onError(p0);
          }
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       hv4[] ohv4Array = this.get();
       int len = ohv4Array.length;
       for (int i = 0; i < len; i = i + 1) {
          ohv4Array[i].a.onNext(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.c, p0);
    }
}
