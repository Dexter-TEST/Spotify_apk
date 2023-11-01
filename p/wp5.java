package p.wp5;
import p.g63;
import android.content.Context;
import p.a81;
import p.ay6;
import p.ui3;
import p.an0;
import p.h63;
import java.lang.Object;
import p.yv6;
import p.me3;
import p.mc1;
import p.vz3;
import p.sn2;
import p.xw0;
import p.ve3;
import p.vp5;
import p.kt0;
import p.gg1;
import p.ww0;
import p.vw0;
import p.pe3;
import p.gy6;
import p.or7;
import p.zm0;
import p.w70;
import p.ps2;
import java.lang.Class;
import java.lang.String;
import android.net.Uri;
import java.lang.Integer;
import p.qd7;
import p.t65;
import java.util.ArrayList;
import p.r32;
import java.io.File;
import p.ks2;
import p.i22;
import p.nl;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import p.y10;
import java.util.List;
import p.vv7;
import p.sm1;
import java.util.Collection;
import p.dj0;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.ComponentCallbacks;
import p.n63;
import p.au0;
import p.tp5;
import p.dx0;
import p.eb3;
import java.lang.IllegalStateException;
import p.du0;
import p.co5;
import p.ej4;
import coil.target.GenericViewTarget;
import coil.request.ViewTargetRequestDelegate;
import p.vj3;
import coil.request.BaseRequestDelegate;
import coil.request.RequestDelegate;
import p.l63;
import p.hu1;
import p.rn4;
import p.oi;
import p.aq5;
import p.x54;
import p.y54;
import p.dv6;
import p.xl7;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import p.p;
import p.d07;
import p.m63;
import p.gl6;
import p.fl6;
import p.up5;
import p.ng2;
import p.io2;
import p.p63;
import p.qv6;
import p.mj4;
import p.to1;
import p.sn4;
import java.util.concurrent.CancellationException;
import java.lang.Throwable;
import p.wc1;
import p.sp5;
import p.il1;
import p.fv1;
import p.v81;
import p.i0;
import android.widget.ImageView;
import android.view.View;
import p.qk7;
import p.r;
import android.os.Looper;
import p.ok7;
import p.r25;

public final class wp5 implements g63	// class@002b81 from classes.dex
{
    public final a81 a;
    public final ui3 b;
    public final kt0 c;
    public final or7 d;
    public final ui3 e;
    public final an0 f;
    public final ArrayList g;

    public void wp5(Context p0,a81 p1,ay6 p2,ui3 p3,ui3 p4,an0 p5,h63 p6){
       wp5 owp5 = this;
       Context uContext = p0;
       ui3 oui3 = p2;
       h63 oh63 = p6;
       super();
       owp5.a = p1;
       owp5.b = oui3;
       me3 ome3 = null;
       xw0 oxw0 = new yv6(ome3).T(vz3.a.w).T(new vp5(owp5));
       if (oxw0.f(gg1.y) != null) {
       }else {
          oxw0 = oxw0.T(new pe3(ome3));
       }
       owp5.c = new kt0(oxw0);
       gy6 ogy6 = new gy6(owp5, uContext, oh63.b);
       or7 oor7 = new or7(owp5, ogy6);
       owp5.d = oor7;
       owp5.e = oui3;
       AtomicBoolean zm0 oui31 = new zm0(p5);
       oui31.a(new w70(2), ps2.class);
       oui31.a(new w70(5), String.class);
       oui31.a(new w70(1), Uri.class);
       oui31.a(new w70(4), Uri.class);
       oui31.a(new w70(3), Integer.class);
       oui31.a(new w70(0), byte[].class);
       zm0 c = oui31.c;
       c.add(new t65(new qd7(), Uri.class));
       c.add(new t65(new r32(oh63.a), File.class));
       oui31.b(new ks2(p4, p3, oh63.c), Uri.class);
       oui31.b(new nl(5), File.class);
       oui31.b(new nl(0), Uri.class);
       oui31.b(new nl(3), Uri.class);
       oui31.b(new nl(6), Uri.class);
       oui31.b(new nl(4), Drawable.class);
       oui31.b(new nl(1), Bitmap.class);
       oui31.b(new nl(2), ByteBuffer.class);
       zm0 e = oui31.e;
       e.add(new y10(oh63.d, oh63.e));
       List list = vv7.U(oui31.a);
       an0 uoan0 = new an0(list, vv7.U(oui31.b), vv7.U(c), vv7.U(oui31.d), vv7.U(e));
       owp5.f = v6;
       owp5.g = dj0.v0(new sm1(owp5, oor7), list);
       oui31 = new AtomicBoolean(0);
       uContext.registerComponentCallbacks(ogy6);
       return;
    }
    public static final Object a(wp5 p0,n63 p1,au0 p2){
       tp5 otp5;
       tp5 x;
       tp5 t;
       tp5 otp53;
       aq5 value;
       n63 e;
       y54 oy54;
       y54 a2;
       wp5 obj;
       ViewTargetRequestDelegate viewTargetRe;
       wp5 owp5 = p0;
       n63 on63 = p1;
       au0 uoau0 = p2;
       p0.getClass();
       if (uoau0 instanceof tp5) {
          otp5 = uoau0;
          tp5 b = otp5.B;
          int i = Integer.MIN_VALUE;
          if ((b & i)) {
             otp5.B = b - i;
          label_0021 :
             tp5 otp51 = otp5;
             tp5 z = otp51.z;
             dx0 a = dx0.a;
             otp5 = otp51.B;
             int i1 = 3;
             if (otp5 != null) {
                if (otp5 != 1) {
                   if (otp5 != 2) {
                      if (otp5 == i1) {
                         x = otp51.x;
                         otp5 = otp51.w;
                         b = otp51.v;
                         t = otp51.t;
                         eb3.G(z);
                         a = z;
                         if (a instanceof qv6) {
                            tp5 otp52 = a;
                            n63 c = otp5.c;
                            t.getClass();
                            qv6 b1 = otp52.b;
                            qv6 a1 = otp52.a;
                            if (!c instanceof GenericViewTarget) {
                               if (c == null) {
                               label_0197 :
                                  x.getClass();
                                  if ((c = b1.d) != null) {
                                     c.a(b1, otp52);
                                  }
                               }
                            }else {
                               b1.m.getClass();
                            }
                            c.c(a1);
                            goto label_0197 ;
                         }else if(a instanceof to1){
                            t.getClass();
                            wp5.c(a, otp5.c, x);
                         }
                         b.c();
                      }else {
                         throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                      }
                   }else {
                      x = otp51.x;
                      otp5 = otp51.w;
                      b = otp51.v;
                      t = otp51.t;
                      eb3.G(z);
                      otp53 = otp51.y;
                   label_0146 :
                      x.getClass();
                      up5 z1 = new up5(otp5, t, z, x, otp53, null);
                      otp51.t = t;
                      otp51.v = b;
                      otp51.w = otp5;
                      otp51.x = x;
                      otp51.y = null;
                      otp51.B = i1;
                      if ((z = io2.B(otp5.w, z, otp51)) != a) {
                      }
                   }
                }else {
                   otp5 = otp51.w;
                   b = otp51.v;
                   eb3.G(z);
                   z = otp51.x;
                   x = otp51.t;
                   if ((value = x.e.getValue()) != null) {
                      if ((e = otp5.E) != null) {
                         if ((oy54 = value.a.b(e)) == null) {
                            oy54 = value.b.b(e);
                         }
                      }else {
                         oy54 = null;
                      }
                      if (oy54 != null) {
                         a2 = oy54.a;
                      label_00fd :
                         BitmapDrawable uBitmapDrawa = (a2 != null)? new BitmapDrawable(otp5.a.getResources(), a2): p.b(otp5, otp5.G, otp5.F, otp5.M.j);
                         if ((e = otp5.c) != null) {
                            e.b(uBitmapDrawa);
                         }
                         z.getClass();
                         if ((e = otp5.d) != null) {
                            e.b(otp5);
                         }
                         otp51.t = x;
                         otp51.v = b;
                         otp51.w = otp5;
                         otp51.x = z;
                         otp51.y = a2;
                         otp51.B = 2;
                         if ((obj = otp5.B.a(otp51)) != a) {
                            otp53 = a2;
                            obj = x;
                            x = z;
                            z = obj;
                            goto label_0146 ;
                         }
                      }
                   }
                   a2 = null;
                   goto label_00fd ;
                }
             }else {
                eb3.G(z);
                du0 b2 = otp51.b;
                co5.i(b2);
                me3 ome3 = ej4.E(b2);
                wp5 d = owp5.d;
                d.getClass();
                n63 a3 = on63.A;
                n63 c1 = on63.c;
                if (c1 instanceof GenericViewTarget) {
                   ViewTargetRequestDelegate v14 = new ViewTargetRequestDelegate(d.a, p1, c1, a3, ome3);
                   viewTargetRe = v14;
                }else {
                   viewTargetRe = new BaseRequestDelegate(a3, ome3);
                }
                viewTargetRe.b();
                l63 v141 = new l63(on63, on63.a);
                v141.b = owp5.a;
                v141.O = 0;
                c1 = v141.a();
                gu1 a4 = hu1.a;
                if (!co5.c(c1.b, rn4.a)) {
                   viewTargetRe.d();
                   otp51.t = owp5;
                   otp51.v = viewTargetRe;
                   otp51.w = c1;
                   otp51.x = a4;
                   otp51.B = 1;
                   if (oi.d(c1.A, otp51) != a) {
                   }
                }else {
                   throw new sn4();
                }
             }
             return a;
          }
       }
       otp5 = new tp5(owp5, uoau0);
       goto label_0021 ;
    }
    public static void c(to1 p0,d07 p1,hu1 p2){
       n63 d;
       to1 b = p0.b;
       if (!p1 instanceof GenericViewTarget) {
          if (p1 == null) {
          label_0018 :
             p2.getClass();
             if ((d = b.d) != null) {
                d.c(b, p0);
             }
             return;
          }
       }else {
          b.m.getClass();
       }
       p1.d(p0.a);
       goto label_0018 ;
    }
    public final wc1 b(n63 p0){
       qk7 b;
       sp5 osp5 = new sp5(this, p0, null);
       xw0 oxw0 = vv7.s(this.c.c(), il1.a, true);
       b81 a = mc1.a;
       if (oxw0 != a && oxw0.f(fv1.t) == null) {
          oxw0 = oxw0.T(a);
       }
       v81 ov81 = new v81(oxw0, true);
       ov81.N(true, ov81, osp5);
       p0 = p0.c;
       if (p0 instanceof GenericViewTarget) {
          qk7 oqk7 = r.c(p0.f());
          _monitor_enter(oqk7);
          if ((b = oqk7.b) != null && (co5.c(Looper.myLooper(), Looper.getMainLooper()) && oqk7.v != null)) {
             oqk7.v = false;
             _monitor_exit(oqk7);
          }else if((b = oqk7.c) != null){
             io2.e(b);
          }
          oqk7.c = null;
          b = new ok7(oqk7.a);
          oqk7.b = b;
          _monitor_exit(oqk7);
       }else {
          b = new r25(ov81);
       }
       return b;
    }
}
