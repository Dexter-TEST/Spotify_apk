package p.lg4;
import android.content.Context;
import java.lang.Object;
import p.n26;
import p.la6;
import p.pa6;
import java.util.Iterator;
import android.app.Activity;
import p.gk;
import p.ll1;
import p.mr6;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p.uj3;
import p.sf4;
import p.sd2;
import p.eh4;
import p.jg4;
import p.dh4;
import p.v6;
import java.util.ArrayList;
import p.o26;
import p.ay6;
import p.wf2;
import p.ue6;
import p.qf4;
import p.gg4;
import android.os.Bundle;
import java.util.List;
import p.a62;
import p.ig4;
import p.co5;
import java.util.ListIterator;
import p.bg4;
import p.gg1;
import java.util.AbstractList;
import java.lang.String;
import p.uf4;
import java.lang.StringBuilder;
import p.en6;
import java.lang.IllegalStateException;
import java.util.Collection;
import p.dj0;
import java.util.NoSuchElementException;
import p.hb;
import p.eb3;
import p.au0;
import p.jc7;
import p.x1;
import p.kg4;
import java.lang.IllegalArgumentException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p.lf4;
import p.ng4;
import p.ir2;
import java.lang.Iterable;
import p.hs5;
import java.lang.Integer;
import p.xg4;
import p.zf2;
import p.do5;
import p.aj0;
import p.ye7;
import p.wf4;
import p.xf4;
import p.yf4;
import p.ni2;
import p.rf4;
import p.fp5;
import java.util.Set;
import p.fk3;
import java.lang.Enum;
import p.dj7;
import java.util.AbstractCollection;
import p.cj0;
import p.zf4;
import java.lang.Boolean;
import p.ch3;
import p.fh3;
import p.eo5;
import p.is5;
import p.ag4;
import p.q14;
import android.content.Intent;
import android.os.BaseBundle;
import p.ko1;
import p.fg4;
import java.lang.Class;
import android.os.Parcelable;
import p.v07;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import p.vf4;
import p.jo6;
import java.util.LinkedHashSet;
import p.xe7;
import java.util.HashMap;
import java.lang.ArithmeticException;
import p.k15;

public final class lg4	// class@001d4b from classes.dex
{
    public final ArrayList A;
    public final ay6 B;
    public final ue6 C;
    public final Context a;
    public final Activity b;
    public ig4 c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final gk g;
    public final mr6 h;
    public final LinkedHashMap i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public ek3 m;
    public b n;
    public bg4 o;
    public final CopyOnWriteArrayList p;
    public uj3 q;
    public final sf4 r;
    public final sd2 s;
    public boolean t;
    public final eh4 u;
    public final LinkedHashMap v;
    public zf2 w;
    public zf2 x;
    public final LinkedHashMap y;
    public int z;

    public void lg4(Context p0){
       Activity uActivity;
       super();
       this.a = p0;
       Iterator iterator = pa6.G(p0, n26.t).iterator();
       do {
          if (iterator.hasNext()) {
          }else {
             uActivity = null;
             break ;
          }
          uActivity = iterator.next();
       } while (uActivity instanceof Activity);
       this.b = uActivity;
       this.g = new gk();
       this.h = new mr6(ll1.a);
       this.i = new LinkedHashMap();
       this.j = new LinkedHashMap();
       this.k = new LinkedHashMap();
       this.l = new LinkedHashMap();
       this.p = new CopyOnWriteArrayList();
       this.q = uj3.b;
       this.r = new sf4(0, this);
       this.s = new sd2(this);
       this.t = true;
       eh4 uActivity1 = new eh4();
       this.u = uActivity1;
       this.v = new LinkedHashMap();
       this.y = new LinkedHashMap();
       uActivity1.a(new jg4(uActivity1));
       uActivity1.a(new v6(this.a));
       this.A = new ArrayList();
       this.B = new ay6(new o26(true, this));
       this.C = new ue6(true, true, 2);
       return;
    }
    public static void n(lg4 p0,qf4 p1){
       p0.m(p1, false, new gk());
    }
    public final void a(gg4 p0,Bundle p1,qf4 p2,List p3){
       gg4 b3;
       Object obj1;
       int i;
       qf4 oqf41;
       Object obj2;
       object oobject;
       lg4 obj3;
       Object obj4;
       gg4 b4;
       qf4 b = p2.b;
       boolean b1 = true;
       boolean b2 = false;
       lg4 tg = this.g;
       if (!b instanceof a62) {
          do {
          } while (!tg.isEmpty() && (tg.last().b instanceof a62 && this.l(tg.last().b.y, b1, b2)));
       }
       gk ogk = new gk();
       lg4 ta = this.a;
       Object obj = null;
       if (p0 instanceof ig4) {
          qf4 oqf4 = b;
          do {
             co5.i(oqf4);
             if ((b3 = oqf4.b) != null) {
                ListIterator listIterator = p3.listIterator(p3.size());
                while (true) {
                   if (listIterator.hasPrevious()) {
                      obj1 = listIterator.previous();
                      if (!co5.c(obj1.b, b3)) {
                         continue ;
                      }
                   }else {
                      obj1 = obj;
                   }
                   if (obj1 == null) {
                      obj1 = gg1.t(ta, b3, p1, this.f(), this.o);
                   }
                   ogk.addFirst(obj1);
                   if ((i = tg.isEmpty() ^ b1) && tg.last().b == b3) {
                      lg4.n(this, tg.last());
                   }
                }
                throw new IllegalStateException(en6.p("NavigatorBackStack for ", p0.a, " should already be created").toString());
             }
             if (b3 != null && b3 != p0) {
                continue ;
             }
          } while (b3 != null && b3 != p0);
       }
       if (ogk.isEmpty()) {
          oqf41 = b;
          while (oqf41 != null && this.c(oqf41.y) == null) {
             if ((oqf41 = oqf41.b) != null) {
                ListIterator listIterator1 = p3.listIterator(p3.size());
                if (listIterator1.hasPrevious()) {
                   obj2 = listIterator1.previous();
                   if (!co5.c(obj2.b, oqf41)) {
                   }
                }else {
                   obj2 = obj;
                }
                if (obj2 == null) {
                   obj2 = gg1.t(ta, oqf41, oqf41.b(p1), this.f(), this.o);
                }
                ogk.addFirst(obj2);
             }
          }
          if (!ogk.isEmpty()) {
             b = ogk.last().b;
          }
          while (!tg.isEmpty() && (tg.last().b instanceof ig4 && tg.last().b.m(b.y, b2) == null)) {
             lg4.n(this, tg.last());
          }
          b = (tg.isEmpty())? obj: tg.b[tg.a];
          if (b == null) {
             oobject = (ogk.isEmpty())? obj: ogk.b[ogk.a];
          }
          b = (oobject != null)? oobject.b: obj;
          if (!co5.c(b, this.c)) {
             ListIterator listIterator2 = p3.listIterator(p3.size());
             while (true) {
                if (listIterator2.hasPrevious()) {
                   obj3 = listIterator2.previous();
                   lg4 tc = this.c;
                   co5.i(tc);
                   if (co5.c(obj3.b, tc)) {
                      obj = obj3;
                   }else {
                      continue ;
                   }
                }
                if (obj == null) {
                   lg4 tc1 = this.c;
                   co5.i(tc1);
                   obj3 = this.c;
                   co5.i(obj3);
                   p1 = obj3.b(p1);
                   obj = gg1.t(ta, tc1, p1, this.f(), this.o);
                }
                ogk.addFirst(obj);
             }
          }
          Iterator iterator = ogk.iterator();
          while (true) {
             if (iterator.hasNext()) {
                qf4 oqf42 = iterator.next();
                if ((obj4 = this.v.get(this.u.b(oqf42.b.a))) != null) {
                   obj4.a(oqf42);
                }else {
                }
             }else {
                tg.addAll(ogk);
                tg.addLast(p2);
                Iterator iterator1 = dj0.v0(p2, ogk).iterator();
                while (iterator1.hasNext()) {
                   qf4 oqf43 = iterator1.next();
                   if ((b4 = oqf43.b.b) != null) {
                      this.h(oqf43, this.d(b4.y));
                   }else {
                      continue ;
                   }
                }
                return;
             }
          }
       }else if(!ogk.isEmpty()){
          oqf41 = ogk.b[ogk.a].b;
          continue ;
       }else {
          throw new NoSuchElementException("ArrayDeque is empty.");
       }
    }
    public final boolean b(){
       lg4 g;
       ue6 g1;
       object oobject;
       ue6 h;
       long l1;
       lg4 olg4 = this;
       while (true) {
          g = olg4.g;
          if (!g.isEmpty() && g.last().b instanceof ig4) {
             lg4.n(this, g.last());
          }else {
             break ;
          }
       }
       qf4 oqf4 = g.k();
       lg4 a = olg4.A;
       if (oqf4 != null) {
          a.add(oqf4);
       }
       int i = 1;
       olg4.z = olg4.z + i;
       this.s();
       int i1 = olg4.z - 1;
       olg4.z = i1;
       int i2 = 0;
       if (!i1) {
          a.clear();
          Iterator iterator = dj0.C0(a).iterator();
          while (iterator.hasNext()) {
             qf4 oqf41 = iterator.next();
             Iterator iterator1 = olg4.p.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().a(this, oqf41.b);
             }
             lg4 c = olg4.C;
             au0[] a1 = eb3.a;
             _monitor_enter(c);
             if ((g1 = c.G) != null) {
                int i3 = c.K + i2;
                if ((h = c.H) == null) {
                   h = c.F(i2, 2, null);
                }else if(i3 >= h.length){
                   int i5 = h.length * 2;
                   h = c.F(i3, i5, h);
                }
                long l = c.E() + (long)i3;
                i2 = h.length - 1;
                i = (int)l & i2;
                h[i] = oqf41;
                i = 1;
                i1 = c.K + i;
                c.K = i1;
                if (i1 > g1) {
                   ue6 h1 = c.H;
                   co5.i(h1);
                   int i4 = h1.length - 1;
                   i2 = (int)c.E() & i4;
                   h1[i2] = null;
                   i1 = c.K - 1;
                   c.K = i1;
                   l1 = c.E() + 1;
                   if ((c.I - l1) < 0) {
                      c.I = l1;
                   }
                   if ((c.J - l1) < 0) {
                      c.J = l1;
                   }
                }
                l1 = c.E() + (long)c.K;
                c.J = l1;
             }
             _monitor_exit(c);
             i1 = a1.length;
             i2 = 0;
             while (i2 < i1) {
                if ((oobject = a1[i2]) != null) {
                   oobject.d(jc7.a);
                }
                i2 = i2 + 1;
             }
             i2 = 0;
          }
          olg4.h.E(this.o());
       }
       if (oqf4 == null) {
          i = false;
       }
       return i;
    }
    public final gg4 c(int p0){
       lg4 tc;
       qf4 oqf4;
       if ((tc = this.c) == null) {
          tc = null;
       }else if(tc.y == p0){
          if ((oqf4 = this.g.k()) == null || (oqf4 = oqf4.b) == null) {
             tc = this.c;
             co5.i(tc);
          }
          if (tc.y != p0) {
             if (tc instanceof ig4) {
             }else {
                gg4 b = tc.b;
                co5.i(b);
             }
             tc = tc.m(p0, true);
          }
       }
       return tc;
    }
    public final qf4 d(int p0){
       Object obj;
       lg4 tg = this.g;
       ListIterator listIterator = tg.listIterator(tg.size());
       while (true) {
          if (listIterator.hasPrevious()) {
             obj = listIterator.previous();
             int i = (obj.b.y == p0)? 1: 0;
             if (!i) {
                continue ;
             }
          }else {
             obj = null;
          }
          if (obj != null) {
             break ;
          }else {
             throw new IllegalArgumentException(kg4.r("No destination with ID ", p0, " is on the NavController\'s back stack. The current destination is ")+this.e().toString());
          }
       }
       return obj;
    }
    public final gg4 e(){
       gg4 ogg4;
       qf4 oqf4 = ((oqf4 = this.g.k()) != null)? oqf4.b: null;
       return oqf4;
    }
    public final uj3 f(){
       uj3 c = (this.m == null)? uj3.c: this.q;
       return c;
    }
    public final qf4 g(){
       qf4 oqf4;
       int i;
       Iterator iterator = dj0.w0(this.g).iterator();
       if (iterator.hasNext()) {
          iterator.next();
       }
       iterator = pa6.F(iterator).iterator();
       do {
          if (iterator.hasNext()) {
          }else {
             oqf4 = null;
             break ;
          }
          oqf4 = iterator.next();
       } while (i = oqf4.b instanceof ig4 ^ 0x01);
       return oqf4;
    }
    public final void h(qf4 p0,qf4 p1){
       this.i.put(p0, p1);
       lg4 tj = this.j;
       if (tj.get(p1) == null) {
          tj.put(p1, new AtomicInteger(0));
       }
       tj = tj.get(p1);
       co5.i(tj);
       tj.incrementAndGet();
       return;
    }
    public final void i(int p0,Bundle p1){
       lf4 b;
       lf4 c;
       lf4 a;
       ng4 c1;
       gg4 ogg4;
       qf4 b2;
       lg4 tg = this.g;
       tg = (tg.isEmpty())? this.c: tg.last().b;
       if (tg != null) {
          lf4 olf4 = tg.c(p0);
          Bundle uBundle = null;
          if (olf4 != null) {
             b = olf4.b;
             c = olf4.c;
             a = olf4.a;
             if (c != null) {
                uBundle = new Bundle();
                uBundle.putAll(c);
             }
          }else {
             a = p0;
             b = uBundle;
          }
          if (uBundle == null) {
             uBundle = new Bundle();
          }
          uBundle.putAll(p1);
          boolean b1 = false;
          if (a == null && (b != null && (c1 = b.c) != -1)) {
             if (this.l(c1, b.d, b1)) {
                this.b();
             }
          }else if(a != null){
             c = 1;
          }else {
             ogg4 = 0;
          }
          if (c) {
             if ((ogg4 = this.c(a)) == null) {
                lg4 ta = this.a;
                String str = ir2.x(ta, a);
                if (olf4 == null) {
                   b1 = true;
                }
                if (!b1) {
                   throw new IllegalArgumentException(en6.t("Navigation destination ", str, " referenced from action ")+ir2.x(ta, p0)+" cannot be found from the current destination "+tg.toString());
                }else {
                   throw new IllegalArgumentException("Navigation action/destination "+str+" cannot be found from the current destination "+tg);
                }
             }else {
                this.j(ogg4, uBundle, b);
             }
          }else {
             throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
          }
          return;
       }else {
          throw new IllegalStateException("no current navigation node");
       }
    }
    public final void j(gg4 p0,Bundle p1,ng4 p2){
       boolean b;
       ng4 c;
       boolean b2;
       gg4 b4;
       int i1;
       lg4 olg4 = this;
       gg4 ogg4 = p0;
       ng4 ong4 = p2;
       lg4 v = olg4.v;
       Iterator iterator = v.values().iterator();
       while (true) {
          b = true;
          if (iterator.hasNext()) {
             iterator.next().d = b;
          }else {
             break ;
          }
       }
       hs5 ohs5 = new hs5();
       boolean b1 = (ong4 && (c = ong4.c) != -1)? olg4.l(c, ong4.d, ong4.e): 0;
       Bundle uBundle = p0.b(p1);
       c = (ong4 != null && ong4.b == b)? 1: 0;
       if (c && olg4.k.containsKey(Integer.valueOf(ogg4.y))) {
          ohs5.a = olg4.p(ogg4.y, uBundle, ong4);
          b2 = b1;
       }else {
          lg4 g = olg4.g;
          Object obj = g.k();
          dh4 uodh4 = olg4.u.b(ogg4.a);
          c = (ong4 != null && ong4.a == b)? 1: 0;
          int i = 0;
          if (c) {
             qf4 b3 = (obj != null && ((b3 = obj.b) != null && ogg4.y == b3.y))? 1: 0;
             if (b3) {
                olg4.r(g.removeLast());
                co5.o(obj, "entry");
                b2 = b1;
                dh4 uodh41 = uodh4;
                ArrayList obj1 = obj;
                b3 = new qf4(obj.a, obj.b, uBundle, obj.t, obj.v, obj.w, obj.x);
                ogg4.t = obj1.t;
                ogg4.b(obj1.C);
                g.addLast(ogg4);
                if ((b4 = ogg4.b.b) != null) {
                   olg4.h(ogg4, olg4.d(b4.y));
                }
                qf4 b5 = ogg4.b;
                if (!b5 instanceof gg4) {
                   b5 = null;
                }
                if (b5 != null) {
                   uodh41.c(b5, null, do5.N(n26.D));
                   uf4 b6 = uodh41.b().b;
                   Iterable value = b6.getValue();
                   Object obj2 = dj0.r0(b6.getValue());
                   co5.o(value, "<this>");
                   obj1 = new ArrayList(aj0.b0(value));
                   Iterator iterator2 = value.iterator();
                   b3 = 0;
                   while (iterator2.hasNext()) {
                      Object obj3 = iterator2.next();
                      if (!b3 && co5.c(obj3, obj2)) {
                         b3 = 1;
                         i1 = 0;
                      }else {
                         i1 = 1;
                      }
                      if (i1) {
                         obj1.add(obj3);
                      }
                   }
                   b6.E(dj0.v0(ogg4, obj1));
                }
                b = 1;
             label_0159 :
                this.t();
                Iterator iterator1 = v.values().iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().d = false;
                }
                if (!b2 && (ohs5.a == null && !b)) {
                   this.s();
                }else {
                   this.b();
                }
                return;
             }
          }
          b2 = b1;
          olg4.w = new wf4(ohs5, olg4, ogg4, uBundle);
          uodh4.d(ye7.J(gg1.t(olg4.a, ogg4, uBundle, this.f(), olg4.o)), ong4);
          olg4.w = null;
       }
       b = 0;
       goto label_0159 ;
    }
    public final boolean k(){
       boolean b = false;
       if (this.g.isEmpty()) {
       }else {
          gg4 ogg4 = this.e();
          co5.i(ogg4);
          if (this.l(ogg4.y, true, b) && this.b()) {
             b = true;
          }
       }
       return b;
    }
    public final boolean l(int p0,boolean p1,boolean p2){
       boolean b1;
       qf4 b2;
       qf4 oqf4;
       rf4 a;
       object oobject;
       lg4 olg4 = this;
       int i = p0;
       boolean b = p2;
       lg4 g = olg4.g;
       if (g.isEmpty()) {
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = dj0.w0(g).iterator();
          while (true) {
             if (iterator.hasNext()) {
                b2 = iterator.next().b;
                dh4 uodh4 = olg4.u.b(b2.a);
                if (p1 || b2.y != i) {
                   uArrayList.add(uodh4);
                }
                if (b2.y == i) {
                   oqf4 = b2;
                }
             }else {
                oqf4 = null;
             }
             if (oqf4 == null) {
                ir2.x(olg4.a, i);
             }else {
                hs5 ohs5 = new hs5();
                gk ogk = new gk();
                Iterator iterator1 = uArrayList.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      hs5 ohs51 = new hs5();
                      xf4 oxf4 = b2;
                      hs5 ohs52 = ohs51;
                      xf4 oxf41 = b2;
                      lg4 olg41 = g;
                      hs5 ohs53 = ohs51;
                      oxf4 = new xf4(ohs52, ohs5, this, p2, ogk);
                      olg4.x = oxf41;
                      iterator1.next().h(g.last(), b);
                      zf2 ozf2 = null;
                      olg4.x = ozf2;
                      if (ohs53.a == null) {
                      label_0098 :
                         if (b) {
                            lg4 k = olg4.k;
                            if (!p1) {
                               iterator = new ni2(pa6.G(oqf4, n26.x), super(olg4, 0)).iterator();
                               while (iterator.hasNext()) {
                                  Integer integer = Integer.valueOf(iterator.next().y);
                                  zf2 ozf21 = (ogk.isEmpty())? ozf2: ogk.b[ogk.a];
                                  a = (ozf21 != null)? ozf21.a: ozf2;
                                  k.put(integer, a);
                               }
                            }
                            int i1 = 1;
                            if ((ogk.isEmpty() ^ i1)) {
                               if (!ogk.isEmpty()) {
                                  oobject = ogk.b[ogk.a];
                                  iterator = new ni2(pa6.G(olg4.c(oobject.b), n26.y), new yf4(olg4, i1)).iterator();
                                  while (true) {
                                     a = oobject.a;
                                     if (iterator.hasNext()) {
                                        k.put(Integer.valueOf(iterator.next().y), a);
                                     }else {
                                        break ;
                                     }
                                  }
                                  olg4.l.put(a, ogk);
                               }else {
                                  throw new NoSuchElementException("ArrayDeque is empty.");
                               }
                            }
                         }
                         this.t();
                         b1 = ohs5.a;
                         break ;
                      }else {
                         g = olg41;
                      }
                   }else {
                      oobject = 0;
                      goto label_0098 ;
                   }
                }
                return b1;
             }
          }
       }
       b1 = false;
    }
    public final void m(qf4 p0,boolean p1,gk p2){
       lg4 to;
       lg4 tg = this.g;
       qf4 oqf4 = tg.last();
       if (!co5.c(oqf4, p0)) {
          throw new IllegalStateException("Attempted to pop "+p0.b+", which is not the top of the back stack \("+oqf4.b+')'.toString());
       }
       tg.removeLast();
       uf4 ouf4 = this.v.get(this.u.b(oqf4.b.a));
       tg = 0;
       Set value = (ouf4 != null && ((ouf4 = ouf4.f) != null && ((value = ouf4.getValue()) != null && value.contains(oqf4) == true)))? 1: 0;
       dj7 uodj7 = (!value && !this.j.containsKey(oqf4))? 0: 1;
       uj3 c = uj3.c;
       if (oqf4.y.c.compareTo(c) >= 0) {
          tg = 1;
       }
       if (tg) {
          if (p1) {
             oqf4.b(c);
             p2.addFirst(new rf4(oqf4));
          }
          if (!value) {
             oqf4.b(uj3.a);
             this.r(oqf4);
          }else {
             oqf4.b(c);
          }
       }
       if (!p1 && (!value && (to = this.o) != null)) {
          qf4 w = oqf4.w;
          co5.o(w, "backStackEntryId");
          if ((uodj7 = to.t.remove(w)) != null) {
             uodj7.a();
          }
       }
       return;
    }
    public final ArrayList o(){
       uj3 t;
       Iterator iterator1;
       Object obj;
       int i;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.v.values().iterator();
       while (true) {
          t = uj3.t;
          if (iterator.hasNext()) {
             ArrayList uArrayList1 = new ArrayList();
             iterator1 = iterator.next().f.getValue().iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                Object obj1 = obj;
                if (!uArrayList.contains(obj1)) {
                   obj1 = (obj1.C.compareTo(t) >= 0)? 1: 0;
                   if (!obj1) {
                      obj1 = 1;
                   label_0053 :
                      if (obj1) {
                         uArrayList1.add(obj);
                      }
                   }
                }
                obj1 = 0;
                goto label_0053 ;
             }
             cj0.c0(uArrayList1, uArrayList);
          }else {
             break ;
          }
       }
       ArrayList uArrayList2 = new ArrayList();
       iterator1 = this.g.iterator();
       while (iterator1.hasNext()) {
          Object obj2 = iterator1.next();
          obj = obj2;
          if (!uArrayList.contains(obj)) {
             obj = (obj.C.compareTo(t) >= 0)? 1: 0;
             if (obj) {
                obj = 1;
             label_008b :
                if (obj) {
                   uArrayList2.add(obj2);
                }
             }
          }
          obj = 0;
          goto label_008b ;
       }
       cj0.c0(uArrayList2, uArrayList);
       uArrayList2 = new ArrayList();
       Iterator iterator2 = uArrayList.iterator();
       while (iterator2.hasNext()) {
          Object obj3 = iterator2.next();
          if (i = obj3.b instanceof ig4 ^ 1) {
             uArrayList2.add(obj3);
          }
       }
       return uArrayList2;
    }
    public final boolean p(int p0,Bundle p1,ng4 p2){
       boolean b1;
       qf4 oqf4;
       lg4 tc;
       Iterator iterator1;
       qf4 oqf41;
       qf4 oqf42;
       List obj;
       lg4 tk = this.k;
       boolean b = false;
       if (!tk.containsKey(Integer.valueOf(p0))) {
       }else {
          String str = tk.get(Integer.valueOf(p0));
          Collection uCollection = tk.values();
          zf4 ozf4 = new zf4(str, b);
          co5.o(uCollection, "<this>");
          Iterator iterator = uCollection.iterator();
          while (true) {
             b1 = true;
             if (iterator.hasNext()) {
                if (ozf4.invoke(iterator.next()).booleanValue() == b1) {
                   iterator.remove();
                }
             }else {
                break ;
             }
          }
          tk = this.l;
          if (tk instanceof ch3 && !tk instanceof fh3) {
             eo5.T(tk, "kotlin.collections.MutableMap");
             throw null;
          }else {
             gk ogk = tk.remove(str);
             ArrayList uArrayList = new ArrayList();
             if ((oqf4 = this.g.k()) != null && ((oqf4 = oqf4.b) != null || (tc = this.c) != null)) {
                if (ogk != null) {
                   iterator1 = ogk.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         rf4 orf4 = iterator1.next();
                         rf4 b2 = orf4.b;
                         if (tc.y == b2) {
                            oqf41 = tc;
                         }else if(tc instanceof ig4){
                            oqf42 = tc;
                         }else {
                            oqf42 = tc.b;
                            co5.i(oqf42);
                         }
                         oqf41 = oqf42.m(b2, b1);
                         lg4 ta = this.a;
                         if (oqf41 != null) {
                            uArrayList.add(orf4.a(ta, oqf41, this.f(), this.o));
                            tc = oqf41;
                         }else {
                            throw new IllegalStateException("Restore State failed: destination "+ir2.x(ta, orf4.b)+" cannot be found from the current destination "+tc.toString());
                         }
                      }
                   }
                }
                ArrayList uArrayList1 = new ArrayList();
                ArrayList uArrayList2 = new ArrayList();
                Iterator iterator2 = uArrayList.iterator();
                while (iterator2.hasNext()) {
                   obj = iterator2.next();
                   if (!obj.b instanceof ig4) {
                      uArrayList2.add(obj);
                   }else {
                      continue ;
                   }
                }
                Iterator iterator3 = uArrayList2.iterator();
                while (iterator3.hasNext()) {
                   qf4 oqf43 = iterator3.next();
                   gg4 a = ((obj = dj0.s0(uArrayList1)) != null && ((oqf42 = dj0.r0(obj)) != null && (oqf42 = oqf42.b) != null))? oqf42.a: null;
                   if (co5.c(a, oqf43.b.a)) {
                      obj.add(oqf43);
                   }else {
                      qf4[] oqf4Array = new qf4[b1];
                      oqf4Array[b] = oqf43;
                      uArrayList1.add(ye7.M(oqf4Array));
                      continue ;
                   }
                }
                hs5 ohs5 = new hs5();
                iterator1 = uArrayList1.iterator();
                while (iterator1.hasNext()) {
                   List list = iterator1.next();
                   ag4 v11 = new ag4(ohs5, uArrayList, new is5(), this, p1);
                   this.w = v11;
                   this.u.b(dj0.k0(list).b.a).d(list, p2);
                   this.w = null;
                }
                b = ohs5.a;
             }else {
                throw new IllegalStateException("You must call setGraph\(\) before calling getGraph\(\)".toString());
             }
          }
       }
       return b;
    }
    public final void q(ig4 p0,Bundle p1){
       lg4 v;
       int i;
       int b2;
       ArrayList stringArrayL;
       dh4 uodh4;
       Bundle bundle;
       gg4 ogg4;
       uf4 ouf4;
       uf4 obj1;
       Intent intent;
       Bundle extras;
       fg4 uofg4;
       gg4 b3;
       lg4 c1;
       String str2;
       Bundle uBundle2;
       ComponentName component;
       int i4;
       int i5;
       lg4 c2;
       gg4 ogg41;
       int i6;
       lg4 olg4 = this;
       lg4 obj = p0;
       int b = true;
       int b1 = false;
       lg4 g = olg4.g;
       if (!co5.c(olg4.c, obj)) {
          lg4 c = olg4.c;
          v = olg4.v;
          if (c != null) {
             Iterator iterator = new ArrayList(olg4.k.keySet()).iterator();
             while (iterator.hasNext()) {
                Integer integer = iterator.next();
                co5.l(integer, "id");
                i = integer.intValue();
                Iterator iterator1 = v.values().iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().d = b;
                }
                b2 = olg4.p(i, null, null);
                Iterator iterator2 = v.values().iterator();
                while (iterator2.hasNext()) {
                   iterator2.next().d = b1;
                }
                if (b2) {
                   olg4.l(i, b, b1);
                }
             }
             olg4.l(c.y, b, b1);
          }
          olg4.c = obj;
          obj = olg4.d;
          c = olg4.u;
          if (obj != null && (stringArrayL = obj.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
             Iterator iterator3 = stringArrayL.iterator();
             while (iterator3.hasNext()) {
                String str = iterator3.next();
                co5.l(str, "name");
                uodh4 = c.b(str);
                if ((bundle = obj.getBundle(str)) != null) {
                   uodh4.f(bundle);
                }
             }
          }
          obj = olg4.e;
          String str1 = " cannot be found from the current destination ";
          lg4 a = olg4.a;
          if (obj != null) {
             i = obj.length;
             b2 = 0;
             while (true) {
                if (b2 < i) {
                   object oobject = obj[b2];
                   if ((ogg4 = olg4.c(oobject.b)) != null) {
                      qf4 oqf4 = oobject.a(a, ogg4, this.f(), olg4.o);
                      dh4 uodh41 = c.b(ogg4.a);
                      if ((ouf4 = v.get(uodh41)) == null) {
                         ouf4 = new uf4(olg4, uodh41);
                         v.put(uodh41, ouf4);
                      }
                      g.addLast(oqf4);
                      ouf4.a(oqf4);
                      if ((ogg4 = oqf4.b.b) != null) {
                         olg4.h(oqf4, olg4.d(ogg4.y));
                      }
                      b2 = b2 + 1;
                   }else {
                      throw new IllegalStateException(en6.t("Restoring the Navigation back stack failed: destination ", ir2.x(a, oobject.b), str1)+this.e());
                   }
                }else {
                   this.t();
                   olg4.e = null;
                }
             }
          }
          ArrayList uArrayList = new ArrayList();
          Iterator iterator4 = q14.r0(c.a).values().iterator();
          while (iterator4.hasNext()) {
             obj1 = iterator4.next();
             if (obj1.b == null) {
                uArrayList.add(obj1);
             }else {
                continue ;
             }
          }
          iterator4 = uArrayList.iterator();
          while (iterator4.hasNext()) {
             uodh4 = iterator4.next();
             if ((obj1 = v.get(uodh4)) == null) {
                obj1 = new uf4(olg4, uodh4);
                v.put(uodh4, obj1);
             }
             uodh4.e(obj1);
          }
          if (olg4.c != null && g.isEmpty()) {
             if (olg4.f == null && (obj = olg4.b) != null) {
                if ((intent = obj.getIntent()) != null) {
                   int[] intArray = ((extras = intent.getExtras()) != null)? extras.getIntArray("android-support-nav:controller:deepLinkIds"): null;
                   ArrayList parcelableAr = (extras != null)? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs"): null;
                   Bundle uBundle = new Bundle();
                   extras = (extras != null)? extras.getBundle("android-support-nav:controller:deepLinkExtras"): null;
                   if (extras != null) {
                      uBundle.putAll(extras);
                   }
                   if (intArray != null) {
                      extras = (!intArray.length)? 1: 0;
                      if (extras) {
                      label_01bb :
                         v = olg4.c;
                         co5.i(v);
                         if ((uofg4 = v.g(new ko1(intent))) != null) {
                            fg4 a1 = uofg4.a;
                            a1.getClass();
                            gk ogk = new gk();
                            fg4 uofg41 = a1;
                            while (true) {
                               if ((b3 = uofg41.b) != null && b3.C == uofg41.y) {
                               label_01e3 :
                                  if (co5.c(b3, null) || b3 == null) {
                                     List list = dj0.B0(ogk);
                                     parcelableAr = new ArrayList(aj0.b0(list));
                                     Iterator iterator5 = list.iterator();
                                     while (iterator5.hasNext()) {
                                        parcelableAr.add(Integer.valueOf(iterator5.next().y));
                                     }
                                     intArray = dj0.A0(parcelableAr);
                                     if ((extras = a1.b(uofg4.b)) != null) {
                                        uBundle.putAll(extras);
                                     }
                                     parcelableAr = null;
                                  }else {
                                     uofg41 = b3;
                                  }
                               }else {
                                  ogk.addFirst(uofg41);
                                  goto label_01e3 ;
                               }
                            }
                         }
                      }
                   }else {
                      goto label_01bb ;
                   }
                   if (intArray != null) {
                      uofg4 = (!intArray.length)? 1: 0;
                      if (!uofg4) {
                         v = olg4.c;
                         int len = intArray.length;
                         int ng4 i1 = 0;
                         while (true) {
                            if (i1 < len) {
                               int i2 = intArray[i1];
                               if (!i1) {
                                  c1 = olg4.c;
                                  co5.i(c1);
                                  c1 = (c1.y == i2)? olg4.c: null;
                               }else {
                                  co5.i(v);
                                  ogg41 = v.m(i2, b);
                               }
                               if (c1 == null) {
                                  str2 = ir2.x(a, i2);
                               label_0280 :
                                  if (str2 != null) {
                                     intent.toString();
                                  }else {
                                     uBundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                     int len1 = intArray.length;
                                     Bundle[] uBundleArray = new Bundle[len1];
                                     for (i1 = 0; i1 < len1; i1 = i1 + 1) {
                                        Bundle uBundle1 = new Bundle();
                                        uBundle1.putAll(uBundle);
                                        if (parcelableAr != null && (uBundle2 = parcelableAr.get(i1)) != null) {
                                           uBundle1.putAll(uBundle2);
                                        }
                                        uBundleArray[i1] = uBundle1;
                                     }
                                     len1 = intent.getFlags();
                                     if (b2 = 0x10000000 & len1) {
                                        int i3 = 0x8000;
                                        if (!((len1 & i3))) {
                                           intent.addFlags(i3);
                                           v07 ov07 = new v07(a);
                                           if ((component = intent.getComponent()) == null) {
                                              component = intent.resolveActivity(ov07.c.getPackageManager());
                                           }
                                           if (component != null) {
                                              ov07.a(component);
                                           }
                                           ov07.b.add(intent);
                                           ov07.b();
                                           obj.finish();
                                           obj.overridePendingTransition(0, 0);
                                        }else {
                                        label_02ed :
                                           String str3 = "Deep Linking failed: destination ";
                                           if (b2) {
                                              if (!g.isEmpty()) {
                                                 c = olg4.c;
                                                 co5.i(c);
                                                 olg4.l(c.y, b, false);
                                              }
                                              i4 = 0;
                                              while (true) {
                                                 if (i4 < intArray.length) {
                                                    i5 = intArray[i4];
                                                    len1 = i4 + 1;
                                                    object oobject1 = uBundleArray[i4];
                                                    if ((b3 = olg4.c(i5)) != null) {
                                                       olg4.j(b3, oobject1, do5.N(new vf4(b3, 0, olg4)));
                                                       i4 = len1;
                                                    }else {
                                                       throw new IllegalStateException(en6.t(str3, ir2.x(a, i5), str1)+this.e());
                                                    }
                                                 }
                                              }
                                           }else {
                                              c = olg4.c;
                                              b1 = intArray.length;
                                              i5 = 0;
                                              while (true) {
                                                 if (i5 < b1) {
                                                    len1 = intArray[i5];
                                                    object oobject2 = uBundleArray[i5];
                                                    if (!i5) {
                                                       c2 = olg4.c;
                                                    }else {
                                                       co5.i(c);
                                                       c2 = c.m(len1, b);
                                                    }
                                                    if (c2 != null) {
                                                       len1 = intArray.length - b;
                                                       if (i5 != len1) {
                                                          if (c2 instanceof ig4) {
                                                             while (true) {
                                                                co5.i(c2);
                                                                if (c2.m(c2.C, b) instanceof ig4) {
                                                                   c2 = c2.m(c2.C, b);
                                                                }else {
                                                                   break ;
                                                                }
                                                             }
                                                             c = c2;
                                                          }
                                                       }else {
                                                          v = olg4.c;
                                                          co5.i(v);
                                                          ng4 ong4 = i1;
                                                          i1 = new ng4(false, false, v.y, true, false, 0, 0, -1, -1);
                                                          olg4.j(c2, oobject2, ong4);
                                                       }
                                                       i5 = i5 + 1;
                                                    }else {
                                                       throw new IllegalStateException(str3+ir2.x(a, len1)+" cannot be found in graph "+c);
                                                    }
                                                 }else {
                                                    olg4.f = b;
                                                 }
                                              }
                                           }
                                        }
                                     }else {
                                        goto label_02ed ;
                                     }
                                     iterator4 = 1;
                                  label_03c2 :
                                     if (iterator4) {
                                     label_03c6 :
                                        if (!b) {
                                           obj = olg4.c;
                                           co5.i(obj);
                                           olg4.j(obj, p1, null);
                                        }
                                     }
                                  }
                               }else {
                                  i2 = intArray.length - b;
                                  if (i1 != i2 && c1 instanceof ig4) {
                                     while (true) {
                                        co5.i(c1);
                                        if (c1.m(c1.C, b) instanceof ig4) {
                                           ogg41 = c1.m(c1.C, b);
                                        }else {
                                           break ;
                                        }
                                     }
                                     v = c1;
                                  }
                                  i1 = i1 + 1;
                               }
                            }else {
                               str2 = null;
                               goto label_0280 ;
                            }
                         }
                      }
                   }
                }
                iterator4 = 0;
                goto label_03c2 ;
             }
             b = false;
             goto label_03c6 ;
          }else {
             this.b();
          }
       }else {
          ig4 b4 = obj.B;
          i4 = b4.g();
          b = 0;
          while (b < i4) {
             gg4 ogg42 = b4.h(b);
             v = olg4.c;
             co5.i(v);
             ig4 b5 = v.B;
             if (b5.a != null) {
                b5.d();
             }
             if ((i6 = do5.d(b5.t, b, b5.b)) >= 0) {
                jo6 c3 = b5.c;
                c3[i6] = ogg42;
             }
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator6 = g.iterator();
             while (iterator6.hasNext()) {
                Object obj2 = iterator6.next();
                Object obj3 = obj2;
                obj3 = (ogg42 != null && obj3.b.y == ogg42.y)? 1: 0;
                if (obj3) {
                   uArrayList1.add(obj2);
                }
             }
             Iterator iterator7 = uArrayList1.iterator();
             while (iterator7.hasNext()) {
                qf4 oqf41 = iterator7.next();
                co5.l(ogg42, "newDestination");
                oqf41.getClass();
                oqf41.b = ogg42;
             }
             b = b + 1;
          }
       }
       return;
    }
    public final void r(qf4 p0){
       AtomicInteger uAtomicInteg;
       uf4 ouf4;
       lg4 o;
       dj7 uodj7;
       co5.o(p0, "child");
       if ((p0 = this.i.remove(p0)) == null) {
       }else {
          lg4 tj = this.j;
          Integer integer = ((uAtomicInteg = tj.get(p0)) != null)? Integer.valueOf(uAtomicInteg.decrementAndGet()): null;
          if (integer != null && !integer.intValue()) {
             if ((ouf4 = this.v.get(this.u.b(p0.b.a))) != null) {
                uf4 h = ouf4.h;
                boolean b = co5.c(h.y.get(p0), Boolean.TRUE);
                uf4 c = ouf4.c;
                Set value = c.getValue();
                co5.o(value, "<this>");
                LinkedHashSet linkedHashSe = new LinkedHashSet(xe7.F(value.size()));
                Iterator iterator = value.iterator();
                int i = 0;
                int i1 = 0;
                while (true) {
                   int i2 = 1;
                   if (iterator.hasNext()) {
                      Object obj = iterator.next();
                      if (!i1 && co5.c(obj, p0)) {
                         i1 = 1;
                         i2 = 0;
                      }
                      if (i2) {
                         linkedHashSe.add(obj);
                      }
                   }else {
                      break ;
                   }
                }
                c.E(linkedHashSe);
                h.y.remove(p0);
                lg4 g = h.g;
                lg4 h1 = h.h;
                if (!g.contains(p0)) {
                   h.r(p0);
                   ouf4 = (p0.y.c.compareTo(uj3.c) >= 0)? 1: 0;
                   if (ouf4) {
                      p0.b(uj3.a);
                   }
                   qf4 w = p0.w;
                   if (!g.isEmpty()) {
                      Iterator iterator1 = g.iterator();
                      do {
                         if (iterator1.hasNext()) {
                         }
                      } while (co5.c(iterator1.next().w, w));
                      if (i && (!b && (o = h.o) != null)) {
                         co5.o(w, "backStackEntryId");
                         if ((uodj7 = o.t.remove(w)) != null) {
                            uodj7.a();
                         }
                      }
                      h.s();
                      h1.E(h.o());
                   }
                   i = 1;
                }else if(ouf4.d == null){
                   h.s();
                   h1.E(h.o());
                }
             }
             tj.remove(p0);
          }
       }
       return;
    }
    public final void s(){
       qf4 b1;
       uf4 ouf4;
       Set value;
       uj3 ouj3;
       ArrayList uArrayList = dj0.C0(this.g);
       if (uArrayList.isEmpty()) {
       }else {
          qf4 b = dj0.r0(uArrayList).b;
          int i = 0;
          if (b instanceof a62) {
             Iterator iterator = dj0.w0(uArrayList).iterator();
             while (true) {
                if (iterator.hasNext()) {
                   b1 = iterator.next().b;
                   if (!b1 instanceof ig4 && !b1 instanceof a62) {
                   label_003b :
                      HashMap hashMap = new HashMap();
                      Iterator iterator1 = dj0.w0(uArrayList).iterator();
                      while (iterator1.hasNext()) {
                         qf4 oqf4 = iterator1.next();
                         qf4 c = oqf4.C;
                         qf4 b2 = oqf4.b;
                         uj3 v = uj3.v;
                         uj3 t = uj3.t;
                         if (b != null && b2.y == b.y) {
                            if (c != v) {
                               Boolean uBoolean = ((ouf4 = this.v.get(this.u.b(b2.a))) != null && ((ouf4 = ouf4.f) != null && (value = ouf4.getValue()) != null))? Boolean.valueOf(value.contains(oqf4)): i;
                               if (!co5.c(uBoolean, Boolean.TRUE)) {
                                  AtomicInteger uAtomicInteg = ((uAtomicInteg = this.j.get(oqf4)) != null && !uAtomicInteg.get())? 1: 0;
                                  if (!uAtomicInteg) {
                                     hashMap.put(oqf4, v);
                                  }
                               }
                               hashMap.put(oqf4, t);
                            }
                            b = b.b;
                         }else if(b1 != null && b2.y == b1.y){
                            if (c == v) {
                               oqf4.b(t);
                            }else if(c != t){
                               hashMap.put(oqf4, t);
                            }
                            b1 = b1.b;
                            continue ;
                         }else {
                            oqf4.b(uj3.c);
                            continue ;
                         }
                      }
                      Iterator iterator2 = uArrayList.iterator();
                      while (iterator2.hasNext()) {
                         b = iterator2.next();
                         if ((ouj3 = hashMap.get(b)) != null) {
                            b.b(ouj3);
                         }else {
                            b.c();
                            continue ;
                         }
                      }
                   }
                }
             }
          }
          b1 = i;
          goto label_003b ;
       }
       return;
    }
    public final void t(){
       int i;
       int i1;
       boolean b = false;
       if (this.t != null) {
          lg4 tg = this.g;
          if (tg instanceof Collection && tg.isEmpty()) {
             i = 0;
          }else {
             Iterator iterator = tg.iterator();
             i = 0;
             while (true) {
                if (iterator.hasNext()) {
                   if ((i1 = iterator.next().b instanceof ig4 ^ 1) && (i = i + 1) < 0) {
                      throw new ArithmeticException("Count overflow has happened.");
                   }
                   continue ;
                }
             }
          }
          if (i > 1) {
             b = true;
          }
       }
       this.s.b(b);
       return;
    }
}
