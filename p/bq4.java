package p.bq4;
import io.reactivex.rxjava3.core.Observer;
import p.z1;
import p.aq4;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.atomic.AtomicBoolean;
import p.ls0;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.System;

public final class bq4 extends z1 implements Observer	// class@001116 from classes.dex
{
    public boolean A;
    public final AtomicBoolean b;
    public final int c;
    public final AtomicReference t;
    public long v;
    public final ls0 w;
    public ls0 x;
    public int y;
    public Throwable z;
    public static final aq4[] B;
    public static final aq4[] C;

    static {
       aq4[] uoaq4Array = new aq4[0];
       bq4.B = uoaq4Array;
       aq4[] uoaq4Array1 = new aq4[0];
       bq4.C = uoaq4Array1;
    }
    public void bq4(Observable p0,int p1){
       super(p0);
       this.c = p1;
       this.b = new AtomicBoolean();
       ls0 ols0 = new ls0(p1);
       this.w = ols0;
       this.x = ols0;
       this.t = new AtomicReference(bq4.B);
    }
    public final void a(aq4 p0){
       bq4 tz;
       if (p0.getAndIncrement()) {
          return;
       }
       aq4 v = p0.v;
       aq4 t = p0.t;
       aq4 c = p0.c;
       aq4 a = p0.a;
       bq4 tc = this.c;
       int i = 1;
       while (true) {
          if (p0.w != null) {
             p0.c = null;
             return;
          }else {
             bq4 tA = this.A;
             int i1 = (!(this.v - v))? 1: 0;
             if (tA != null && i1) {
                p0.c = null;
                if ((tz = this.z) != null) {
                   a.onError(tz);
                   break ;
                }else {
                   a.onComplete();
                   break ;
                }
             }else if(!i1){
                if (t == tc) {
                   c = c.b;
                   t = 0;
                }
                a.onNext(c.a[t]);
                t = t + 1;
                v = v + 1;
             }else {
                p0.v = v;
                p0.t = t;
                p0.c = c;
                if (!(i = - i)) {
                   return;
                }
             }
          }
       }
       return;
    }
    public final void onComplete(){
       this.A = true;
       aq4[] andSet = this.t.getAndSet(bq4.C);
       int len = andSet.length;
       for (int i = 0; i < len; i = i + 1) {
          this.a(andSet[i]);
       }
       return;
    }
    public final void onError(Throwable p0){
       this.z = p0;
       this.A = true;
       aq4[] andSet = this.t.getAndSet(bq4.C);
       int len = andSet.length;
       for (int i = 0; i < len; i = i + 1) {
          this.a(andSet[i]);
       }
       return;
    }
    public final void onNext(Object p0){
       bq4 ty = this.y;
       int i = 0;
       int i1 = 1;
       if (ty == this.c) {
          ls0 ols0 = new ls0(ty);
          ols0.a[i] = p0;
          this.y = i1;
          p0.b = ols0;
          this.x = ols0;
       }else {
          this.x.a[ty] = p0;
          this.y = ty + i1;
       }
       this.v = this.v + 1;
       p0 = this.t.get();
       int len = p0.length;
       for (; i < len; i = i + 1) {
          this.a(p0[i]);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
    }
    public final void subscribeActual(Observer p0){
       bq4 tt;
       aq4[] uoaq4Array;
       aq4 uoaq4 = new aq4(p0, this);
       p0.onSubscribe(uoaq4);
       while (true) {
          tt = this.t;
          if ((uoaq4Array = tt.get()) == bq4.C) {
             break ;
          }else {
             int len = uoaq4Array.length;
             int i = len + 1;
             aq4[] uoaq4Array1 = new aq4[i];
             System.arraycopy(uoaq4Array, false, uoaq4Array1, false, len);
             uoaq4Array1[len] = uoaq4;
             while (true) {
                if (tt.compareAndSet(uoaq4Array, uoaq4Array1)) {
                   tt = 1;
                   break ;
                }else {
                   if (tt.get() != uoaq4Array) {
                      tt = 0;
                      break ;
                   }
                }
             }
             if (tt) {
             }
          }
       }
       tt = this.b;
       if (!tt.get() && tt.compareAndSet(false, true)) {
          this.a.subscribe(this);
       }else {
          this.a(uoaq4);
       }
       return;
    }
}
