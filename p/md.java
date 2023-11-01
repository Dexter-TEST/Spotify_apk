package p.md;
import p.b47;
import java.lang.String;
import p.sc4;
import p.gg1;
import java.lang.Object;
import p.co5;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.lang.CharSequence;
import p.av6;
import java.lang.IllegalArgumentException;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import p.ri2;
import java.lang.Long;
import java.lang.Number;
import p.dj0;
import p.a47;
import p.c47;
import p.ml1;
import java.lang.Class;
import p.g06;
import p.h06;
import java.util.List;
import p.ye7;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import p.xf7;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import p.wf7;
import p.vf7;
import p.yf7;
import p.zf2;
import p.t65;
import p.xe7;
import p.q14;
import p.ll1;
import p.kd3;
import p.cd2;
import p.b45;

public final class md implements b47	// class@001e77 from classes.dex
{
    public final String a;
    public final sc4 b;
    public final gg1 c;
    public final UUID d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public final ConcurrentHashMap g;
    public String h;
    public final AtomicBoolean i;
    public Long j;
    public final ConcurrentHashMap k;
    public final Set l;
    public final Set m;

    public void md(String p0,sc4 p1){
       co5.o(p0, "category");
       co5.o(p1, "timestampProvider");
       super();
       this.a = p0;
       this.b = p1;
       this.c = new gg1();
       UUID uUID = UUID.randomUUID();
       co5.l(uUID, "randomUUID\(\)");
       this.d = uUID;
       this.e = new ConcurrentHashMap();
       this.f = new ConcurrentHashMap();
       this.g = new ConcurrentHashMap();
       this.i = new AtomicBoolean(true);
       this.k = new ConcurrentHashMap();
       Set set = Collections.newSetFromMap(new ConcurrentHashMap());
       co5.l(set, "newSetFromMap\(ConcurrentHashMap\(\)\)");
       this.l = set;
       set = Collections.newSetFromMap(new ConcurrentHashMap());
       co5.l(set, "newSetFromMap\(ConcurrentHashMap\(\)\)");
       this.m = set;
       if ((av6.p0(p0) ^ true)) {
          return;
       }
       throw new IllegalArgumentException("Category must not be empty".toString());
    }
    public static Set f(Collection p0,long p1){
       ri2 c;
       Long longx;
       ArrayList uArrayList = new ArrayList(aj0.b0(p0));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ri2 ori2 = iterator.next();
          if ((c = ori2.c) != null) {
             long l = c.longValue() - p1;
             longx = Long.valueOf(l);
          }else {
             longx = null;
          }
          uArrayList.add(new ri2(ori2.a, ori2.b, longx, ori2.d));
       }
       return dj0.F0(uArrayList);
    }
    public final md a(String p0,String p1){
       co5.o(p1, "value");
       this.f.put(p0, p1);
       return this;
    }
    public final a47 b(){
       c47 uoc47;
       c47 uoc471;
       md d;
       md a;
       md e;
       md f;
       Collection uCollection;
       md j;
       long l;
       String str1;
       vf7 ovf7;
       String str2;
       Map map;
       ll1 oll1;
       ArrayList key;
       vf7 ovf71;
       Pattern pattern;
       Iterator iterator2;
       md omd = this;
       boolean b = false;
       int i = 2;
       if (!omd.i.getAndSet(b)) {
          uoc47 = new c47(i, ml1.a, this.d());
       }else {
          omd.c.getClass();
          g06[] og06Array = new g06[4];
          og06Array[0] = h06.b;
          int i1 = 1;
          og06Array[1] = h06.e;
          og06Array[2] = h06.d;
          og06Array[3] = h06.c;
          Iterator iterator = ye7.K(og06Array).iterator();
          while (true) {
             e = 0;
             if (iterator.hasNext()) {
                String str = "input";
                str1 = "compile\(pattern\)";
                switch (iterator.next().a){
                    case 0:
                      d = omd.l;
                      if (d.isEmpty()) {
                      label_013d :
                         ovf7 = e;
                      }else {
                         ovf71 = new vf7(d);
                      label_0129 :
                         ovf7 = ovf71;
                      }
                      break;
                    case 1:
                      pattern = Pattern.compile("^[a-zA-Z0-9/_\\s.-]+$");
                      co5.l(pattern, str1);
                      LinkedHashMap linkedHashMa = new LinkedHashMap();
                      iterator2 = omd.f.entrySet().iterator();
                      while (iterator2.hasNext()) {
                         Map$Entry uEntry2 = iterator2.next();
                         String key1 = uEntry2.getKey();
                         String value = uEntry2.getValue();
                         String str4 = "".append(key1).append(value).toString();
                         co5.o(str4, str);
                         int i2 = (pattern.matcher(str4).matches() && ((i2 = av6.p0(key1) ^ i1) && (i2 = av6.p0(value) ^ i1)))? 1: 0;
                         if (!i2) {
                            linkedHashMa.put(uEntry2.getKey(), uEntry2.getValue());
                         }
                      }
                      if (linkedHashMa.isEmpty()) {
                         goto label_013d ;
                      }else {
                         ovf7 = new wf7(linkedHashMa);
                      }
                      break;
                    case 2:
                      pattern = Pattern.compile("^[a-zA-Z0-9_.-]+$");
                      co5.l(pattern, str1);
                      Set set1 = omd.g.keySet();
                      co5.l(set1, "points.keys");
                      key = new ArrayList();
                      iterator2 = set1.iterator();
                      while (iterator2.hasNext()) {
                         Object obj = iterator2.next();
                         Object obj1 = obj;
                         co5.o(obj1, str);
                         if (!pattern.matcher(obj1).matches()) {
                            key.add(obj);
                         }
                      }
                      if (key.isEmpty()) {
                         goto label_013d ;
                      }else {
                         ovf7 = new xf7(dj0.F0(key));
                      }
                      break;
                    default:
                      d = omd.m;
                      if (d.isEmpty() && this.e().isEmpty()) {
                         goto label_013d ;
                      }else {
                         ovf71 = new yf7(d, this.e());
                         goto label_0129 ;
                      }
                }
                if (ovf7 == null) {
                   continue ;
                }
             }else {
                ovf7 = e;
             }
             if (ovf7 != null) {
                Set set = this.d();
                str1 = "-";
                if (ovf7 instanceof vf7) {
                   str2 = dj0.q0(ovf7.d, ", ", null, null, null, 62);
                   if (!av6.p0(str2)) {
                      str1 = str2;
                   }
                   map = xe7.H(new t65("duplicated_points", str1));
                }else if(ovf7 instanceof yf7){
                   t65[] ot65Array = new t65[i];
                   xf7 oxf7 = ovf7;
                   String str3 = dj0.q0(oxf7.d, ", ", null, null, null, 62);
                   if (av6.p0(str3)) {
                      str3 = str1;
                   }
                   ot65Array[b] = new t65("not_started_point_identifiers", str3);
                   str2 = dj0.q0(oxf7.e, ", ", null, null, null, 62);
                   if (!av6.p0(str2)) {
                      str1 = str2;
                   }
                   ot65Array[i1] = new t65("not_finished_point_identifiers", str1);
                   map = q14.o0(ot65Array);
                }else if(ovf7 instanceof xf7){
                   str2 = dj0.q0(ovf7.d, ", ", null, null, null, 62);
                   if (!av6.p0(str2)) {
                      str1 = str2;
                   }
                   map = xe7.H(new t65("invalid_point_identifiers", str1));
                }else if(ovf7 instanceof wf7){
                   wf7 d1 = ovf7.d;
                   co5.o(d1, "<this>");
                   ll1 a1 = ll1.a;
                   if (d1.size()) {
                      Iterator iterator1 = d1.entrySet().iterator();
                      if (iterator1.hasNext()) {
                         Map$Entry uEntry = iterator1.next();
                         if (!iterator1.hasNext()) {
                            a1 = ye7.J(new t65(uEntry.getKey(), uEntry.getValue()));
                         }else {
                            ArrayList uArrayList = new ArrayList(d1.size());
                            uArrayList.add(new t65(uEntry.getKey(), uEntry.getValue()));
                            do {
                               Map$Entry uEntry1 = iterator1.next();
                               key = uEntry1.getKey();
                               uArrayList.add(new t65(key, uEntry1.getValue()));
                            } while (!iterator1.hasNext());
                            key = uArrayList;
                         label_026f :
                            str2 = dj0.q0(oll1, ",", null, null, null, 62);
                            if (!av6.p0(str2)) {
                               str1 = str2;
                            }
                            map = xe7.H(new t65("invalid_dimensions", str1));
                         }
                      }
                   }
                   oll1 = a1;
                   goto label_026f ;
                }else {
                   throw new cd2(10);
                }
                uoc47 = new c47(ovf7.a, map, set);
             }else {
                uoc471 = e;
             label_029d :
                d = omd.d;
                a = omd.a;
                e = omd.e;
                f = omd.f;
                uCollection = omd.g.values();
                co5.l(uCollection, "points.values");
                l = ((j = omd.j) != null)? j.longValue(): 0;
                break ;
             }
          }
          a47 uoc472 = new a47(d, a, e, f, md.f(uCollection, l), omd.h, uoc471);
          return uoc47;
       }
       uoc471 = uoc47;
       goto label_029d ;
    }
    public final void c(String p0){
       b45 uob45;
       ri2 ori2;
       co5.o(p0, "identifier");
       long l = this.b.a();
       if ((uob45 = this.k.get(p0)) == null) {
          this.m.add(p0);
          return;
       }else {
          md th = this.h;
          b45 a = uob45.a;
          ri2 a1 = a.a;
          if (th == null) {
             th = a.b;
          }
          ri2 c = a.c;
          Long longx = ((ori2 = c) != null)? Long.valueOf((l - ori2.longValue())): null;
          ri2 ori21 = new ri2(a1, th, c, longx);
          this.g.put(ori21.a, ori21);
          this.k.remove(uob45.a.a);
          return;
       }
    }
    public final Set d(){
       md tj;
       Collection uCollection = this.k.values();
       co5.l(uCollection, "ongoingPoints.values");
       ArrayList uArrayList = new ArrayList(aj0.b0(uCollection));
       Iterator iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().a);
       }
       long l = ((tj = this.j) != null)? tj.longValue(): 0;
       return md.f(uArrayList, l);
    }
    public final Set e(){
       Collection uCollection = this.k.values();
       co5.l(uCollection, "ongoingPoints.values");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj.b != null) {
             uArrayList.add(obj);
          }
       }
       ArrayList uArrayList1 = new ArrayList(aj0.b0(uArrayList));
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          uArrayList1.add(iterator1.next().a.a);
       }
       return dj0.F0(uArrayList1);
    }
    public final void g(String p0){
       co5.o(p0, "identifier");
       this.i(p0, null, true);
    }
    public final void h(String p0,long p1,String p2,boolean p3,boolean p4){
       md tk = this.k;
       int i = (!this.g.containsKey(p0) && !tk.containsKey(p0))? 0: 1;
       if (i) {
          this.l.add(p0);
          return;
       }else if(!p3 && this.j != null){
          this.j = Long.valueOf(p1);
       }
       tk.put(p0, new b45(new ri2(p0, p2, Long.valueOf(p1), null), p4));
       return;
    }
    public final void i(String p0,String p1,boolean p2){
       co5.o(p0, "identifier");
       this.h(p0, this.b.a(), p1, false, p2);
    }
}
