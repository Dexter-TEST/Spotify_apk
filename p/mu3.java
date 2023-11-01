package p.mu3;
import android.os.Parcelable;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import p.q14;
import p.ht3;
import p.et3;
import org.json.JSONObject;
import java.lang.Throwable;
import java.lang.StringBuilder;
import p.sz1;
import p.dc3;
import androidx.fragment.app.k;
import android.content.Context;
import android.os.Bundle;
import android.os.BaseBundle;
import java.lang.System;
import p.me7;
import p.bj;
import android.content.Intent;
import p.ej4;
import p.tm2;
import p.a3;
import p.om2;
import p.az5;
import p.fs2;
import p.xm2;
import p.ny1;
import p.tz1;
import p.oz1;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public abstract class mu3 implements Parcelable	// class@001f08 from classes.dex
{
    public HashMap a;
    public ht3 b;

    public void mu3(Parcel p0){
       Map map;
       co5.o(p0, "source");
       super();
       int i = p0.readInt();
       HashMap hashMap = null;
       if (i < 0) {
          map = hashMap;
       }else {
          map = new HashMap();
          if (i > 0) {
             int i1 = 0;
             do {
                i1 = i1 + 1;
                map.put(p0.readString(), p0.readString());
             } while (i1 >= i);
          }
       }
       if (map != null) {
          hashMap = q14.t0(map);
       }
       this.a = hashMap;
       return;
    }
    public void mu3(ht3 p0){
       super();
       this.b = p0;
    }
    public abstract int C(et3 p0);
    public final void a(String p0,String p1){
       mu3 ta;
       if (this.a == null) {
          this.a = new HashMap();
       }
       if ((ta = this.a) != null) {
          p0 = (p0 == null)? null: p0;
          ta.put(p1, p0);
       }
       return;
    }
    public void b(){
    }
    public final String c(String p0){
       JSONObject jSONObject;
       co5.o(p0, "authId");
       try{
          jSONObject = new JSONObject();
          jSONObject.put("0_auth_logger_id", p0);
          jSONObject.put("3_method", this.e());
          this.y(jSONObject);
       }catch(org.json.JSONException e3){
          co5.K(e3.getMessage(), "Error creating client state json: ");
       }
       p0 = jSONObject.toString();
       co5.l(p0, "param.toString\(\)");
       return p0;
    }
    public final ht3 d(){
       mu3 tb;
       if ((tb = this.b) != null) {
          return tb;
       }
       co5.N("loginClient");
       throw null;
    }
    public abstract String e();
    public String j(){
       return "fb"+sz1.b()+"://authorize/";
    }
    public final void m(String p0){
       ht3 x;
       String str = ((x = this.d().x) == null)? null: x.t;
       if (str == null) {
          str = sz1.b();
       }
       dc3 uodc3 = new dc3(this.d().e(), str);
       Bundle uBundle = new Bundle();
       uBundle.putString("fb_web_login_e2e", p0);
       uBundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
       uBundle.putString("app_id", str);
       if (me7.a()) {
          uodc3.a.b("fb_dialogs_web_login_dialog_complete", uBundle);
       }
       return;
    }
    public boolean q(int p0,int p1,Intent p2){
       return false;
    }
    public final void u(Bundle p0,et3 p1){
       tm2 otm2;
       xm2 c;
       String str4;
       String str = "code";
       String str1 = p0.getString(str);
       if (ej4.Z(str1)) {
          throw new ny1("No code param found from the request");
       }
       String str2 = null;
       if (str1 == null) {
          otm2 = str2;
       }else {
          String str3 = this.j();
          if ((p1 = p1.G) == null) {
             str4 = "";
          }
          co5.o(str3, "redirectUri");
          Bundle uBundle = new Bundle();
          uBundle.putString(str, str1);
          uBundle.putString("client_id", sz1.b());
          uBundle.putString("redirect_uri", str3);
          uBundle.putString("code_verifier", str4);
          otm2 = az5.M(str2, "oauth/access_token", str2);
          otm2.k(fs2.a);
          otm2.d = uBundle;
       }
       if (otm2 != null) {
          xm2 oxm2 = otm2.c();
          if ((c = oxm2.c) == null) {
             try{
                oxm2 = oxm2.b;
                str = "access_token";
                if (oxm2 != null) {
                   str2 = oxm2.getString(str);
                }
                if (oxm2 != null && !ej4.Z(str2)) {
                   p0.putString(str, str2);
                   if (oxm2.has("id_token")) {
                      p0.putString("id_token", oxm2.getString("id_token"));
                   }
                   return;
                }else {
                   throw new ny1("No access token found from result");
                }
             }catch(org.json.JSONException e7){
                throw new ny1(co5.K(e7.getMessage(), "Fail to process code exchange response: "));
             }
          }else {
             throw new tz1(c, c.a());
          }
       }else {
          throw new ny1("Failed to create code exchange request");
       }
    }
    public void writeToParcel(Parcel p0,int p1){
       mu3 ta;
       co5.o(p0, "dest");
       if ((ta = this.a) == null) {
          p0.writeInt(-1);
       }else {
          p0.writeInt(ta.size());
          Iterator iterator = ta.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             p0.writeString(key);
             p0.writeString(uEntry.getValue());
          }
       }
       return;
    }
    public void y(JSONObject p0){
    }
}
