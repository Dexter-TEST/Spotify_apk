package p.un0;
import p.yq5;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import p.ej5;
import java.util.Iterator;
import p.tn0;
import java.lang.String;
import p.is7;
import p.gh4;
import p.sk7;
import p.mq6;
import p.lq6;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import p.zr5;
import java.util.IdentityHashMap;
import java.lang.IllegalStateException;
import p.z00;
import p.rk7;

public final class un0 extends yq5	// class@0028e0 from classes.dex
{
    public final ej5 t;

    public void un0(yq5[] p0){
       boolean b;
       int i1;
       Iterator iterator1;
       RecyclerView recyclerView;
       super();
       this.t = new ej5(this);
       Iterator iterator = Arrays.asList(p0).iterator();
       while (true) {
          tn0 a = tn0.a;
          b = true;
          int i = 0;
          if (iterator.hasNext()) {
             yq5 oyq5 = iterator.next();
             un0 tt = this.t;
             if ((i1 = tt.a.size()) >= 0 && i1 <= tt.a.size()) {
                if (tt.g == a) {
                   iterator1 = 0;
                }
                if (b) {
                   is7.f("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", oyq5.b);
                }else {
                   yq5 b1 = oyq5.b;
                }
                int i2 = tt.a.size();
                while (true) {
                   b = -1;
                   if (i < i2) {
                      if (tt.a.get(i).c == oyq5) {
                      label_006a :
                         i2 = (i == b)? 0: tt.a.get(i);
                         if (i2 != null) {
                            continue ;
                         }else {
                            gh4 ogh4 = new gh4(oyq5, tt, tt.c, tt.h.a());
                            tt.a.add(i1, ogh4);
                            iterator1 = tt.d.iterator();
                         label_009b :
                            if (iterator1.hasNext()) {
                               if ((recyclerView = iterator1.next().get()) != null) {
                                  oyq5.m(recyclerView);
                                  goto label_009b ;
                               }else {
                                  goto label_009b ;
                               }
                            }else if(ogh4.e > null){
                               tt.b.k(tt.i(ogh4), ogh4.e);
                            }
                            tt.f();
                         }
                      }else {
                         i = i + 1;
                      }
                   }else {
                      i = -1;
                      goto label_006a ;
                   }
                }
             }else {
                throw new IndexOutOfBoundsException("Index must be between 0 and "+tt.a.size()+". Given:"+i1);
             }
          }else if(this.t.g != a){
             b = false;
             break ;
          }
          break ;
       }
       this.v(b);
       return;
    }
    public final int c(yq5 p0,zr5 p1,int p2){
       gh4 ogh4;
       int i;
       un0 tt = this.t;
       if ((ogh4 = tt.e.get(p1)) == null) {
          i = -1;
       }else {
          p2 = p2 - tt.i(ogh4);
          gh4 c = ogh4.c;
          int i1 = c.d();
          if (p2 >= 0 && p2 < i1) {
             i = c.c(p0, p1, p2);
          }else {
             throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to "+p2+" which is out of bounds for the adapter with size "+i1+".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:"+p1+"adapter:"+p0);
          }
       }
       return i;
    }
    public final int d(){
       Iterator iterator = this.t.a.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + iterator.next().e;
       }
       return i;
    }
    public final long e(int p0){
       un0 tt = this.t;
       z00 oz00 = tt.k(p0);
       z00 c = oz00.c;
       oz00.b = false;
       oz00.c = null;
       oz00.a = -1;
       tt.f = oz00;
       return c.b.a(c.c.e(oz00.a));
    }
    public final int f(int p0){
       un0 tt = this.t;
       z00 oz00 = tt.k(p0);
       z00 c = oz00.c;
       oz00.b = false;
       oz00.c = null;
       oz00.a = -1;
       tt.f = oz00;
       return c.a.d(c.c.f(oz00.a));
    }
    public final void m(RecyclerView p0){
       un0 tt = this.t;
       Iterator iterator = tt.d.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().get() == p0) {
                iterator = 1;
             }
          }else {
             iterator = 0;
          }
          if (!iterator) {
             tt.d.add(new WeakReference(p0));
             Iterator iterator1 = tt.a.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().c.m(p0);
             }
          }
          break ;
       }
       return;
    }
    public final void n(zr5 p0,int p1){
       un0 tt = this.t;
       z00 oz00 = tt.k(p1);
       tt.e.put(p0, oz00.c);
       oz00.c.c.b(p0, oz00.a);
       oz00.b = false;
       oz00.c = null;
       oz00.a = -1;
       tt.f = oz00;
    }
    public final zr5 o(int p0,RecyclerView p1){
       gh4 ogh4 = this.t.c.c(p0);
       return ogh4.c.o(ogh4.a.b(p0), p1);
    }
    public final void p(RecyclerView p0){
       un0 tt = this.t;
       int i = tt.d.size();
       while ((i = i - 1) >= 0) {
          WeakReference weakReferenc = tt.d.get(i);
          if (weakReferenc.get() == null) {
             tt.d.remove(i);
          }else if(weakReferenc.get() == p0){
             tt.d.remove(i);
             break ;
          }
       }
       Iterator iterator = tt.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().c.p(p0);
       }
       return;
    }
    public final boolean q(zr5 p0){
       gh4 ogh4;
       un0 tt = this.t;
       if ((ogh4 = tt.e.get(p0)) == null) {
          throw new IllegalStateException("Cannot find wrapper for "+p0+", seems like it is not bound by this adapter: "+tt);
       }
       tt.e.remove(p0);
       return ogh4.c.q(p0);
    }
    public final void r(zr5 p0){
       this.t.l(p0).c.r(p0);
    }
    public final void s(zr5 p0){
       this.t.l(p0).c.s(p0);
    }
    public final void t(zr5 p0){
       gh4 ogh4;
       un0 tt = this.t;
       if ((ogh4 = tt.e.get(p0)) == null) {
          throw new IllegalStateException("Cannot find wrapper for "+p0+", seems like it is not bound by this adapter: "+tt);
       }
       ogh4.c.t(p0);
       tt.e.remove(p0);
       return;
    }
}
