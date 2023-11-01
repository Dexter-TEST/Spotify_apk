package p.xq5;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import p.n7;
import p.hr5;
import p.zr5;
import p.xe0;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import p.ir5;
import p.pr5;
import java.util.ArrayList;
import p.vr5;
import java.lang.Class;
import p.zn;
import p.q71;

public final class xq5	// class@002ccb from classes.dex
{
    public final RecyclerView a;

    public void xq5(RecyclerView p0){
       this.a = p0;
       super();
    }
    public final void a(n7 p0){
       n7 a = p0.a;
       xq5 ta = this.a;
       if (a != 1) {
          if (a != 2) {
             if (a != 4) {
                if (a == 8) {
                   ta.E.m0(ta, p0.b, p0.d);
                }
             }else {
                ta.E.p0(ta, p0.b, p0.d, p0.c);
             }
          }else {
             ta.E.n0(ta, p0.b, p0.d);
          }
       }else {
          ta.E.k0(ta, p0.b, p0.d);
       }
       return;
    }
    public final zr5 b(int p0){
       zr5 ozr51;
       xq5 ta = this.a;
       int i = ta.w.h();
       int i1 = 0;
       zr5 ozr5 = null;
       while (true) {
          if (i1 < i) {
             if ((ozr51 = RecyclerView.M(ta.w.g(i1))) != null && (!ozr51.k() && ozr51.c == p0)) {
                if (ta.w.k(ozr51.a)) {
                   ozr5 = ozr51;
                }else {
                   ozr5 = ozr51;
                label_0035 :
                   if (ozr5 == null) {
                      return null;
                   }else if(ta.w.k(ozr5.a)){
                      return null;
                   }else {
                      break ;
                   }
                }
             }
             i1 = i1 + 1;
          }else {
             goto label_0035 ;
          }
       }
       return ozr5;
    }
    public final int c(){
       return this.a.getChildCount();
    }
    public final void d(int p0,int p1,Object p2){
       int i2;
       zr5 ozr5;
       zr5 c;
       zr5 ozr51;
       xq5 ta = this.a;
       int i = ta.w.h();
       p1 = p1 + p0;
       int i1 = 0;
       while (true) {
          i2 = 2;
          if (i1 < i) {
             View view = ta.w.g(i1);
             if ((ozr5 = RecyclerView.M(view)) != null && (!ozr5.q() && ((c = ozr5.c) >= p0 && c < p1))) {
                ozr5.b(i2);
                ozr5.a(p2);
                view.getLayoutParams().c = true;
             }
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       p2 = ta.c;
       pr5 f = p2.f;
       i1 = f.size();
       while ((i1 = i1 - 1) >= 0) {
          if ((ozr51 = f.get(i1)) == null || ((ozr5 = ozr51.c) < p0 || ozr5 >= p1)) {
             continue ;
          }else {
             ozr51.b(i2);
             p2.h(i1);
          }
       }
       ta.C0 = true;
       return;
    }
    public final void e(int p0,int p1){
       zr5 ozr5;
       zr5 ozr51;
       xq5 ta = this.a;
       int i = ta.w.h();
       int i1 = 0;
       while (i1 < i) {
          if ((ozr5 = RecyclerView.M(ta.w.g(i1))) != null && (!ozr5.q() && ozr5.c >= p0)) {
             ozr5.n(p1, false);
             ta.y0.f = true;
          }
          i1 = i1 + 1;
       }
       pr5 f = ta.c.f;
       i1 = f.size();
       int i2 = 0;
       while (i2 < i1) {
          if ((ozr51 = f.get(i2)) != null && ozr51.c >= p0) {
             ozr51.n(p1, false);
          }
          i2 = i2 + 1;
       }
       ta.requestLayout();
       ta.B0 = true;
       return;
    }
    public final void f(int p0,int p1){
       int i2;
       int i3;
       int i4;
       zr5 ozr5;
       zr5 c;
       int i6;
       xq5 ta = this.a;
       int i = ta.w.h();
       int i1 = -1;
       if (p0 < p1) {
          i2 = p0;
          i3 = p1;
          i4 = -1;
       }else {
          i3 = p0;
          i2 = p1;
          i4 = 1;
       }
       int i5 = 0;
       while (i5 < i) {
          if ((ozr5 = RecyclerView.M(ta.w.g(i5))) != null && ((c = ozr5.c) >= i2 && c <= i3)) {
             if (c == p0) {
                i6 = p1 - p0;
                ozr5.n(i6, false);
             }else {
                ozr5.n(i4, false);
             }
             ta.y0.f = true;
          }
          i5 = i5 + 1;
       }
       RecyclerView c1 = ta.c;
       c1.getClass();
       if (p0 < p1) {
          i2 = p0;
          i3 = p1;
       }else {
          i3 = p0;
          i2 = p1;
          i1 = 1;
       }
       pr5 f = c1.f;
       i4 = f.size();
       i5 = 0;
       while (i5 < i4) {
          if ((ozr5 = f.get(i5)) != null && ((c = ozr5.c) >= i2 && c <= i3)) {
             if (c == p0) {
                i6 = p1 - p0;
                ozr5.n(i6, false);
             }else {
                ozr5.n(i1, false);
             }
          }
          i5 = i5 + 1;
       }
       ta.requestLayout();
       ta.B0 = true;
       return;
    }
    public final void g(zr5 p0,zn p1,zn p2){
       boolean b;
       xq5 ta = this.a;
       ta.getClass();
       p0.p(false);
       RecyclerView recyclerView = ta.g0;
       if (p1 != null) {
          recyclerView.getClass();
          zn a = p1.a;
          zn a1 = p2.a;
          if (a != a1 || p1.b != p2.b) {
             b = recyclerView.h(p0, a, p1.b, a1, p2.b);
          label_0038 :
             if (b) {
                ta.V();
             }
             return;
          }
       }
       recyclerView.m(p0);
       p0.a.setAlpha(0);
       recyclerView.i.add(p0);
       b = true;
       goto label_0038 ;
    }
    public final void h(zr5 p0,zn p1,zn p2){
       boolean b1;
       xq5 ta = this.a;
       ta.c.m(p0);
       ta.g(p0);
       p0.p(false);
       RecyclerView recyclerView = ta.g0;
       recyclerView.getClass();
       zn a = p1.a;
       zn b = p1.b;
       zr5 a1 = p0.a;
       int left = (p2 == null)? a1.getLeft(): p2.a;
       int i = left;
       int top = (p2 == null)? a1.getTop(): p2.b;
       int i1 = top;
       if (!p0.k() && (a != i && b == i1)) {
          a1.layout(i, i1, (a1.getWidth() + i), (a1.getHeight() + i1));
          b1 = recyclerView.h(p0, a, b, i, i1);
       }else {
          recyclerView.m(p0);
          recyclerView.h.add(p0);
          b1 = true;
       }
       if (b1) {
          ta.V();
       }
       return;
    }
    public final void i(int p0){
       View childAt;
       xq5 ta = this.a;
       if ((childAt = ta.getChildAt(p0)) != null) {
          ta.q(childAt);
          childAt.clearAnimation();
       }
       ta.removeViewAt(p0);
       return;
    }
}
