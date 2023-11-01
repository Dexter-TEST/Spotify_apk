package p.uz4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Observer;
import p.yf2;
import p.vz4;
import java.lang.Object;
import p.gq6;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import java.util.Arrays;
import p.co5;
import io.reactivex.rxjava3.core.ObservableSource;

public final class uz4 extends AtomicInteger implements Disposable	// class@00294f from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public final vz4[] c;
    public final Object[] t;
    public final boolean v;
    public boolean w;

    public void uz4(Observer p0,yf2 p1,int p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       vz4[] ovz4Array = new vz4[p2];
       this.c = ovz4Array;
       Object[] objArray = new Object[p2];
       this.t = objArray;
       this.v = p3;
    }
    public final void a(){
       uz4 tc = this.c;
       int len = tc.length;
       int i = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          tc[i1].b.clear();
       }
       len = tc.length;
       for (; i < len; i = i + 1) {
          cd1.a(tc[i].v);
       }
       return;
    }
    public final void b(){
       Object obj;
       vz4 t1;
       uz4 ouz4 = this;
       if (this.getAndIncrement()) {
          return;
       }
       uz4 c = ouz4.c;
       uz4 a = ouz4.a;
       uz4 t = ouz4.t;
       uz4 v = ouz4.v;
       int i = 1;
    label_0013 :
       int len = c.length;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (true) {
          if (i1 < len) {
             object oobject = c[i1];
             if (t[i3] == null) {
                vz4 c1 = oobject.c;
                int i4 = ((obj = oobject.b.poll()) == null)? 1: 0;
                if (ouz4.w != null) {
                   this.a();
                }else if(c1 != null){
                   if (v != null) {
                      if (i4) {
                         t1 = oobject.t;
                         ouz4.w = true;
                         this.a();
                         if (t1 != null) {
                            a.onError(t1);
                         }else {
                            a.onComplete();
                         }
                      }
                   }else if((t1 = oobject.t) != null){
                      ouz4.w = true;
                      this.a();
                      a.onError(t1);
                   }else if(i4){
                      ouz4.w = true;
                      this.a();
                      a.onComplete();
                   }
                }
                t1 = 0;
             label_0065 :
                if (i5) {
                   break ;
                }else if(!i4){
                   t[i3] = obj;
                }else {
                   i2 = i2 + 1;
                }
                int i5 = 1;
                goto label_0065 ;
             }else if(oobject.c != null && (v == null && (t1 = oobject.t) != null)){
                ouz4.w = true;
                this.a();
                a.onError(t1);
                return;
             }
             i3 = i3 + 1;
             i1 = i1 + 1;
          }else if(i2){
             if (!(i = - i)) {
                return;
             }
             goto label_0013 ;
          }else {
             Object obj1 = ouz4.b.apply(t.clone());
             Objects.requireNonNull(obj1, "The zipper returned a null value");
             a.onNext(obj1);
             Arrays.fill(t, null);
             goto label_0013 ;
          }
       }
       return;
    }
    public void dispose(){
       if (this.w == null) {
          this.w = true;
          uz4 tc = this.c;
          int len = tc.length;
          int i = 0;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             cd1.a(tc[i1].v);
          }
          if (!this.getAndIncrement()) {
             tc = this.c;
             len = tc.length;
             for (; i < len; i = i + 1) {
                tc[i].b.clear();
             }
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.w;
    }
    public void subscribe(ObservableSource[] p0,int p1){
       uz4 tc = this.c;
       int len = tc.length;
       int i = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          tc[i1] = new vz4(this, p1);
       }
       this.lazySet(i);
       this.a.onSubscribe(this);
       while (true) {
          if (i >= len) {
             return;
          }
          if (this.w != null) {
             break ;
          }else {
             p0[i].subscribe(tc[i]);
             i = i + 1;
          }
       }
       return;
    }
}
