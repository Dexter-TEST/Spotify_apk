package p.ap6;
import p.to6;
import p.y50;
import p.wm3;
import p.wn;
import p.sn;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.LinkedList;
import p.an5;
import p.u44;
import p.wf2;
import java.lang.Class;
import p.t50;
import p.hs0;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;

public final class ap6 implements to6	// class@000fcc from classes.dex
{
    public final y50 a;
    public final wm3 b;
    public final wn c;
    public final sn d;
    public final LinkedList e;
    public final an5 f;
    public final u44 g;

    public void ap6(y50 p0,wm3 p1,wn p2,sn p3){
       co5.o(p0, "branchFacade");
       co5.o(p1, "branchSettings");
       co5.o(p2, "attributionValueStorage");
       co5.o(p3, "attributionEventLogger");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = new LinkedList();
       this.f = new an5();
       this.g = new u44(24);
    }
    public final void a(wf2 p0){
       this.a.getClass();
       int i = (t50.i() != null)? 1: 0;
       if (i) {
          p0.invoke();
       }else {
          Disposable uDisposable = this.f.subscribe(new hs0(2, p0));
          co5.l(uDisposable, "onInitialised: \(\) -> Uni…lised\(\)\n                }");
          this.g.s(uDisposable);
       }
       return;
    }
}
