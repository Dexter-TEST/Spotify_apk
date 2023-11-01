package p.qk7;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import java.lang.Object;
import p.me3;
import p.io2;
import p.mc1;
import p.vz3;
import p.sn2;
import p.pk7;
import p.au0;
import p.il1;
import p.xw0;
import p.vv7;
import p.fv1;
import p.ww0;
import p.vw0;
import p.aj3;
import p.ng2;
import p.uq6;
import p.i0;
import coil.request.ViewTargetRequestDelegate;
import p.wp5;
import p.n63;
import p.wc1;
import p.dk3;
import p.vj3;

public final class qk7 implements View$OnAttachStateChangeListener	// class@0023bf from classes.dex
{
    public final View a;
    public ok7 b;
    public me3 c;
    public ViewTargetRequestDelegate t;
    public boolean v;

    public void qk7(View p0){
       this.a = p0;
    }
    public synchronized final void a(){
       qk7 tc;
       if ((tc = this.c) != null) {
          io2.e(tc);
       }
       sn2 w = vz3.a.w;
       pk7 opk7 = new pk7(this, null);
       if ((2 & 1)) {
          w = il1.a;
       }
       int i = 2;
       int i1 = 0;
       int i2 = ((i & i))? 1: 0;
       xw0 oxw0 = vv7.s(il1.a, w, 1);
       b81 a = mc1.a;
       if (oxw0 != a && oxw0.f(fv1.t) == null) {
          oxw0 = oxw0.T(a);
       }
       if (i2 == i) {
          i1 = 1;
       }
       aj3 uoaj3 = (i1)? new aj3(oxw0, opk7): new uq6(oxw0, 1);
       uoaj3.N(i2, uoaj3, opk7);
       this.c = uoaj3;
       this.b = null;
       return;
    }
    public final void onViewAttachedToWindow(View p0){
       qk7 tt;
       if ((tt = this.t) == null) {
          return;
       }
       this.v = true;
       tt.a.b(tt.b);
       return;
    }
    public final void onViewDetachedFromWindow(View p0){
       qk7 tt;
       if ((tt = this.t) != null) {
          io2.e(tt.v);
          ViewTargetRequestDelegate c = tt.c;
          ViewTargetRequestDelegate t = tt.t;
          if (c instanceof dk3) {
             t.c(c);
          }
          t.c(tt);
       }
       return;
    }
}
