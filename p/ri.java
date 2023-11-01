package p.ri;
import p.om2;
import java.lang.Object;
import p.xm2;
import p.ns3;
import p.vv7;
import p.fs3;
import java.lang.String;
import p.oz1;
import p.sz1;
import android.content.Context;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import p.av6;
import java.util.LinkedHashMap;
import java.util.Map;
import java.net.URL;
import p.yi;
import java.lang.StringBuilder;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.ArrayList;
import p.ej4;
import java.util.List;
import p.dj0;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.NullPointerException;
import java.lang.Exception;
import p.io2;
import p.mj7;
import p.ji7;

public final class ri implements om2	// class@0024f7 from classes.dex
{
    public final int a;

    public void ri(int p0){
       this.a = p0;
       super();
    }
    public final void a(xm2 p0){
       xm2 c;
       SharedPreferences sharedPrefer;
       String str6;
       ns3 t = ns3.t;
       switch (this.a){
           case 0:
             break;
           default:
             mj7.j(t, ji7.e, "App index sent to FB!");
             return;
       }
       try{
          int i = 0;
          Map map = null;
          String str = "access_key";
          String str1 = "endpoint";
          if ((c = p0.c) != null) {
             c.toString();
             String.valueOf(c.z);
             sz1.i(t);
             if ((sharedPrefer = sz1.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", i)) != null) {
                String str2 = sharedPrefer.getString("dataset_id", map);
                String str3 = sharedPrefer.getString(str1, map);
                String str4 = sharedPrefer.getString(str, map);
                int i1 = (str2 != null && !av6.p0(str2))? 0: 1;
                if (!i1) {
                   i1 = (str3 != null && !av6.p0(str3))? 0: 1;
                   if (!i1) {
                      if (str4 == null || av6.p0(str4)) {
                         i = 1;
                      }
                      if (!i) {
                         map = new LinkedHashMap();
                         map.put(str1, str3);
                         map.put("dataset_id", str2);
                         map.put(str, str4);
                         sz1.i(t);
                      }
                   }
                }
             }
             if (map != null) {
                URL uRL = new URL(String.valueOf(map.get(str1)));
                yi.a(String.valueOf(map.get("dataset_id")), uRL.getProtocol()+"://"+uRL.getHost(), String.valueOf(map.get(str)));
                vv7.b = true;
             }
          }else {
             sz1.i(t);
             if ((p0 = p0.b) != null) {
                map = p0.get("data");
             }
             if (map != null) {
                HashMap hashMap = ej4.r(new JSONObject(dj0.l0(ej4.q(map))));
                String str5 = hashMap.get(str1);
                str1 = hashMap.get("dataset_id");
                str = hashMap.get(str);
                if (str5 != null && (str1 != null && str != null)) {
                   yi.a(str1, str5, str);
                   vv7.P(hashMap);
                   str6 = "is_enabled";
                   if (hashMap.get(str6) != null) {
                      if ((hashMap = hashMap.get(str6)) != null) {
                         i = hashMap.booleanValue();
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                      }
                   }
                   vv7.b = i;
                }else {
                   mj7.j(t, "p.vv7", "CloudBridge Settings API response doesn\'t have valid data");
                }
             }else {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
             }
          }
       }catch(org.json.JSONException e11){
          io2.v(e11);
          sz1.i(t);
       }catch(java.lang.NullPointerException e11){
          io2.v(e11);
          sz1.i(t);
       }catch(java.net.MalformedURLException e11){
          io2.v(e11);
          sz1.i(str6);
       }
       return;
    }
}
