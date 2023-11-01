package p.bl6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.SingleObserver;
import p.yf2;
import p.cl6;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class bl6 extends AtomicInteger implements Disposable	// class@0010eb from classes.dex
{
    public final SingleObserver a;
    public final yf2 b;
    public final cl6[] c;
    public Object[] t;

    public void bl6(SingleObserver p0,int p1,yf2 p2){
       super(p1);
       this.a = p0;
       this.b = p2;
       cl6[] uocl6Array = new cl6[p1];
       for (int i = 0; i < p1; i++) {
          uocl6Array[i] = new cl6(this, i);
       }
       this.c = uocl6Array;
       Object[] objArray = new Object[p1];
       this.t = objArray;
       return;
    }
    public final void a(int p0,Throwable p1){
       int i = 0;
       if (this.getAndSet(i) > 0) {
          bl6 tc = this.c;
          int len = tc.length;
          for (; i < p0; i = i + 1) {
             object oobject = tc[i];
             oobject.getClass();
             cd1.a(oobject);
          }
          while ((p0++) < len) {
             object oobject1 = tc[p0];
             oobject1.getClass();
             cd1.a(oobject1);
          }
          this.t = null;
          this.a.onError(p1);
       }else {
          RxJavaPlugins.c(p1);
       }
       return;
    }
    public void dispose(){
       int i = 0;
       if (this.getAndSet(i) > 0) {
          bl6 tc = this.c;
          int len = tc.length;
          for (; i < len; i = i + 1) {
             object oobject = tc[i];
             oobject.getClass();
             cd1.a(oobject);
          }
          this.t = null;
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() <= 0)? true: false;
       return b;
    }
}
