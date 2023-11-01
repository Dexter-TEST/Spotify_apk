package p.iz7;
import java.lang.Runnable;
import java.lang.Object;
import p.zw7;
import p.e25;
import p.vj1;
import java.lang.Exception;
import p.m25;
import p.l77;
import p.m77;
import java.util.concurrent.PriorityBlockingQueue;
import p.qw1;
import p.vw1;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.ji6;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Throwable;
import p.qx4;
import p.z1;
import p.px4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ur4;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.lang.AssertionError;
import java.lang.StringBuilder;
import java.lang.String;
import android.os.Message;
import java.lang.RuntimeException;
import p.p77;
import p.ld;
import p.a47;
import java.util.HashSet;
import p.w47;
import p.sb4;
import p.hu0;
import p.t01;
import android.net.Uri;
import p.ym7;
import android.os.Handler;
import p.zf2;
import p.q54;
import java.lang.Long;
import p.ze;
import android.view.View;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.content.res.Resources;
import p.xj0;
import android.view.TouchDelegate;
import p.fw5;
import p.co5;
import p.ir0;
import p.iw1;
import p.ck3;
import android.os.Bundle;
import p.e46;
import p.es0;
import java.lang.Number;
import p.o11;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import p.ef;
import p.wf2;
import java.util.concurrent.Callable;
import p.j07;
import p.vf;
import p.a28;
import p.o07;
import java.util.concurrent.Executor;
import p.bu0;
import p.m07;
import p.ny0;
import p.vc6;
import p.vx5;
import p.rz7;
import p.qz7;
import p.yy7;
import p.dx7;
import p.jz7;
import p.hz7;
import p.au0;
import p.ye7;
import p.tx5;
import p.eb3;

public final class iz7 implements Runnable	// class@001a37 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void iz7(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public void iz7(Object p0,Object p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    private final void a(){
       zw7 c = this.c.c;
       _monitor_enter(c);
       zw7 d = this.c.d;
       if (d != null) {
          d.c(this.b.b());
       }
       _monitor_exit(c);
       return;
    }
    private final void b(){
       zw7 c = this.c.c;
       _monitor_enter(c);
       zw7 d = this.c.d;
       if (d != null) {
          d.onSuccess(this.b.c());
       }
       _monitor_exit(c);
       return;
    }
    public final void run(){
       iz7 tb;
       iz7 tc;
       e46 c1;
       es0 j;
       o11 w;
       GridLayoutManager layoutManage;
       es0 j1;
       o11 v;
       ym7 z;
       ld c2;
       int i = 1;
       switch (this.a){
           case 0:
             tb = this.b;
             tc = this.c;
             tb.getClass();
             tb.a.a(tc.c, tc.d, tc.b);
             return;
           case 1:
             tb = this.b;
             tc = this.c;
             tb.getClass();
             tb.a.a(tc.d, tc.e, tc.b);
             return;
           case 2:
             zw7 c = this.c.c;
             _monitor_enter(c);
             zw7 d = this.c.d;
             if (d != null) {
                d.f();
             }
             _monitor_exit(c);
             return;
             break;
           case 3:
             this.a();
             return;
           case 4:
             this.b();
             return;
           case 5:
             ny0.a(this.c, this.b);
             return;
           case 6:
             try{
                j07 oj07 = this.b.call();
                oj07.getClass();
                oj07.h(o07.a, new vf(21, this));
             }catch(java.lang.Exception e0){
                this.c.a.j(e0);
             }
             return;
             break;
           case 7:
             if ((c1 = this.b.C) != null) {
                iz7 tc1 = this.c;
                int i1 = c1.intValue();
                if ((j = tc1.j) != null && ((w = j.w) != null && (layoutManage = w.getLayoutManager()) != null)) {
                   layoutManage.r1(i1, i);
                }
                if (!i1 && ((j1 = tc1.j) != null && (v = j1.v) != null)) {
                   v.setExpanded(i);
                }
                tc1.h.invoke();
             }
             return;
             break;
           case 8:
             ck3.C(this.b, this.c);
             return;
           case 9:
             tb = this.c;
             tc = this.b;
             tb.getClass();
             co5.o(tc, "response");
             tb.c.accept(tc);
             return;
           case 10:
             tb = this.b;
             tc = this.c;
             tb.getClass();
             co5.o(tc, "error");
             tb.d.accept(tc);
             return;
           case 11:
             tb = this.c;
             if (tb.c != null) {
                Rect rect = new Rect();
                tb.b.getHitRect(rect);
                int i2 = xj0.e0(24.00f, tb.c.getResources());
                rect.top = 0;
                rect.left = rect.left - i2;
                rect.bottom = rect.bottom + i2;
                rect.right = rect.right + i2;
                this.b.setTouchDelegate(new TouchDelegate(rect, tb.c));
             }
             return;
             break;
           case 12:
             this.b.invoke(Long.valueOf(this.c.b));
             return;
           case 13:
             tb = this.b;
             this.c.toString();
             tb.a.removeCallbacks(tb.y);
             if ((z = tb.z) == null || z == i) {
                tb.y(2);
                if (tb.c != null) {
                   throw null;
                }
             }
             return;
             break;
           case 14:
             this.c.e.i(this.b);
             return;
           case 15:
             if ((c2 = this.b.c) == null) {
                tc = this.c;
                c2 = this.b.d;
                if (c2.size() < 50) {
                   c2.add(tc);
                }
             }else {
                c2.a(this.c);
             }
             return;
             break;
           case 16:
             throw new RuntimeException("Transformation "+this.b.a()+" crashed with exception.", this.c);
           case 17:
             throw new AssertionError("Unknown handler message received: "+this.b.what);
           case 18:
             throw new RuntimeException(this.b);
           case 19:
             throw new AssertionError("Unhandled stats message."+this.b.what);
           case 20:
             this.c.subscribe(this.b);
             return;
           case 21:
             this.c.a.onNext(this.b);
             return;
           case 22:
             this.c.a.subscribe(this.b);
             return;
           case 23:
             this.c.b.onError(this.b);
             return;
           case 24:
             this.c.b.onSuccess(this.b);
             return;
           case 25:
             tb = this.b;
             qw1 b = tb.b;
             b.getClass();
             cd1.c(b, this.c.c(tb));
             return;
           case 26:
             this.b.t = i;
             this.c.a.remove(this.b);
             return;
           default:
             ye7.E(this.b).d(eb3.h(this.c));
             return;
       }
    }
}
