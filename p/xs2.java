package p.xs2;
import p.yq5;
import p.uu2;
import java.lang.Class;
import java.lang.Object;
import p.jt2;
import p.ys2;
import p.ar5;
import java.util.List;
import p.ju2;
import p.m33;
import p.e33;
import java.lang.String;
import p.zr5;
import p.ws2;
import p.r8;
import p.y33;
import android.view.View;
import p.bt2;
import p.vt2;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p.l33;
import java.util.Collections;
import com.google.common.collect.c;
import p.ys5;
import p.i33;

public final class xs2 extends yq5	// class@002cd9 from classes.dex
{
    public final uu2 t;
    public final jt2 v;
    public final ys2 w;

    public void xs2(uu2 p0){
       super();
       p0.getClass();
       this.t = p0;
       jt2 ojt2 = new jt2(p0);
       this.v = ojt2;
       this.w = new ys2(ojt2);
       this.v(true);
       this.u(ojt2.v);
    }
    public final int d(){
       return this.v.size();
    }
    public final long e(int p0){
       String str;
       xs2 tv = this.v;
       ju2 oju2 = tv.b.get(p0);
       oju2.getClass();
       m33 a = tv.c.a(oju2).a;
       if ((str = a.c()) != null) {
          a = str;
       }
       return (long)a.hashCode();
    }
    public final int f(int p0){
       xs2 tv = this.v;
       ju2 oju2 = tv.b.get(p0);
       oju2.getClass();
       return tv.c.a(oju2).b;
    }
    public final void n(zr5 p0,int p1){
       xs2 tv = this.v;
       ju2 oju2 = tv.b.get(p1);
       oju2.getClass();
       m33 om33 = tv.c.a(oju2);
       ws2 u = p0.u;
       u.getClass();
       om33 = om33.a;
       u.e = new r8(om33, p1, 0);
       y33 d = u.d;
       d.j.getClass();
       u.c.b(u.b, om33, d, this.w);
       d.j.getClass();
    }
    public final zr5 o(int p0,RecyclerView p1){
       return new ws2(y33.a(p0, p1, this.t));
    }
    public final void w(List p0){
       int i;
       if (p0 == null || p0.isEmpty()) {
          this.w.a.clear();
       }
       xs2 tv = this.v;
       if (p0 != null) {
          tv.b = p0;
          uu2 g = tv.a.g;
          l33 i1 = (p0 != l33.t && (p0 != Collections.emptyList() && p0 != ys5.v))? 0: 1;
          if (!i && (!p0 instanceof l33 || p0.c != g)) {
             i1 = new l33(g, p0);
          }
       }else {
          tv.getClass();
          tv.b = Collections.emptyList();
          l33 t = l33.t;
       }
       return;
    }
}
