package p.z54;
import p.g63;
import p.or7;
import java.lang.Object;
import p.zp5;
import p.n63;
import p.x54;
import p.y54;
import p.qv6;
import android.content.res.Resources;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import java.util.Map;
import java.lang.String;
import java.lang.Boolean;
import p.r;
import android.graphics.drawable.Drawable;
import p.fl6;
import p.en6;
import p.wp5;
import p.ui3;
import p.aq5;
import p.dv6;
import p.xl7;
import android.graphics.Bitmap$Config;
import java.lang.Class;
import p.b17;
import p.co5;
import p.ib1;
import p.ye7;
import p.p;
import java.lang.Math;
import p.u45;
import p.hu1;
import p.an0;
import java.util.List;
import p.t65;
import p.oh3;
import p.n75;
import p.ml1;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import p.q14;
import java.util.Collection;
import p.ki0;
import p.tp2;
import java.util.Map$Entry;

public final class z54	// class@002e8f from classes.dex
{
    public final g63 a;
    public final or7 b;

    public void z54(g63 p0,or7 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static qv6 c(zp5 p0,n63 p1,x54 p2,y54 p3){
       BitmapDrawable uBitmapDrawa = new BitmapDrawable(p1.a.getResources(), p3.a);
       p3 = p3.b;
       qv6 obj = p3.get("coil#disk_cache_key");
       Boolean uBoolean = null;
       Boolean uBoolean1 = (obj instanceof String)? obj: uBoolean;
       p3 = p3.get("coil#is_sampled");
       if (p3 instanceof Boolean) {
          uBoolean = p3;
       }
       boolean b = (uBoolean != null)? uBoolean.booleanValue(): false;
       boolean b1 = (p0 instanceof zp5 && p0.g != null)? true: false;
       obj = new qv6(uBitmapDrawa, p1, 1, p2, uBoolean1, b, b1);
       return v8;
    }
    public final y54 a(n63 p0,x54 p1,fl6 p2,int p3){
       aq5 value;
       y54 oy541;
       Bitmap$Config config;
       y54 oy542;
       boolean b;
       String str;
       ib1 h1;
       int i;
       boolean b2;
       z54 oz54 = this;
       n63 on63 = p0;
       x54 ox54 = p1;
       fl6 uofl6 = p2;
       y54 oy54 = null;
       if (!en6.i(on63.t)) {
          return oy54;
       }
       if ((value = oz54.a.e.getValue()) != null) {
          if ((oy541 = value.a.b(ox54)) == null) {
             oy541 = value.b.b(ox54);
          }
       }else {
          oy541 = oy54;
       }
       if (oy541 != null) {
          y54 a = oy541.a;
          if ((config = a.getConfig()) == null) {
             config = Bitmap$Config.ARGB_8888;
          }
          oz54.b.getClass();
          if (!or7.j(on63, config)) {
          label_0047 :
             oy542 = oy541;
          label_011d :
             b = false;
          }else {
             y54 oy543 = oy541.b.get("coil#is_sampled");
             if (oy543 instanceof Boolean) {
             }else {
                oy543 = oy54;
             }
             boolean b1 = (oy543 != null)? oy543.booleanValue(): false;
             if (b17.r(p2)) {
                if (b1) {
                   goto label_0047 ;
                }else {
                   oy542 = oy541;
                }
             }else if((str = ox54.b.get("coil#transformation_size")) != null){
                b = co5.c(str, p2.toString());
                oy542 = oy541;
             }else {
                int width = a.getWidth();
                int height = a.getHeight();
                fl6 a1 = uofl6.a;
                ib1 h = (a1 instanceof ib1)? a1.H: Integer.MAX_VALUE;
                uofl6 = uofl6.b;
                if (uofl6 instanceof ib1) {
                   h1 = uofl6.H;
                   i = p3;
                }else {
                   i = p3;
                   h1 = Integer.MAX_VALUE;
                }
                double d = ye7.m(width, height, h, h1, i);
                if (b2 = p.a(p0)) {
                   oy542 = oy541;
                   double d1 = ((0x3ff0000000000000 - d) > 0)? 0x3ff0000000000000: d;
                   if ((Math.abs(((double)h - ((double)width * d1))) - 0x3ff0000000000000) <= 0 || (Math.abs(((double)h1 - (d1 * (double)height))) - 0x3ff0000000000000) <= 0) {
                   label_011f :
                      b = true;
                   }
                }else {
                   oy542 = oy541;
                   oy54 = Integer.MIN_VALUE;
                   oy541 = (h != oy54 && h != Integer.MAX_VALUE)? 0: 1;
                   if (oy541 || Math.abs((h - width)) <= 1) {
                      width = (h1 != oy54 && h1 != Integer.MAX_VALUE)? 0: 1;
                      if (width || Math.abs((h1 - height)) <= 1) {
                      }
                   }
                }
                width = (!(d - 0x3ff0000000000000))? 1: 0;
                if (!width && (!b2 || ((0x3ff0000000000000 - d) > 0 && b1))) {
                   goto label_011d ;
                }else {
                   goto label_011f ;
                }
             }
          }
          if (b) {
             oy54 = oy542;
          label_0126 :
             return oy54;
          }
       }
       oy54 = null;
       goto label_0126 ;
    }
    public final x54 b(n63 p0,Object p1,u45 p2,hu1 p3){
       n63 e;
       String str;
       ml1 oml1;
       if ((e = p0.e) != null) {
          return e;
       }
       an0 c = this.a.f.c;
       int i = c.size();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i2 < i) {
             t65 ot65 = c.get(i2);
             t65 a = ot65.a;
             if (ot65.b.isAssignableFrom(p1.getClass())) {
                co5.j(a, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                if ((str = a.a(p1, p2)) != null) {
                label_003e :
                   if (str == null) {
                      return null;
                   }else {
                      p1 = p0.D.a;
                      ml1 a1 = ml1.a;
                      if (p1.isEmpty()) {
                         oml1 = a1;
                      }else {
                         oml1 = new LinkedHashMap();
                         p1 = p1.entrySet().iterator();
                         if (p1.hasNext()) {
                            tp2.v(p1.next().getValue());
                            throw null;
                         }
                      }
                      p0 = p0.l;
                      if (p0.isEmpty() && oml1.isEmpty()) {
                         return new x54(str, a1);
                      }else {
                         p1 = q14.t0(oml1);
                         if ((p0.isEmpty() ^ 0x01)) {
                            int i3 = p0.size();
                            for (; i1 < i3; i1 = i1 + 1) {
                               p1.put(tp2.k("coil#transformation_", i1), p0.get(i1).a);
                            }
                            p1.put("coil#transformation_size", p2.d.toString());
                         }
                         break ;
                      }
                   }
                }
             }
             i2 = i2 + 1;
          }else {
             str = null;
             goto label_003e ;
          }
       }
       return new x54(str, p1);
    }
}
