package p.uf4;
import p.lg4;
import p.dh4;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.concurrent.locks.ReentrantLock;
import p.ll1;
import p.mr6;
import p.pl1;
import p.fp5;
import p.lr6;
import p.qf4;
import java.util.Collection;
import java.util.ArrayList;
import p.dj0;
import p.gg4;
import android.os.Bundle;
import p.uj3;
import android.content.Context;
import p.bg4;
import p.gg1;
import p.eh4;
import p.zf2;
import p.tf4;
import p.gk;
import java.util.LinkedHashMap;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.Objects;
import java.lang.StringBuilder;
import p.en6;
import java.lang.IllegalStateException;

public final class uf4	// class@00289d from classes.dex
{
    public final ReentrantLock a;
    public final mr6 b;
    public final mr6 c;
    public boolean d;
    public final fp5 e;
    public final fp5 f;
    public final dh4 g;
    public final lg4 h;

    public void uf4(lg4 p0,dh4 p1){
       co5.o(p1, "navigator");
       this.h = p0;
       super();
       this.a = new ReentrantLock(true);
       mr6 omr6 = new mr6(ll1.a);
       this.b = omr6;
       mr6 omr61 = new mr6(pl1.a);
       this.c = omr61;
       this.e = new fp5(omr6);
       this.f = new fp5(omr61);
       this.g = p1;
    }
    public final void a(qf4 p0){
       co5.o(p0, "backStackEntry");
       uf4 ta = this.a;
       ta.lock();
       uf4 tb = this.b;
       tb.E(dj0.v0(p0, tb.getValue()));
       ta.unlock();
    }
    public final qf4 b(gg4 p0,Bundle p1){
       uf4 th = this.h;
       uj3 ouj3 = th.f();
       return gg1.t(th.a, p0, p1, ouj3, th.o);
    }
    public final void c(qf4 p0,boolean p1){
       lg4 x;
       int i;
       co5.o(p0, "popUpTo");
       uf4 th = this.h;
       dh4 uodh4 = th.u.b(p0.b.a);
       if (co5.c(uodh4, this.g)) {
          if ((x = th.x) != null) {
             x.invoke(p0);
             this.d(p0);
          }else {
             tf4 otf4 = new tf4(this, p0, p1, 0);
             lg4 g = th.g;
             if ((i = g.indexOf(p0)) >= 0) {
                if ((i = i + 1) != g.c) {
                   th.l(g.get(i).b.y, 1, 0);
                }
                lg4.n(th, p0);
                otf4.invoke();
                th.t();
                th.b();
             }
          }
       }else {
          Object obj = th.v.get(uodh4);
          co5.i(obj);
          obj.c(p0, p1);
       }
       return;
    }
    public final void d(qf4 p0){
       int i;
       co5.o(p0, "popUpTo");
       uf4 ta = this.a;
       ta.lock();
       uf4 tb = this.b;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = tb.getValue().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!(i = co5.c(obj, p0) ^ 0x01)) {
             break ;
          }else {
             uArrayList.add(obj);
          }
       }
       tb.E(uArrayList);
       ta.unlock();
       return;
    }
    public final void e(qf4 p0){
       lg4 w;
       Object obj;
       co5.o(p0, "backStackEntry");
       uf4 th = this.h;
       dh4 uodh4 = th.u.b(p0.b.a);
       if (co5.c(uodh4, this.g)) {
          if ((w = th.w) != null) {
             w.invoke(p0);
             this.a(p0);
          }else {
             Objects.toString(p0.b);
          }
       }else if((obj = th.v.get(uodh4)) != null){
          obj.e(p0);
       }else {
          throw new IllegalStateException(en6.p("NavigatorBackStack for ", p0.b.a, " should already be created").toString());
       }
       return;
    }
}
