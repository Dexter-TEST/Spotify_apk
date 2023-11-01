package p.sm7;
import p.mu3;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ht3;
import p.et3;
import android.os.Bundle;
import java.util.Collection;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import android.os.BaseBundle;
import p.o61;
import p.a3;
import p.az5;
import androidx.fragment.app.k;
import android.content.Context;
import p.sz1;
import android.content.SharedPreferences;
import p.ej4;
import java.lang.System;
import p.me7;
import p.j3;
import p.ny1;
import java.util.Set;
import p.dt3;
import p.yp;
import p.gt3;
import android.webkit.CookieSyncManager;
import android.content.SharedPreferences$Editor;
import java.lang.Throwable;
import p.mz1;
import p.tz1;
import p.oz1;

public abstract class sm7 extends mu3	// class@00265c from classes.dex
{
    public String c;

    public void sm7(Parcel p0){
       co5.o(p0, "source");
       super(p0);
    }
    public void sm7(ht3 p0){
       super(p0);
    }
    public final Bundle D(et3 p0){
       String str;
       k ok;
       k ok1;
       Bundle uBundle = new Bundle();
       et3 b = p0.b;
       int i = 0;
       o61 b1 = (b != null && !b.isEmpty())? 0: 1;
       if (!b) {
          str = TextUtils.join(",", p0.b);
          String str1 = "scope";
          uBundle.putString(str1, str);
          this.a(str, str1);
       }
       if ((b = p0.c) == null) {
          b1 = o61.b;
       }
       uBundle.putString("default_audience", b1.a);
       uBundle.putString("state", this.c(p0.v));
       a3 uoa3 = ((uoa3 = az5.D()) == null)? null: uoa3.v;
       str = "0";
       String str2 = "access_token";
       if (uoa3 != null) {
          if ((ok = this.d().e()) == null) {
             ok = sz1.a();
          }
          if (co5.c(uoa3, ok.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", i).getString("TOKEN", ""))) {
             uBundle.putString(str2, uoa3);
             this.a("1", str2);
          label_008c :
             uBundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
             if (me7.a()) {
                str = "1";
             }
             uBundle.putString("ies", str);
             return uBundle;
          }
       }
       if ((ok1 = this.d().e()) != null) {
          ej4.k(ok1);
       }
       this.a(str, str2);
       goto label_008c ;
    }
    public abstract j3 L();
    public final void M(et3 p0,Bundle p1,ny1 p2){
       gt3 ogt3;
       k ok;
       String str2;
       ht3 oht3 = this.d();
       this.c = null;
       if (p1 != null) {
          String str = "e2e";
          if (p1.containsKey(str)) {
             this.c = p1.getString(str);
          }
          try{
             a3 uoa3 = dt3.i(p0.b, p1, this.L(), p0.t);
             ogt3 = dt3.l(oht3.x, uoa3, dt3.j(p1, p0.F));
             if (oht3.e() != null) {
                try{
                   CookieSyncManager.createInstance(oht3.e()).sync();
                }catch(java.lang.Exception e0){
                }
                if (uoa3 != null) {
                   a3 v = uoa3.v;
                   if ((ok = this.d().e()) == null) {
                      ok = sz1.a();
                   }
                   ok.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", v).apply();
                }
             }
          }catch(p.ny1 e5){
             ogt3 = dt3.m(oht3.x, null, e5.getMessage(), null);
          }
       }else if(p2 instanceof mz1){
          ogt3 = dt3.k(oht3.x, "User canceled log in.");
       }else {
          this.c = null;
          String str1 = (p2 == null)? null: p2.getMessage();
          if (p2 instanceof tz1) {
             tz1 a = p2.a;
             str2 = String.valueOf(a.b);
             str1 = a.toString();
          }else {
             str2 = null;
          }
          ogt3 = dt3.m(oht3.x, null, str1, str2);
       }
       if (!ej4.Z(this.c)) {
          this.m(this.c);
       }
       oht3.d(ogt3);
       return;
    }
}
