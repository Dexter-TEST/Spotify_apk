package p.am0;
import java.lang.Runnable;
import java.lang.Object;
import p.vc3;
import p.sc3;
import java.io.Closeable;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.lang.String;
import p.co5;
import p.x0;
import p.q0;
import p.fm3;
import androidx.work.WorkerParameters;
import p.h51;
import java.util.HashMap;
import p.es3;
import p.vq0;
import p.bm3;
import p.pc6;
import java.lang.Class;
import android.content.Context;
import p.sr7;
import p.uq7;
import p.lr7;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p.jr7;
import p.fq7;
import p.zq7;
import p.eq7;
import java.util.List;
import p.ye7;
import java.util.Collection;
import p.ij;
import java.util.concurrent.Executor;
import p.cm3;
import p.bo3;
import java.util.ArrayList;
import java.util.Iterator;
import p.w7;
import p.t7;
import p.wd5;
import p.cn;
import p.c0;
import io.reactivex.rxjava3.core.Observer;
import p.c1;
import java.lang.Boolean;
import p.an5;
import p.lx3;
import p.hy3;
import p.x37;
import p.fn0;
import p.yl6;
import p.t00;
import p.co3;
import p.wn6;
import p.tn6;
import p.rn6;
import p.eq3;
import p.io2;
import android.content.Intent;
import p.xj0;
import p.n6;
import com.spotify.lite.welcome.WelcomeActivity;
import p.p25;
import androidx.core.widget.NestedScrollView;
import p.rk2;
import com.spotify.legacyglue.contextmenu.glue.GlueContextMenuLayout;
import android.view.View;
import com.spotify.eventsender.eventsender.a;
import p.n56;
import p.vu1;
import p.ym7;
import p.ea1;
import p.ej;
import p.h22;
import p.u12;
import p.e22;
import p.v12;
import p.t12;
import p.s12;
import p.vz1;
import p.gj7;
import java.lang.ref.Reference;
import android.app.Activity;
import p.is7;
import p.rv6;
import p.nj7;
import p.mj7;
import p.di0;
import p.ai0;
import android.os.Bundle;
import p.sz1;
import p.vn;
import org.json.JSONArray;
import android.os.Build;
import p.av6;
import java.lang.CharSequence;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Locale;
import java.lang.StringBuilder;
import android.os.BaseBundle;
import p.tm2;
import java.util.Arrays;
import p.z91;
import p.az5;
import p.xm2;
import org.json.JSONObject;
import java.util.concurrent.atomic.AtomicBoolean;
import p.ji7;
import java.lang.NullPointerException;
import p.yi;
import p.ns3;
import p.xi;
import p.ej4;
import java.util.Map;
import java.util.LinkedHashMap;
import p.q14;
import java.util.Set;
import java.lang.System;
import p.fs3;
import p.wi;
import p.pi;
import java.util.Map$Entry;
import p.qi;
import p.ui;
import java.lang.Enum;
import p.pu0;
import java.lang.Iterable;
import p.c11;
import p.ti;
import p.ou0;
import p.mu0;
import p.nu0;
import java.lang.Integer;
import java.lang.Exception;
import p.si;
import java.lang.Math;
import p.dj0;
import p.eo5;
import p.ib3;
import p.ll1;
import p.gb3;
import p.t65;
import p.xe7;
import p.p76;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import java.lang.Throwable;
import p.eb3;
import p.bb2;
import p.ni;
import p.bw3;
import java.util.concurrent.Semaphore;
import p.fw3;
import p.jn0;
import p.sk5;
import p.kj3;
import p.fk3;
import p.vf2;
import p.wf2;
import p.um0;
import p.im0;
import androidx.activity.a;

public final class am0 implements Runnable	// class@000fab from classes.dex
{
    public final int a;
    public final Object b;

    public void am0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    private final void a(){
       vc3 h;
       am0 tb = this.b;
       vc3 l = tb.l;
       _monitor_enter(l);
       tb.g = false;
       tb.i.d();
       if ((h = tb.h) != null) {
          h.close();
       }
       _monitor_exit(l);
       return;
    }
    private final void b(){
       int i;
       ConstraintTrackingWorker y;
       jr7 ojr7;
       am0 tb = this.b;
       co5.o(tb, "this$0");
       if (tb.y.a instanceof q0) {
       }else {
          fm3 obj = tb.b.b.a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
          if (obj instanceof String) {
          }else {
             obj = null;
          }
          es3 uoes3 = es3.c();
          co5.l(uoes3, "get\(\)");
          fq7 uofq7 = (obj != null && obj.length())? 0: 1;
          if (i) {
             uoes3.a(vq0.a, "No worker to delegate to.");
             y = tb.y;
             co5.l(y, "future");
             y.i(new bm3());
          }else {
             tb.b.e.getClass();
             obj = sr7.a(tb.a, obj, tb.v);
             tb.z = obj;
             if (obj == null) {
                y = tb.y;
                co5.l(y, "future");
                y.i(new bm3());
             }else {
                uq7 ouq7 = uq7.y(tb.a);
                String str = tb.b.a.toString();
                co5.l(str, "id.toString\(\)");
                if ((ojr7 = ouq7.C.y().l(str)) == null) {
                   y = tb.y;
                   co5.l(y, "future");
                   y.i(new bm3());
                }else {
                   ouq7 = ouq7.J;
                   co5.l(ouq7, "workManagerImpl.trackers");
                   uofq7 = new fq7(ouq7, tb);
                   uofq7.c(ye7.J(ojr7));
                   String str1 = tb.b.a.toString();
                   co5.l(str1, "id.toString\(\)");
                   if (uofq7.a(str1)) {
                      ConstraintTrackingWorker z = tb.z;
                      co5.i(z);
                      pc6 opc6 = z.e();
                      co5.l(opc6, "delegate!!.startWork\(\)");
                      opc6.a(new ij(tb, 10, opc6), tb.b.c);
                   }else {
                      y = tb.y;
                      co5.l(y, "future");
                      y.i(new cm3());
                   }
                }
             }
          }
       }
       return;
    }
    private final void c(){
       am0 tb = this.b;
       bo3 h = tb.h;
       _monitor_enter(h);
       _monitor_exit(h);
       Iterator iterator = new ArrayList(tb.h).iterator();
       while (iterator.hasNext()) {
          iterator.next().B = null;
       }
       return;
    }
    private final void d(){
       am0 tb = this.b;
       try{
          tb.getClass();
          tb.F.d(tb.K);
          return;
       }catch(java.util.NoSuchElementException e0){
       }
    }
    public final void run(){
       am0 b;
       im0 b1;
       bw3 z;
       String str;
       tm2 b2;
       List list;
       String str1;
       xi c;
       ns3 ons3;
       String str2;
       Object[] objArray1;
       String str3;
       ns3 t;
       String str5;
       Object[] obj;
       String str7;
       pi opi;
       am0 uoam02;
       pi opi1;
       String str8;
       String str9;
       LinkedHashMap linkedHashMa4;
       int i3;
       String str10;
       p76 op76;
       URLConnection uRLConnectio;
       Set set;
       int b5;
       BufferedOutputStream b5;
       ArrayList obj2;
       int i4;
       object oobject;
       pi opi2;
       String str13;
       int i7;
       ui oui;
       pu0 opu0;
       Object[] objArray2;
       object obj4;
       LinkedHashMap linkedHashMa8;
       Iterator iterator7;
       String str15;
       int len1;
       object oobject1;
       mu0 a2;
       Map obj5;
       nu0 obj6;
       Object obj7;
       si[] obj8;
       Configuration locale;
       String d;
       ji7 c2;
       String str17;
       am0 uoam0 = this;
       z91 oz91 = null;
       int i = 1;
       int i1 = 0;
       switch (uoam0.a){
           case 0:
             uoam0.b.invalidateOptionsMenu();
             return;
           case 1:
             b = uoam0.b;
             if ((b1 = b.b) != null) {
                b1.run();
                b.b = null;
             }
             return;
             break;
           case 2:
             um0.b(uoam0.b);
             return;
           case 3:
             b = uoam0.b;
             co5.o(b, "this$0");
             vf2 g = b.g;
             _monitor_enter(g);
             b.b = false;
             if (b.d == null && b.c == null) {
                b.f.invoke();
                b.a();
             }
             _monitor_exit(g);
             return;
             break;
           case 4:
             b = uoam0.b;
             co5.o(b, "this$0");
             if (b.b == null) {
                b.c = true;
                b.w.f(kj3.ON_PAUSE);
             }
             if (b.a == null && b.c != null) {
                b.w.f(kj3.ON_STOP);
                b.t = true;
             }
             return;
             break;
           case 5:
             this.a();
             return;
           case 6:
             this.b();
             return;
           case 7:
             b = uoam0.b;
             bw3 q = b.Q;
             if ((z = b.z) != null) {
                q.acquire();
                z.n(b.b.e());
                q.release();
             }
             return;
             break;
           case 8:
             b = uoam0.b;
             co5.o(b, "$reason");
             ni.a(b);
             return;
           case 9:
             am0 uoam01 = uoam0.b;
             str = "POST";
             co5.o(uoam01, "$request");
             if ((b2 = uoam01.b) == null) {
                list = oz91;
             }else {
                String[] stringArray = new String[]{"/"};
                list = av6.B0(b2, stringArray, i1, 6);
             }
             ns3 v = ns3.v;
             str1 = "CAPITransformerWebRequests";
             if (list != null && list.size() == 2) {
                try{
                   if ((c = yi.c) != null) {
                      try{
                         xi b3 = c.b;
                         if (c != null) {
                            str3 = b3+"/capi/"+c.a+"/events";
                            b2 = uoam01.c;
                            t = ns3.t;
                            if (b2 != null) {
                               LinkedHashMap linkedHashMa = q14.t0(ej4.r(b2));
                               if ((b2 = uoam01.e) != null) {
                                  String str4 = "custom_events";
                                  linkedHashMa.put(str4, b2);
                                  str5 = "";
                                  Iterator iterator = linkedHashMa.keySet().iterator();
                                  while (iterator.hasNext()) {
                                     obj = iterator.next();
                                     str5 = str5.append(obj).append(" : ").append(linkedHashMa.get(obj)).append(System.getProperty("line.separator"));
                                     int i2 = 2;
                                  }
                                  obj = new Object[i];
                                  obj[i1] = str5;
                                  mj7.i(t, str1, "\nGraph Request data: \n\n%s \n\n", obj);
                                  LinkedHashMap linkedHashMa1 = new LinkedHashMap();
                                  LinkedHashMap linkedHashMa2 = new LinkedHashMap();
                                  ArrayList uArrayList = new ArrayList();
                                  LinkedHashMap linkedHashMa3 = new LinkedHashMap();
                                  JSONObject obj1 = linkedHashMa.get("event");
                                  String str6 = "null cannot be cast to non-null type kotlin.String";
                                  if (obj1 != null) {
                                     pi b4 = pi.b;
                                     str7 = str;
                                     pi c1 = pi.c;
                                     if (co5.c(obj1, "MOBILE_APP_INSTALL")) {
                                        opi = pi.a;
                                     }else if(co5.c(obj1, "CUSTOM_APP_EVENTS")){
                                        opi = b4;
                                     }else {
                                        opi = c1;
                                     }
                                     if (opi != c1) {
                                        Iterator iterator3 = linkedHashMa.entrySet().iterator();
                                        while (true) {
                                           if (iterator3.hasNext()) {
                                              Map$Entry uEntry = iterator3.next();
                                              str8 = str1;
                                              ui obj3 = uEntry.getKey();
                                              uoam02 = uoam01;
                                              ArrayList value = uEntry.getValue();
                                              str9 = str3;
                                              str3 = "rawValue";
                                              co5.o(obj3, str3);
                                              qi[] oqiArray = qi.values();
                                              linkedHashMa4 = linkedHashMa;
                                              int len = oqiArray.length;
                                              opi1 = c1;
                                              int i5 = 0;
                                              while (true) {
                                                 if (i5 < len) {
                                                    int i6 = len;
                                                    oobject = oqiArray[i5];
                                                    qi[] oqiArray1 = oqiArray;
                                                    if (co5.c(oobject.a, obj3)) {
                                                    label_0448 :
                                                       LinkedHashMap linkedHashMa7 = linkedHashMa3;
                                                       if (oobject != null) {
                                                          co5.o(value, "value");
                                                          Map a1 = wi.a;
                                                          if ((obj3 = a1.get(oobject)) != null) {
                                                             if (i7 = obj3.a.ordinal()) {
                                                                if (i7 == 1) {
                                                                   opu0 = ((oui = a1.get(oobject)) == null)? null: oui.b;
                                                                   if (opu0 != null) {
                                                                      linkedHashMa2.put(opu0.a, value);
                                                                   }
                                                                }
                                                             }else if(oobject == qi.x){
                                                                try{
                                                                   linkedHashMa1.putAll(ej4.r(new JSONObject(value)));
                                                                }catch(org.json.JSONException e0){
                                                                   objArray2 = new Object[]{value,e0};
                                                                   mj7.i(t, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", objArray2);
                                                                }
                                                             }else if((oui = a1.get(oobject)) == null){
                                                                opu0 = null;
                                                             }else {
                                                                oui = oui.b;
                                                             }
                                                             if (opu0 != null) {
                                                                linkedHashMa1.put(opu0.a, value);
                                                             }
                                                          }
                                                          opi2 = b4;
                                                          str13 = str4;
                                                       }else {
                                                          i3 = co5.c(obj3, str4);
                                                          v12 = value instanceof String;
                                                          if (opi == b4 && (i3 && oobject)) {
                                                             co5.o(value, "appEvents");
                                                             try{
                                                                obj2 = new ArrayList();
                                                                Iterator iterator4 = ej4.q(new JSONArray(value)).iterator();
                                                                while (iterator4.hasNext()) {
                                                                   String str14 = iterator4.next();
                                                                   try{
                                                                      opi2 = b4;
                                                                      obj2.add(ej4.r(new JSONObject(str14)));
                                                                      b4 = opi2;
                                                                   }catch(org.json.JSONException e0){
                                                                   }
                                                                   str13 = str4;
                                                                   Object[] objArray3 = new Object[]{value,e0};
                                                                   mj7.i(t, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", objArray3);
                                                                label_0652 :
                                                                   value = null;
                                                                label_0653 :
                                                                   if (value != null) {
                                                                      uArrayList.addAll(value);
                                                                   }
                                                                }
                                                                opi2 = b4;
                                                                if (obj2.isEmpty()) {
                                                                   str13 = str4;
                                                                   goto label_0652 ;
                                                                }else {
                                                                   value = new ArrayList();
                                                                   Iterator iterator5 = obj2.iterator();
                                                                   while (true) {
                                                                      if (iterator5.hasNext()) {
                                                                         obj4 = iterator5.next();
                                                                         linkedHashMa8 = new LinkedHashMap();
                                                                         linkedHashMa = new LinkedHashMap();
                                                                         Iterator iterator6 = obj4.keySet().iterator();
                                                                         while (true) {
                                                                            if (iterator6.hasNext()) {
                                                                               str5 = iterator6.next();
                                                                               co5.o(str5, str3);
                                                                               iterator7 = iterator5;
                                                                               c11[] uoc11Array = c11.values();
                                                                               str15 = str3;
                                                                               len1 = uoc11Array.length;
                                                                               str13 = str4;
                                                                               int i8 = 0;
                                                                               while (true) {
                                                                                  if (i8 < len1) {
                                                                                     int i9 = len1;
                                                                                     oobject1 = uoc11Array[i8];
                                                                                     c11[] uoc11Array1 = uoc11Array;
                                                                                     if (co5.c(oobject1.a, str5)) {
                                                                                     label_056e :
                                                                                        ti oti = wi.b.get(oobject1);
                                                                                        if (oobject1 != null && oti != null) {
                                                                                           ti b6 = oti.b;
                                                                                           if ((oti = oti.a) != null) {
                                                                                              if (oti == ou0.c) {
                                                                                                 a2 = b6.a;
                                                                                                 if ((obj5 = obj4.get(str5)) != null) {
                                                                                                    if ((obj6 = wi.a(obj5, str5)) != null) {
                                                                                                       linkedHashMa8.put(a2, obj6);
                                                                                                    }else {
                                                                                                       throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                                    }
                                                                                                 }else {
                                                                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                                 }
                                                                                              }
                                                                                           }else {
                                                                                              try{
                                                                                                 a2 = b6.a;
                                                                                                 if (oobject1 == c11.c && obj4.get(str5) != null) {
                                                                                                    if ((str5 = obj4.get(str5)) != null) {
                                                                                                       obj5 = wi.c;
                                                                                                       if (obj5.containsKey(str5)) {
                                                                                                          str5 = ((obj6 = obj5.get(str5)) == null)? "": obj6.a;
                                                                                                       }
                                                                                                       linkedHashMa.put(a2, str5);
                                                                                                    }else {
                                                                                                       throw new NullPointerException(str6);
                                                                                                    }
                                                                                                 }else if(oobject1 == c11.b && obj4.get(str5) != null){
                                                                                                    if ((obj7 = obj4.get(str5)) != null) {
                                                                                                       if ((obj8 = wi.a(obj7, str5)) != null) {
                                                                                                          linkedHashMa.put(a2, obj8);
                                                                                                       }else {
                                                                                                          throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                                       }
                                                                                                    }else {
                                                                                                       throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                                    }
                                                                                                 }
                                                                                              }catch(java.lang.ClassCastException e0){
                                                                                                 objArray2 = new Object[]{io2.v(e0)};
                                                                                                 mj7.i(t, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", objArray2);
                                                                                              }
                                                                                           }
                                                                                        }
                                                                                        oti = 1;
                                                                                        iterator5 = iterator7;
                                                                                        str3 = str15;
                                                                                        str4 = str13;
                                                                                     }else {
                                                                                        i8 = i8 + 1;
                                                                                        len1 = i9;
                                                                                        uoc11Array = uoc11Array1;
                                                                                     }
                                                                                  }else {
                                                                                     oobject1 = null;
                                                                                     goto label_056e ;
                                                                                  }
                                                                               }
                                                                            }else {
                                                                               iterator7 = iterator5;
                                                                               str15 = str3;
                                                                               str13 = str4;
                                                                               if (i3 = linkedHashMa8.isEmpty() ^ 1) {
                                                                                  linkedHashMa.put("custom_data", linkedHashMa8);
                                                                               }
                                                                               value.add(linkedHashMa);
                                                                               iterator5 = iterator7;
                                                                               str3 = str15;
                                                                               str4 = str13;
                                                                            }
                                                                         }
                                                                      }else {
                                                                         str13 = str4;
                                                                         goto label_0653 ;
                                                                      }
                                                                   }
                                                                }
                                                             }catch(org.json.JSONException e0){
                                                                opi2 = b4;
                                                             }
                                                          }else {
                                                             opi2 = b4;
                                                             str13 = str4;
                                                             obj8 = si.values();
                                                             i1 = obj8.length;
                                                             i5 = 0;
                                                             while (true) {
                                                                if (i5 < i1) {
                                                                   obj4 = obj8[i5];
                                                                   if (co5.c(obj4.a, obj3)) {
                                                                   label_0675 :
                                                                      if (obj4 != null) {
                                                                         linkedHashMa3 = linkedHashMa7;
                                                                         linkedHashMa3.put(obj3, value);
                                                                      label_067c :
                                                                         uoam01 = uoam02;
                                                                         str1 = str8;
                                                                         str3 = str9;
                                                                         linkedHashMa = linkedHashMa4;
                                                                         c1 = opi1;
                                                                         b4 = opi2;
                                                                         str4 = str13;
                                                                      }
                                                                   }else {
                                                                      i5 = i5 + 1;
                                                                   }
                                                                }else {
                                                                   obj4 = null;
                                                                   goto label_0675 ;
                                                                }
                                                             }
                                                          }
                                                       }
                                                       linkedHashMa3 = linkedHashMa7;
                                                       goto label_067c ;
                                                    }else {
                                                       i5 = i5 + 1;
                                                       len = i6;
                                                       oqiArray = oqiArray1;
                                                    }
                                                 }else {
                                                    oobject = null;
                                                    goto label_0448 ;
                                                 }
                                              }
                                           }
                                        }
                                     }
                                     uoam02 = uoam01;
                                     opi1 = c1;
                                     str8 = str1;
                                     str9 = str3;
                                     linkedHashMa4 = linkedHashMa;
                                     if (opi != opi1) {
                                        obj2 = linkedHashMa4.get("install_timestamp");
                                        LinkedHashMap linkedHashMa5 = new LinkedHashMap();
                                        linkedHashMa5.put("action_source", "app");
                                        linkedHashMa5.put("user_data", linkedHashMa1);
                                        linkedHashMa5.put("app_data", linkedHashMa2);
                                        linkedHashMa5.putAll(linkedHashMa3);
                                        if (i4 = opi.ordinal()) {
                                           if (i4 == 1 && !uArrayList.isEmpty()) {
                                              obj2 = new ArrayList();
                                              Iterator iterator2 = uArrayList.iterator();
                                              while (iterator2.hasNext()) {
                                                 linkedHashMa3 = new LinkedHashMap();
                                                 linkedHashMa3.putAll(linkedHashMa5);
                                                 linkedHashMa3.putAll(iterator2.next());
                                                 obj2.add(linkedHashMa3);
                                              }
                                           label_071b :
                                              if (list != null) {
                                                 yi.b().addAll(list);
                                                 if ((i3 = Math.max(0, (yi.b().size() - 1000))) > 0) {
                                                    list = eo5.e(dj0.h0(yi.b(), i3));
                                                    co5.o(list, "<set-?>");
                                                    yi.d = list;
                                                 }
                                                 i3 = Math.min(yi.b().size(), 10);
                                                 List list1 = yi.b();
                                                 i1 = 0;
                                                 ib3 oib3 = new ib3(i1, (i3 - 1));
                                                 ll1 a = (oib3.isEmpty())? ll1.a: dj0.B0(list1.subList(Integer.valueOf(i1).intValue(), (Integer.valueOf(oib3.b).intValue() + 1)));
                                                 yi.b().subList(0, i3).clear();
                                                 linkedHashMa1 = new LinkedHashMap();
                                                 linkedHashMa1.put("data", new JSONArray(a));
                                                 if ((c = yi.c) != null) {
                                                    linkedHashMa1.put("accessKey", c.c);
                                                    obj1 = new JSONObject(linkedHashMa1);
                                                    obj = new Object[3];
                                                    obj[0] = str9;
                                                    obj[1] = uoam02;
                                                    str10 = obj1.toString(2);
                                                    co5.l(str10, "jsonBodyStr.toString\(2\)");
                                                    obj[2] = str10;
                                                    str2 = str8;
                                                    mj7.i(t, str2, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", obj);
                                                    str5 = obj1.toString();
                                                    Map map = xe7.H(new t65("Content-Type", "application/json"));
                                                    op76 = new p76(2, a);
                                                    String str11 = "UTF-8";
                                                    str6 = "urlStr";
                                                    str = str9;
                                                    co5.o(str, str6);
                                                    if ((uRLConnectio = new URL(str).openConnection()) != null) {
                                                       str = str7;
                                                       uRLConnectio.setRequestMethod(str);
                                                       if ((set = map.keySet()) != null) {
                                                          Iterator iterator1 = set.iterator();
                                                          while (iterator1.hasNext()) {
                                                             str1 = iterator1.next();
                                                             uRLConnectio.setRequestProperty(str1, map.get(str1));
                                                          }
                                                       }
                                                       b5 = (!uRLConnectio.getRequestMethod().equals(str) && !uRLConnectio.getRequestMethod().equals("PUT"))? false: true;
                                                       uRLConnectio.setDoOutput(b5);
                                                       uRLConnectio.setConnectTimeout(0xea60);
                                                       b5 = new BufferedOutputStream(uRLConnectio.getOutputStream());
                                                       BufferedWriter str12 = new BufferedWriter(new OutputStreamWriter(b5, str11));
                                                       str12.write(str5);
                                                       str12.flush();
                                                       str12.close();
                                                       b5.close();
                                                       str5 = "";
                                                       if (yi.a.contains(Integer.valueOf(uRLConnectio.getResponseCode()))) {
                                                          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(uRLConnectio.getInputStream(), str11));
                                                          while ((str11 = uBufferedRea.readLine()) != null) {
                                                             str5 = str5.append(str11);
                                                          }
                                                          eb3.d(uBufferedRea, null);
                                                       }
                                                       str5 = str5;
                                                       co5.l(str5, "connResponseSB.toString\(\)");
                                                       obj = new Object[]{str5,Integer.valueOf(uRLConnectio.getResponseCode())};
                                                       mj7.i(t, str2, "\nResponse Received: \n%s\n%s", obj);
                                                       op76.b(str5, Integer.valueOf(uRLConnectio.getResponseCode()));
                                                    }else {
                                                       throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                                                    }
                                                 }else {
                                                    co5.N("credentials");
                                                    throw null;
                                                 }
                                              }
                                           }
                                        }else if(obj2 == null){
                                           LinkedHashMap linkedHashMa6 = new LinkedHashMap();
                                           linkedHashMa6.putAll(linkedHashMa5);
                                           linkedHashMa6.put("event_name", "MobileAppInstall");
                                           linkedHashMa6.put("event_time", obj2);
                                           list = ye7.J(linkedHashMa6);
                                           goto label_071b ;
                                        }
                                     }
                                  }else {
                                     throw new NullPointerException(str6);
                                  }
                               }else {
                                  throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                               }
                            }else {
                               uoam02 = uoam01;
                               str7 = str;
                               str8 = str1;
                               str9 = str3;
                            }
                            list = null;
                            goto label_071b ;
                         }else {
                            str2 = str1;
                            co5.N("credentials");
                            throw null;
                         }
                      }catch(java.net.UnknownHostException e0){
                         objArray1 = new Object[]{e0.toString()};
                         mj7.i(t, str2, "Connection failed, retrying: \n%s", objArray1);
                         op76.b(null, Integer.valueOf(503));
                      }catch(java.io.IOException e0){
                         objArray1 = new Object[]{e0.toString()};
                         mj7.i(v, str2, "Send to server failed: \n%s", objArray1);
                      }
                   }else {
                      co5.N("credentials");
                      throw null;
                   }
                }catch(p.ic7 e0){
                   ons3 = v;
                   str2 = str1;
                }catch(p.ic7 e0){
                }
                objArray1 = new Object[]{e0};
                mj7.i(ons3, str2, "\n Credentials not initialized Error when logging: \n%s", objArray1);
             }else {
                Object[] objArray = new Object[]{uoam01};
                mj7.i(v, str1, "\n GraphPathComponents Error when logging: \n%s", objArray);
             }
             return;
             break;
           case 10:
             b = uoam0.b;
             Bundle uBundle = new Bundle();
             vn ovn = mj7.d(sz1.a());
             JSONArray jSONArray = new JSONArray();
             str1 = Build.MODEL;
             String str16 = "";
             str3 = (str1 != null)? str1: str16;
             jSONArray.put(str3);
             len1 = (ovn == null)? oz91: ovn.a();
             if (len1 != null) {
                jSONArray.put(ovn.a());
             }else {
                jSONArray.put(str16);
             }
             str = "0";
             jSONArray.put(str);
             str16 = Build.FINGERPRINT;
             co5.l(str16, "FINGERPRINT");
             if (!av6.D0(str16, "generic", i1) && !av6.D0(str16, "unknown", i1)) {
                co5.l(str1, "MODEL");
                str16 = "google_sdk";
                if (!av6.f0(str1, str16) && (!av6.f0(str1, "Emulator") && !av6.f0(str1, "Android SDK built for x86"))) {
                   str1 = Build.MANUFACTURER;
                   co5.l(str1, "MANUFACTURER");
                   if (!av6.f0(str1, "Genymotion")) {
                      str1 = Build.BRAND;
                      co5.l(str1, "BRAND");
                      if (av6.D0(str1, "generic", i1)) {
                         str1 = Build.DEVICE;
                         co5.l(str1, "DEVICE");
                         if (av6.D0(str1, "generic", i1)) {
                         label_024a :
                            linkedHashMa8 = 1;
                         label_024b :
                            if (linkedHashMa8) {
                               str = "1";
                            }
                            try{
                               jSONArray.put(str);
                               locale = sz1.a().getResources().getConfiguration().locale;
                            }catch(java.lang.Exception e0){
                               locale = oz91;
                            }
                            if (locale == null) {
                               locale = Locale.getDefault();
                               co5.l(locale, "getDefault\(\)");
                            }
                            jSONArray.put(locale.getLanguage()+'_'+locale.getCountry());
                            str1 = jSONArray.toString();
                            co5.l(str1, "extInfoArray.toString\(\)");
                            if (ai0.d == null) {
                               ai0.d = UUID.randomUUID().toString();
                            }
                            if ((d = ai0.d) != null) {
                               uBundle.putString("device_session_id", d);
                               uBundle.putString("extinfo", str1);
                               Object[] objArray4 = new Object[i];
                               objArray4[i1] = e0;
                               str5 = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(objArray4, i));
                               co5.l(str5, "java.lang.String.format\(locale, format, *args\)");
                               xm2 b7 = az5.O(str5, uBundle, oz91).c().b;
                               AtomicBoolean f = ai0.f;
                               if (b7 == null || !b7.optBoolean("is_app_indexing_enabled", i1)) {
                                  i = false;
                               }
                               f.set(i);
                               if (!f.get()) {
                                  ai0.d = oz91;
                               }else if((c2 = ai0.c) == null){
                                  c2.a();
                               }
                               ai0.g = i1;
                               return;
                            }else {
                               throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                         }
                      }
                      if (co5.c(str16, Build.PRODUCT)) {
                         goto label_024a ;
                      }else {
                         linkedHashMa8 = 0;
                         goto label_024b ;
                      }
                   }else {
                      goto label_024a ;
                   }
                }else {
                   goto label_024a ;
                }
             }else {
                goto label_024a ;
             }
             break;
           case 11:
             b = uoam0.b;
             co5.o(b, "this$0");
             b.a();
             return;
           case 12:
             b = uoam0.b;
             co5.o(b, "this$0");
             try{
                gj7 a3 = b.a;
                View view = is7.q(a3.get());
                Activity uActivity = a3.get();
                if (view != null && uActivity != null) {
                   Iterator iterator8 = rv6.a(view).iterator();
                   while (iterator8.hasNext()) {
                      View view1 = iterator8.next();
                      if (io2.o(view1)) {
                         continue ;
                      }else {
                         d = rv6.d(view1);
                         linkedHashMa8 = (d.length() > 0)? 1: 0;
                         if (linkedHashMa8 && d.length() <= 300) {
                            d = uActivity.getLocalClassName();
                            co5.l(d, "activity.localClassName");
                            mj7.b(view1, view, d);
                         }
                      }
                   }
                }
                return;
             }catch(java.lang.Exception e0){
             }
             break;
           case 13:
             vz1.g(uoam0.b);
             return;
           case 14:
             b = uoam0.b;
             b.getClass();
             b.a.a(v12.c(b.b));
             return;
           case 15:
             uoam0.b.getClass();
             return;
           case 16:
             b = uoam0.b;
             co5.o(b, "this$0");
             b.I();
             return;
           case 17:
             b = uoam0.b;
             if (b.z == null) {
                b.y(i);
             }
             return;
             break;
           case 18:
             b = uoam0.b;
             if (b.h.e != null) {
                b.b.run();
             }
             return;
             break;
           case 19:
             b = uoam0.b;
             rk2 d1 = b.d;
             if (b.b()) {
                d1.setMinTopMarginPx(i1);
             }else {
                rk2 c3 = b.c;
                b5 = c3.getHeight();
                d1.setMinTopMarginPx((c3.getPaddingTop() + b5));
             }
             return;
             break;
           case 20:
             uoam0.b.Z.l.m(130);
             return;
           case 21:
             b = uoam0.b;
             eq3 f1 = b.f;
             str10 = f1.g(eq3.g, oz91);
             if ((str17 = f1.g(eq3.h, oz91)) != null && (str10 != null && !io2.j(str17, str10))) {
                eq3 b8 = b.b;
                n6.g(b8, xj0.z0(b8, "spotify.intent.action.STORAGE_FINALIZE_SERVICE"));
             }
             return;
             break;
           case 22:
             wn6 own6 = uoam0.b.i.edit();
             own6.d(co3.k);
             own6.d(co3.l);
             own6.d(co3.m);
             own6.d(co3.q);
             own6.d(co3.p);
             own6.d(co3.r);
             own6.f();
             return;
           case 23:
             this.c();
             return;
           case 24:
             uoam0.b.dispose();
             return;
           case 25:
             b = uoam0.b;
             b.d = oz91;
             b.f = 0;
             b.e = 0;
             b.h.e();
             b.c.b(i);
             b.g.onNext(Boolean.FALSE);
             return;
           case 26:
             uoam0.b.L.b();
             return;
           case 27:
             uoam0.b.y.onNext(Boolean.FALSE);
             return;
           case 28:
             uoam0.b.t.onNext(c0.a);
             return;
           default:
             this.d();
             return;
       }
    }
}
