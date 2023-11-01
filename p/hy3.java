package p.hy3;
import p.gy3;
import p.by3;
import java.lang.Object;
import p.an5;
import p.u44;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.iz3;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import p.co5;
import p.gv4;
import p.hh3;
import p.xz1;
import p.il0;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ir2;
import p.bi5;
import p.mf1;
import p.yf2;
import p.ay3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;

public final class hy3	// class@0018e7 from classes.dex
{
    public final ey3 a;
    public final yx3 b;
    public final an5 c;
    public final an5 d;
    public dx3 e;
    public final u44 f;
    public final Scheduler g;

    public void hy3(gy3 p0,by3 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new an5();
       this.d = new an5();
       this.f = new u44(24);
       this.g = id.a();
    }
    public final void a(iz3 p0){
       hy3 tb = this.b;
       tb.f.t();
       tb.h.clear();
       object oobject = by3.k[0];
       Integer integer = Integer.valueOf(0);
       by3 i = tb.i;
       i.getClass();
       co5.o(oobject, "property");
       gv4 a = i.a;
       i.a = integer;
       i.a(a, integer, oobject);
       tb.d = new il0();
       this.c.onNext(p0);
    }
    public final void b(){
       hy3 te;
       if ((te = this.e) != null) {
          hy3 tb = this.b;
          tb.getClass();
          tb.g = te;
          TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
          Disposable uDisposable = tb.b.mergeWith(tb.c.debounce(200, mILLISECONDS)).delay(0, mILLISECONDS).filter(ir2.f0).map(new mf1(7, te)).filter(ir2.g0).observeOn(tb.a).subscribe(new ay3(tb, 0));
          co5.l(uDisposable, "override fun onStart\(vie…        }\n        \)\n    }");
          tb.f.s(uDisposable);
          return;
       }else {
          co5.N("viewBinder");
          throw null;
       }
    }
}
