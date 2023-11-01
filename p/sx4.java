package p.sx4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.rx4;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.yf2;
import p.rn;
import java.lang.Object;
import java.lang.Throwable;
import p.yh6;
import p.co5;
import java.lang.Class;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;

public final class sx4 extends AtomicInteger implements Observer, Disposable	// class@0026ba from classes.dex
{
    public long A;
    public final Observer a;
    public final yf2 b;
    public final int c;
    public final boolean t;
    public final rn v;
    public boolean w;
    public boolean x;
    public Disposable y;
    public final AtomicReference z;
    public static final rx4 B;

    static {
       rx4 orx4 = new rx4(null, -1, 1);
       sx4.B = orx4;
       cd1.a(orx4);
    }
    public void sx4(Observer p0,yf2 p1,int p2,boolean p3){
       super();
       this.z = new AtomicReference();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = new rn();
    }
    public final void a(){
       Throwable throwable;
       rx4 orx4;
       rx4 t;
       if (this.getAndIncrement()) {
          return;
       }
       sx4 ta = this.a;
       sx4 tz = this.z;
       sx4 tt = this.t;
       int i = 1;
       while (true) {
          if (this.x != null) {
             return;
          }
          if (this.w != null) {
             int i1 = (tz.get() == null)? 1: 0;
             if (tt != null) {
                if (i1) {
                   if ((throwable = this.v.get()) != null) {
                      ta.onError(throwable);
                      break ;
                   }else {
                      ta.onComplete();
                      break ;
                   }
                }
             }else if(this.v.get() != null){
                this.v.d(ta);
                return;
             }else if(i1){
                ta.onComplete();
                return;
             }
          }
          if ((orx4 = tz.get()) != null && (t = orx4.t) != null) {
             int i2 = 0;
             while (true) {
                if (this.x != null) {
                   return;
                }
                if (orx4 == tz.get()) {
                   if (tt == null && this.v.get() != null) {
                      this.v.d(ta);
                      return;
                   }else {
                      rx4 v = orx4.v;
                      Object obj = t.poll();
                      int i3 = (obj == null)? 1: 0;
                      if (v != null && i3) {
                         do {
                         } while (tz.compareAndSet(orx4, null) || tz.get() != orx4);
                      }else if(i3){
                      label_00cf :
                         if (i2) {
                            continue ;
                         }
                      }else {
                         ta.onNext(obj);
                      }
                   }
                }
                i2 = 1;
                goto label_00cf ;
             }
             return;
          }
          if (!(i = - i)) {
             return;
          }else {
             continue ;
          }
       }
    }
    public void dispose(){
       rx4 andSet;
       if (this.x == null) {
          this.x = true;
          this.y.dispose();
          if ((andSet = this.z.getAndSet(sx4.B)) != null) {
             cd1.a(andSet);
          }
          this.v.b();
       }
       return;
    }
    public boolean isDisposed(){
       return this.x;
    }
    public final void onComplete(){
       if (this.w == null) {
          this.w = true;
          this.a();
       }
       return;
    }
    public final void onError(Throwable p0){
       rx4 andSet;
       if (this.w == null) {
          sx4 tv = this.v;
          tv.getClass();
          if (iw1.a(tv, p0)) {
             if (this.t == null && (andSet = this.z.getAndSet(sx4.B)) != null) {
                cd1.a(andSet);
             }
             this.w = true;
             this.a();
          label_002c :
             return;
          }
       }
       RxJavaPlugins.c(p0);
       goto label_002c ;
    }
    public final void onNext(Object p0){
       rx4 orx4;
       rx4 orx41;
       long l = this.A + 1;
       this.A = l;
       if ((orx4 = this.z.get()) != null) {
          cd1.a(orx4);
       }
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The ObservableSource returned is null");
       orx4 = new rx4(this, l, this.c);
       while ((orx41 = this.z.get()) != sx4.B) {
          sx4 tz = this.z;
          while (true) {
             if (tz.compareAndSet(orx41, orx4)) {
                orx41 = 1;
             }else {
                if (tz.get() != orx41) {
                   orx41 = 0;
                }
             }
             if (orx41) {
                p0.subscribe(orx4);
                break ;
             }else {
                continue ;
             }
          }
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.y, p0)) {
          this.y = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
