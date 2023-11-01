package p.op4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import p.zv6;
import p.gq6;
import io.reactivex.rxjava3.core.Observable;
import p.fn0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import p.rn;
import p.pp4;
import p.cd1;
import java.lang.Long;
import java.lang.Object;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Throwable;
import p.np4;

public final class op4 extends AtomicInteger implements Observer, Disposable	// class@002165 from classes.dex
{
    public boolean A;
    public long B;
    public LinkedHashMap C;
    public final Observer a;
    public final zv6 b;
    public final ObservableSource c;
    public final yf2 t;
    public final fn0 v;
    public final AtomicReference w;
    public final rn x;
    public boolean y;
    public final gq6 z;

    public void op4(Observer p0,ObservableSource p1,yf2 p2,zv6 p3){
       super();
       this.a = p0;
       this.b = p3;
       this.c = p1;
       this.t = p2;
       this.z = new gq6(Observable.bufferSize());
       this.v = new fn0();
       this.w = new AtomicReference();
       this.C = new LinkedHashMap();
       this.x = new rn();
    }
    public final void a(pp4 p0,long p1){
       int i;
       op4 tC;
       this.v.b(p0);
       if (!this.v.g()) {
          cd1.a(this.w);
          i = 1;
       }else {
          i = 0;
       }
       _monitor_enter(this);
       if ((tC = this.C) == null) {
          _monitor_exit(this);
          return;
       }else {
          this.z.offer(tC.remove(Long.valueOf(p1)));
          _monitor_exit(this);
          if (i) {
             this.y = true;
          }
          this.b();
          return;
       }
    }
    public final void b(){
       op4 ty;
       Collection uCollection;
       int i1;
       if (this.getAndIncrement()) {
          return;
       }
       op4 ta = this.a;
       op4 tz = this.z;
       int i = 1;
       while (true) {
          if (this.A != null) {
             tz.clear();
             return;
          }else if((ty = this.y) != null && this.x.get() != null){
             tz.clear();
             this.x.d(ta);
             return;
          }else if((uCollection = tz.poll()) == null){
             i1 = 1;
          }else {
             i1 = 0;
          }
          if (ty != null && i1) {
             ta.onComplete();
             return;
          }else if(i1){
             if (!(i = - i)) {
                break ;
             }
          }else {
             ta.onNext(uCollection);
          }
       }
       return;
    }
    public void dispose(){
       if (cd1.a(this.w)) {
          this.A = true;
          this.v.dispose();
          _monitor_enter(this);
          this.C = null;
          _monitor_exit(this);
          if (this.getAndIncrement()) {
             this.z.clear();
          }
       }
       return;
    }
    public boolean isDisposed(){
       return cd1.b(this.w.get());
    }
    public final void onComplete(){
       op4 tC;
       this.v.dispose();
       _monitor_enter(this);
       if ((tC = this.C) == null) {
          _monitor_exit(this);
          return;
       }else {
          Iterator iterator = tC.values().iterator();
          while (iterator.hasNext()) {
             this.z.offer(iterator.next());
          }
          this.C = null;
          _monitor_exit(this);
          this.y = true;
          this.b();
          return;
       }
    }
    public final void onError(Throwable p0){
       if (this.x.a(p0)) {
          this.v.dispose();
          _monitor_enter(this);
          this.C = null;
          _monitor_exit(this);
          this.y = true;
          this.b();
       }
       return;
    }
    public final void onNext(Object p0){
       op4 tC;
       _monitor_enter(this);
       if ((tC = this.C) == null) {
          _monitor_exit(this);
          return;
       }else {
          Iterator iterator = tC.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().add(p0);
          }
          _monitor_exit(this);
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this.w, p0)) {
          np4 onp4 = new np4(this);
          this.v.c(onp4);
          this.c.subscribe(onp4);
       }
       return;
    }
}
