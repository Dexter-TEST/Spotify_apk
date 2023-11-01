package p.zb7;
import p.d46;
import p.du0;
import p.xw0;
import p.ac7;
import p.ww0;
import p.vw0;
import p.au0;
import java.lang.ThreadLocal;
import java.lang.Object;
import p.co5;
import p.fv1;
import p.zw0;
import p.w51;
import p.t65;
import p.b17;
import p.vv7;

public final class zb7 extends d46	// class@002ec6 from classes.dex
{
    public final ThreadLocal t;

    public void zb7(du0 p0,xw0 p1){
       ac7 a = ac7.a;
       xw0 oxw0 = (p1.f(a) == null)? p1.T(a): p1;
       super(p0, oxw0);
       ThreadLocal threadLocal = new ThreadLocal();
       this.t = threadLocal;
       p0 = p0.b;
       co5.i(p0);
       if (!p0.f(fv1.t) instanceof zw0) {
          p0 = w51.W(p1, null);
          w51.N(p1, p0);
          threadLocal.set(new t65(p1, p0));
       }
       return;
    }
    public final void M(Object p0){
       Object obj;
       zb7 tt = this.t;
       t65 ot65 = tt.get();
       zb7 ozb7 = null;
       if (ot65 != null) {
          w51.N(ot65.a, ot65.b);
          tt.set(ozb7);
       }
       p0 = b17.w(p0);
       d46 tc = this.c;
       xw0 context = tc.getContext();
       if ((obj = w51.W(context, ozb7)) != w51.C) {
          ozb7 = vv7.X(tc, context, obj);
       }
       tc.d(p0);
       if (ozb7 == null || ozb7.O()) {
          w51.N(context, obj);
       }
       return;
    }
    public final boolean O(){
       zb7 tt = this.t;
       if (tt.get() == null) {
          return false;
       }
       tt.set(null);
       return true;
    }
}
