package p.ee2;
import p.dh4;
import android.content.Context;
import androidx.fragment.app.o;
import java.util.LinkedHashSet;
import p.gg4;
import p.de2;
import java.util.List;
import p.ng4;
import java.util.Iterator;
import java.lang.Object;
import p.qf4;
import p.uf4;
import p.fp5;
import java.util.Set;
import androidx.fragment.app.n;
import java.lang.String;
import p.yd2;
import java.lang.StringBuilder;
import p.md2;
import java.lang.ClassLoader;
import androidx.fragment.app.Fragment;
import p.co5;
import android.os.Bundle;
import androidx.fragment.app.a;
import p.dj0;
import p.zd2;
import java.lang.IllegalStateException;
import java.util.ArrayList;
import java.lang.Iterable;
import java.util.AbstractCollection;
import p.cj0;
import p.t65;
import java.util.Collection;
import p.do5;
import java.util.Objects;

public class ee2 extends dh4	// class@00146c from classes.dex
{
    public final Context c;
    public final o d;
    public final int e;
    public final LinkedHashSet f;

    public void ee2(Context p0,o p1,int p2){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = new LinkedHashSet();
    }
    public final gg4 a(){
       return new de2(this);
    }
    public final void d(List p0,ng4 p1){
       de2 b2;
       ee2 uoee2 = this;
       ng4 ong4 = p1;
       ee2 d = uoee2.d;
       if (d.L()) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          qf4 oqf4 = iterator.next();
          List value = this.b().e.getValue();
          boolean b = value.isEmpty();
          int i = 0;
          int i1 = (ong4 && (!b && (ong4.b != null && uoee2.f.remove(oqf4.w))))? 1: 0;
          if (i1) {
             d.v(new n(d, oqf4.w, i), i);
             this.b().e(oqf4);
          }else {
             qf4 b1 = oqf4.b;
             if ((b2 = b1.B) != null) {
                ee2 c = uoee2.c;
                if (b2.charAt(i) == '.') {
                   b2 = "".append(c.getPackageName()).append(b2).toString();
                }
                Fragment uFragment = d.G().a(c.getClassLoader(), b2);
                co5.l(uFragment, "fragmentManager.fragment…t.classLoader, className\)");
                uFragment.setArguments(oqf4.c);
                a uoa = new a(d);
                int i2 = -1;
                ng4 f = (ong4 != null)? ong4.f: -1;
                ng4 g = (ong4 != null)? ong4.g: -1;
                ng4 h = (ong4 != null)? ong4.h: -1;
                ng4 i3 = (ong4 != null)? ong4.i: -1;
                if (f != i2 || (g != i2 || (h != i2 || i3 != i2))) {
                   if (f == i2) {
                      f = 0;
                   }
                   if (g == i2) {
                      g = 0;
                   }
                   if (h == i2) {
                      h = 0;
                   }
                   if (i3 == i2) {
                      i = 0;
                   }
                   uoa.b = f;
                   uoa.c = g;
                   uoa.d = h;
                   uoa.e = i3;
                }
                uoa.k(uoee2.e, uFragment, null);
                uoa.m(uFragment);
                gg4 y = b1.y;
                y = (ong4 != null && (!b && (ong4.a != null && dj0.r0(value).b.y == y)))? 1: 0;
                if (!b) {
                   qf4 w = oqf4.w;
                   if (y) {
                      if (value.size() > 1) {
                         d.v(new zd2(d, w, i2), false);
                         uoa.c(w);
                      }
                      y = 0;
                   label_0112 :
                      uoa.p = true;
                      uoa.e(false);
                      if (y) {
                         this.b().e(oqf4);
                      }
                   }else {
                      uoa.c(w);
                   }
                }
                y = 1;
                goto label_0112 ;
             }else {
                break ;
             }
          }
       }
       throw new IllegalStateException("Fragment class was not set".toString());
    }
    public final void f(Bundle p0){
       ArrayList stringArrayL;
       if ((stringArrayL = p0.getStringArrayList("androidx-nav-fragment:navigator:savedIds")) != null) {
          ee2 tf = this.f;
          tf.clear();
          cj0.c0(stringArrayL, tf);
       }
       return;
    }
    public final Bundle g(){
       ee2 tf = this.f;
       if (tf.isEmpty()) {
          return null;
       }
       t65[] ot65Array = new t65[]{new t65("androidx-nav-fragment:navigator:savedIds", new ArrayList(tf))};
       return do5.g(ot65Array);
    }
    public final void h(qf4 p0,boolean p1){
       co5.o(p0, "popUpTo");
       ee2 td = this.d;
       if (td.L()) {
          return;
       }
       if (p1) {
          List value = this.b().e.getValue();
          qf4 oqf4 = dj0.k0(value);
          Iterator iterator = dj0.w0(value.subList(value.indexOf(p0), value.size())).iterator();
          while (iterator.hasNext()) {
             qf4 oqf41 = iterator.next();
             if (co5.c(oqf41, oqf4)) {
                Objects.toString(oqf41);
             }else {
                td.v(new n(td, oqf41.w, 1), false);
                this.f.add(oqf41.w);
             }
          }
       }else {
          td.v(new zd2(td, p0.w, -1), false);
       }
       this.b().c(p0, p1);
       return;
    }
}
