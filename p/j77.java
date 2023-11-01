package p.j77;
import p.er5;
import java.lang.Object;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p.vr5;
import p.zr5;
import p.yq5;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import p.ri3;
import java.lang.Class;
import p.qi3;
import p.mk2;
import java.util.Set;
import p.nk2;
import p.dn2;
import p.u44;
import androidx.recyclerview.widget.GridLayoutManager;
import p.gn2;
import android.util.SparseIntArray;
import android.view.ViewGroup$LayoutParams;
import p.ir5;
import p.m65;

public final class j77 extends er5	// class@001a81 from classes.dex
{
    public final int a;
    public final Object b;

    public void j77(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void f(Rect p0,View p1,RecyclerView p2,vr5 p3){
       int i1;
       int i4;
       mk2 omk2;
       int i5;
       j77 oj77 = this;
       Rect rect = p0;
       j77 b = oj77.b;
       switch (oj77.a){
           case 0:
             zr5 ozr5 = p2.L(p1);
             yq5 adapter = p2.getAdapter();
             if (ozr5 != null) {
                int i = -1;
                if (ozr5.d() != i && (adapter != null && b.h0 != null)) {
                   i1 = ozr5.d();
                   int i2 = adapter.d();
                   TraitsLayoutManager e0 = b.e0;
                   TraitsLayoutManager h0 = b.h0;
                   ri3 a = b.g0.a;
                   a.getClass();
                   rect.set(0, 0, 0, 0);
                   qi3 b1 = a.b;
                   Set set = a.b((i1 - 1), i2, h0);
                   Set set1 = a.b(i1, i2, h0);
                   Set set2 = a.b((i1 + 1), i2, h0);
                   b1.getClass();
                   nk2 b2 = nk2.b;
                   nk2 c = nk2.c;
                   mk2 d = b1.d;
                   if (set1.contains(b2)) {
                      mk2 a1 = b1.a;
                      int i3 = (a1.f != null)? a1.a(((e0.b.c0.c(i1) + a1.b(i1, e0)) + i), e0): a1.c(a1.b(i1, e0), e0);
                      mk2 b3 = b1.b;
                      if ((i4 = b3.get(i1, i)) < 0) {
                         u44 b4 = e0.b;
                         i4 = b4.c0.a(i1, b4.X);
                         b3.put(i1, i4);
                      }
                      omk2 = (!i4)? d: 0;
                      i1 = (a1.f != null)? a1.c(a1.b(i1, e0), e0): a1.a(((e0.b.c0.c(i1) + a1.b(i1, e0)) + i), e0);
                      rect.set(i3, omk2, i1, d);
                   }else {
                      omk2 = b1.i;
                      if (!set1.contains(nk2.v) && b1.j != null) {
                         mk2 c1 = b1.c;
                         if ((i5 = c1.get(i1, i)) < 0) {
                            u44 b6 = e0.b;
                            i5 = b6.c0.b(i1, b6.X);
                            c1.put(i1, i5);
                         }
                         u44 b5 = e0.b;
                         GridLayoutManager x = b5.X;
                         if (!i5) {
                            rect.left = rect.left + omk2;
                            if (b5.c0.c(i1) == x) {
                               rect.right = rect.right + omk2;
                            }
                         }else if(i5 == (x + i)){
                            rect.right = rect.right + omk2;
                         }
                      }
                      if (set2.contains(b2)) {
                         if (set1.contains(c)) {
                            rect.bottom = b1.g;
                            if (omk2 > null) {
                               rect.left = rect.left - d;
                            }
                         }else {
                            rect.bottom = d;
                         }
                      }
                   }
                   b2 = nk2.y;
                   if (set1.contains(nk2.w)) {
                      if (!set.contains(c)) {
                         rect.top = rect.top + d;
                      }
                      if (!set2.contains(b2) && !set2.contains(c)) {
                         rect.bottom = rect.bottom + d;
                      }
                   }
                   if (set1.contains(nk2.x)) {
                      mk2 h = b1.h;
                      rect.top = h;
                      rect.bottom = h;
                   }
                   if (set1.contains(nk2.a)) {
                      rect.top = b1.e;
                      if (!set2.contains(b2)) {
                         rect.bottom = b1.f;
                      }
                   }
                   if (set1.contains(nk2.A) && set.isEmpty()) {
                      rect.top = rect.top + d;
                   }
                }
             }
             break;
           default:
             i1 = p1;
             if (!p1.getLayoutParams().a()) {
                rect.top = rect.top + b.C;
             }
             return;
       }
       return;
    }
}
