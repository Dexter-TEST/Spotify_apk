package p.hw0;
import p.ir0;
import p.ow0;
import java.lang.Object;
import java.lang.Class;
import java.util.Objects;
import p.kw0;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;
import p.v05;
import p.co5;
import p.lb;
import p.fl0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Boolean;
import p.gv0;

public final class hw0 implements ir0	// class@0018d2 from classes.dex
{
    public final int a;
    public final ow0 b;

    public void hw0(ow0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       hw0 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             Objects.requireNonNull(p0);
             Completable.i(new kw0(p0, 1)).p(tb.F).subscribe();
             return;
           case 1:
             tb.getClass();
             Objects.requireNonNull(p0);
             lb f = co5.f;
             Completable.i(new kw0(p0, 0)).p(tb.F).g(new v05(7), co5.g, f, f, f, f).subscribe();
             return;
           default:
             tb.m.a();
             return;
       }
    }
}
