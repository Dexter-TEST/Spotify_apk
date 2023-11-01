package p.wi;
import p.t65;
import p.qi;
import p.ui;
import p.ou0;
import p.pu0;
import java.lang.Object;
import java.util.Map;
import p.q14;
import p.c11;
import p.ti;
import p.mu0;
import p.nu0;
import java.lang.String;
import p.co5;
import p.vi;
import java.lang.Enum;
import java.lang.Integer;
import p.yu6;
import p.cd2;
import java.lang.Boolean;
import org.json.JSONArray;
import java.util.ArrayList;
import p.ej4;
import java.util.Iterator;
import java.lang.Iterable;
import org.json.JSONObject;
import java.util.HashMap;
import p.fs3;
import p.ns3;
import p.sz1;
import p.jc7;

public abstract class wi	// class@002b46 from classes.dex
{
    public static final Map a;
    public static final Map b;
    public static final Map c;

    static {
       t65[] ot65Array = new t65[17];
       ou0 a = ou0.a;
       ot65Array[0] = new t65(qi.b, new ui(a, pu0.b));
       ot65Array[1] = new t65(qi.c, new ui(a, pu0.c));
       ot65Array[2] = new t65(qi.t, new ui(a, pu0.t));
       ot65Array[3] = new t65(qi.v, new ui(a, pu0.v));
       ot65Array[4] = new t65(qi.w, new ui(a, pu0.w));
       ou0 b = ou0.b;
       ot65Array[5] = new t65(qi.y, new ui(b, pu0.x));
       ot65Array[6] = new t65(qi.z, new ui(b, pu0.y));
       ot65Array[7] = new t65(qi.A, new ui(b, pu0.z));
       ot65Array[8] = new t65(qi.B, new ui(b, pu0.A));
       ot65Array[9] = new t65(qi.C, new ui(b, pu0.B));
       ot65Array[10] = new t65(qi.D, new ui(b, pu0.C));
       ot65Array[11] = new t65(qi.E, new ui(b, pu0.D));
       ot65Array[12] = new t65(qi.F, new ui(b, pu0.E));
       ot65Array[13] = new t65(qi.G, new ui(b, pu0.F));
       ot65Array[14] = new t65(qi.H, new ui(b, pu0.G));
       ui oui = new ui(b, pu0.H);
       ot65Array[15] = new t65(qi.I, oui);
       ui oui1 = new ui(a, null);
       ot65Array[16] = new t65(qi.x, oui1);
       wi.a = q14.o0(ot65Array);
       t65[] ot65Array1 = new t65[17];
       ot65Array1[0] = new t65(c11.b, new ti(null, mu0.c));
       ot65Array1[1] = new t65(c11.c, new ti(null, mu0.t));
       ou0 c = ou0.c;
       ot65Array1[2] = new t65(c11.t, new ti(c, mu0.b));
       ot65Array1[3] = new t65(c11.v, new ti(c, mu0.v));
       ot65Array1[4] = new t65(c11.w, new ti(c, mu0.w));
       ot65Array1[5] = new t65(c11.x, new ti(c, mu0.x));
       ot65Array1[6] = new t65(c11.I, new ti(c, mu0.I));
       ot65Array1[7] = new t65(c11.y, new ti(c, mu0.y));
       ot65Array1[8] = new t65(c11.z, new ti(c, mu0.z));
       ot65Array1[9] = new t65(c11.A, new ti(c, mu0.A));
       ot65Array1[10] = new t65(c11.B, new ti(c, mu0.B));
       ot65Array1[11] = new t65(c11.C, new ti(c, mu0.C));
       ot65Array1[12] = new t65(c11.D, new ti(c, mu0.D));
       ot65Array1[13] = new t65(c11.E, new ti(c, mu0.E));
       ot65Array1[14] = new t65(c11.F, new ti(c, mu0.F));
       ot65Array1[15] = new t65(c11.G, new ti(c, mu0.G));
       ot65Array1[16] = new t65(c11.H, new ti(c, mu0.H));
       wi.b = q14.o0(ot65Array1);
       ot65Array1 = new t65[14];
       ot65Array1[0] = new t65("fb_mobile_achievement_unlocked", nu0.b);
       ot65Array1[1] = new t65("fb_mobile_activate_app", nu0.c);
       ot65Array1[2] = new t65("fb_mobile_add_payment_info", nu0.t);
       ot65Array1[3] = new t65("fb_mobile_add_to_cart", nu0.v);
       ot65Array1[4] = new t65("fb_mobile_add_to_wishlist", nu0.w);
       ot65Array1[5] = new t65("fb_mobile_complete_registration", nu0.x);
       ot65Array1[6] = new t65("fb_mobile_content_view", nu0.y);
       ot65Array1[7] = new t65("fb_mobile_initiated_checkout", nu0.z);
       ot65Array1[8] = new t65("fb_mobile_level_achieved", nu0.A);
       ot65Array1[9] = new t65("fb_mobile_purchase", nu0.B);
       ot65Array1[10] = new t65("fb_mobile_rate", nu0.C);
       ot65Array1[11] = new t65("fb_mobile_search", nu0.D);
       ot65Array1[12] = new t65("fb_mobile_spent_credits", nu0.E);
       ot65Array1[13] = new t65("fb_mobile_tutorial_completion", nu0.F);
       wi.c = q14.o0(ot65Array1);
    }
    public static final Object a(Object p0,String p1){
       int i;
       HashMap hashMap;
       vi a = vi.a;
       Boolean uBoolean = null;
       if (co5.c(p1, "extInfo")) {
       }else if(co5.c(p1, "url_schemes") || (co5.c(p1, "fb_content_id") || (co5.c(p1, "fb_content") || co5.c(p1, "data_processing_options")))){
          a = vi.b;
          if (!co5.c(p1, "advertiser_tracking_enabled") && !co5.c(p1, "application_tracking_enabled")) {
             a = (co5.c(p1, "_logTime"))? vi.c: uBoolean;
          }
       }
       p1 = (p0 instanceof String)? p0: uBoolean;
       if (a != null && p1 != null) {
          try{
             if (i = a.ordinal()) {
                boolean b = true;
                if (i != b) {
                   if (i == 2) {
                      return yu6.c0(p0.toString());
                   }else {
                      throw new cd2(10);
                   }
                }else if((p0 = yu6.c0(p1)) != null){
                   if (!p0.intValue()) {
                      b = false;
                   }
                   uBoolean = Boolean.valueOf(b);
                }
                return uBoolean;
             }else {
                ArrayList uArrayList = new ArrayList();
                p0 = ej4.q(new JSONArray(p1)).iterator();
                while (p0.hasNext()) {
                   String str = p0.next();
                   try{
                      hashMap = ej4.r(new JSONObject(str));
                   }catch(org.json.JSONException e0){
                      hashMap = ej4.q(new JSONArray(e0));
                   }catch(org.json.JSONException e0){
                   }
                   uArrayList.add(e0);
                }
                return uArrayList;
             }
          }catch(org.json.JSONException e0){
             sz1.i(ns3.t);
             p0 = jc7.a;
          }
       label_00cd :
          return p0;
       }else {
          goto label_00cd ;
       }
    }
}
