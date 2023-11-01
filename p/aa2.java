package p.aa2;
import p.v92;
import java.util.ArrayList;
import p.ak4;
import java.lang.Object;
import java.util.AbstractCollection;
import java.lang.Throwable;
import p.yj4;
import p.t92;
import java.lang.Integer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.AbstractList;
import p.iv6;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.vv7;

public final class aa2 extends ArrayList implements v92	// class@000f43 from classes.dex
{
    public int a;

    public void aa2(){
       super(16);
    }
    public final void a(){
       this.add(ak4.a);
       this.a = this.a + 1;
    }
    public final void c(Object p0){
       this.add(p0);
       this.a = this.a + 1;
    }
    public final void d(Throwable p0){
       this.add(new yj4(p0));
       this.a = this.a + 1;
    }
    public final void g(t92 p0){
       t92 c;
       Object obj;
       aa2 uoaa2 = this;
       t92 ot92 = p0;
       _monitor_enter(p0);
       boolean b = true;
       if (ot92.v != null) {
          ot92.w = b;
          _monitor_exit(p0);
          return;
       }else {
          ot92.v = b;
          _monitor_exit(p0);
          t92 b1 = ot92.b;
          while (true) {
             if (p0.isDisposed()) {
             }else {
                aa2 a = uoaa2.a;
                int i = ((c = ot92.c) != null)? c.intValue(): 0;
                long l = p0.get();
                int i1 = 0;
                long l1 = l;
                long l2 = i1;
                while (true) {
                   if ((l1 - i1) && i < a) {
                      if ((obj = uoaa2.get(i)) == ak4.a) {
                         b1.onComplete();
                      }else if(obj instanceof yj4){
                         b1.onError(obj.a);
                      }else {
                         b1.onNext(obj);
                         b = 0;
                      label_0057 :
                         if (b) {
                            return;
                         }else if(p0.isDisposed()){
                            return;
                         }else {
                            i = i + 1;
                            l1 = l1 - 1;
                            l2 = l2 + 1;
                            b = 1;
                         }
                      }
                      b = 1;
                      goto label_0057 ;
                   }else if(l2 - i1){
                      ot92.c = Integer.valueOf(i);
                      if (l - Long.MAX_VALUE) {
                         vv7.I(ot92, l2);
                      }
                   }
                   _monitor_enter(p0);
                   if (ot92.w == null) {
                   }else {
                      ot92.w = false;
                      _monitor_exit(p0);
                      b = 1;
                   }
                }
                return;
             }
          }
          ot92.v = false;
          _monitor_exit(p0);
          return;
       }
    }
}
