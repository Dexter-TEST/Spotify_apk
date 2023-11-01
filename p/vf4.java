package p.vf4;
import p.zf2;
import p.gi3;
import java.lang.Object;
import p.nw6;
import java.lang.String;
import p.co5;
import p.hq;
import java.lang.Class;
import p.uw6;
import p.i57;
import p.xj6;
import java.lang.Enum;
import p.yj6;
import p.j46;
import p.jc7;
import p.y6;
import p.gu3;
import p.ht3;
import p.sz1;
import p.eo5;
import android.content.Intent;
import androidx.fragment.app.k;
import android.app.Activity;
import p.og4;
import p.n26;
import p.pd;
import p.zn;
import p.gg4;
import p.ig4;
import p.la6;
import p.pa6;
import p.lg4;
import java.util.Iterator;
import p.vh5;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;
import java.io.IOException;
import p.dc1;
import p.tb1;

public final class vf4 extends gi3 implements zf2	// class@0029e4 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void vf4(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super(1);
    }
    public final Object a(nw6 p0){
       vf4 tc = this.c;
       vf4 tb = this.b;
       switch (this.a){
           case 1:
           default:
             co5.o(p0, "db");
             tb.getClass();
             p0.w(null);
             tb.getClass();
             throw null;
       }
       co5.o(p0, "db");
       p0.R(tb, tc);
       return null;
    }
    public final Object invoke(Object p0){
       Iterator iterator;
       lg4 c;
       vh5 iterator1;
       y6 a1;
       int i = 0;
       int i1 = -1;
       boolean b = true;
       switch (this.a){
           case 0:
             co5.o(p0, "$this$navOptions");
             pd opd = new pd();
             n26.v.invoke(opd);
             og4 a = p0.a;
             a.a = opd.a;
             a.b = opd.b;
             a.c = i1;
             a.d = i1;
             vf4 tb = this.b;
             vf4 tc = this.c;
             if (tb instanceof ig4) {
                co5.o(tb, "<this>");
                vf4 ovf4 = tc;
                iterator = pa6.G(tb, n26.z).iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      gg4 ogg4 = iterator.next();
                      gg4 ogg41 = ((ogg41 = ovf4.e()) != null)? ogg41.b: null;
                      if (co5.c(ogg4, ogg41)) {
                         iterator = 0;
                      }
                   }else {
                      iterator1 = 1;
                   }
                   if (iterator) {
                      i = 1;
                   }
                }
             }
             if (i) {
                if ((c = tc.c) != null) {
                   iterator = pa6.G(c.m(c.C, b), n26.A).iterator();
                   if (iterator.hasNext()) {
                      Object obj = iterator.next();
                   label_00e7 :
                      if (iterator.hasNext()) {
                         obj = iterator.next();
                         goto label_00e7 ;
                      }else {
                         p0.c = obj.y;
                         iterator1 = new vh5();
                         n26.w.invoke(iterator1);
                         p0.d = iterator1.a;
                      }
                   }else {
                      throw new NoSuchElementException("Sequence is empty.");
                   }
                }else {
                   throw new IllegalStateException("You must call setGraph\(\) before calling getGraph\(\)".toString());
                }
             }
             return jc7.a;
             break;
           case 1:
             return this.a(p0);
           case 2:
             return this.a(p0);
           case 3:
             co5.o(p0, "result");
             if ((a1 = p0.a) == i1) {
                eo5.Q();
                this.b.u().u((sz1.h + i), a1, p0.b);
             }else {
                this.c.finish();
             }
             return jc7.a;
             break;
           case 4:
             co5.o(p0, "event");
             if (xj6.a[p0.ordinal()] == b) {
                this.b.v.invoke(this.c);
             }
             return jc7.a;
             break;
           default:
             co5.o(p0, "it");
             p0 = this.b;
             _monitor_enter(p0);
             this.c.d();
             _monitor_exit(p0);
             return jc7.a;
       }
    }
}
