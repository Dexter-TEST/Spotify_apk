package p.dr5;
import java.lang.Object;
import java.util.ArrayList;
import p.zr5;
import p.zn;
import p.xq5;
import androidx.recyclerview.widget.RecyclerView;
import p.xe0;
import android.view.View;
import android.view.ViewGroup;
import p.we0;
import p.pr5;

public abstract class dr5	// class@0013a1 from classes.dex
{
    public xq5 a;
    public final ArrayList b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public void dr5(){
       super();
       this.a = null;
       this.b = new ArrayList();
       this.c = 120;
       this.d = 120;
       this.e = 250;
       this.f = 250;
    }
    public static void b(zr5 p0){
       int i = p0.j & 0x0e;
       if (p0.i()) {
          return;
       }
       if (!((i & 0x04))) {
          p0.c();
       }
       return;
    }
    public abstract boolean a(zr5 p0,zr5 p1,zn p2,zn p3);
    public final void c(zr5 p0){
       dr5 ta;
       int i1;
       this.g(p0);
       if ((ta = this.a) != null) {
          boolean b = true;
          p0.p(b);
          zr5 ozr5 = null;
          if (p0.h != null && p0.i == null) {
             p0.h = ozr5;
          }
          p0.i = ozr5;
          int i = ((p0.j & 0x10))? 1: 0;
          if (!i) {
             xq5 a = ta.a;
             a.l0();
             RecyclerView w = a.w;
             xe0 b1 = w.b;
             zr5 a1 = p0.a;
             if ((i1 = b1.a.indexOfChild(a1)) == -1) {
                w.m(a1);
             }else {
                xe0 c1 = w.c;
                if (c1.d(i1)) {
                   c1.f(i1);
                   w.m(a1);
                   b1.i(i1);
                }else {
                   b = false;
                }
             }
             if (b) {
                zr5 ozr51 = RecyclerView.M(a1);
                RecyclerView c = a.c;
                c.m(ozr51);
                c.j(ozr51);
             }
             a.m0((b ^ 0x01));
             if (!b && p0.m()) {
                a.removeDetachedView(a1, false);
             }
          }
       }
       return;
    }
    public abstract void d(zr5 p0);
    public abstract void e();
    public abstract boolean f();
    public void g(zr5 p0){
    }
}
