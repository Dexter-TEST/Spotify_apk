package p.x86;
import p.vi7;
import p.fh5;
import p.si4;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ne4;
import p.mk7;
import java.util.List;
import java.lang.Throwable;
import p.ux5;
import java.lang.Iterable;
import java.util.Collection;
import java.util.ArrayList;
import p.dj0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.CharSequence;
import p.av6;
import androidx.lifecycle.b;
import p.ll1;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Observable;
import p.u86;
import p.ir0;
import io.reactivex.rxjava3.core.Single;
import p.v86;
import p.yf2;

public final class x86 extends vi7	// class@002c2d from classes.dex
{
    public final ne4 A;
    public String B;
    public final fh5 t;
    public final si4 v;
    public final Scheduler w;
    public final Scheduler x;
    public Disposable y;
    public Disposable z;

    public void x86(fh5 p0,si4 p1,Scheduler p2,Scheduler p3){
       mk7 p1;
       co5.o(p0, "ubiSearchLogger");
       co5.o(p1, "repository");
       co5.o(p2, "mainScheduler");
       co5.o(p3, "ioScheduler");
       super();
       this.t = p0;
       this.v = p1;
       this.w = p2;
       this.x = p3;
       p1 = new mk7(null, null, false, false, false, 63);
       this.A = new ne4(p1);
    }
    public static mk7 f(String p0,Object p1,List p2){
       mk7 v8;
       if (ux5.a(p1) == null) {
          Iterable iterable = p1;
          ArrayList uArrayList = dj0.u0(iterable, p2);
          boolean b = (iterable.size() >= 10)? true: false;
          v8 = new mk7(p0, uArrayList, false, false, b, 28);
       }else {
          v8 = new mk7(p0, p2, false, true, false, 44);
       }
       return v8;
    }
    public final void b(){
       x86 ty;
       if ((ty = this.y) != null) {
          ty.dispose();
       }
       if ((ty = this.z) != null) {
          ty.dispose();
       }
       return;
    }
    public final void e(String p0,String p1){
       x86 ty;
       ll1 oll1;
       mk7 omk71;
       co5.o(p0, "query");
       co5.o(p1, "searchUrl");
       if ((ty = this.y) != null) {
          ty.dispose();
       }
       if ((ty = this.z) != null) {
          ty.dispose();
       }
       x86 tA = this.A;
       if (!av6.p0(p0) && p0.length() <= 500) {
          this.B = p1;
          if ((omk71 = tA.e()) == null || (omk71 = omk71.b) == null) {
             oll1 = ll1.a;
          }
          mk7 oll11 = new mk7(p0, oll1, true, false, false, 56);
          tA.l(oll1);
          tA = this.x;
          x86 tw = this.w;
          this.z = Observable.timer(250, TimeUnit.MILLISECONDS).subscribeOn(tA).observeOn(tw).subscribe(new u86(this, false));
          this.y = this.v.f(false, p1, p0).map(new v86(this, p0, false)).subscribeOn(tA).observeOn(tw).subscribe(new u86(this, 1));
          return;
       }else {
          mk7 omk7 = tA.e();
          oll1 = null;
          if (omk7 != null) {
             oll1 = mk7.a(omk7, p0, oll1, false, 62);
          }
          tA.k(oll1);
          return;
       }
    }
}
