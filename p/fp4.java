package p.fp4;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import p.gp4;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import io.reactivex.rxjava3.core.ObservableSource;

public final class fp4 implements Disposable	// class@001611 from classes.dex
{
    public final Observer a;
    public final gp4[] b;
    public final AtomicInteger c;

    public void fp4(Observer p0,int p1){
       super();
       this.c = new AtomicInteger();
       this.a = p0;
       gp4[] ogp4Array = new gp4[p1];
       this.b = ogp4Array;
    }
    public final boolean a(int p0){
       int i1;
       fp4 tc = this.c;
       int i = 0;
       if (tc.get() || !tc.compareAndSet(i, p0)) {
          return i;
       }
       tc = this.b;
       int len = tc.length;
       while (i < len) {
          if ((i1 = i + 1) != p0) {
             object oobject = tc[i];
             oobject.getClass();
             cd1.a(oobject);
          }
          i = i1;
       }
       return true;
    }
    public void dispose(){
       fp4 tc = this.c;
       int i = -1;
       if (tc.get() != i) {
          tc.lazySet(i);
          tc = this.b;
          int len = tc.length;
          for (i = 0; i < len; i = i + 1) {
             object oobject = tc[i];
             oobject.getClass();
             cd1.a(oobject);
          }
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.c.get() == -1)? true: false;
       return b;
    }
    public void subscribe(ObservableSource[] p0){
       fp4 ta;
       fp4 tb = this.b;
       int len = tb.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          ta = this.a;
          if (i1 < len) {
             int i2 = i1 + 1;
             tb[i1] = new gp4(this, i2, ta);
             i1 = i2;
          }else {
             break ;
          }
       }
       fp4 tc = this.c;
       tc.lazySet(i);
       ta.onSubscribe(this);
       while (true) {
          if (i >= len) {
             return;
          }
          if (tc.get()) {
             break ;
          }else {
             p0[i].subscribe(tb[i]);
             i = i + 1;
          }
       }
       return;
    }
}
