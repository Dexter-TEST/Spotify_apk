package p.i70;
import p.su0;
import p.y81;
import p.ww0;
import p.mz0;
import p.wm0;
import p.fi4;
import p.yf2;
import p.cg7;
import p.bf7;
import io.reactivex.rxjava3.core.SingleTransformer;
import p.j15;
import p.by6;
import p.ILoggerFactory;
import p.e25;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import android.os.ResultReceiver;
import p.m95;
import p.iw5;
import java.lang.Class;
import p.at7;
import p.j80;
import java.lang.Character;
import p.av6;
import p.wa;
import p.xt;
import p.t8;
import p.ls6;
import p.y4;
import java.util.Set;
import p.co5;
import p.da;
import p.e46;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.ArrayList;
import p.dj0;
import java.util.Iterator;
import p.he5;
import p.de5;
import java.lang.Iterable;
import java.util.List;
import p.aj0;
import p.je5;
import java.lang.Integer;
import java.lang.Number;
import p.fe5;
import p.ye7;
import p.e9;
import p.w8;
import com.spotify.allboarding.entrypoint.EntryPoint;
import p.n46;
import p.h9;
import p.u8;
import p.mi;
import p.di7;
import p.n26;
import p.c87;
import p.la6;
import p.zf2;
import p.cs3;
import p.v42;
import p.oa6;
import p.c5;
import p.nr0;
import p.l46;
import p.d9;
import p.k46;
import p.j46;
import p.u4;
import p.w4;
import p.ll1;
import p.t4;
import p.cd2;
import p.f46;
import p.h46;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import p.uj0;
import p.vv7;
import javax.net.ssl.SSLSocket;
import p.k50;
import p.ir2;
import org.bouncycastle.jsse.BCSSLSocket;
import java.lang.Exception;
import p.w08;
import p.jd;
import java.io.File;
import p.is3;
import p.se4;
import p.ny1;
import p.ml5;
import android.util.Log;
import p.dn6;
import p.l50;
import io.reactivex.rxjava3.core.Single;
import p.mf1;
import p.nx5;
import p.q81;
import p.hj2;
import org.json.JSONObject;
import android.net.Uri;
import p.vl5;
import p.az5;
import android.util.JsonReader;
import p.nz0;
import p.vx5;
import java.lang.NullPointerException;
import p.xr;
import android.view.View;
import p.xp7;
import android.content.res.Resources;
import android.os.Build$VERSION;
import p.s3;
import p.aa3;
import p.vp7;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import p.kg3;
import p.ug3;
import java.lang.Math;
import android.app.Activity;
import p.hu3;
import android.content.Context;
import p.sz1;

public final class i70 implements su0, y81, ww0, mz0, wm0, fi4, yf2, cg7, bf7, SingleTransformer, j15, by6, ILoggerFactory, e25	// class@00023a from classes2.dex
{
    public static final i70 A;
    public static final i70 B;
    public static hu3 C;
    public static final i70 D;
    public static final i70 E;
    public static final i70 F;
    public static final i70 a;
    public static final i70 b;
    public static boolean c;
    public static i70 t;
    public static final i70 v;
    public static final i70 w;
    public static final i70 x;
    public static final i70 y;
    public static final i70 z;

    static {
       i70.a = new i70();
       i70.b = new i70();
       i70.t = new i70();
       i70.v = new i70();
       i70.w = new i70();
       i70.x = new i70();
       i70.y = new i70();
       i70.z = new i70();
       i70.A = new i70();
       i70.B = new i70();
       i70.D = new i70();
       i70.E = new i70();
       i70.F = new i70();
    }
    public void i70(){
       super();
    }
    public void i70(String p0,Bundle p1,ResultReceiver p2){
       super();
    }
    public static final boolean o(m95 p0){
       int i;
       p0.getClass();
       m95 a = p0.a;
       if ((i = j80.k(a, at7.a)) != -1) {
       }else {
          i = j80.k(a, at7.b);
       }
       if (i != -1) {
          a = j80.o(a, (i + 1), 0, 2);
       }else if(p0.e() != null && a.d() == 2){
          a = j80.t;
       }
       return (av6.g0(a.q(), ".class", 1) ^ 1);
    }
    public static xt q(wa p0){
       y4 b;
       ls6 t = p0.b.t;
       y4 oy4 = null;
       t = (t != null)? t.b: oy4;
       if (t instanceof y4) {
          oy4 = t;
       }
       if (oy4 == null || (b = oy4.b) == null) {
          b = "";
       }
       return xt.a(co5.H(new t8(b)));
    }
    public static xt r(wa p0,da p1){
       xt oxt1;
       e46 obj;
       ArrayList uArrayList2;
       Iterator iterator2;
       int i3;
       je5 obj1;
       e46 uoe46;
       wa owa = p0;
       da uoda = p1;
       wa c = owa.c;
       xt oxt = null;
       wa owa1 = (c instanceof e46)? c: oxt;
       if (owa1 == null) {
          return xt.e();
       }else {
          LinkedHashSet linkedHashSe = new LinkedHashSet();
          ArrayList uArrayList = dj0.C0(owa1.c);
          Iterator iterator = uArrayList.iterator();
          while (true) {
             int i = 0;
             int i1 = 1;
             if (iterator.hasNext()) {
                oxt1 = iterator.next();
                obj = oxt1;
                obj = (obj instanceof de5 && co5.c(obj.b(), uoda.a.b()))? 1: 0;
                if (!obj) {
                   continue ;
                }
             }else {
                oxt1 = oxt;
             }
             xt oxt2 = (oxt1 instanceof de5)? oxt1: oxt;
             obj = owa1.y;
             if (oxt2 == null) {
                da a = uoda.a;
                boolean b = false;
                boolean b1 = false;
                List list = dj0.y0(obj, i1);
                ArrayList uArrayList1 = new ArrayList(aj0.b0(list));
                iterator = list.iterator();
                while (iterator.hasNext()) {
                   uArrayList1.add(iterator.next().b);
                }
                oxt2 = de5.a(a, b, b1, uArrayList1, false, 95);
             }
             de5 uode5 = de5.a(oxt2, false, false, null, false, 119);
             Iterator iterator1 = uArrayList.iterator();
             int i2 = 0;
             while (true) {
                if (iterator1.hasNext()) {
                   he5 ohe5 = iterator1.next();
                   ohe5 = (ohe5 instanceof de5 && co5.c(ohe5.a, uoda.a.a))? 1: 0;
                   if (ohe5) {
                   label_00ca :
                      Integer integer = Integer.valueOf(i2);
                      iterator1 = (integer.intValue() != -1)? 1: 0;
                      if (!iterator1) {
                         integer = oxt;
                      }
                      if (oxt1 == null) {
                         if (integer == null) {
                            he5[] ohe5Array = new he5[]{uode5,fe5.a};
                            uArrayList2 = dj0.u0(uArrayList, ye7.K(ohe5Array));
                         label_00f9 :
                            if (oxt1 == null) {
                               uArrayList = new ArrayList(aj0.b0(obj));
                               iterator2 = obj.iterator();
                               i3 = 0;
                               while (true) {
                                  if (iterator2.hasNext()) {
                                     obj1 = iterator2.next();
                                     i2 = i3 + 1;
                                     if (i3 >= 0) {
                                        i3 = (!i3)? true: false;
                                        uArrayList.add(je5.a(obj1, i3));
                                        i3 = i2;
                                     }else {
                                        ye7.W();
                                        throw oxt;
                                     }
                                  }
                               }
                            }else {
                               Iterator iterator3 = oxt1.w.iterator();
                               while (true) {
                                  if (iterator3.hasNext()) {
                                     oxt1 = iterator3.next();
                                     obj1 = oxt1;
                                     if (!obj instanceof Collection || !obj.isEmpty()) {
                                        Iterator iterator5 = obj.iterator();
                                        while (true) {
                                           if (iterator5.hasNext()) {
                                              if (co5.c(iterator5.next().b, obj1)) {
                                                 obj1 = 1;
                                              }else {
                                                 continue ;
                                              }
                                           }
                                        }
                                        if (!obj1) {
                                           continue ;
                                        }
                                     }
                                     obj1 = 0;
                                  }else {
                                     oxt1 = oxt;
                                  }
                                  if (oxt1 == null) {
                                     uoe46 = obj;
                                  }else {
                                     uoe46 = new ArrayList(aj0.b0(obj));
                                     Iterator iterator4 = obj.iterator();
                                     while (iterator4.hasNext()) {
                                        obj1 = iterator4.next();
                                        uoe46.add(je5.a(obj1, co5.c(obj1.b, oxt1)));
                                     }
                                  }
                               }
                            }
                            iterator2 = uArrayList.iterator();
                            i3 = 0;
                            while (true) {
                               if (iterator2.hasNext()) {
                                  if (iterator2.next().c != null) {
                                  label_01b1 :
                                     Integer integer1 = Integer.valueOf(i3);
                                     if (integer1.intValue() != -1) {
                                        i = 1;
                                     }
                                     if (i) {
                                        oxt = integer1;
                                     }
                                     if (oxt != null) {
                                        int i4 = oxt.intValue();
                                        linkedHashSe.add(new e9(owa.b.a, i4, uArrayList.get(i4).b));
                                        break ;
                                     }
                                     break ;
                                  }else {
                                     i3 = i3 + 1;
                                  }
                               }else {
                                  i3 = -1;
                                  goto label_01b1 ;
                               }
                            }
                            linkedHashSe.add(new w8(uode5));
                            return new xt(wa.a(p0, 0, 0, e46.a(owa1, uArrayList2, uArrayList, null, null, 3963), 0, 0, 27), co5.B(linkedHashSe));
                         }else {
                            uArrayList.add(integer.intValue(), uode5);
                         }
                      }
                      uArrayList2 = uArrayList;
                      goto label_00f9 ;
                   }else {
                      i2 = i2 + 1;
                   }
                }else {
                   i2 = -1;
                   goto label_00ca ;
                }
             }
          }
       }
    }
    public static xt s(wa p0){
       wa c = p0.c;
       xt oxt = (c instanceof e46)? xt.d(wa.a(p0, null, null, e46.a(c, null, null, null, null, 2047), 0, 0, 27)): xt.e();
       return oxt;
    }
    public static xt t(wa p0,ls6 p1,h9 p2){
       xt oxt;
       xt oxt1;
       Object obj;
       wa c = p0.c;
       u8 a = u8.a;
       ls6 b = p1.b;
       int i = 1;
       wa a1 = p0.a;
       if (c instanceof e46) {
          int i1 = (a1 != null && a1.getCanExit() == i)? 1: 0;
          i1 = (i1 && (c.x == null && !mi.s(c)))? 1: 0;
          if (i1) {
             h9[] oh9Array = new h9[]{a,p2};
             oxt = xt.a(co5.I(oh9Array));
          }else {
             co5.o(c, "<this>");
             List list = ye7.N(oa6.H(new c87(new v42(new v42(new c87(dj0.e0(c.c), n26.E), 0, cs3.c), i, n26.F), n26.G)));
             List list1 = dj0.g0(c.z);
             p0 = i70.u(p0, p1, list);
             String str = b.a();
             ArrayList uArrayList = new ArrayList(aj0.b0(list));
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().a());
             }
             h9[] oh9Array1 = new h9[]{new d9(str, dj0.u0(list1, uArrayList), p1.c instanceof l46, p0.a),p2};
             oxt1 = new xt(p0, co5.B(co5.I(oh9Array1)));
          label_013c :
             oxt = oxt1;
          }
       }else {
          wa t = p0.t;
          if (c instanceof k46) {
             Iterator iterator1 = c.c.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   obj = iterator1.next();
                   if (obj.c == null) {
                      continue ;
                   }
                }else {
                   obj = null;
                }
                oxt = (obj != null)? new xt(i70.u(p0, p1, t), co5.B(co5.H(new d9(b.a(), ye7.J(obj.b), 0, a1)))): null;
                if (oxt == null) {
                   oxt = xt.e();
                   break ;
                }
             }
          }else if(co5.c(b, u4.b)){
             oxt = xt.e();
          }else if(b instanceof w4){
             oxt1 = new xt(i70.u(p0, p1, t), co5.B(co5.H(new d9(b.a(), ll1.a, 0, a1))));
             goto label_013c ;
          }else if(co5.c(b, t4.b)){
             i = b instanceof y4;
          }
          if (i) {
             oxt = xt.a(co5.H(a));
          }else {
             throw new cd2(10);
          }
       }
       return oxt;
    }
    public static wa u(wa p0,ls6 p1,List p2){
       ArrayList uArrayList = dj0.u0(p2, p0.t);
       p1 = p1.c;
       if (p1 instanceof l46) {
          p0 = wa.a(p0, null, null, l46.a(p1, uArrayList), uArrayList, null, 19);
       }else if(p1 instanceof f46){
          p0 = wa.a(p0, null, null, new f46(null, uArrayList), uArrayList, null, 19);
       }else {
          p0 = wa.a(p0, null, null, h46.a, uArrayList, null, 19);
       }
       return p0;
    }
    public Object a(Object p0){
       return p0.toString();
    }
    public Object apply(Object p0){
       co5.o(p0, "p0");
       return vv7.g(p0);
    }
    public boolean b(SSLSocket p0){
       boolean b = (k50.d.C() && p0 instanceof BCSSLSocket)? true: false;
       return b;
    }
    public void c(Exception p0){
       Object[] objArray = new Object[]{p0};
       objArray = new Object[0];
       w08.e.f(String.format("Could not sync active asset packs. %s", objArray), objArray);
    }
    public void d(File p0){
       co5.o(p0, "file");
    }
    public is3 e(String p0){
       return se4.a;
    }
    public void f(ny1 p0){
       Log.e("ml5", co5.K(p0, "Got unexpected exception: "));
    }
    public dn6 g(SSLSocket p0){
       return new l50();
    }
    public Single h(Single p0){
       co5.o(p0, "upstream");
       p0 = p0.retryWhen(new mf1(12, this));
       co5.l(p0, "override fun apply\(upstr…              }\n        }");
       return p0;
    }
    public Object i(nx5 p0){
       hj2 b;
       Set set = p0.d();
       if ((b = hj2.b) == null) {
          _monitor_enter(hj2.class);
          if ((b = hj2.b) == null) {
             b = new hj2(0);
             hj2.b = b;
          }
          _monitor_exit(hj2.class);
       }
       return new q81(set, b);
    }
    public void j(JSONObject p0){
       String str = null;
       String str1 = (p0 == null)? str: p0.optString("id");
       if (str1 == null) {
          return;
       }else {
          String str2 = p0.optString("link");
          String str3 = p0.optString("profile_picture", str);
          String str4 = p0.optString("first_name");
          String str5 = p0.optString("middle_name");
          String str6 = p0.optString("last_name");
          String str7 = p0.optString("name");
          Uri uri = (str2 != null)? Uri.parse(str2): str;
          if (str3 != null) {
             str = Uri.parse(str3);
          }
          ml5 v10 = new ml5(str1, str4, str5, str6, str7, uri, str);
          vl5.d.G().a(v10, true);
          return;
       }
    }
    public Object k(JsonReader p0){
       vx5 ovx5 = new vx5(6);
       p0.beginObject();
       while (true) {
          if (p0.hasNext()) {
             String str = p0.nextName();
             str.getClass();
             if (!str.equals("key")) {
                if (!str.equals("value")) {
                   p0.skipValue();
                }else if((str = p0.nextString()) != null){
                   ovx5.c = str;
                }else {
                   break ;
                }
             }else if((str = p0.nextString()) != null){
                ovx5.b = str;
             }else {
                throw new NullPointerException("Null key");
             }
          }else {
             p0.endObject();
             return ovx5.b();
          }
       }
       throw new NullPointerException("Null value");
    }
    public boolean l(){
       return true;
    }
    public xp7 m(View p0,xp7 p1){
       aa3 d;
       co5.o(p0, "p0");
       Resources resources = p0.getResources();
       int dimensionPix = resources.getDimensionPixelSize(R.dimen.snackbar_floating_margin_horizontal);
       int dimensionPix1 = resources.getDimensionPixelSize(R.dimen.snackbar_floating_margin_bottom);
       if (Build$VERSION.SDK_INT >= 30) {
          xp7 a = p1.a;
          if (a.f(s3.p()).d > null) {
             d = a.f(s3.p()).d;
          label_003a :
             ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
             co5.j(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             layoutParams.setMargins(dimensionPix, 0, dimensionPix, (dimensionPix1 + d));
             return p1;
          }
       }
       d = p1.a();
       goto label_003a ;
    }
    public Object n(kg3 p0,float p1){
       return Integer.valueOf(Math.round((ug3.d(p0) * p1)));
    }
    public synchronized hu3 p(Activity p0){
       Context uContext;
       if (p0 == null) {
          uContext = sz1.a();
       }
       if (i70.C == null) {
          i70.C = new hu3(uContext, sz1.b());
       }
       return i70.C;
    }
    public void shutdown(){
    }
}
