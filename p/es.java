package p.es;
import p.vc6;
import java.lang.Object;
import android.content.Context;
import p.wc6;
import p.yy6;
import p.u44;
import p.a70;
import p.x61;
import p.i51;
import java.util.concurrent.atomic.AtomicReference;
import p.m07;
import org.json.JSONObject;
import java.lang.String;
import p.vh4;
import p.x12;
import java.lang.System;
import p.uc6;
import p.vj;
import android.view.ViewGroup;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import p.g;
import java.lang.Boolean;
import java.lang.Long;
import p.lx3;
import io.reactivex.rxjava3.core.Flowable;
import p.kz6;
import io.reactivex.rxjava3.core.Scheduler;
import p.cy3;
import java.lang.Class;
import p.ra;
import p.z11;
import p.u36;
import p.tm5;
import p.zq7;
import p.t55;
import p.ta3;
import p.fs;
import java.lang.Integer;
import p.kg4;
import java.lang.IllegalStateException;
import p.eu;
import p.v35;
import p.na5;
import p.ra5;
import p.en6;
import android.util.Log;
import java.lang.Throwable;
import java.util.concurrent.Executor;
import p.a28;
import android.content.SharedPreferences;
import p.vv7;
import p.if7;
import p.b7;
import p.o07;
import p.bu0;
import p.uv1;
import p.pv6;

public final class es implements vc6	// class@0014ef from classes.dex
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public void es(){
       super();
    }
    public void es(Context p0,wc6 p1,yy6 p2,u44 p3,a70 p4,x61 p5,i51 p6){
       super();
       this.h = new AtomicReference();
       this.i = new AtomicReference(new m07());
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       es th = this.h;
       JSONObject jSONObject = new JSONObject();
       vh4 ovh4 = new vh4(jSONObject.optInt("max_custom_exception_events", 8), 4);
       x12 ox12 = new x12(jSONObject.optBoolean("collect_reports", true));
       long l = (jSONObject.has("expires_at"))? jSONObject.optLong("expires_at"): System.currentTimeMillis() + 0x36ee80;
       uc6 l1 = new uc6(l, null, ovh4, ox12);
       th.set(l);
       return;
    }
    public void es(ViewGroup p0,View p1,Button p2,TextView p3,TextView p4,TextView p5,TextView p6,TextView p7,View p8){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       super();
    }
    public void es(g p0){
       super();
       this.d = p0.a;
       this.a = p0.b;
       this.b = p0.c;
       this.c = p0.t;
       this.e = p0.v;
       this.f = p0.w;
       this.i = Boolean.valueOf(p0.x);
       this.g = Long.valueOf(p0.y);
       this.h = Long.valueOf(p0.z);
    }
    public void es(lx3 p0,Flowable p1,kz6 p2,Scheduler p3,cy3 p4){
       super();
       this.f = new u44(24);
       this.g = new u44(24);
       p0.getClass();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void es(ra p0){
       super();
       this.b = this;
       this.a = p0;
       z11 oz11 = new z11(p0, 0);
       this.c = oz11;
       z11 oz111 = new z11(p0, 3);
       this.d = oz111;
       u36 ou36 = new u36(oz111, 1);
       this.e = ou36;
       oz111 = new z11(p0, 2);
       this.f = oz111;
       z11 oz112 = new z11(p0, 1);
       this.g = oz112;
       zq7 ozq7 = new zq7(oz11, ou36, oz111, oz112);
       this.h = ozq7;
       this.i = ta3.a(new t55(ozq7));
    }
    public final fs a(){
       String str = (this.a == null)? " arch": "";
       if (this.d == null) {
          str = str.concat(" model");
       }
       if (this.b == null) {
          str = kg4.l(str, " cores");
       }
       if (this.g == null) {
          str = kg4.l(str, " ram");
       }
       if (this.h == null) {
          str = kg4.l(str, " diskSpace");
       }
       if (this.i == null) {
          str = kg4.l(str, " simulator");
       }
       if (this.c == null) {
          str = kg4.l(str, " state");
       }
       if (this.e == null) {
          str = kg4.l(str, " manufacturer");
       }
       if (this.f == null) {
          str = kg4.l(str, " modelClass");
       }
       if (str.isEmpty()) {
          fs str1 = new fs(this.a.intValue(), this.d, this.b.intValue(), this.g.longValue(), this.h.longValue(), this.i.booleanValue(), this.c.intValue(), this.e, this.f);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final eu b(){
       String str = (this.a == null)? " handle": "";
       if (this.i == null) {
          str = str.concat(" loggingIn");
       }
       if (this.g == null) {
          str = kg4.l(str, " resendEnabledTimeMs");
       }
       if (this.h == null) {
          str = kg4.l(str, " challengeExpiredTimeMs");
       }
       if (str.isEmpty()) {
          eu str1 = new eu(this.d, this.a, this.b, this.c, this.e, this.f, this.i.booleanValue(), this.g.longValue(), this.h.longValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final uc6 c(int p0){
       JSONObject jSONObject;
       uc6 ouc6 = null;
       int i = 2;
       try{
          if (!en6.b(i, p0)) {
             if ((jSONObject = this.e.c()) != null) {
                uc6 ouc61 = this.c.C(jSONObject);
                jSONObject.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                this.d.getClass();
                long l = System.currentTimeMillis();
                if (!en6.b(3, p0)) {
                   p0 = ((ouc61.d - l) < 0)? 1: 0;
                   if (p0) {
                      Log.isLoggable("FirebaseCrashlytics", 3);
                   }
                }
                try{
                   Log.isLoggable("FirebaseCrashlytics", 3);
                   ouc6 = ouc61;
                }catch(java.lang.Exception e10){
                   ouc6 = ouc61;
                }
                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e10);
             }else {
                Log.isLoggable("FirebaseCrashlytics", 3);
             }
          }
          return ouc6;
       }catch(java.lang.Exception e10){
       }
    }
    public final a28 d(int p0,Executor p1){
       uc6 ouc6;
       if (!((this.a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(this.b.f) ^ 0x01)) && (ouc6 = this.c(p0)) != null) {
          this.h.set(ouc6);
          this.i.get().b(ouc6.a);
          return vv7.t(null);
       }else if((ouc6 = this.c(3)) != null){
          this.h.set(ouc6);
          this.i.get().b(ouc6.a);
       }
       es tg = this.g;
       m07 a = tg.h.a;
       i51 f = tg.f;
       _monitor_enter(f);
       m07 a1 = tg.g.a;
       _monitor_exit(f);
       m07 f1 = new m07();
       b7 uob7 = new b7(16, f1);
       a.getClass();
       mt7 a2 = o07.a;
       a.h(a2, uob7);
       a1.getClass();
       a1.h(a2, uob7);
       return f1.a.g(p1, new uv1(20, this));
    }
    public final void e(boolean p0){
       this.i = Boolean.valueOf(p0);
    }
}
