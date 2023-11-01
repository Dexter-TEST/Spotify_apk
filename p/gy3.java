package p.gy3;
import p.ey3;
import java.lang.Object;
import p.t00;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.u44;
import p.o26;
import p.ay6;
import p.wf2;
import p.dx3;
import p.gu0;
import p.iz3;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.co5;
import p.mf1;
import p.yf2;
import p.ir2;
import io.reactivex.rxjava3.core.ObservableSource;
import p.fy3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;

public final class gy3 implements ey3	// class@0017a2 from classes.dex
{
    public dx3 a;
    public gu0 b;
    public final t00 c;
    public final t00 d;
    public final Scheduler e;
    public final u44 f;
    public final ay6 g;

    public void gy3(){
       super();
       this.c = t00.a();
       this.d = t00.a();
       this.e = id.a();
       this.f = new u44(24);
       this.g = new ay6(new o26(23, this));
    }
    public final void a(dx3 p0,gu0 p1){
       gy3 tf = this.f;
       tf.t();
       gu0 b = p1.b;
       iz3 h = b.h;
       Observable observable = h.take(1);
       co5.l(observable, "trackProgress.take\(1\)");
       observable = observable.map(new mf1(8, b));
       co5.l(observable, "lyricsViewConfiguration:…n, forceScroll\)\n        }");
       Observable observable1 = h.map(new mf1(8, b));
       co5.l(observable1, "lyricsViewConfiguration:…n, forceScroll\)\n        }");
       gy3 te = this.e;
       observable1 = Observable.concat(observable.map(ir2.R), observable1).observeOn(te).distinctUntilChanged();
       co5.l(observable1, "concat\(\n            /**\n…r\).distinctUntilChanged\(\)");
       Disposable uDisposable = observable1.subscribe(new fy3(p0, 0));
       co5.l(uDisposable, "observeProgressForScroll…e\(viewBinder::autoScroll\)");
       tf.s(uDisposable);
       Observable observable2 = p1.b.h.map(new mf1(9, p1.a)).observeOn(te).distinctUntilChanged();
       co5.l(observable2, "progressTransformer: Lyr…r\).distinctUntilChanged\(\)");
       Disposable uDisposable1 = observable2.subscribe(new fy3(p0, 1));
       co5.l(uDisposable1, "observeProgressForHighli…wBinder::updateHighlight\)");
       tf.s(uDisposable1);
       uDisposable1 = this.c.distinctUntilChanged().observeOn(te).subscribe(new fy3(p0, 2));
       co5.l(uDisposable1, "viewBinder: LyricsContra…xt\)\n                    }");
       tf.s(uDisposable1);
       observable2 = this.d.distinctUntilChanged().observeOn(te);
       Disposable uDisposable2 = observable2.subscribe(new fy3(p0, 3));
       co5.l(uDisposable2, "translationSubject\n     …inder::renderTranslation\)");
       tf.s(uDisposable2);
    }
}
