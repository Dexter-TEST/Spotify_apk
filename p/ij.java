package p.ij;
import java.lang.Runnable;
import java.lang.Object;
import p.jj;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import p.am3;
import java.lang.String;
import p.co5;
import p.vq0;
import p.cm3;
import p.pc6;
import p.d3;
import p.ki;
import p.ni;
import p.yb6;
import p.u44;
import p.aj;
import p.zi;
import p.b3;
import p.bb2;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import p.oi;
import p.ka5;
import p.mi;
import java.util.List;
import p.xo7;
import p.ot;
import java.lang.Class;
import p.ab3;
import p.vo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInstallReferrerNonAuth;
import p.xe7;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.xs3;
import p.xp;
import p.bt3;
import p.hu3;
import android.os.Bundle;
import p.dc3;
import p.ej;
import p.h22;
import p.v12;
import p.t12;
import p.gr7;
import p.u12;
import p.s12;
import p.e22;
import p.c25;
import p.ap5;
import p.ye7;
import p.cu5;
import p.eu5;
import p.t83;
import java.util.ArrayList;
import java.util.Collection;
import p.ji7;
import p.oe0;
import java.nio.charset.Charset;
import p.ej4;
import p.a3;
import p.az5;
import p.sz1;
import p.tm2;
import java.util.Locale;
import java.util.Arrays;
import org.json.JSONObject;
import p.om2;
import android.os.BaseBundle;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import p.ai0;
import java.util.UUID;
import java.lang.NullPointerException;
import p.ri;
import p.xm2;
import p.fs3;
import p.ns3;
import p.mj7;
import java.util.concurrent.atomic.AtomicBoolean;
import android.util.Log;
import java.lang.Throwable;
import java.util.TimerTask;
import java.util.Timer;
import p.t6;
import java.lang.Double;
import p.bj;
import java.lang.Integer;
import p.yi;
import p.dj0;
import android.view.View;
import p.ha4;
import android.widget.EditText;
import android.text.Editable;
import java.lang.CharSequence;
import p.av6;
import java.util.Set;
import java.util.HashMap;
import p.gi7;
import android.content.res.Resources;
import p.ts5;
import java.util.Iterator;
import p.t94;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import p.ox7;
import android.view.ViewParent;
import android.view.ViewGroup;
import p.ee7;
import java.util.Map$Entry;
import android.util.Patterns;
import java.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashSet;
import java.util.AbstractSet;
import p.uk;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.concurrent.Executor;
import p.de7;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import p.wm2;
import android.util.Pair;
import p.vm2;
import p.g3;
import p.i3;
import p.ur0;
import java.lang.Long;
import java.util.Date;
import p.j3;
import p.vn;
import p.dj;
import p.cj;
import java.lang.System;
import p.ny1;
import java.lang.Exception;
import p.tp2;
import p.nq7;
import p.x0;
import p.q0;
import p.fm3;
import p.tq0;
import java.lang.Iterable;
import p.eq0;
import p.fq7;
import p.ur7;
import java.util.concurrent.Future;
import p.ae4;
import p.yd4;
import p.vc3;
import p.a26;
import p.y16;
import p.tc3;
import p.uc3;
import p.xd4;
import androidx.profileinstaller.ProfileInstallerInitializer;
import android.os.Build$VERSION;
import android.os.Looper;
import android.os.Handler;
import p.tl5;
import java.util.Random;
import java.lang.Math;
import p.ql5;
import p.ll7;
import p.re2;
import p.uw5;
import android.graphics.Typeface;
import p.eq3;
import p.tv;
import android.content.Intent;
import p.xj0;
import java.io.File;
import p.n6;

public final class ij implements Runnable	// class@0019aa from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void ij(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public void ij(jj p0,Runnable p1){
       this.a = 6;
       super();
       this.c = p1;
       this.b = p0;
    }
    private final void a(){
       ij tb = this.b;
       ij tc = this.c;
       co5.o(tb, "this$0");
       co5.o(tc, "$innerFuture");
       ConstraintTrackingWorker w = tb.w;
       _monitor_enter(w);
       if (tb.x != null) {
          ConstraintTrackingWorker y = tb.y;
          co5.l(y, "future");
          y.i(new cm3());
       }else {
          tb.y.k(tc);
       }
       _monitor_exit(w);
       return;
    }
    private final void b(){
       yb6 oyb6;
       ij tb = this.b;
       ij tc = this.c;
       co5.o(tb, "$accessTokenAppId");
       co5.o(tc, "$appEvent");
       u44 a = ni.a;
       _monitor_enter(a);
       if ((oyb6 = a.z(tb)) == null) {
       }else {
          oyb6.a(tc);
       }
       _monitor_exit(a);
       if (aj.b.o() != zi.b && ni.a.y() > 100) {
          ni.a(bb2.c);
       }else if(ni.c == null){
          ni.c = ni.b.schedule(ni.d, 15, TimeUnit.SECONDS);
       }
       return;
    }
    private final void c(){
       ij tb = this.b;
       ij tc = this.c;
       co5.o(tb, "$accessTokenAppId");
       co5.o(tc, "$appEvents");
       _monitor_enter(oi.class);
       ka5 oka5 = mi.F();
       oka5.a(tb, tc.c());
       mi.I(oka5);
       _monitor_exit(oi.class);
    }
    public final void run(){
       ij oij1;
       ij b;
       Iterator iterator;
       uc3 value;
       int i4;
       String str1;
       String str2;
       String str3;
       g3 a;
       g3 f;
       i3 d2;
       ur0 b3;
       ur0 w;
       g3 og3;
       g3 og31;
       a3 z;
       Date uDate1;
       a3 z1;
       int i7;
       object oobject1;
       ij c3;
       String str4;
       CharSequence tag;
       int i9;
       t94 ot94;
       Iterator iterator3;
       Pattern pattern;
       Object[] objArray1;
       String str8;
       String str9;
       Pattern pattern2;
       ji7 c4;
       tm2 d3;
       PackageInfo versionName;
       xm2 b5;
       ij oij = this;
       int i = 5;
       int i1 = 10;
       String str = null;
       int i2 = 0;
       int i3 = 1;
       switch (oij.a){
           case 0:
             oij1 = oij.b;
             oij1.getClass();
             oij.c.run();
             oij1.b();
             return;
           case 1:
             oij.b.q(oij.c);
             return;
           case 3:
             oij1 = oij.c;
             co5.o(oij1, "$violation");
             Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in "+oij.b, oij1);
             throw oij1;
           case 4:
             oij1 = oij.c;
             oij.b.getClass();
             Handler handler = (Build$VERSION.SDK_INT >= 28)? tl5.a(Looper.getMainLooper()): new Handler(Looper.getMainLooper());
             handler.postDelayed(new ql5(oij1, 0), (long)(new Random().nextInt(Math.max(1000, 1)) + 5000));
             return;
             break;
           case 5:
             b = oij.b;
             oij1 = oij.c;
             co5.o(b, "this$0");
             co5.o(oij1, "$tables");
             ae4 d = b.d;
             String[] stringArray = Arrays.copyOf(oij1, oij1.length);
             d.getClass();
             co5.o(stringArray, "tables");
             vc3 j = d.j;
             _monitor_enter(j);
             iterator = d.j.iterator();
          label_0989 :
             Iterator iterator1 = iterator;
             if (iterator1.hasNext()) {
                Map$Entry uEntry = iterator1.next();
                co5.l(uEntry, "\(observer, wrapper\)");
                tc3 key = uEntry.getKey();
                value = uEntry.getValue();
                switch (key.b){
                    case 0:
                      i4 = 1;
                      break;
                    default:
                      i4 = 0;
                }
                if (!i4) {
                   value.b(stringArray);
                   goto label_0989 ;
                }else {
                   goto label_0989 ;
                }
             }else {
                _monitor_exit(j);
                return;
             }
             break;
           case 6:
             b = oij.c;
             oij1 = oij.b;
             co5.o(b, "$command");
             co5.o(oij1, "this$0");
             b.run();
             oij1.b();
             return;
           case 7:
             oij1 = oij.c;
             if (oij.b.G.a instanceof q0) {
                oij1.cancel(true);
             }
             return;
             break;
           case 8:
             b = oij.b;
             oij1 = oij.c;
             co5.o(b, "$listenersList");
             co5.o(oij1, "this$0");
             iterator = b.iterator();
             while (iterator.hasNext()) {
                eq0 uoeq0 = iterator.next();
                tq0 e = oij1.e;
                uoeq0.d = e;
                uoeq0.d(uoeq0.e, e);
             }
             return;
             break;
           case 9:
             b = oij.b;
             oij1 = oij.c;
             if (!b.a.a instanceof q0) {
                oij1.k(b.t.a());
             }else {
                oij1.cancel(true);
             }
             return;
             break;
           case 10:
             this.a();
             return;
           case 11:
             b = oij.b;
             tp2.v(oij.c);
             co5.o(b, "this$0");
             b.a();
             return;
           case 12:
             b = oij.b;
             oij1 = oij.c;
             co5.o(oij1, "$applicationId");
             str1 = "applicationContext";
             try{
                co5.l(b, str1);
                vn ovn = mj7.d(b);
                SharedPreferences sharedPrefer = b.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                str2 = co5.K("ping", oij1);
                long longx = sharedPrefer.getLong(str2, 0);
                try{
                   Object[] objArray = new Object[]{oij1};
                   str3 = String.format("%s/activities", Arrays.copyOf(objArray, 1));
                   co5.l(str3, "java.lang.String.format\(format, *args\)");
                   sz1.q.getClass();
                   tm2 otm2 = az5.N(null, str3, dj.a(cj.a, ovn, aj.b.n(b), sz1.f(b), b), null);
                   if (!(longx) && otm2.c().c == null) {
                      SharedPreferences$Editor uEditor = sharedPrefer.edit();
                      uEditor.putLong(str2, System.currentTimeMillis());
                      uEditor.apply();
                   }
                   return;
                }catch(org.json.JSONException e0){
                   throw new ny1("An error occurred while publishing install.", e0);
                }
             }catch(java.lang.Exception e0){
             }
             break;
           case 13:
             b = oij.b;
             oij1 = oij.c;
             co5.o(b, "$callbacks");
             co5.o(oij1, "$requests");
             iterator = b.iterator();
             while (iterator.hasNext()) {
                Pair pair = iterator.next();
                pair = pair.second;
                co5.l(pair, "pair.second");
                pair.first.a(pair);
             }
             iterator = oij1.t.iterator();
             while (iterator.hasNext()) {
                vm2 ovm2 = iterator.next();
                g3 b2 = ovm2.b;
                a = ovm2.a;
                co5.o(a, "$refreshResult");
                g3 c = ovm2.c;
                co5.o(c, "$permissionsCallSucceeded");
                g3 d1 = ovm2.d;
                co5.o(d1, "$permissions");
                g3 e1 = ovm2.e;
                co5.o(e1, "$declinedPermissions");
                f = ovm2.f;
                co5.o(f, "$expiredPermissions");
                g3 g = ovm2.g;
                co5.o(g, "this$0");
                d2 = g.d;
                b3 = a.b;
                ur0 c1 = a.c;
                ur0 v = a.v;
                w = a.w;
                az5 f1 = i3.f;
                if (f1.F().c != null) {
                   i3 c2 = ((c2 = f1.F().c) == null)? 0: c2.z;
                   if (c2 == b2.z) {
                      if (!c.get() && (b3 == null && c1 == null)) {
                         d2.set(false);
                      }else {
                         a3 a1 = b2.a;
                         if (a.c != null) {
                            long l = (long)a.c * 1000;
                            a1 = new Date(l);
                         }else if(a.t != null){
                            og3 = d1;
                            og31 = e1;
                            long l2 = (long)a.t * 1000;
                            l2 = l2 + new Date().getTime();
                            a1 = new Date(l2);
                         label_07cd :
                            a3 uoa3 = a1;
                            if (b3 == null) {
                               b3 = b2.v;
                            }
                            ur0 our0 = b3;
                            a3 y = b2.y;
                            z = b2.z;
                            g3 og32 = (c.get())? og3: b2.b;
                            g3 og33 = (c.get())? og31: b2.c;
                            if (!c.get()) {
                               f = b2.t;
                            }
                            g3 og34 = f;
                            a3 w1 = b2.w;
                            Date uDate = new Date();
                            if (v != null) {
                               long l1 = v.longValue() * 1000;
                               uDate1 = new Date(l1);
                            }else {
                               uDate1 = b2.A;
                            }
                            Date uDate2 = uDate1;
                            if (w == null) {
                               w = b2.B;
                            }
                            a3 a2 = new a3(our0, y, z, og32, og33, og34, w1, uoa3, uDate, uDate2, w);
                            f1.F().c(a, true);
                         }
                         og3 = d1;
                         og31 = e1;
                         goto label_07cd ;
                      }
                   }
                }
                d2.set(false);
             }
             return;
             break;
           case 15:
             this.b();
             return;
           case 16:
             this.c();
             return;
           case 17:
             b = oij.b;
             oij1 = oij.c;
             co5.o(b, "$context");
             co5.o(oij1, "$logger");
             Bundle uBundle = new Bundle();
             String[] stringArray1 = new String[]{"com.facebook.core.Core","com.facebook.login.Login","com.facebook.share.Share","com.facebook.places.Places","com.facebook.messenger.Messenger","com.facebook.applinks.AppLinks","com.facebook.marketing.Marketing","com.facebook.gamingservices.GamingServices","com.facebook.all.All","com.android.billingclient.api.BillingClient","com.android.vending.billing.IInAppBillingService"};
             String[] stringArray2 = new String[]{"core_lib_included","login_lib_included","share_lib_included","places_lib_included","messenger_lib_included","applinks_lib_included","marketing_lib_included","gamingservices_lib_included","all_lib_included","billing_client_lib_included","billing_service_lib_included"};
             int i5 = 0;
             int i6 = 0;
             while (true) {
                i7 = i5 + 1;
                object oobject = stringArray1[i5];
                oobject1 = stringArray2[i5];
                break ;
             }
             try{
                Class.forName(oobject);
                int i8 = 1;
                uBundle.putInt(oobject1, i8);
                i5 = i8 << i5;
                i6 = i6 | i5;
             }catch(java.lang.ClassNotFoundException e0){
             }
             if (i7 > i1) {
                SharedPreferences sharedPrefer1 = e0.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPrefer1.getInt("kitsBitmask", 0) != i6) {
                   sharedPrefer1.edit().putInt("kitsBitmask", i6).apply();
                   oij1.b("fb_sdk_initialize", uBundle);
                }
                return;
             }else {
                i5 = i7;
             }
             break;
           case 18:
             b = oij.b;
             c3 = oij.c;
             co5.o(b, "$view");
             co5.o(c3, "this$0");
             if (b instanceof EditText) {
                if ((str4 = b.getText().toString()) != null) {
                   if ((str4 = av6.K0(str4).toString()) != null) {
                      str4 = str4.toLowerCase();
                      co5.l(str4, "\(this as java.lang.String\).toLowerCase\(\)");
                      oobject1 = (!str4.length())? 1: 0;
                      if (!oobject1) {
                         ha4 a3 = c3.a;
                         if (!a3.contains(str4)) {
                            w = 100;
                            if (str4.length() <= w) {
                               a3.add(str4);
                               HashMap hashMap = new HashMap();
                               ArrayList uArrayList = new ArrayList();
                               uArrayList.add(gi7.g(b));
                               if ((tag = b.getTag()) != null) {
                                  uArrayList.add(tag.toString());
                               }
                               if ((tag = b.getContentDescription()) != null) {
                                  uArrayList.add(tag.toString());
                               }
                               try{
                                  if (b.getId() != -1) {
                                     String resourceName = b.getResources().getResourceName(b.getId());
                                     co5.l(resourceName, "resourceName");
                                     String[] stringArray4 = new String[i2];
                                     if ((objArray1 = new ts5("/").a(resourceName).toArray(stringArray4)) != null) {
                                        if (objArray1.length == 2) {
                                           uArrayList.add(objArray1[i3]);
                                        }
                                     }else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                     }
                                  }
                                  ArrayList uArrayList1 = new ArrayList();
                                  Iterator iterator2 = uArrayList.iterator();
                                  while (iterator2.hasNext()) {
                                     String str5 = iterator2.next();
                                     i9 = (str5.length() > 0)? 1: 0;
                                     if (i9 && str5.length() <= w) {
                                        str5 = str5.toLowerCase();
                                        co5.l(str5, "\(this as java.lang.String\).toLowerCase\(\)");
                                        uArrayList1.add(str5);
                                     }
                                  }
                                  iterator2 = new HashSet(t94.d).iterator();
                                  ij oij2 = e0;
                                  ArrayList uArrayList2 = str;
                                  while (true) {
                                     str = "nativePattern.matcher\(in…).replaceAll\(replacement\)";
                                     str3 = "";
                                     str2 = "compile\(pattern\)";
                                     if (iterator2.hasNext()) {
                                        ot94 = iterator2.next();
                                        iterator3 = iterator2;
                                        if (co5.c("r2", ot94.a)) {
                                           pattern = Pattern.compile("[^\\d.]");
                                           co5.l(pattern, str2);
                                           str3 = pattern.matcher(str4).replaceAll(str3);
                                           co5.l(str3, str);
                                        }else {
                                           str3 = str4;
                                        }
                                        t94 b4 = ot94.b;
                                        pattern = (b4.length() > 0)? 1: 0;
                                        if (pattern) {
                                           Pattern pattern1 = Pattern.compile(b4);
                                           co5.l(pattern1, str2);
                                           if (pattern1.matcher(str3).matches()) {
                                           label_0416 :
                                              t94 a4 = ot94.a;
                                              if (ox7.D(uArrayList1, new ArrayList(ot94.c))) {
                                                 b3.d(hashMap, a4, str3);
                                              }else if(uArrayList2 == null){
                                                 ArrayList uArrayList3 = new ArrayList();
                                                 ViewParent parent = e0.getParent();
                                                 if (parent instanceof ViewGroup) {
                                                 }else {
                                                    parent = null;
                                                 }
                                                 if (parent != null) {
                                                    Iterator iterator4 = gi7.a(parent).iterator();
                                                    while (iterator4.hasNext()) {
                                                       View view = iterator4.next();
                                                       if (oij2 != view) {
                                                          uArrayList3.addAll(ox7.q(view));
                                                       }
                                                       oij2 = e0;
                                                    }
                                                 }
                                                 uArrayList2 = uArrayList3;
                                              }
                                              if (ox7.D(uArrayList2, new ArrayList(ot94.c))) {
                                                 b3.d(hashMap, a4, str3);
                                              }
                                              oij2 = e0;
                                           }
                                        }else {
                                           goto label_0416 ;
                                        }
                                        iterator2 = iterator3;
                                        pattern = 1;
                                     }else if(!ee7.c.get()){
                                        ee7.a.a();
                                     }
                                     iterator = hashMap.entrySet().iterator();
                                     while (true) {
                                        ConcurrentHashMap e2 = ee7.e;
                                        if (iterator.hasNext()) {
                                           Map$Entry uEntry1 = iterator.next();
                                           str4 = uEntry1.getKey();
                                           str1 = uEntry1.getValue();
                                           int i10 = str1.length() - 1;
                                           i4 = 0;
                                           uArrayList1 = 0;
                                           while (true) {
                                              int i11 = 32;
                                              if (i4 <= i10) {
                                                 i9 = (!uArrayList1)? i4: i10;
                                                 ot94 = (co5.r(str1.charAt(i9), i11) <= 0)? 1: 0;
                                                 if (!uArrayList1) {
                                                    if (!ot94) {
                                                       uArrayList1 = 1;
                                                    }else {
                                                       i4 = i4 + 1;
                                                    }
                                                 }else if(!ot94){
                                                 label_04d7 :
                                                    i10 = i10 + 1;
                                                    str1 = str1.subSequence(i4, i10).toString();
                                                    i10 = str1.length() - 1;
                                                    i4 = 0;
                                                    uArrayList1 = 0;
                                                    while (true) {
                                                       if (i4 <= i10) {
                                                          i9 = (!uArrayList1)? i4: i10;
                                                          ot94 = (co5.r(str1.charAt(i9), i11) <= 0)? 1: 0;
                                                          if (!uArrayList1) {
                                                             if (!ot94) {
                                                                uArrayList1 = 1;
                                                             }else {
                                                                i4 = i4 + 1;
                                                                continue ;
                                                             }
                                                          }else if(!ot94){
                                                          label_050c :
                                                             i10 = i10 + 1;
                                                             if ((str1 = str1.subSequence(i4, i10).toString()) != null) {
                                                                str1 = str1.toLowerCase();
                                                                co5.l(str1, "\(this as java.lang.String\).toLowerCase\(\)");
                                                                String str6 = "ee7";
                                                                if (co5.c("em", str4)) {
                                                                   if (!Patterns.EMAIL_ADDRESS.matcher(str1).matches()) {
                                                                      Log.e(str6, "Setting email failure: this is not a valid email address");
                                                                   label_058f :
                                                                      str1 = str3;
                                                                   }
                                                                }else if(co5.c("ph", str4)){
                                                                   pattern2 = Pattern.compile("[^0-9]");
                                                                   co5.l(pattern2, str2);
                                                                   str1 = pattern2.matcher(str1).replaceAll(str3);
                                                                   co5.l(str1, str);
                                                                }else if(co5.c("ge", str4)){
                                                                   pattern2 = (str1.length() > 0)? 1: 0;
                                                                   if (pattern2) {
                                                                      str1 = str1.substring(0, 1);
                                                                      co5.l(str1, "\(this as java.lang.Strin…ing\(startIndex, endIndex\)");
                                                                   }else {
                                                                      str1 = str3;
                                                                   }
                                                                   if (!co5.c("f", str1) && !co5.c("m", str1)) {
                                                                      Log.e(str6, "Setting gender failure: the supported value for gender is f or m");
                                                                      goto label_058f ;
                                                                   }
                                                                }
                                                                str1 = ej4.O0(str1);
                                                                if (e2.containsKey(str4)) {
                                                                   String str7 = e2.get(str4);
                                                                   str6 = ",";
                                                                   if (str7 == null) {
                                                                      objArray1 = null;
                                                                      i11 = 0;
                                                                   }else {
                                                                      i11 = 0;
                                                                      String[] stringArray3 = new String[i11];
                                                                      if ((objArray1 = new ts5(str6).a(str7).toArray(stringArray3)) != null) {
                                                                      }else {
                                                                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                                                      }
                                                                   }
                                                                   if (objArray1 == null) {
                                                                      objArray1 = new String[i11];
                                                                   }
                                                                   Object[] objArray2 = Arrays.copyOf(objArray1, objArray1.length);
                                                                   co5.o(objArray2, "elements");
                                                                   iterator3 = iterator;
                                                                   LinkedHashSet linkedHashSe = new LinkedHashSet(xe7.F(objArray2.length));
                                                                   uk.s0(linkedHashSe, objArray2);
                                                                   if (!linkedHashSe.contains(str1)) {
                                                                      str8 = "";
                                                                      objArray2 = (!objArray1.length)? 1: 0;
                                                                      if (objArray2) {
                                                                         str8 = str8.append(str1);
                                                                         str9 = str3;
                                                                         d2 = 5;
                                                                      }else {
                                                                         str9 = str3;
                                                                         d2 = 5;
                                                                         if (objArray1.length < d2) {
                                                                            str8 = str8.append(str7).append(str6).append(str1);
                                                                         }else {
                                                                            i10 = 1;
                                                                            while (true) {
                                                                               i11 = i10 + 1;
                                                                               str8 = str8.append(objArray1[i10]).append(str6);
                                                                               if (i11 >= d2) {
                                                                                  break ;
                                                                               }else {
                                                                                  i10 = i11;
                                                                               }
                                                                            }
                                                                            str8 = str8.append(str1);
                                                                            linkedHashSe.remove(objArray1[0]);
                                                                         }
                                                                      }
                                                                      e2.put(str4, str8.toString());
                                                                   }
                                                                }else {
                                                                   iterator3 = iterator;
                                                                   str9 = str3;
                                                                   e2.put(str4, str1);
                                                                }
                                                                iterator = iterator3;
                                                                str3 = str9;
                                                             }else {
                                                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                             }
                                                          }else {
                                                             i10 = i10 - 1;
                                                             continue ;
                                                          }
                                                       }else {
                                                          goto label_050c ;
                                                       }
                                                    }
                                                 }else {
                                                    i10 = i10 - 1;
                                                 }
                                              }else {
                                                 goto label_04d7 ;
                                              }
                                           }
                                        }else {
                                           sz1.c().execute(new de7(0, "com.facebook.appevents.UserDataStore.internalUserData", ej4.f0(e2)));
                                           break ;
                                        }
                                     }
                                  }
                               }catch(android.content.res.Resources$NotFoundException e0){
                               }
                            }
                         }
                      }
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                   }
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
             }
             return;
             break;
           case 19:
             b = oij.b;
             c3 = oij.c;
             co5.o(c3, "$processedEvents");
             if (!dj0.f0(yi.a, b) && dj0.f0(yi.b, b)) {
                if (yi.e >= i) {
                   yi.b().clear();
                   yi.e = i2;
                }else {
                   yi.b().addAll(i2, c3);
                   yi.e = yi.e + i3;
                }
             }
             return;
             break;
           case 20:
             c3 = oij.b;
             ij oij3 = oij.c;
             co5.o(c3, "$eventName");
             co5.o(oij3, "$parameters");
             aj a5 = new aj(sz1.a()).a;
             a5.getClass();
             a5.a(c3, null, oij3, false, t6.a());
             return;
           case 21:
             b = oij.b;
             ij oij4 = oij.c;
             co5.o(b, "this$0");
             str3 = "$indexingTask";
             try{
                co5.o(oij4, str3);
                if ((c4 = b.c) != null) {
                   c4.cancel();
                }
                b.d = str;
                Timer timer = new Timer();
                timer.scheduleAtFixedRate(oij4, 0, 1000);
                b.c = timer;
             }catch(java.lang.Exception e0){
                Log.e(ji7.e, "Error scheduling indexing job", e0);
             }
             return;
             break;
           case 22:
             try{
                b = oij.b;
                oij1 = oij.c;
                co5.o(b, "$tree");
                co5.o(oij1, "this$0");
                byte[] bytes = b.getBytes(oe0.a);
                co5.l(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
                str1 = ej4.S("MD5", bytes);
                z = az5.D();
                if (str1 == null || !co5.c(str1, oij1.d)) {
                   Object[] objArray3 = new Object[i3];
                   objArray3[i2] = sz1.b();
                   str4 = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(objArray3, i3));
                   co5.l(str4, "java.lang.String.format\(locale, format, *args\)");
                   tm2 otm21 = az5.N(z, str4, str, str);
                   if ((d3 = otm21.d) == null) {
                      d3 = new Bundle();
                   }
                   d3.putString("tree", b);
                   Context uContext = sz1.a();
                   try{
                      versionName = uContext.getPackageManager().getPackageInfo(uContext.getPackageName(), i2).versionName;
                      co5.l(versionName, "{\n      val packageInfo = context.packageManager.getPackageInfo\(context.packageName, 0\)\n      packageInfo.versionName\n    }");
                   }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                      versionName = "";
                   }
                   d3.putString("app_version", versionName);
                   d3.putString("platform", "android");
                   str2 = "app_indexing";
                   d3.putString("request_type", str2);
                   if (co5.c(str2, str2)) {
                      if (ai0.d == null) {
                         ai0.d = UUID.randomUUID().toString();
                      }
                      if ((str8 = ai0.d) != null) {
                         d3.putString("device_session_id", str8);
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }
                   }
                   otm21.d = d3;
                   otm21.j(new ri(i3));
                   str8 = "is_app_indexing_enabled";
                   str2 = ji7.e;
                   xm2 oxm2 = otm21.c();
                   if ((b5 = oxm2.b) != null) {
                      if (co5.c("true", b5.optString("success"))) {
                         mj7.j(ns3.t, str2, "Successfully send UI component tree to server");
                         oij1.d = str1;
                      }
                      if (b5.has(str8)) {
                         ai0.f.set(b5.getBoolean(str8));
                      }
                   }else {
                      Log.e(str2, co5.K(oxm2.c, "Error sending UI component tree to Facebook: "));
                   }
                }
             }catch(org.json.JSONException e0){
                Log.e(str2, "Error decoding server response.", e0);
             }
             return;
             break;
           case 23:
             b = oij.b;
             oij1 = oij.c;
             co5.o(b, "this$0");
             co5.o(oij1, "$queryPurchaseHistoryRunnable");
             b.a(new ArrayList(b.r), oij1);
             return;
           case 24:
             b = oij.b;
             oij1 = oij.c;
             co5.o(b, "$applicationId");
             co5.o(oij1, "$event");
             ap5.B(cu5.c, b, ye7.J(oij1));
             return;
           case 25:
             oij.b.getClass();
             e22.c(new u12(new gr7(8), t12.y));
             e22.c(new u12(new gr7(9), t12.x));
             e22.c(new u12(new gr7(i1), t12.z));
             e22.c(new u12(new gr7(11), t12.D));
             e22.c(new u12(new gr7(12), t12.G));
             e22.c(new u12(new gr7(13), t12.w));
             return;
           case 26:
             b = oij.b;
             oij1 = oij.c;
             co5.o(b, "this$0");
             co5.o(oij1, "$bundle");
             b.b.a(oij1, "fb_mobile_login_heartbeat");
             return;
           case 27:
             oij.b.a.d(oij.c);
             return;
           case 28:
             b = oij.b;
             b.getClass();
             xo7 v1 = b.v;
             v1.getClass();
             vo3 ovo3 = LiteInstallReferrerNonAuth.h();
             ovo3.c(xe7.J(oij.c.a));
             ovo3.d();
             v1.a.a(ovo3.build());
             return;
           default:
             b = oij.b;
             oij1 = oij.c;
             b.getClass();
             eq3 b1 = b.b;
             n6.g(b1, xj0.z0(b1, "spotify.intent.action.STORAGE_MOVE_SERVICE").putExtra("EXTRA_FILE_PATH", oij1.k.getAbsolutePath()).putExtra("EXTRA_INTERNAL", oij1.h));
             return;
       }
    }
}
