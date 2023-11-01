package p.pk6;
import io.reactivex.rxjava3.core.Single;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import p.ok6;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import p.jl1;
import p.zv6;
import p.yf2;
import java.lang.String;
import java.util.Objects;
import p.al6;
import p.ir0;
import java.lang.Throwable;
import p.co5;
import p.hn0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class pk6 extends Single	// class@00227e from classes.dex
{
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object t;
    public final Object v;

    public void pk6(Object p0,Object p1,Object p2,boolean p3,int p4){
       this.a = p4;
       super();
       this.c = p0;
       this.t = p1;
       this.v = p2;
       this.b = p3;
    }
    public final void subscribeActual(SingleObserver p0){
       pk6 tb = this.b;
       pk6 tv = this.v;
       pk6 tt = this.t;
       pk6 tc = this.c;
       switch (this.a){
           case 0:
             tc.subscribe(new ok6(p0, tt, tv, tb));
             return;
           default:
             yf2 oyf2 = tc.get();
             Object obj = tt.apply(oyf2);
             Objects.requireNonNull(obj, "The singleFunction returned a null SingleSource");
             obj.subscribe(new al6(p0, oyf2, tb, tv));
             return;
       }
    }
}
