package p.e11;
import p.sm7;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.j3;
import p.mu3;
import p.xe7;
import p.ht3;
import java.util.Random;
import java.math.BigInteger;
import p.et3;
import android.os.Bundle;
import android.os.BaseBundle;
import p.bv3;
import p.mj7;
import java.util.Set;
import java.lang.Enum;
import p.sz1;
import p.g11;
import p.ca3;
import android.net.Uri;
import p.d11;
import androidx.fragment.app.k;
import android.content.Intent;
import com.facebook.CustomTabMainActivity;
import android.content.Context;
import java.lang.Class;
import androidx.fragment.app.Fragment;
import p.av6;
import p.ej4;
import org.json.JSONObject;
import p.ny1;
import java.lang.Integer;
import java.util.concurrent.Executor;
import p.jj1;
import java.lang.Runnable;
import p.mz1;
import p.oz1;
import p.tz1;

public final class e11 extends sm7	// class@0013f8 from classes.dex
{
    public String t;
    public final String v;
    public final String w;
    public final String x;
    public final j3 y;
    public static final Parcelable$Creator CREATOR;
    public static boolean z;

    static {
       e11.CREATOR = new g44(27);
    }
    public void e11(Parcel p0){
       co5.o(p0, "source");
       super(p0);
       this.x = "custom_tab";
       this.y = j3.v;
       this.v = p0.readString();
       this.w = xe7.A(super.j());
    }
    public void e11(ht3 p0){
       super(p0);
       this.x = "custom_tab";
       this.y = j3.v;
       String str = new BigInteger(100, new Random()).toString(32);
       co5.l(str, "BigInteger\(length * 5, r\).toString\(32\)");
       this.v = str;
       e11.z = false;
       this.w = xe7.A(super.j());
    }
    public final int C(et3 p0){
       et3 c1;
       et3 i3;
       k ok;
       e11 tt;
       ht3 c2;
       ht3 oht3 = this.d();
       e11 tw = this.w;
       int i = 0;
       int i1 = (!tw.length())? 1: 0;
       if (i1) {
          return i;
       }else {
          Bundle uBundle = this.D(p0);
          uBundle.putString("redirect_uri", tw);
          bv3 c = bv3.c;
          int i2 = ((c1 = p0.C) == c)? 1: 0;
          et3 t = p0.t;
          if (i2) {
             uBundle.putString("app_id", t);
          }else {
             uBundle.putString("client_id", t);
          }
          uBundle.putString("e2e", mj7.g());
          i2 = (c1 == c)? 1: 0;
          String str = "response_type";
          if (i2) {
             uBundle.putString(str, "token,signed_request,graph_domain,granted_scopes");
          }else if(p0.b.contains("openid")){
             uBundle.putString("nonce", p0.F);
          }
          uBundle.putString(str, "id_token,token,signed_request,graph_domain");
          uBundle.putString("code_challenge", p0.H);
          String str1 = ((i3 = p0.I) == null)? null: i3.name();
          uBundle.putString("code_challenge_method", str1);
          str = "true";
          uBundle.putString("return_scopes", str);
          uBundle.putString("auth_type", p0.y);
          uBundle.putString("login_behavior", p0.a.name());
          uBundle.putString("sdk", co5.K("15.0.1", "android-"));
          uBundle.putString("sso", "chrome_custom_tab");
          String str2 = "0";
          str1 = (sz1.k)? "1": str2;
          uBundle.putString("cct_prefetching", str1);
          if (p0.D != null) {
             uBundle.putString("fx_app", c1.a);
          }
          if (p0.E != null) {
             uBundle.putString("skip_dedupe", str);
          }
          if ((i3 = p0.A) != null) {
             uBundle.putString("messenger_page_id", i3);
             if (p0.B != null) {
                str2 = "1";
             }
             uBundle.putString("reset_messenger_state", str2);
          }
          if (e11.z) {
             uBundle.putString("cct_over_app_switch", "1");
          }
          if (sz1.k) {
             int i4 = (c1 == c)? 1: 0;
             if (i4) {
                mj7.k(ca3.c.h(uBundle, "oauth"));
             }else {
                mj7.k(d11.b.h(uBundle, "oauth"));
             }
          }
          if ((ok = oht3.e()) == null) {
             return i;
          }else {
             Intent intent = new Intent(ok, CustomTabMainActivity.class);
             intent.putExtra(CustomTabMainActivity.c, "oauth");
             intent.putExtra(CustomTabMainActivity.t, uBundle);
             String v = CustomTabMainActivity.v;
             if ((tt = this.t) == null) {
                tt = xe7.w();
                this.t = tt;
             }
             intent.putExtra(v, tt);
             intent.putExtra(CustomTabMainActivity.x, c1.a);
             if ((c2 = oht3.c) != null) {
                c2.startActivityForResult(intent, 1);
             }
             return 1;
          }
       }
    }
    public final j3 L(){
       return this.y;
    }
    public final int describeContents(){
       return 0;
    }
    public final String e(){
       return this.x;
    }
    public final String j(){
       return this.w;
    }
    public final boolean q(int p0,int p1,Intent p2){
       ht3 x;
       String str;
       String str1;
       int i;
       boolean b = false;
       if (p2 != null && p2.getBooleanExtra(CustomTabMainActivity.z, b)) {
          return b;
       }
       if (p0 != 1) {
          return b;
       }
       if ((x = this.d().x) == null) {
          return b;
       }
       Bundle uBundle = null;
       if (p1 == -1) {
          String stringExtra = (p2 != null)? p2.getStringExtra(CustomTabMainActivity.w): uBundle;
          if (stringExtra != null && (av6.D0(stringExtra, "fbconnect://cct.", b) && !av6.D0(stringExtra, super.j(), b))) {
             Uri uri = Uri.parse(stringExtra);
             Bundle uBundle1 = ej4.B0(uri.getQuery());
             Bundle uBundle2 = ej4.B0(uri.getFragment());
             try{
                uBundle1.putAll(uBundle2);
                if ((stringExtra = uBundle1.getString("state")) != null) {
                   b = co5.c(new JSONObject(stringExtra).getString("7_challenge"), this.v);
                }
             }catch(org.json.JSONException e0){
             }
             if (!e0) {
                this.M(x, uBundle, new ny1("Invalid state parameter"));
             }else if((stringExtra = uBundle1.getString("error")) == null){
                stringExtra = uBundle1.getString("error_type");
             }
             if ((str = uBundle1.getString("error_msg")) == null) {
                str = uBundle1.getString("error_message");
             }
             if (str == null) {
                str = uBundle1.getString("error_description");
             }
             try{
                if ((str1 = uBundle1.getString("error_code")) != null) {
                   i = Integer.parseInt(str1);
                label_00b0 :
                   if (ej4.Z(stringExtra) && (ej4.Z(str) && i == -1)) {
                      if (uBundle1.containsKey("access_token")) {
                         this.M(x, uBundle1, uBundle);
                      }else {
                         sz1.c().execute(new jj1(this, x, uBundle1, 2));
                      }
                   }else if(stringExtra != null && (co5.c(stringExtra, "access_denied") && !co5.c(stringExtra, "OAuthAccessDeniedException"))){
                      this.M(x, uBundle, new mz1());
                   }else if(i == 4201){
                      this.M(x, uBundle, new mz1());
                   }else {
                      this.M(x, uBundle, new tz1(new oz1(i, stringExtra, str), str));
                   }
                }
             }catch(java.lang.NumberFormatException e0){
             }
             i = -1;
             goto label_00b0 ;
          }
          return 1;
       }else {
          this.M(x, uBundle, new mz1());
          return b;
       }
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       super.writeToParcel(p0, p1);
       p0.writeString(this.v);
    }
    public final void y(JSONObject p0){
       p0.put("7_challenge", this.v);
    }
}
