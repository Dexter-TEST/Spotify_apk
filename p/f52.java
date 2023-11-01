package p.f52;
import p.g52;
import java.lang.Object;
import p.mc4;
import p.b52;
import p.q81;
import p.h71;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import p.d52;
import android.content.Context;
import p.fh5;
import p.jf7;
import p.z53;
import p.mo5;
import java.util.ArrayList;
import p.a28;
import p.m07;
import p.xi2;
import p.lu;
import p.i52;
import java.lang.Class;
import java.lang.String;
import java.net.URL;
import java.net.HttpURLConnection;
import java.lang.StringBuilder;
import java.net.URLConnection;
import p.wv;
import android.util.Log;
import p.nq5;
import java.lang.Long;
import p.y57;
import java.lang.Enum;
import p.t67;
import p.la5;
import p.h52;
import java.lang.System;
import p.w51;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p.vv7;
import p.em0;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import p.si4;
import android.text.TextUtils;
import android.content.SharedPreferences;
import org.json.JSONObject;
import p.pt;
import p.o11;
import p.qa3;
import java.util.Iterator;

public final class f52 implements g52	// class@00155f from classes.dex
{
    public final b52 a;
    public final d52 b;
    public final fh5 c;
    public final jf7 d;
    public final z53 e;
    public final mo5 f;
    public final Object g;
    public final ExecutorService h;
    public final ThreadPoolExecutor i;
    public String j;
    public final ArrayList k;
    public static final Object l;
    public static final mc4 m;

    static {
       f52.l = new Object();
       f52.m = new mc4(1);
    }
    public void f52(b52 p0,q81 p1,h71 p2){
       int i = this;
       b52 uob52 = p0;
       TimeUnit sECONDS = TimeUnit.SECONDS;
       mc4 m = f52.m;
       ThreadPoolExecutor v10 = new ThreadPoolExecutor(0, 1, 30, sECONDS, new LinkedBlockingQueue(), m);
       p0.a();
       super();
       i.g = new Object();
       i.k = new ArrayList();
       i.a = uob52;
       i.b = new d52(uob52.a, p1, p2);
       i.c = new fh5(uob52);
       i.d = new jf7();
       i.e = new z53(uob52);
       i.f = new mo5();
       i.h = v10;
       ThreadPoolExecutor uob521 = new ThreadPoolExecutor(0, 1, 30, sECONDS, new LinkedBlockingQueue(), m);
       i.i = uob52;
    }
    public final a28 a(){
       m07 om07 = new m07();
       f52 tg = this.g;
       _monitor_enter(tg);
       this.k.add(new xi2(om07));
       _monitor_exit(tg);
       return om07.a;
    }
    public final lu b(lu p0){
       int responseCode;
       wv owv;
       int i2;
       t67 ot67;
       nq5 onq5;
       f52 uof52 = this;
       lu olu = p0;
       f52 a = uof52.a;
       a.a();
       i52 a1 = a.c.a;
       a.a();
       i52 g = a.c.g;
       lu d = olu.d;
       f52 b = uof52.b;
       b.getClass();
       int i = 2;
       Object[] objArray = new Object[i];
       objArray[0] = g;
       objArray[1] = olu.a;
       URL uRL = d52.a(String.format("projects/%s/installations/%s/authTokens:generate", objArray));
       int i1 = 0;
       while (true) {
          if (i1 > 1) {
             throw new h52("Firebase Installations Service is unavailable. Please try again later.");
          }
          HttpURLConnection httpURLConne = b.c(uRL, a1);
          try{
             httpURLConne.setRequestMethod("POST");
             httpURLConne.addRequestProperty("Authorization", "".append("FIS_v2 ").append(d).toString());
             d52.h(httpURLConne);
             if ((responseCode = httpURLConne.getResponseCode()) == 200) {
                owv = d52.f(httpURLConne);
             }else {
                d52.b(httpURLConne, null, a1, g);
                int i3 = 6;
                if (responseCode != 401 && responseCode != 404) {
                   if (responseCode != 429 && (responseCode < 500 && responseCode < 600)) {
                      Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options \(API key, Project ID, Application ID\) when initializing Firebase.");
                      onq5 = new nq5(i3);
                      onq5.b = Long.valueOf(0);
                      onq5.c = y57.b;
                      owv = onq5.b();
                   }else {
                      i3 = 0;
                      i1 = i1 + 1;
                      httpURLConne.disconnect();
                   }
                }else {
                   onq5 = new nq5(i3);
                   onq5.b = Long.valueOf(0);
                   onq5.c = y57.c;
                   owv = onq5.b();
                }
             }
             httpURLConne.disconnect();
             if (i2 = owv.c.ordinal()) {
                if (i2 != 1) {
                   if (i2 == i) {
                      break ;
                   }else {
                      throw new h52("Firebase Installations Service is unavailable. Please try again later.");
                   }
                }else {
                   ot67 = new t67(olu, 0);
                   ot67.y = "BAD CONFIG";
                   ot67.g(la5.v);
                   return ot67.d();
                }
             }else {
                uof52.d.getClass();
                t67 ot671 = new t67(olu, 0);
                ot671.t = owv.a;
                ot671.w = Long.valueOf(owv.b);
                ot671.x = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
                return ot671.d();
             }
          }catch(java.io.IOException e0){
          }catch(java.io.IOException e0){
          }
       }
       uof52.i(null);
       ot67 = new t67(olu, 0);
       ot67.g(la5.b);
       return ot67.d();
    }
    public final a28 c(){
       f52 ta = this.a;
       ta.a();
       w51.j("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", ta.c.b);
       ta = this.a;
       ta.a();
       w51.j("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", ta.c.g);
       ta = this.a;
       ta.a();
       String str = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
       w51.j(str, ta.c.a);
       ta = this.a;
       ta.a();
       w51.d("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", ta.c.b.contains(":"));
       ta = this.a;
       ta.a();
       w51.d(str, jf7.b.matcher(ta.c.a).matches());
       _monitor_enter(this);
       ta = this.j;
       _monitor_exit(this);
       if (ta != null) {
          return vv7.t(ta);
       }
       this.h.execute(new em0(22, this));
       return this.a();
    }
    public final void d(lu p0){
       Object l = f52.l;
       _monitor_enter(l);
       f52 ta = this.a;
       ta.a();
       si4 osi4 = si4.a(ta.a);
       this.c.f(p0);
       if (osi4 != null) {
          osi4.e();
       }
       _monitor_exit(l);
       return;
    }
    public final String e(lu p0){
       String str;
       f52 ta = this.a;
       ta.a();
       if (!ta.b.equals("CHIME_ANDROID_SDK")) {
          ta = this.a;
          ta.a();
          if (!"[DEFAULT]".equals(ta.b)) {
          label_0029 :
             this.f.getClass();
             return mo5.a();
          }
       }
       int i = (p0.b == la5.a)? 1: 0;
       if (!i) {
          goto label_0029 ;
       }else {
          f52 te = this.e;
          z53 a = te.a;
          _monitor_enter(a);
          if ((str = te.a()) != null) {
             _monitor_exit(a);
          }else {
             str = te.b();
             _monitor_exit(a);
          }
          if (TextUtils.isEmpty(str)) {
             this.f.getClass();
             str = mo5.a();
          }
          return str;
       }
    }
    public final lu f(lu p0){
       String str1;
       f52 ta;
       i52 a2;
       lu a3;
       f52 ta1;
       i52 g;
       f52 ta2;
       i52 b;
       Object[] objArray;
       URL uRL;
       int i2;
       HttpURLConnection httpURLConne;
       int responseCode;
       pt opt;
       o11 oo11;
       lu a = p0.a;
       int i = 11;
       String str = null;
       if (a != null && a.length() == i) {
          f52 te = this.e;
          z53 a1 = te.a;
          _monitor_enter(a1);
          String[] c = z53.c;
          int i1 = 0;
          while (true) {
             if (i1 < 4) {
                if ((str1 = te.a.getString("|T|".append(te.b).append("|").append(c[i1]).toString(), str)) != null && !str1.isEmpty()) {
                   str = (str1.startsWith("{"))? new JSONObject(str1).getString("token"): str1;
                   _monitor_exit(a1);
                }else {
                   i1 = i1 + 1;
                }
             }else {
                _monitor_exit(a1);
             }
          }
          t67 ot67 = new t67(p0, 0);
          ot67.y = "BAD CONFIG";
          ot67.g(la5.v);
          return ot67.d();
       }
    }
    public final void g(){
       f52 tg = this.g;
       _monitor_enter(tg);
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().getClass();
       }
       _monitor_exit(tg);
       return;
    }
    public final void h(lu p0){
       f52 tg = this.g;
       _monitor_enter(tg);
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          xi2 oxi2 = iterator.next();
          oxi2.getClass();
          lu b = p0.b;
          int i = 1;
          int i1 = (b == la5.c)? 1: 0;
          if (!i1) {
             i1 = (b == la5.t)? 1: 0;
             if (!i1) {
                i1 = (b == la5.v)? 1: 0;
                if (!i1) {
                   i = 0;
                label_0041 :
                   if (i) {
                      iterator.remove();
                   }
                }
             }
          }
          oxi2.a.b(p0.a);
          goto label_0041 ;
       }
       _monitor_exit(tg);
       return;
    }
    public synchronized final void i(String p0){
       this.j = p0;
    }
}
