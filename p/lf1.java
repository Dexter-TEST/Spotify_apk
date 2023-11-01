package p.lf1;
import p.if1;
import android.content.Context;
import p.hs3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.google.gson.internal.Excluder;
import p.pv3;
import p.w22;
import java.util.HashMap;
import java.util.ArrayList;
import p.q57;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import com.google.gson.internal.sql.a;
import com.google.gson.a;
import p.q22;
import p.nv3;
import p.m57;
import p.n57;
import p.kf1;
import p.ma7;
import java.util.LinkedHashMap;
import p.sv1;
import p.hf1;
import p.rv1;
import p.ye7;
import java.util.LinkedHashSet;
import java.util.Set;
import p.jf1;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;
import p.jk0;
import p.hs0;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import p.tv1;
import p.ef1;
import java.lang.Class;
import p.oe0;
import java.nio.charset.Charset;
import com.spotify.eventsender.droppedevents.proto.EventCounters;
import java.lang.Throwable;
import com.spotify.eventsender.droppedevents.proto.a;
import com.spotify.eventsender.droppedevents.proto.b;
import com.spotify.eventsender.droppedevents.proto.EventCounters$Counters;
import java.lang.Long;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.pv1;
import java.lang.Enum;
import java.lang.CharSequence;
import p.av6;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.reflect.Type;
import p.ac3;
import p.jv3;
import java.lang.Iterable;
import java.lang.Number;
import p.aj0;
import java.lang.StringBuilder;
import p.ff1;

public final class lf1 implements if1	// class@001d3f from classes.dex
{
    public final Context a;
    public final hs3 b;
    public final a c;
    public final String d;
    public final Type e;
    public final LinkedHashMap f;
    public final ArrayList g;
    public final Set h;

    public void lf1(Context p0,hs3 p1){
       co5.o(p1, "logger");
       super();
       this.a = p0;
       this.b = p1;
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = new ArrayList(((uArrayList1.size() + uArrayList.size()) + 3));
       uArrayList2.addAll(uArrayList);
       Collections.reverse(uArrayList2);
       uArrayList = new ArrayList(uArrayList1);
       Collections.reverse(uArrayList);
       uArrayList2.addAll(uArrayList);
       a a.a = new a(Excluder.w, w22.a, new HashMap(), true, pv3.a, uArrayList2, q57.a, q57.b);
       this.c = a.a;
       this.d = "DroppedEventsPersisterImplLock";
       this.e = new kf1().b;
       this.f = new LinkedHashMap();
       sv1[] osv1Array = new sv1[2];
       osv1Array[0] = new hf1(a.a);
       rv1 a.a1 = new rv1(a.a);
       osv1Array[1] = a.a1;
       this.g = ye7.e(osv1Array);
       this.h = Collections.synchronizedSet(new LinkedHashSet());
       Completable.i(new jf1(this, 0)).p(s36.c).m().subscribe(new jf1(this, 1), new hs0(3, this));
    }
    public static final void a(lf1 p0,Map p1,Map p2){
       tv1 otv1;
       Iterator iterator = p2.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          tv1 value = uEntry.getValue();
          if ((otv1 = p1.get(key)) == null) {
             otv1 = new tv1();
             p1.put(key, otv1);
          }
          co5.o(value, "other");
          value = value.a;
          int len = value.length;
          int i = 0;
          int i1 = 0;
          while (i < len) {
             int i2 = i1 + 1;
             tv1 a = otv1.a;
             object oobject = a[i1];
             oobject.c(value[i]);
             a[i1] = oobject;
             i = i + 1;
             i1 = i2;
          }
       }
       return;
    }
    public static final Map b(lf1 p0,byte[] p1){
       Map map;
       String message;
       p0.getClass();
       String str = new String(p1, oe0.a);
       int i = 0;
       if (str.length() > 4 && (str.charAt(i) == '1' && str.charAt(i) != '2')) {
          int i1 = 10;
          if (str.charAt(1) == i1 && (str.charAt(2) == i1 && (str.charAt(3) == '{' && str.charAt((str.length() - 1)) == '}'))) {
             i = 1;
          }
       }
       try{
          if (i) {
             map = p0.e(str);
          }else {
             EventCounters uEventCounte = EventCounters.k(p1);
             co5.l(uEventCounte, "parseFrom\(data\)");
             map = p0.f(uEventCounte);
          }
       }catch(java.lang.RuntimeException e6){
          if ((message = e6.getMessage()) == null) {
             message = "";
          }
          map.b.a("Cannot parse data: ".concat(message));
          map = new LinkedHashMap();
       }
       return map;
    }
    public static EventCounters c(LinkedHashMap p0){
       a uoa = EventCounters.j();
       uoa.d();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          tv1 value = uEntry.getValue();
          b uob = EventCounters$Counters.i();
          value.getClass();
          value = value.a;
          ArrayList uArrayList = new ArrayList(value.length);
          int len = value.length;
          for (int i = 0; i < len; i = i + 1) {
             uArrayList.add(Long.valueOf(value[i].b()));
          }
          uob.c(uArrayList);
          uoa.c(key, uob.build());
       }
       c uoc = uoa.build();
       co5.l(uoc, "countersBuilder.build\(\)");
       return uoc;
    }
    public final void d(String p0,pv1 p1){
       tv1 otv1;
       co5.o(p0, "eventName");
       if (!this.h.contains(p1)) {
          return;
       }
       lf1 td = this.d;
       _monitor_enter(td);
       lf1 tf = this.f;
       if ((otv1 = tf.get(p0)) == null) {
          otv1 = new tv1();
          tf.put(p0, otv1);
       }
       object oobject = otv1.a[p1.ordinal()];
       oobject.e((oobject.b() + 1));
       _monitor_exit(td);
       return;
    }
    public final Map e(String p0){
       int i1;
       LinkedHashMap linkedHashMa;
       String[] stringArray = new String[]{"\n\n"};
       int i = 0;
       List list = av6.B0(p0, stringArray, i, 6);
       if (list.size() == 2) {
          if ((i1 = Integer.parseInt(list.get(i))) != 3) {
             i1 = i1 - 1;
             lf1 tg = this.g;
             if (i1 >= 0 && i1 < tg.size()) {
                i = 1;
             }
             if (i) {
                linkedHashMa = tg.get(i1).a(list.get(1));
             }else {
                throw new IllegalStateException("No EventStatesCounter migration for version 3".toString());
             }
          }else {
             linkedHashMa = this.c.b(list.get(1), this.e);
             co5.l(linkedHashMa, "{\n                gson.f…reportType\)\n            }");
          }
       }else {
          linkedHashMa = new LinkedHashMap();
       }
       return linkedHashMa;
    }
    public final LinkedHashMap f(EventCounters p0){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       lf1 b = this.b;
       if (p0.i() == 3) {
          Map map = p0.h();
          co5.l(map, "protoCounters.eventNameToCountersMapMap");
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             EventCounters$Counters value = uEntry.getValue();
             ac3 uoac3 = value.g();
             co5.l(uoac3, "protoEventCounters.countersList");
             tv1 otv1 = null;
             if (uoac3.c <= pv1.t) {
                tv1 otv11 = new tv1();
                Iterator iterator2 = uoac3.iterator();
                int i = 0;
                while (true) {
                   if (iterator2.hasNext()) {
                      Object obj = iterator2.next();
                      int i1 = i + 1;
                      if (i >= 0) {
                         object oobject = otv11.a[i];
                         long l = obj.longValue() + oobject.b();
                         oobject.e(l);
                         i = i1;
                      }else {
                         ye7.W();
                         throw otv1;
                      }
                   }else {
                      otv1 = otv11;
                   }
                }
             }
             if (otv1 == null) {
                ac3 uoac31 = value.g();
                co5.l(uoac31, "protoEventCounters.countersList");
                ArrayList uArrayList = new ArrayList(aj0.b0(uoac31));
                Iterator iterator1 = uoac31.iterator();
                while (iterator1.hasNext()) {
                   uArrayList.add(String.valueOf(iterator1.next()));
                }
                b.a("Cannot parse counters proto array ".append(uArrayList).toString());
             }else {
                co5.l(key, "protoEventName");
                linkedHashMa.put(key, otv1);
                continue ;
             }
          }
       }else {
          b.a("Unknown counters proto file version "+p0+".fileFormatVersion");
       }
       return linkedHashMa;
    }
    public final LinkedHashMap g(Map p0){
       lf1 td = this.d;
       _monitor_enter(td);
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          linkedHashMa.put(key, uEntry.getValue());
       }
       _monitor_exit(td);
       return linkedHashMa;
    }
    public final void h(List p0){
       tv1 otv1;
       co5.o(p0, "reportedEvents");
       lf1 td = this.d;
       _monitor_enter(td);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ff1 uoff1 = iterator.next();
          if ((otv1 = this.f.get(uoff1.a)) != null) {
             ff1 d = uoff1.d;
             co5.o(d, "state");
             otv1.a[d.ordinal()].d(uoff1.b);
          }
       }
       _monitor_exit(td);
       return;
    }
}
