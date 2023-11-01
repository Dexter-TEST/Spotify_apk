package p.xf;
import p.a6;
import p.jg;
import p.oy6;
import java.lang.Object;
import p.b6;
import android.view.View;
import android.view.Window;
import java.lang.Runnable;
import p.fk7;
import p.wh7;
import p.wf;
import p.ik7;
import p.kf;
import p.hh7;
import p.e64;
import android.view.MenuItem;

public final class xf implements a6	// class@002c6c from classes.dex
{
    public final a6 a;
    public final jg b;

    public void xf(jg p0,oy6 p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public final void c(b6 p0){
       jg p;
       this.a.c(p0);
       xf tb = this.b;
       if (tb.N != null) {
          tb.C.getDecorView().removeCallbacks(tb.O);
       }
       if (tb.M != null) {
          if ((p = tb.P) != null) {
             p.b();
          }
          fk7 uofk7 = wh7.a(tb.M);
          uofk7.a(0);
          tb.P = uofk7;
          uofk7.d(new wf(2, this));
       }
       if ((p = tb.E) != null) {
          p.f();
       }
       tb.L = null;
       hh7.c(tb.S);
       tb.J();
       return;
    }
    public final boolean e(b6 p0,e64 p1){
       return this.a.e(p0, p1);
    }
    public final boolean f(b6 p0,MenuItem p1){
       return this.a.f(p0, p1);
    }
    public final boolean g(b6 p0,e64 p1){
       hh7.c(this.b.S);
       return this.a.g(p0, p1);
    }
}
