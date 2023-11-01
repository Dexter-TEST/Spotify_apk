package p.s53;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.util.Collection;
import p.y15;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.String;
import p.aq6;
import p.td7;
import p.yp6;
import p.ma3;
import p.co6;
import java.lang.Class;
import p.co5;
import android.content.SharedPreferences;
import p.rn6;
import p.tn6;
import p.ot;
import p.co3;
import java.lang.Boolean;
import p.bq3;
import com.google.common.collect.c;
import p.d73;
import p.tv;
import p.a73;
import p.w51;
import p.n6;
import android.content.Context;
import java.io.File;
import p.ns0;
import p.do5;
import java.util.Arrays;
import p.ys5;
import java.lang.Iterable;
import p.eq3;
import p.p25;
import p.wn6;
import p.tm5;
import p.pp3;
import p.ti3;
import p.z40;
import java.util.List;
import p.c94;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MetadataItem;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.ab2;
import p.vr1;
import p.dt5;
import p.bt3;
import p.r45;
import p.tp2;
import p.sz1;
import p.i3;
import p.az5;
import p.pp2;
import org.json.JSONObject;
import p.a3;
import p.vl5;
import p.nl5;
import p.ml5;
import p.aj;
import p.b3;
import p.me7;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import p.dc3;
import p.ej4;
import android.os.BaseBundle;
import java.util.UUID;
import p.t6;
import java.lang.Double;
import p.bj;
import p.ni;
import p.bb2;
import p.am0;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import p.uv1;
import androidx.work.impl.WorkDatabase;
import java.lang.Integer;
import p.p54;
import p.r44;

public final class s53 implements Callable	// class@0025c0 from classes.dex
{
    public final int a;
    public final Object b;

    public void s53(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object call(){
       s53 tb;
       String str2;
       a3 uoa3;
       ml5 oml5;
       ApplicationInfo applicationI;
       ApplicationInfo metaData;
       p25 str4;
       tv otv;
       object oobject;
       int i3;
       rn6 c;
       aq6 uoaq6;
       aq6 b2;
       String str = null;
       boolean b = false;
       switch (this.a){
           case 0:
             tb = this.b;
             co5.o(tb, "this$0");
             return Integer.valueOf(ej4.b(tb.b, "next_alarm_manager_id"));
           case 1:
             tp2.v(this.b);
             i3 oi3 = i3.f.F();
             pp2 a = oi3.b.a;
             String str1 = "com.facebook.AccessTokenManager.CachedAccessToken";
             if (a.contains(str1) && (str2 = a.getString(str1, str)) != null) {
                try{
                   uoa3 = az5.y(new JSONObject(str2));
                label_01ac :
                   if (uoa3 != null) {
                      e0.c(uoa3, b);
                   }
                   az5 d = vl5.d;
                   vl5 ovl5 = d.G();
                   if ((str1 = ovl5.b.a.getString("com.facebook.ProfileManager.CachedProfile", str)) != null) {
                      try{
                         oml5 = new ml5(new JSONObject(str1));
                      label_01d0 :
                         if (oml5 != null) {
                            ovl5.a(oml5, b);
                         }
                         if (az5.J() && e0.G().c == null) {
                            az5.C();
                         }
                         aj.b.s(sz1.a(), sz1.c);
                         try{
                            AtomicBoolean a1 = me7.a;
                            Context uContext = sz1.a();
                            str1 = ((applicationI = uContext.getPackageManager().getApplicationInfo(uContext.getPackageName(), 128)) == null)? str: applicationI.metaData;
                            if (str1 != null && applicationI.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", b)) {
                               dc3 uodc3 = new dc3(uContext);
                               Bundle uBundle = new Bundle();
                               if (!ej4.V()) {
                                  uBundle.putString("SchemeWarning", "You haven\'t set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                               }
                               if (me7.a()) {
                                  dc3 a2 = uodc3.a;
                                  a2.getClass();
                                  a2.a("fb_auto_applink", null, uBundle, false, t6.a());
                               }
                            }
                            uContext = sz1.a().getApplicationContext();
                            co5.l(uContext, "getApplicationContext\(\).applicationContext");
                            new aj(uContext).a.getClass();
                            ni.b.execute(new am0(8, bb2.a));
                            return str;
                         }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                         }
                      }catch(org.json.JSONException e0){
                      }
                      oml5 = str;
                      goto label_01d0 ;
                   }else {
                   }
                }catch(org.json.JSONException e0){
                }
             label_01ab :
                uoa3 = str;
                goto label_01ac ;
             }else {
                goto label_01ab ;
             }
             break;
           case 2:
             return this.b.b();
           case 3:
             c94 uoc94 = MetadataCosmos$MetadataItem.q();
             uoc94.c();
             return ab2.b(this.b).g(new vr1(2, uoc94.build()));
           case 4:
             return this.b.get();
           case 5:
             return this.b.get();
           case 6:
             tb = this.b;
             eq3 f = tb.f;
             rn6 g = eq3.g;
             String str3 = f.g(g, str);
             str = f.g(eq3.h, str);
             rn6 i = eq3.i;
             eq3 e = tb.e;
             if (!f.d(i, b) && (str3 != null && str == null)) {
                File uFile = (str != null)? new File(str): new File(str3);
                str4 = new p25(e.h(uFile));
                str4.f = Boolean.TRUE;
                otv = str4.c();
             }else {
                str4 = new p25(e.a());
                str4.f = Boolean.TRUE;
                otv = str4.c();
                wn6 own6 = f.edit();
                own6.c(g, otv.k.getAbsolutePath());
                own6.a(i, true);
                own6.f();
             }
             return otv;
             break;
           case 7:
             tb = this.b;
             tb.getClass();
             d73 uod73 = new d73();
             uod73.D0(tb.a());
             w51.h(4, "initialCapacity");
             Object[] objArray = new Object[4];
             File[] uFileArray = ns0.b(tb.a, str);
             int len = uFileArray.length;
             int i1 = 0;
             int i2 = 0;
             while (i1 < len) {
                if ((oobject = uFileArray[i1]) != null) {
                   tv otv1 = bq3.b(oobject, new File(oobject, "core-cache"), new File(oobject, "core-volatile"), b);
                   i3 = i2 + 1;
                   if (objArray.length < i3) {
                      objArray = Arrays.copyOf(objArray, do5.t(objArray.length, i3));
                   }
                   objArray[i2] = otv1;
                   i2 = i3;
                }
                i1 = i1 + 1;
             }
             uod73.G0(c.m(i2, objArray));
             return uod73.I0();
             break;
           case 8:
             return Boolean.valueOf(this.b.i.d(co3.q, b));
           case 9:
             ma3 b1 = this.b.b;
             ma3 oma3 = b1;
             c = ma3.c;
             oma3.getClass();
             co5.o(c, "key");
             if (oma3.h().contains(c.a)) {
                str = new ot(b1.e(c));
             }
             return str;
             break;
           case 10:
             tb = this.b;
             HashSet hashSet = new HashSet(tb.size());
             Iterator iterator = tb.iterator();
             while (iterator.hasNext()) {
                if ((uoaq6 = td7.d(iterator.next())) != null && ((b2 = uoaq6.b) == yp6.B && b2 != yp6.A)) {
                   hashSet.add(uoaq6.t);
                }
             }
             return hashSet;
             break;
           default:
             return this.b.d();
       }
    }
}
