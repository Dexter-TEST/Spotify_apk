package p.e3;
import p.om2;
import java.lang.Object;
import p.xm2;
import p.d3;
import p.tm2;
import p.yb6;
import p.r8;
import p.ni;
import java.lang.String;
import p.co5;
import p.cb2;
import p.oz1;
import java.util.Arrays;
import p.sz1;
import p.ns3;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p.ij;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p.ej4;
import java.util.Locale;
import p.ea1;
import java.util.Date;
import p.ny1;
import p.qo5;
import p.mj7;
import p.ma1;
import p.ca1;
import p.h22;
import p.f22;
import p.km6;
import java.util.AbstractCollection;
import java.lang.Boolean;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import p.kg4;
import android.app.AlertDialog$Builder;
import android.content.Context;
import java.lang.CharSequence;
import p.aa1;
import android.content.DialogInterface$OnClickListener;
import p.ba1;
import android.app.AlertDialog;
import android.app.Dialog;
import java.lang.Throwable;

public final class e3 implements om2	// class@001413 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public void e3(Object p0,Object p1,Object p2,Object p3,int p4){
       this.a = p4;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void a(xm2 p0){
       e3 tb;
       e3 td;
       e3 te;
       JSONArray jSONArray;
       int i1;
       JSONObject jSONObject;
       int i2;
       xm2 c;
       cb2 c1;
       JSONObject jSONObject1;
       ea1 o;
       f22 uof22;
       int i = 0;
       int b = true;
       switch (this.a){
           case 0:
             tb = this.b;
             e3 tc = this.c;
             td = this.d;
             te = this.e;
             co5.o(tb, "$permissionsCallSucceeded");
             co5.o(tc, "$permissions");
             co5.o(td, "$declinedPermissions");
             co5.o(te, "$expiredPermissions");
             if ((p0 = p0.d) != null && (jSONArray = p0.optJSONArray("data")) != null) {
                tb.set(b);
                if ((i1 = jSONArray.length()) > 0) {
                   while (true) {
                      b = i + 1;
                      if ((jSONObject = jSONArray.optJSONObject(i)) == null) {
                      label_014d :
                         if (b < i1) {
                            i = b;
                         }
                      }else {
                         String str = jSONObject.optString("permission");
                         String str1 = "status";
                         String str2 = jSONObject.optString(str1);
                         if (!ej4.Z(str) && !ej4.Z(str2)) {
                            co5.l(str2, str1);
                            Locale uS = Locale.US;
                            co5.l(uS, "US");
                            str2 = str2.toLowerCase(uS);
                            co5.l(str2, "\(this as java.lang.String\).toLowerCase\(locale\)");
                            if ((i2 = str2.hashCode()) != -1309235419) {
                               if (i2 != 0x10b4f6bb) {
                                  if (i2 == 0x21ddfc2e && str2.equals("declined")) {
                                     td.add(str);
                                     goto label_014d ;
                                  }
                               }else if(!str2.equals("granted")){
                                  tc.add(str);
                                  goto label_014d ;
                               }
                            }else if(!str2.equals("expired")){
                               te.add(str);
                               goto label_014d ;
                            }
                            co5.K(str2, "Unexpected status: ");
                            goto label_014d ;
                         }else {
                            goto label_014d ;
                         }
                      }
                   }
                }
             }
             break;
           case 1:
             tb = this.b;
             td = this.d;
             te = this.e;
             co5.o(tb, "$accessTokenAppId");
             co5.o(this.c, "$postRequest");
             co5.o(td, "$appEvents");
             co5.o(te, "$flushState");
             c = p0.c;
             cb2 a = cb2.a;
             if (c != null) {
                if (c.b == -1) {
                   c1 = cb2.c;
                }else {
                   Object[] objArray = new Object[]{p0.toString(),c.toString()};
                   co5.l(String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(objArray, 2)), "java.lang.String.format\(format, *args\)");
                   c1 = cb2.b;
                }
             }else {
                c1 = a;
             }
             sz1.i(ns3.t);
             if (c == null) {
                b = false;
             }
             _monitor_enter(td);
             if (b) {
                td.c.addAll(td.d);
             }
             td.d.clear();
             td.e = i;
             _monitor_exit(td);
             cb2 c2 = cb2.c;
             if (c1 == c2) {
                sz1.c().execute(new ij(tb, 16, td));
             }
             if (c1 != a && te.c != c2) {
                te.c = c1;
             }
             return;
             break;
           default:
             tb = this.b;
             e3 uoe3 = this.c;
             e3 uoe31 = this.d;
             e3 uoe32 = this.e;
             co5.o(tb, "this$0");
             co5.o(uoe3, "$accessToken");
             if (!tb.L.get()) {
                try{
                   if ((c = p0.c) != null) {
                      if (c.z == null) {
                         ny1 ony1 = new ny1();
                         tb.G(ony1);
                      }
                   }else if((p0 = p0.b) == null){
                      jSONObject1 = new JSONObject();
                   }
                   String str3 = jSONObject1.getString("id");
                   co5.l(str3, "jsonObject.getString\(\"id\"\)");
                   qo5 oqo5 = mj7.a(jSONObject1);
                   String str4 = jSONObject1.getString("name");
                   co5.l(str4, "jsonObject.getString\(\"name\"\)");
                   if ((o = tb.O) != null) {
                      ma1.a(o.b);
                   }
                   Boolean uBoolean = ((uof22 = h22.b(sz1.b())) == null || (uof22 = uof22.c) == null)? null: Boolean.valueOf(uof22.contains(km6.t));
                   if (co5.c(uBoolean, Boolean.TRUE) && tb.Q == null) {
                      tb.Q = b;
                      String str5 = tb.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                      co5.l(str5, "resources.getString\(R.string.com_facebook_smart_login_confirmation_title\)");
                      String str6 = tb.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                      co5.l(str6, "resources.getString\(R.string.com_facebook_smart_login_confirmation_continue_as\)");
                      String str7 = tb.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                      co5.l(str7, "resources.getString\(R.string.com_facebook_smart_login_confirmation_cancel\)");
                      Object[] objArray1 = new Object[b];
                      objArray1[i] = str4;
                      str4 = kg4.q(objArray1, b, str6, "java.lang.String.format\(format, *args\)");
                      AlertDialog$Builder uBuilder = new AlertDialog$Builder(tb.getContext());
                      aa1 v12 = new aa1(tb, str3, oqo5, uoe3, uoe31, uoe32);
                      uBuilder.setMessage(str5).setCancelable(b).setNegativeButton(str4, v12).setPositiveButton(str7, new ba1(i, tb));
                      uBuilder.create().show();
                   }else {
                      tb.C(str3, oqo5, uoe3, uoe31, uoe32);
                   }
                }catch(org.json.JSONException e14){
                   tb.G(new ny1(e14));
                }
             }
             return;
       }
       return;
    }
}
