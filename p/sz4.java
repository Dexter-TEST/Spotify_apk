package p.sz4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.yf2;
import p.tz4;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReference;
import p.rn;
import java.lang.Class;
import java.lang.Object;
import p.cd1;
import p.xe7;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.util.Objects;
import p.co5;
import io.reactivex.rxjava3.core.ObservableSource;

public final class sz4 extends AtomicInteger implements Observer, Disposable	// class@0026cc from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public final tz4[] c;
    public final AtomicReferenceArray t;
    public final AtomicReference v;
    public final rn w;
    public boolean x;

    public void sz4(Observer p0,yf2 p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       tz4[] otz4Array = new tz4[p2];
       for (int i = 0; i < p2; i++) {
          otz4Array[i] = new tz4(this, i);
       }
       this.c = otz4Array;
       this.t = new AtomicReferenceArray(p2);
       this.v = new AtomicReference();
       this.w = new rn();
       return;
    }
    public final void a(int p0){
       int i = 0;
       while (true) {
          sz4 tc = this.c;
          if (i < tc.length) {
             if (i != p0) {
                object oobject = tc[i];
                oobject.getClass();
                cd1.a(oobject);
             }
             i = i + 1;
          }else {
             break ;
          }
       }
       return;
    }
    public void dispose(){
       cd1.a(this.v);
       sz4 tc = this.c;
       int len = tc.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = tc[i];
          oobject.getClass();
          cd1.a(oobject);
       }
       return;
    }
    public boolean isDisposed(){
       return cd1.b(this.v.get());
    }
    public final void onComplete(){
       if (this.x == null) {
          this.x = true;
          this.a(-1);
          xe7.K(this.a, this, this.w);
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.x != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.x = true;
          this.a(-1);
          xe7.L(this.a, p0, this, this.w);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.x != null) {
          return;
       }
       sz4 tt = this.t;
       int i = tt.length();
       Object[] objArray = new Object[(i + 1)];
       int i1 = 0;
       objArray[i1] = p0;
       while (true) {
          if (i1 < i) {
             if ((p0 = tt.get(i1)) == null) {
                break ;
             }else {
                i1 = i1 + 1;
                objArray[i1] = p0;
             }
          }else {
             p0 = this.b.apply(objArray);
             Objects.requireNonNull(p0, "combiner returned a null value");
             xe7.N(this.a, p0, this, this.w);
             return;
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.v, p0);
    }
    public void subscribe(ObservableSource[] p0,int p1){
       sz4 tc = this.c;
       sz4 tv = this.v;
       for (int i = 0; i < p1 && (!cd1.b(tv.get()) && this.x == null); i = i + 1) {
          p0[i].subscribe(tc[i]);
       }
       return;
    }
}
