package p.sm1;
import p.qb3;
import p.g63;
import p.or7;
import java.lang.Object;
import p.z54;
import p.qn6;
import p.an0;
import p.n63;
import p.u45;
import p.hu1;
import p.au0;
import java.lang.Class;
import p.lm1;
import p.dx0;
import p.eb3;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.List;
import p.y10;
import p.a20;
import p.q63;
import kotlinx.coroutines.sync.a;
import java.lang.Integer;
import p.t65;
import p.y51;
import java.lang.Number;
import p.x51;
import p.km1;
import p.m32;
import android.graphics.drawable.Drawable;
import java.lang.StringBuilder;
import p.mm1;
import p.ks5;
import p.wp5;
import android.os.Build$VERSION;
import android.graphics.Bitmap$Config;
import p.p3;
import p.uw5;
import java.util.Collection;
import java.util.ArrayList;
import p.dj0;
import p.vv7;
import p.c22;
import p.nm1;
import p.xw0;
import p.ng2;
import p.du0;
import p.io2;
import p.je1;
import java.io.Closeable;
import p.r;
import android.graphics.drawable.BitmapDrawable;
import p.rm1;
import android.graphics.Bitmap;
import p.cd2;
import p.om1;
import p.i22;
import p.co5;
import p.j22;
import p.zp5;
import p.pm1;
import p.fl6;
import p.x54;
import p.y54;
import p.qv6;
import p.qm1;
import java.util.concurrent.CancellationException;
import java.lang.Throwable;
import p.to1;

public final class sm1 implements qb3	// class@002656 from classes.dex
{
    public final g63 a;
    public final or7 b;
    public final z54 c;

    public void sm1(g63 p0,or7 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new z54(p0, p1);
    }
    public static final Object a(sm1 p0,qn6 p1,an0 p2,n63 p3,Object p4,u45 p5,hu1 p6,au0 p7){
       lm1 olm1;
       int i1;
       sm1 osm1;
       lm1 v;
       lm1 olm11;
       lm1 olm12;
       String str;
       lm1 olm13;
       lm1 olm14;
       int i5;
       dx0 uodx0;
       lm1 olm15;
       int i6;
       t65 ot65;
       Object obj;
       au0 uoau0 = p7;
       p0.getClass();
       if (uoau0 instanceof lm1) {
          olm1 = uoau0;
          lm1 e = olm1.E;
          int i = Integer.MIN_VALUE;
          if (i1 = e & i) {
             int i2 = e - i;
             olm1.E = i2;
             osm1 = p0;
          label_0021 :
             lm1 c = olm1.C;
             dx0 a = dx0.a;
             lm1 e1 = olm1.E;
             int i3 = 0;
             int i4 = 1;
             if (e1 != null) {
                if (e1 == i4) {
                   v = olm1.v;
                   eb3.G(c);
                   olm11 = olm1.A;
                   e1 = olm1.y;
                   olm12 = olm1;
                   olm1 = olm1.w;
                   str = i3;
                   olm13 = olm1.z;
                   olm14 = olm1.B;
                   osm1 = olm1.t;
                   i5 = 1;
                   uodx0 = a;
                   olm15 = olm1.x;
                label_00cd :
                   olm11.getClass();
                   if (c != null) {
                      qn6 c1 = v.c;
                      qn6 a1 = v.a;
                      if (a1 instanceof m32) {
                      }else {
                         a1 = str;
                      }
                      if (a1 != null) {
                         str = a1.c;
                      }
                      uodx0 = new km1(c.a, c.b, c1, str);
                   label_00ed :
                      return uodx0;
                   }else {
                      c = v;
                      i6 = i5;
                   }
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                eb3.G(c);
                qn6 oqn6 = p1;
                e1 = p4;
                olm11 = p6;
                olm12 = olm1;
                uodx0 = a;
                str = i3;
                olm14 = null;
                i6 = 1;
                an0 uoan0 = p2;
                olm15 = p3;
                olm13 = p5;
             }
             an0 e2 = olm1.e;
             if (olm14 < e2.size()) {
                y10 oy10 = e2.get(olm14);
                oy10.getClass();
                ot65 = new t65(new a20(c.a, olm13, oy10.b, oy10.a), Integer.valueOf(olm14));
             }else {
                ot65 = str;
             }
             if (ot65 != null) {
                i5 = ot65.b.intValue() + i6;
                olm11.getClass();
                olm12.t = osm1;
                olm12.v = c;
                olm12.w = olm1;
                olm12.x = olm15;
                olm12.y = e1;
                olm12.z = olm13;
                olm12.A = olm11;
                olm12.getClass();
                olm12.B = i5;
                olm12.E = i6;
                if ((obj = ot65.a.a(olm12)) == uodx0) {
                   goto label_00ed ;
                }else {
                   v = c;
                   c = obj;
                   olm14 = i5;
                   i5 = i6;
                   goto label_00cd ;
                }
             }else {
                throw new IllegalStateException("Unable to create a decoder that supports: "+e1.toString());
             }
          }
       }
       osm1 = p0;
       olm1 = new lm1(osm1, uoau0);
       goto label_0021 ;
    }
    public static final Object b(sm1 p0,n63 p1,Object p2,u45 p3,hu1 p4,au0 p5){
       mm1 omm1;
       Bitmap bitmap;
       mm1 x;
       mm1 v;
       mm1 t;
       mm1 omm12;
       mm1 omm13;
       mm1 omm14;
       mm1 omm15;
       qn6 a3;
       mm1 omm17;
       mm1 omm18;
       mm1 omm19;
       mm1 omm110;
       ks5 a4;
       n63 j;
       sm1 osm1 = p0;
       n63 on63 = p1;
       au0 uoau0 = p5;
       p0.getClass();
       if (uoau0 instanceof mm1) {
          omm1 = uoau0;
          mm1 e = omm1.E;
          int i = Integer.MIN_VALUE;
          if ((e & i)) {
             omm1.E = e - i;
          label_0021 :
             mm1 omm11 = omm1;
             mm1 c = omm11.C;
             dx0 a = dx0.a;
             omm1 = omm11.E;
             int i1 = 3;
             int i2 = 2;
             int i3 = 1;
             if (omm1 != null) {
                if (omm1 != i3) {
                   if (omm1 != i2) {
                      if (omm1 == i1) {
                         eb3.G(c);
                         i3 = 0;
                         a = c;
                         km1 a1 = a.a;
                         km1 okm1 = (a1 instanceof BitmapDrawable)? a1: i3;
                         if (okm1 != null && (bitmap = okm1.getBitmap()) != null) {
                            bitmap.prepareToDraw();
                         }
                      }else {
                         throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                      }
                   }else {
                      omm1 = omm11.y;
                      x = omm11.x;
                      e = omm11.w;
                      v = omm11.v;
                      t = omm11.t;
                      eb3.G(c);
                   label_01a3 :
                      omm12 = x;
                      omm13 = e;
                      omm14 = v;
                      omm15 = t;
                   label_01c9 :
                      ks5 a2 = omm1.a;
                      ks5 oks5 = (a2 instanceof qn6)? a2: null;
                      if (oks5 != null && (a3 = oks5.a) != null) {
                         r.a(a3);
                      }
                      ks5 oks51 = omm12.a;
                      sm1 osm11 = null;
                      omm11.t = osm11;
                      omm11.v = osm11;
                      omm11.w = osm11;
                      omm11.x = osm11;
                      omm11.y = osm11;
                      omm11.z = osm11;
                      omm11.A = osm11;
                      omm11.B = osm11;
                      omm11.E = 3;
                      omm15.getClass();
                      n63 l = omm14.l;
                      if (!l.isEmpty() && (c.a instanceof BitmapDrawable || omm14.p != null)) {
                         rm1 omm16 = new rm1(omm15, c, oks51, l, omm13, omm14, null);
                         c = io2.B(omm14.z, omm1, omm11);
                      }
                      if (c != a) {
                      }
                   }
                }else {
                   omm1 = omm11.A;
                   omm14 = omm11.v;
                   eb3.G(c);
                   omm17 = omm11.B;
                   omm18 = omm11.z;
                   omm12 = omm11.y;
                   omm19 = omm11.x;
                   omm110 = omm11.w;
                   x = omm11.t;
                label_0163 :
                   omm17.a = c;
                   a4 = omm1.a;
                   ks5 nm1 oks52 = a4;
                   if (oks52 instanceof qn6) {
                      oks52 = new nm1(x, omm1, omm18, omm14, omm110, omm12, omm19, null);
                      omm11.t = x;
                      omm11.v = omm14;
                      omm11.w = omm19;
                      omm11.x = omm12;
                      omm11.y = omm1;
                      omm11.z = null;
                      omm11.A = null;
                      omm11.B = null;
                      omm11.E = 2;
                      if ((c = io2.B(omm14.y, oks52, omm11)) != a) {
                         t = x;
                         v = omm14;
                         e = omm19;
                         x = omm12;
                         goto label_01a3 ;
                      }
                   }else if(oks52 instanceof je1){
                      omm15 = x;
                      c = new km1(a4.a, a4.b, a4.c, null);
                      omm13 = omm19;
                      goto label_01c9 ;
                   }else {
                      throw new cd2(10);
                   }
                }
             }else {
                eb3.G(c);
                omm12 = new ks5();
                omm12.a = p3;
                ks5 oks53 = new ks5();
                oks53.a = osm1.a.f;
                ks5 oks54 = new ks5();
                sm1 b = osm1.b;
                b.getClass();
                u45 b1 = omm12.a.b;
                int i4 = 0;
                b1 = (Build$VERSION.SDK_INT >= 26 && b1 == p3.D())? 1: 0;
                ArrayList uArrayList4 = (b1 && !b.c.b())? 0: 1;
                if (!b) {
                   omm12.a = u45.a(omm12.a, Bitmap$Config.ARGB_8888);
                }
                n63 k = on63.k;
                if (on63.j != null || k != null) {
                   a4 = oks53.a;
                   a4.getClass();
                   ArrayList uArrayList = dj0.C0(a4.a);
                   ArrayList uArrayList1 = dj0.C0(a4.b);
                   ArrayList uArrayList2 = dj0.C0(a4.c);
                   ArrayList uArrayList3 = dj0.C0(a4.d);
                   uArrayList4 = dj0.C0(a4.e);
                   if ((j = on63.j) != null) {
                      uArrayList3.add(i4, j);
                   }
                   if (k != null) {
                      uArrayList4.add(i4, k);
                   }
                   an0 k1 = new an0(vv7.U(uArrayList), vv7.U(uArrayList1), vv7.U(uArrayList2), vv7.U(uArrayList3), vv7.U(uArrayList4));
                   oks53.a = k;
                }
                omm11.t = osm1;
                omm11.v = on63;
                Object obj = p2;
                omm11.w = obj;
                omm19 = p4;
                omm11.x = omm19;
                omm11.y = omm12;
                omm11.z = oks53;
                omm11.A = oks54;
                omm11.B = oks54;
                omm11.E = i3;
                omm17 = oks54;
                if ((c = p0.c(oks53.a, p1, p2, omm12.a, p4, omm11)) != a) {
                   omm14 = on63;
                   omm110 = obj;
                   ks5 oks55 = omm17;
                   omm18 = oks53;
                   goto label_0163 ;
                }
             }
             return a;
          }
       }
       omm1 = new mm1(osm1, uoau0);
       goto label_0021 ;
    }
    public final Object c(an0 p0,n63 p1,Object p2,u45 p3,hu1 p4,au0 p5){
       om1 oom1;
       int i1;
       om1 z;
       om1 v;
       om1 t;
       om1 oom11;
       dx0 uodx0;
       om1 oom12;
       om1 oom13;
       om1 oom14;
       j22 oj22;
       t65 ot651;
       Object obj;
       au0 uoau0 = p5;
       if (uoau0 instanceof om1) {
          oom1 = uoau0;
          om1 d = oom1.D;
          int i = Integer.MIN_VALUE;
          if (i1 = d & i) {
             int i2 = d - i;
             oom1.D = i2;
             i2 = this;
          label_001e :
             om1 b = oom1.B;
             dx0 a = dx0.a;
             om1 d1 = oom1.D;
             int i3 = 1;
             if (d1 != null) {
                if (d1 == i3) {
                   z = oom1.z;
                   v = oom1.v;
                   t = oom1.t;
                   eb3.G(b);
                   oom11 = oom1;
                   oom1 = oom1.w;
                   uodx0 = a;
                   oom12 = oom1.x;
                   oom13 = oom1.A;
                   d1 = oom1.y;
                label_00d0 :
                   oom14 = b;
                   z.getClass();
                   if (oom14 != null) {
                   }else {
                      b = v;
                   }
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                eb3.G(b);
                an0 uoan0 = p0;
                u45 ou45 = p3;
                z = p4;
                oom11 = oom1;
                t = i2;
                uodx0 = a;
                oom13 = null;
                n63 on63 = p1;
                oom12 = p2;
             }
             sm1 a1 = t.a;
             an0 d2 = b.d;
             int i4 = d2.size();
             while (true) {
                if (oom13 < i4) {
                   t65 ot65 = d2.get(oom13);
                   t65 a2 = ot65.a;
                   if (ot65.b.isAssignableFrom(oom12.getClass())) {
                      co5.j(a2, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                      if ((oj22 = a2.a(oom12, d1, a1)) != null) {
                         ot651 = new t65(oj22, Integer.valueOf(oom13));
                      label_009d :
                         if (ot651 != null) {
                            int i5 = 1;
                            int i6 = ot651.b.intValue() + i5;
                            z.getClass();
                            oom11.t = t;
                            oom11.v = b;
                            oom11.w = oom1;
                            oom11.x = oom12;
                            oom11.y = d1;
                            oom11.z = z;
                            oom11.getClass();
                            oom11.A = i6;
                            oom11.D = i5;
                            if ((obj = ot651.a.a(oom11)) == uodx0) {
                               return uodx0;
                            }else {
                               v = b;
                               b = obj;
                               oom13 = i6;
                               goto label_00d0 ;
                            }
                         }else {
                            throw new IllegalStateException("Unable to create a fetcher that supports: "+oom12.toString());
                         }
                      }
                   }
                   oom13 = oom13 + 1;
                }else {
                   ot651 = null;
                   goto label_009d ;
                }
             }
             return oom14;
          }
       }
       sm1 osm1 = this;
       oom1 = new om1(osm1, uoau0);
       goto label_001e ;
    }
    public final Object d(zp5 p0,au0 p1){
       pm1 opm1;
       x54 ox54;
       sm1 osm1 = this;
       zp5 ozp5 = p0;
       au0 uoau0 = p1;
       sm1 c = osm1.c;
       if (uoau0 instanceof pm1) {
          opm1 = uoau0;
          pm1 y = opm1.y;
          int i = Integer.MIN_VALUE;
          if ((y & i)) {
             opm1.y = y - i;
          label_0020 :
             pm1 opm11 = opm1;
             opm1 = opm11.w;
             dx0 a = dx0.a;
             if ((y = opm11.y) != null) {
                if (y == 1) {
                   eb3.G(opm1);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                eb3.G(opm1);
                zp5 d = ozp5.d;
                zp5 e = ozp5.e;
                zp5 f = ozp5.f;
                u45 ou45 = osm1.b.m(d, e);
                u45 e1 = ou45.e;
                f.getClass();
                Object obj = osm1.a.f.a(d.b, ou45);
                y54 oy54 = ((ox54 = c.b(d, obj, ou45, f)) != null)? c.a(d, ox54, e, e1): null;
                if (oy54 != null) {
                   return z54.c(ozp5, d, ox54, oy54);
                }else {
                   qm1 v15 = new qm1(this, d, obj, ou45, f, ox54, p0, 0);
                   opm11.t = osm1;
                   opm11.v = ozp5;
                   opm11.y = 1;
                   if ((opm1 = io2.B(d.x, v15, opm11)) == a) {
                      return a;
                   }
                }
             }
             return opm1;
          }
       }
       opm1 = new pm1(osm1, uoau0);
       goto label_0020 ;
    }
}
