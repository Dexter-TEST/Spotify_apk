package p.jq4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Observer;
import p.yf2;
import p.rn;
import java.lang.Object;
import p.iq4;
import p.gq6;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.String;
import java.util.Objects;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.core.ObservableSource;

public final class jq4 extends AtomicInteger implements Disposable	// class@001b26 from classes.dex
{
    public int A;
    public int B;
    public final Observer a;
    public final yf2 b;
    public final iq4[] c;
    public Object[] t;
    public final gq6 v;
    public final boolean w;
    public boolean x;
    public boolean y;
    public final rn z;

    public void jq4(int p0,int p1,Observer p2,yf2 p3,boolean p4){
       super();
       this.z = new rn();
       this.a = p2;
       this.b = p3;
       this.w = p4;
       Object[] objArray = new Object[p0];
       this.t = objArray;
       iq4[] oiq4Array = new iq4[p0];
       for (int i = 0; i < p0; i++) {
          oiq4Array[i] = new iq4(this, i);
       }
       this.c = oiq4Array;
       this.v = new gq6(p1);
       return;
    }
    public final void a(){
       jq4 tc = this.c;
       int len = tc.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = tc[i];
          oobject.getClass();
          cd1.a(oobject);
       }
       return;
    }
    public final void b(gq6 p0){
       _monitor_enter(this);
       this.t = null;
       _monitor_exit(this);
       p0.clear();
    }
    public final void c(){
       Object[] objArray;
       if (this.getAndIncrement()) {
          return;
       }
       jq4 tv = this.v;
       jq4 ta = this.a;
       jq4 tw = this.w;
       int i = 1;
       while (true) {
          if (this.x != null) {
             _monitor_enter(this);
             this.t = null;
             _monitor_exit(this);
             tv.clear();
             this.z.b();
             return;
          }else if(tw == null && this.z.get() != null){
             this.a();
             this.b(tv);
             this.z.d(ta);
             return;
          }else {
             jq4 ty = this.y;
             int i1 = ((objArray = tv.poll()) == null)? 1: 0;
             if (ty != null && i1) {
                this.b(tv);
                this.z.d(ta);
                return;
             }else if(i1){
                if (!(i = - i)) {
                   break ;
                }
             }else {
                Object obj = this.b.apply(objArray);
                Objects.requireNonNull(obj, "The combiner returned a null value");
                ta.onNext(obj);
             }
          }
       }
       return;
    }
    public void dispose(){
       if (this.x == null) {
          this.x = true;
          this.a();
          this.c();
       }
       return;
    }
    public boolean isDisposed(){
       return this.x;
    }
    public void subscribe(ObservableSource[] p0){
       jq4 tc = this.c;
       int len = tc.length;
       this.a.onSubscribe(this);
       for (int i = 0; i < len && (this.y == null && this.x == null); i = i + 1) {
          p0[i].subscribe(tc[i]);
       }
       return;
    }
}
