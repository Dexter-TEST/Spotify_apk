package p.s83;
import java.lang.reflect.InvocationHandler;
import p.gx0;
import p.i16;
import java.lang.Object;
import p.t83;
import java.lang.Runnable;
import java.lang.String;
import p.co5;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Iterator;
import java.lang.Class;
import p.tu6;
import org.json.JSONObject;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArraySet;
import p.vb6;
import p.wb6;
import p.qv5;
import p.lx5;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import p.o11;
import p.p95;
import java.util.LinkedHashMap;
import p.vd7;
import java.util.ArrayList;
import p.c93;
import com.spotify.cosmos.cosmonaut.annotations.Path;
import java.lang.Number;
import p.fa5;
import java.util.Map;
import java.lang.IllegalArgumentException;
import p.tp2;
import java.lang.StringBuilder;
import p.en6;
import java.lang.IllegalStateException;
import java.util.Set;
import java.util.Map$Entry;
import p.hn5;
import com.spotify.cosmos.cosmonaut.annotations.Query;
import p.uw5;
import p.r45;
import com.spotify.cosmos.cosmonaut.annotations.QueryMap;
import java.lang.CharSequence;
import p.av6;
import p.np2;
import com.spotify.cosmos.cosmonaut.annotations.Header;
import p.b30;
import p.a30;
import p.jg2;
import io.reactivex.rxjava3.core.Observable;
import p.gx5;
import p.jy5;

public final class s83 implements InvocationHandler	// class@0025da from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void s83(gx0 p0,i16 p1){
       this.a = 2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public void s83(t83 p0,Runnable p1,int p2){
       this.a = p2;
       if (p2 != 1) {
          co5.o(p0, "this$0");
          this.c = p0;
          super();
          this.b = p1;
          return;
       }else {
          co5.o(p0, "this$0");
          this.c = p0;
          super();
          this.b = p1;
          return;
       }
    }
    public final Object invoke(Object p0,Method p1,Object[] p2){
       s83 obj2;
       wb6 owb6;
       c93 uoc93;
       String str2;
       object oobject1;
       String str7;
       object oobject3;
       wb6 owb61;
       int i = 1;
       int i1 = 0;
       o11 obj = null;
       switch (this.a){
           case 0:
             co5.o(p0, "proxy");
             co5.o(p1, "method");
             if (co5.c(p1.getName(), "onPurchaseHistoryResponse")) {
                p0 = (p2 == null)? obj: p2[i];
                if (p0 != null && p0 instanceof List) {
                   s83 tc = this.c;
                   p0 = p0.iterator();
                   while (p0.hasNext()) {
                      String obj1 = p0.next();
                      try{
                         Object[] objArray = new Object[i1];
                         obj1 = tu6.y(tc.g, obj1, tc.n, objArray);
                         if (obj1 instanceof String) {
                         }else {
                            obj2 = obj;
                         }
                         if (obj1 == null) {
                            continue ;
                         }else {
                            JSONObject jSONObject = new JSONObject(obj1);
                            jSONObject.put("packageName", tc.a.getPackageName());
                            if (jSONObject.has("productId")) {
                               obj1 = jSONObject.getString("productId");
                               tc.r.add(obj1);
                               co5.l(obj1, "skuID");
                               t83.w.put(obj1, jSONObject);
                            }
                         }
                      }catch(java.lang.Exception e0){
                      }
                   }
                   this.b.run();
                }
             }
             break;
           case 1:
             co5.o(p0, "proxy");
             co5.o(p1, "m");
             if (co5.c(p1.getName(), "onSkuDetailsResponse")) {
                p0 = (p2 == null)? obj: p2[i];
                if (p0 != null && p0 instanceof List) {
                   p0 = p0.iterator();
                   while (p0.hasNext()) {
                      p2 = p0.next();
                      try{
                         obj2 = this.c;
                         Object[] objArray1 = new Object[i1];
                         p2 = tu6.y(obj2.f, p2, obj2.m, objArray1);
                         if (p2 instanceof String) {
                         }else {
                            p2 = obj;
                         }
                         if (p2 == null) {
                            continue ;
                         }else {
                            JSONObject jSONObject1 = new JSONObject(p2);
                            if (jSONObject1.has("productId")) {
                               String str = jSONObject1.getString("productId");
                               co5.l(str, "skuID");
                               t83.x.put(str, jSONObject1);
                            }
                         }
                      }catch(java.lang.Exception e0){
                      }
                   }
                   this.b.run();
                }
             }
             return obj;
             break;
           default:
             co5.o(p0, "o");
             co5.o(p1, "method");
             p0 = this.b;
             obj2 = this.c;
             p0.getClass();
             co5.o(obj2, "rxRouter");
             if (co5.c(p1.getDeclaringClass(), Object.class)) {
                Object[] objArray2 = new Object[i];
                objArray2[i1] = p2;
                p0 = p1.invoke(p0, objArray2);
             }else {
                p0 = p0.a;
                p0.getClass();
                if ((owb6 = p0.a.get(p1)) == null) {
                   vb6 a1 = p0.a;
                   _monitor_enter(a1);
                   if ((owb61 = p0.a.get(p1)) == null) {
                      owb61 = new wb6(p1, p0.b, p0.c);
                      p0.a.put(p1, owb61);
                      _monitor_exit(a1);
                   }else {
                      _monitor_exit(a1);
                   }
                   owb6 = owb61;
                }
                p0 = owb6.a;
                p0.getClass();
                o11 b = p0.b;
                obj = p0.c;
                obj.getClass();
                LinkedHashMap linkedHashMa = new LinkedHashMap();
                fa5 b1 = vd7.b;
                Iterator iterator = obj.a.iterator();
                while (true) {
                   String str1 = "Required value was null.";
                   if (iterator.hasNext()) {
                      uoc93 = iterator.next();
                      str2 = uoc93.a.value();
                      if (p2 != null) {
                         object oobject = p2[uoc93.b];
                         co5.o(str2, "name");
                         if (oobject instanceof String) {
                         }else if(oobject instanceof Number){
                            oobject = oobject.toString();
                         }else {
                            p0 = "@Path argument ";
                            if (oobject == null) {
                               throw new IllegalArgumentException(tp2.m(p0, str2, " is null"));
                            }else {
                               throw new IllegalArgumentException(en6.t(p0, str2, " has unsupported type: ")+oobject.getClass().getName());
                            }
                         }
                         if (!uoc93.a.encoded()) {
                            oobject = b1.g(oobject);
                         }
                         linkedHashMa.put(str2, oobject);
                      }else {
                         throw new IllegalStateException(str1.toString());
                      }
                   }else {
                      String str3 = obj.b;
                      Iterator iterator1 = linkedHashMa.entrySet().iterator();
                      while (iterator1.hasNext()) {
                         Map$Entry uEntry = iterator1.next();
                         String str4 = "".append("{".append(uEntry.getKey()).toString()).append('}').toString();
                         int i2 = str3.indexOf(str4);
                         int i3 = str4.length() + i2;
                         str3.replace(i2, i3, uEntry.getValue());
                      }
                      String str5 = str3;
                      co5.l(str5, "builder.toString\(\)");
                      o11 t = p0.t;
                      t.getClass();
                      LinkedHashMap linkedHashMa1 = new LinkedHashMap();
                      fa5 a = vd7.a;
                      Iterator iterator2 = t.a.iterator();
                      while (true) {
                         if (iterator2.hasNext()) {
                            c93 uoc931 = iterator2.next();
                            if (p2 != null) {
                               if ((oobject1 = p2[uoc931.b]) != null) {
                                  uoc931 = uoc931.a;
                                  String str6 = uoc931.value();
                                  str7 = uw5.f(oobject1, str6);
                                  if (!uoc931.encoded()) {
                                     str7 = a.g(str7);
                                  }
                                  linkedHashMa1.put(str6, uw5.f(str7, str6));
                               }else {
                                  continue ;
                               }
                            }else {
                               throw new IllegalStateException(str1.toString());
                            }
                         }else {
                            a = vd7.a;
                            hn5 b2 = t.b;
                            if (b2.c()) {
                               c93 uoc932 = b2.b();
                               if (p2 != null) {
                                  object oobject2 = p2[uoc932.b];
                                  if (oobject2 instanceof Map) {
                                     co5.o(oobject2, "arg");
                                     iterator2 = oobject2.entrySet().iterator();
                                     while (iterator2.hasNext()) {
                                        Map$Entry uEntry1 = iterator2.next();
                                        str7 = uw5.f(uEntry1.getValue(), uEntry1.getKey());
                                        if (!uoc932.a.encoded()) {
                                           str7 = a.g(str7);
                                        }
                                        linkedHashMa1.put(uEntry1.getKey(), str7);
                                     }
                                  }
                               }else {
                                  throw new IllegalStateException(str1.toString());
                               }
                            }
                            if (!linkedHashMa1.isEmpty()) {
                               String str9 = str5;
                               char c = '?';
                               int i4 = av6.m0(str5, c, 0, 0, 6);
                               char c1 = '&';
                               if (i4 < 0) {
                                  str9 = str9+c;
                               }else if(i4 < (str9.length() - 1)){
                                  str9 = str9+c1;
                               }
                               iterator1 = linkedHashMa1.entrySet().iterator();
                               while (iterator1.hasNext()) {
                                  Map$Entry uEntry3 = iterator1.next();
                                  str9 = str9.append(uEntry3.getKey()).append('=').append(uEntry3.getValue()).append(c1);
                               }
                               str5 = str9.delete((str9.length() - 1), str9.length());
                               co5.l(str5, "sb.delete\(sb.length - 1, sb.length\).toString\(\)");
                            }
                            t = p0.v;
                            t.getClass();
                            linkedHashMa1 = new LinkedHashMap();
                            linkedHashMa1.putAll(t.a);
                            iterator = t.b.iterator();
                            while (true) {
                               if (iterator.hasNext()) {
                                  uoc93 = iterator.next();
                                  if (p2 != null) {
                                     String str8 = uoc93.a.value();
                                     linkedHashMa1.put(str8, uw5.e(p2[uoc93.b], str8));
                                  }else {
                                     throw new IllegalStateException(str1.toString());
                                  }
                               }else {
                                  Iterator iterator3 = t.c.iterator();
                                  while (true) {
                                     if (iterator3.hasNext()) {
                                        c93 uoc933 = iterator3.next();
                                        if (p2 != null) {
                                           if ((oobject3 = p2[uoc933.b]) != null) {
                                              if (oobject3 instanceof Map) {
                                                 iterator = oobject3.entrySet().iterator();
                                                 while (iterator.hasNext()) {
                                                    Map$Entry uEntry2 = iterator.next();
                                                    str2 = String.valueOf(uEntry2.getKey());
                                                    linkedHashMa1.put(str2, uw5.e(uEntry2.getValue(), str2));
                                                 }
                                              }else {
                                                 throw new IllegalArgumentException("@HeaderMap argument is not a java.util.Map".toString());
                                              }
                                           }else {
                                              throw new IllegalArgumentException("@HeaderMap argument is null".toString());
                                           }
                                        }else {
                                           throw new IllegalStateException(str1.toString());
                                        }
                                     }else {
                                        p0 = p0.w;
                                        p0.getClass();
                                        p0 = p0.a.g(new a30(0, p2)).e(b30.b);
                                        co5.l(p0, "args: Array<Any?>?\): Byt\x20\x02       .or\(DEFAULT_VALUE\)");
                                        Request request = new Request(b, str5, linkedHashMa1, p0);
                                        p0 = owb6.c.a(owb6.b, obj2.resolve(request));
                                        break ;
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
             return p0;
       }
       return obj;
    }
}
