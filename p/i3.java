package p.i3;
import p.az5;
import p.wq3;
import p.pp2;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Date;
import java.util.HashSet;
import p.ur0;
import p.wm2;
import p.tm2;
import p.e3;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import p.a3;
import p.om2;
import p.fs2;
import p.f3;
import p.co5;
import p.h3;
import p.g3;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import p.eo5;
import p.um2;
import java.util.concurrent.Executor;
import p.sz1;
import java.lang.Void;
import android.os.AsyncTask;
import android.content.Intent;
import android.content.Context;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import java.lang.Class;
import android.os.Parcelable;
import org.json.JSONObject;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import p.ej4;
import android.app.AlarmManager;
import android.os.Build$VERSION;
import android.app.PendingIntent;

public final class i3	// class@00191c from classes.dex
{
    public final wq3 a;
    public final pp2 b;
    public a3 c;
    public final AtomicBoolean d;
    public Date e;
    public static final az5 f;
    public static i3 g;

    static {
       i3.f = new az5();
    }
    public void i3(wq3 p0,pp2 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.d = new AtomicBoolean(false);
       this.e = new Date(0);
    }
    public final void a(){
       i3 c;
       a3 b;
       i3 oi3 = this;
       if ((c = oi3.c) == null) {
          return;
       }
       if (!oi3.d.compareAndSet(false, true)) {
          return;
       }
       oi3.e = new Date();
       HashSet hashSet = new HashSet();
       HashSet hashSet1 = new HashSet();
       HashSet hashSet2 = new HashSet();
       AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
       ur0 our0 = new ur0();
       tm2[] otm2Array = new tm2[2];
       e3 uoe3 = v14;
       e3 uoe31 = v14;
       g3 tm2[] otm2Array1 = otm2Array;
       uoe3 = new e3(uAtomicBoole, hashSet, hashSet1, hashSet2, 0);
       Bundle uoe32 = new Bundle();
       String str = "fields";
       uoe32.putString(str, "permission,status");
       tm2 otm2 = az5.M(c, "me/permissions", uoe31);
       otm2.d = uoe32;
       fs2 a = fs2.a;
       otm2.k(a);
       otm2Array1[0] = otm2;
       f3 uof3 = new f3(false, our0);
       if ((b = c.B) == null) {
          b = "facebook";
       }
       h3 oh3 = (co5.c(b, "instagram"))? new h3(1): new h3(false);
       Bundle uBundle = new Bundle();
       uBundle.putString("grant_type", oh3.b);
       uBundle.putString("client_id", c.y);
       uBundle.putString(str, "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
       otm2 = az5.M(c, oh3.a, uof3);
       otm2.d = uBundle;
       otm2.k(a);
       otm2Array1[1] = otm2;
       wm2 owm2 = new wm2(otm2Array1);
       otm2Array1 = new g3(our0, c, uAtomicBoole, hashSet, hashSet1, hashSet2, this);
       wm2 t = owm2.t;
       if (!t.contains(otm2Array1)) {
          t.add(otm2Array1);
       }
       eo5.B(owm2);
       Void[] voidArray = new Void[false];
       new um2(owm2).executeOnExecutor(sz1.c(), voidArray);
       return;
    }
    public final void b(a3 p0,a3 p1){
       Intent intent = new Intent(sz1.a(), CurrentAccessTokenExpirationBroadcastReceiver.class);
       intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
       intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", p0);
       intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", p1);
       this.a.c(intent);
    }
    public final void c(a3 p0,boolean p1){
       i3 tb;
       a3 a;
       i3 tc = this.c;
       this.c = p0;
       this.d.set(false);
       this.e = new Date(0);
       if (p1) {
          String str = "com.facebook.AccessTokenManager.CachedAccessToken";
          tb = this.b;
          if (p0 != null) {
             try{
                tb.getClass();
                tb.a.edit().putString(str, p0.a().toString()).apply();
             }catch(org.json.JSONException e0){
             }
          }else {
             tb.a.edit().remove(str).apply();
             ej4.k(sz1.a());
          }
       }
       try{
          if (!ej4.c(e0, p0)) {
             this.b(e0, p0);
             Context uContext = sz1.a();
             a3 uoa3 = az5.D();
             AlarmManager systemServic = uContext.getSystemService("alarm");
             if (az5.J()) {
                tb = (uoa3 == null)? 0: uoa3.a;
                if (tb != null && systemServic != null) {
                   Intent intent = new Intent(uContext, CurrentAccessTokenExpirationBroadcastReceiver.class);
                   intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                   PendingIntent broadcast = (Build$VERSION.SDK_INT >= 23)? PendingIntent.getBroadcast(uContext, false, intent, 0x4000000): PendingIntent.getBroadcast(uContext, false, intent, false);
                   systemServic.set(1, uoa3.a.getTime(), broadcast);
                }
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
