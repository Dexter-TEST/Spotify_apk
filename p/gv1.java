package p.gv1;
import p.fw1;
import java.util.concurrent.TimeUnit;
import p.uv1;
import p.o11;
import p.ou1;
import p.lf1;
import p.dy1;
import p.na6;
import p.lv1;
import p.fv1;
import p.yu1;
import p.t67;
import p.or7;
import p.hs3;
import p.i70;
import p.n56;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.dv1;
import java.util.concurrent.atomic.AtomicLong;
import java.util.HashSet;
import java.lang.Class;
import android.os.SystemClock;
import p.xt1;
import java.util.Iterator;
import java.lang.Iterable;
import p.u65;
import p.i80;
import com.spotify.messages.EventSenderStats2NonAuth;
import p.hv1;
import java.util.List;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.is7;
import p.dw1;
import p.bb3;
import p.vp;
import p.r45;
import java.util.concurrent.ConcurrentHashMap;
import p.mi;
import p.zy5;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import java.util.ArrayList;
import java.lang.Long;
import p.vv1;
import p.di7;
import p.dj0;
import p.n26;
import p.v42;
import p.la6;
import p.zf2;
import p.oa6;
import p.ye7;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Number;
import java.lang.Integer;
import p.if1;
import p.et0;
import p.ff1;
import p.jv1;
import p.t65;
import p.q14;
import java.util.TreeMap;
import p.cv1;
import java.util.TreeSet;
import java.util.AbstractSet;
import p.uk;
import p.pv1;
import p.ev1;
import p.vm6;
import java.util.Collection;
import p.h80;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.ew1;
import p.cw1;
import p.et5;
import com.spotify.messages.RejectedClientEventNonAuth;
import p.s74;
import java.lang.System;
import p.aw1;
import p.oe7;

public final class gv1 implements fw1	// class@001785 from classes.dex
{
    public final uv1 a;
    public final o11 b;
    public final ou1 c;
    public final if1 d;
    public final dy1 e;
    public final na6 f;
    public final fv1 g;
    public final cw1 h;
    public final t67 i;
    public final or7 j;
    public final hs3 k;
    public final i70 l;
    public final m56 m;
    public final fv1 n;
    public final dv1 o;
    public final long p;
    public final AtomicLong q;
    public final AtomicLong r;
    public static final long s;

    static {
       gv1.s = TimeUnit.HOURS.toMillis(23);
    }
    public void gv1(uv1 p0,o11 p1,ou1 p2,lf1 p3,dy1 p4,na6 p5,lv1 p6,uv1 p7,fv1 p8,yu1 p9,t67 p10,or7 p11,hs3 p12,i70 p13,n56 p14,int p15){
       int i = this;
       Object obj = p6;
       Object obj1 = p8;
       Object obj2 = p12;
       Object obj3 = p13;
       Object obj4 = p14;
       co5.o(p0, "eventStatsDao");
       co5.o(p5, "sequenceIdProvider");
       co5.o(obj, "eventSequenceNumbersDao");
       co5.o(obj1, "clock");
       co5.o(obj2, "logger");
       co5.o(obj3, "clientContextIdManager");
       co5.o(obj4, "sdkFlags");
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = obj1;
       i.h = p9;
       i.i = p10;
       i.j = p11;
       i.k = obj2;
       i.l = obj3;
       i.m = obj4;
       i.n = new fv1();
       i.o = new dv1(p7, obj);
       i.p = TimeUnit.SECONDS.toMillis((long)p15);
       i.q = new AtomicLong(0);
       i.r = new AtomicLong(0);
    }
    public final void a(HashSet p0){
       if ((p0.isEmpty() ^ 0x01)) {
          this.g.getClass();
          this.q.set(SystemClock.elapsedRealtime());
       }
       return;
    }
    public final void b(xt1 p0){
       hv1 obj;
       gv1 tj = this.j;
       gv1 tm = this.m;
       co5.o(p0, "event");
       if (co5.c(p0.b, "EventSenderStats2NonAuth")) {
          Iterator iterator = p0.e.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                if (!co5.c(obj.a, "message")) {
                   continue ;
                }
             }else {
                obj = null;
             }
             if (obj != null) {
                try{
                   EventSenderStats2NonAuth uEventSender = EventSenderStats2NonAuth.S(obj.b);
                   tm.getClass();
                   co5.l(uEventSender, "ess2");
                   this.e.getClass();
                   hv1 ohv1 = dy1.c(uEventSender);
                   hv1 a = ohv1.a;
                   obj = ohv1.b;
                   ohv1 = ohv1.c;
                   if (tj.l(a, obj, ohv1)) {
                      this.g.getClass();
                      this.r.set(SystemClock.elapsedRealtime());
                   }
                   tj.q(a, obj, ohv1);
                   this.d.h(ohv1);
                   break ;
                }catch(p.rc3 e7){
                   this.k.a("Couldn\'t parse ESS2: "+e7.getMessage());
                   break ;
                }
             }
          }
       }
       return;
    }
    public final is7 get(){
       byte[] uobyteArray1;
       byte[][] uobyteArray2;
       object oobject;
       int i5;
       gv1 ogv11;
       o11 t;
       gv1 ogv12;
       LinkedHashMap linkedHashMa;
       byte[][] uobyteArray4;
       byte[] uobyteArray5;
       o11 oo11;
       TreeMap treeMap;
       vv1 ovv1;
       vv1 d1;
       List list1;
       vv1 f1;
       Map$Entry uEntry;
       String key;
       Iterator iterator2;
       ev1 uoev1;
       ev1 uoev11;
       cv1 uocv12;
       Map$Entry uEntry1;
       String key1;
       Object obj;
       Object obj1;
       jv1 ojv1;
       Iterator iterator4;
       int i8;
       vv1 e;
       gv1 ogv1 = this;
       ogv1.g.getClass();
       dw1 g = dw1.G;
       if (((SystemClock.elapsedRealtime() - ogv1.q.get()) - ogv1.p) < 0) {
          return g;
       }
       r45 or45 = ogv1.c.a.a();
       gv1 f = ogv1.f;
       StringBuilder str = "";
       byte[] uobyteArray = f.a.get(or45.e(str));
       na6 a = f.a;
       if (uobyteArray == null && (uobyteArray = a.get(str)) == null) {
          return g;
       }
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       if (or45.c()) {
          if ((uobyteArray1 = a.get(str)) != null) {
             uobyteArray2 = new byte[][i];
             uobyteArray2[i2] = uobyteArray;
             uobyteArray2[i1] = uobyteArray1;
          }else {
             uobyteArray2 = new byte[][i1];
             uobyteArray2[i2] = uobyteArray;
          }
       }else {
          uobyteArray2 = new byte[][i1];
          uobyteArray2[i2] = uobyteArray;
       }
       gv1 a1 = ogv1.a;
       a1.getClass();
       str = "SELECT eventName || \'_\' || hex\(sequenceId\) AS eventId, eventName, sequenceId,hex\(sequenceId\) AS sequenceStr,sequenceNumberNext, COUNT\(sequenceNumber\) AS storageSize,MIN\(sequenceNumber\) AS sequenceNumberMin FROM EventSequenceNumbers LEFT JOIN Events USING \(eventName, sequenceId\) WHERE sequenceId IN \(";
       int len = uobyteArray2.length;
       mi.c(len, str);
       zy5 ozy5 = zy5.x((len + i2), str+"\) GROUP BY eventName, sequenceId, sequenceStr");
       len = uobyteArray2.length;
       int i4 = 1;
       for (int vv1 i3 = 0; i3 < len; i3 = i3 + 1) {
          if ((oobject = uobyteArray2[i3]) == null) {
             ozy5.z(i4);
          }else {
             ozy5.d0(oobject, i4);
          }
          i4 = i4 + 1;
       }
       a1.b.b();
       Cursor uCursor = vv7.J(a1.b, ozy5, i2);
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (true) {
          i4 = 3;
          i5 = 4;
          int i6 = 5;
          int i7 = 6;
          if (uCursor.moveToNext()) {
             String str1 = (uCursor.isNull(i2))? null: uCursor.getString(i2);
             String str2 = (uCursor.isNull(i1))? null: uCursor.getString(i1);
             byte[] uobyteArray3 = (uCursor.isNull(i))? null: uCursor.getBlob(i);
             String str3 = (uCursor.isNull(i4))? null: uCursor.getString(i4);
             long longx = uCursor.getLong(i5);
             long longx1 = uCursor.getLong(i6);
             Long longx2 = (uCursor.isNull(i7))? null: Long.valueOf(uCursor.getLong(i7));
             i3 = new vv1(str1, str2, uobyteArray3, str3, longx2, longx, longx1);
             uArrayList.add(i3);
          }else {
             break ;
          }
       }
       uCursor.close();
       ozy5.y();
       List list = ye7.N(oa6.H(new v42(dj0.e0(uArrayList), i1, n26.I)));
       ogv1.m.getClass();
       gv1 r = ogv1.r;
       r = ((r.get()) && ((SystemClock.elapsedRealtime() - r.get()) - gv1.s) < 0)? 1: 0;
       gv1 j = ogv1.j;
       if (r) {
          j.getClass();
          if (!j.a.isEmpty()) {
             ArrayList uArrayList3 = new ArrayList();
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                obj = obj1;
                if ((f1 = j.a.get(obj.a)) != null) {
                   ogv11 = j;
                   if (!(obj.g - f1.g)) {
                      vv1 f2 = obj.f;
                      if (!(f2 - f1.f)) {
                         if ((e = obj.e) != null) {
                            f2 = e.longValue();
                         }
                         if ((e = f1.e) != null && !(f2 - e.longValue())) {
                            e = 0;
                         label_01bf :
                            if (e) {
                               uArrayList3.add(obj1);
                            }
                            j = ogv11;
                            obj = 6;
                         }
                      }
                   }
                }else {
                   ogv11 = j;
                }
                e = 1;
                goto label_01bf ;
             }
             ogv11 = j;
             list = uArrayList3;
          label_01d3 :
             gv1 b = ogv1.b;
             if (r) {
                t = b.t;
                ogv11.getClass();
                co5.o(t, "events");
                ogv12 = ogv11;
                if (!ogv12.b.isEmpty()) {
                   LinkedHashMap linkedHashMa2 = new LinkedHashMap();
                   Iterator iterator5 = t.entrySet().iterator();
                   while (iterator5.hasNext()) {
                      uEntry1 = iterator5.next();
                      key1 = uEntry1.getKey();
                      i5 = uEntry1.getValue().intValue();
                      Integer integer = (ogv12.b.containsKey(key1) && ((integer = ogv12.b.get(key1)) != null && i5 == integer.intValue()))? 0: 1;
                      if (integer) {
                         linkedHashMa2.put(uEntry1.getKey(), uEntry1.getValue());
                      }
                   }
                   t = linkedHashMa2;
                }
             }else {
                ogv12 = ogv11;
                t = b.t;
             }
             gv1 d = ogv1.d;
             if (r) {
                linkedHashMa = et0.g(d);
                ogv12.getClass();
                if (ogv12.c.isEmpty()) {
                   uobyteArray4 = uobyteArray2;
                   uobyteArray5 = uobyteArray;
                   oo11 = t;
                }else {
                   ArrayList uArrayList1 = new ArrayList();
                   iterator2 = linkedHashMa.entrySet().iterator();
                   while (iterator2.hasNext()) {
                      uEntry1 = iterator2.next();
                      key1 = uEntry1.getKey();
                      ArrayList uArrayList2 = new ArrayList();
                      Iterator iterator3 = uEntry1.getValue().iterator();
                      while (iterator3.hasNext()) {
                         obj = iterator3.next();
                         obj1 = obj;
                         if ((ojv1 = ogv12.c.get(or7.e(obj1))) != null) {
                            uobyteArray4 = uobyteArray2;
                            uobyteArray5 = uobyteArray;
                            iterator4 = iterator2;
                            oo11 = t;
                            if (!(obj1.b - ojv1.a) && !(obj1.c - ojv1.b)) {
                               treeMap = 0;
                            label_02d9 :
                               if (treeMap) {
                                  uArrayList2.add(obj);
                               }
                               t = oo11;
                               uobyteArray = uobyteArray5;
                               uobyteArray2 = uobyteArray4;
                               iterator2 = iterator4;
                               ojv1 = 3;
                            }
                         }else {
                            uobyteArray4 = uobyteArray2;
                            uobyteArray5 = uobyteArray;
                            iterator4 = iterator2;
                            oo11 = t;
                         }
                         treeMap = 1;
                         goto label_02d9 ;
                      }
                      uobyteArray4 = uobyteArray2;
                      uobyteArray5 = uobyteArray;
                      iterator4 = iterator2;
                      oo11 = t;
                      t65 ot65 = new t65(key1, uArrayList2);
                      if (!(i8 = uArrayList2.isEmpty() ^ 1)) {
                         ot65 = null;
                      }
                      if (ot65 != null) {
                         uArrayList1.add(ot65);
                      }
                      t = oo11;
                      uobyteArray = uobyteArray5;
                      uobyteArray2 = uobyteArray4;
                      iterator2 = iterator4;
                      ojv1 = 3;
                   }
                   uobyteArray4 = uobyteArray2;
                   uobyteArray5 = uobyteArray;
                   oo11 = t;
                   linkedHashMa = q14.q0(uArrayList1);
                }
             }else {
                uobyteArray4 = uobyteArray2;
                uobyteArray5 = uobyteArray;
                oo11 = t;
                linkedHashMa = et0.g(d);
             }
             ogv1.n.getClass();
             co5.o(oo11, "allRateLimitedEvents");
             treeMap = new TreeMap(oo11);
             cv1 uocv1 = EventSenderStats2NonAuth.R();
             String[] stringArray = new String[0];
             TreeSet treeSet = new TreeSet();
             uk.s0(treeSet, stringArray);
             LinkedHashMap linkedHashMa1 = new LinkedHashMap();
             t65[] ot65Array = new t65[]{new t65(pv1.v, new ev1(new vm6(2, uocv1))),new t65(pv1.w, new ev1(new vm6(3, uocv1))),new t65(pv1.x, new ev1(new vm6(4, uocv1))),new t65(pv1.y, new ev1(new vm6(5, uocv1))),new t65(pv1.z, new ev1(new vm6(6, uocv1))),new t65(pv1.A, new ev1(new vm6(7, uocv1))),new t65(pv1.B, new ev1(new vm6(8, uocv1)))};
             co5.l(uocv1, "invoke$lambda$8");
             Map map = q14.o0(ot65Array);
             iterator = list.iterator();
             while (iterator.hasNext()) {
                ovv1 = iterator.next();
                treeSet.add(ovv1.b);
                d1 = ovv1.d;
                if ((list1 = linkedHashMa1.get(d1)) != null) {
                   list1.add(ovv1);
                }else {
                   vv1[] ovv1Array = new vv1[]{ovv1};
                   linkedHashMa1.put(d1, ye7.M(ovv1Array));
                }
             }
             treeSet.addAll(treeMap.keySet());
             treeSet.addAll(linkedHashMa.keySet());
             uocv1.c(treeSet);
             iterator = linkedHashMa1.entrySet().iterator();
             while (iterator.hasNext()) {
                List value = iterator.next().getValue();
                uocv1.e(value.size());
                len = 0;
                d1 = value.get(len).c;
                uocv1.k(i80.c(d1, len, d1.length));
                Iterator iterator1 = value.iterator();
                while (iterator1.hasNext()) {
                   ovv1 = iterator1.next();
                   uocv1.d(dj0.n0(treeSet, ovv1.b));
                   f1 = ovv1.f;
                   long l = ((d1 = ovv1.e) != null)? d1.longValue(): f1;
                   uocv1.f(l);
                   uocv1.h(ovv1.g);
                   uocv1.g(f1);
                }
             }
             iterator = linkedHashMa.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                key = uEntry.getKey();
                uocv1.p(dj0.n0(treeSet, key));
                Set set = dj0.E0(pv1.c);
                iterator2 = uEntry.getValue().iterator();
                while (iterator2.hasNext()) {
                   ff1 uoff1 = iterator2.next();
                   if ((uoev1 = map.get(uoff1.d)) != null && (uoev1 = uoev1.a) != null) {
                      cv1 uocv11 = uoev1.invoke(Long.valueOf(uoff1.b));
                   }
                   set.remove(uoff1.d);
                }
                iterator2 = set.iterator();
                while (iterator2.hasNext()) {
                   if ((uoev11 = map.get(iterator2.next())) != null && (uoev11 = uoev11.a) != null) {
                      uocv12 = uoev11.invoke(Long.valueOf(0));
                   }
                }
             }
             iterator = treeMap.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                key = uEntry.getKey();
                uocv1.j(dj0.n0(treeSet, key));
                uocv1.i((long)uEntry.getValue().intValue());
             }
             c uoc = uocv1.build();
             co5.l(uoc, "newBuilder\(\).apply {\n   …  }\n            }.build\(\)");
             uocv12 = (uoc.getSerializedSize() <= 0x19000)? 1: 0;
             if (uocv12) {
                g = new ew1(ogv1.h, ye7.J(ogv1.o.a(uoc, uobyteArray5)));
             }else {
                et5 uoet5 = RejectedClientEventNonAuth.h();
                uoet5.c("EventSenderStats2NonAuth");
                uoet5.d("PAYLOAD_SIZE_LIMIT_EXCEEDED");
                ogv1.l.getClass();
                a1 = ogv1.i;
                a1.v.j("RejectedClientEventNonAuth", uoet5.build().toByteArray(), a1.c, uobyteArray4[0], a1.t, a1.y, a1.x, false, null, a1.w.j(), System.currentTimeMillis(), null);
             }
             return g;
          }
       }
       ogv11 = j;
       goto label_01d3 ;
    }
}
