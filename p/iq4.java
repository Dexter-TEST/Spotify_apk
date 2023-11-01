package p.iq4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;
import p.jq4;
import java.lang.Throwable;
import p.rn;
import java.lang.Object;
import p.gq6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

public final class iq4 extends AtomicReference implements Observer	// class@0019e5 from classes.dex
{
    public final jq4 a;
    public final int b;

    public void iq4(jq4 p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onComplete(){
       jq4 t;
       iq4 ta = this.a;
       iq4 tb = this.b;
       _monitor_enter(ta);
       if ((t = ta.t) == null) {
          _monitor_exit(ta);
       }else if(t[tb] == null){
          tb = 1;
       }else {
          tb = 0;
       }
       if (!tb) {
          int i = ta.B + 1;
          ta.B = i;
          if (i != t.length) {
          label_001f :
             _monitor_exit(ta);
             if (tb) {
                ta.a();
             }
             ta.c();
          }
       }
       ta.y = true;
       goto label_001f ;
       return;
    }
    public final void onError(Throwable p0){
       jq4 t;
       iq4 ta = this.a;
       iq4 tb = this.b;
       if (ta.z.a(p0)) {
          int i = 1;
          if (ta.w != null) {
             _monitor_enter(ta);
             if ((t = ta.t) == null) {
                _monitor_exit(ta);
             }else if(t[tb] == null){
                tb = 1;
             }else {
                tb = 0;
             }
             if (!tb) {
                int i1 = ta.B + i;
                ta.B = i1;
                if (i1 != t.length) {
                label_002b :
                   _monitor_exit(ta);
                   i = tb;
                }
             }
             ta.y = i;
             goto label_002b ;
          }
          if (i) {
             ta.a();
          }
          ta.c();
       }
       return;
    }
    public final void onNext(Object p0){
       jq4 t;
       int i;
       iq4 ta = this.a;
       iq4 tb = this.b;
       _monitor_enter(ta);
       if ((t = ta.t) == null) {
          _monitor_exit(ta);
       }else {
          jq4 a = ta.A;
          if (t[tb] == null) {
             a = a + 1;
             ta.A = a;
          }
          t[tb] = p0;
          if (a == t.length) {
             ta.v.offer(t.clone());
             i = 1;
          }else {
             i = 0;
          }
          _monitor_exit(ta);
          if (i) {
             ta.c();
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
