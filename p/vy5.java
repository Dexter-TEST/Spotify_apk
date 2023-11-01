package p.vy5;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.util.ArrayList;
import p.ia4;
import java.util.LinkedHashSet;
import p.ka4;
import java.util.HashSet;
import java.lang.Integer;
import java.util.Arrays;
import p.xy5;
import p.ck;
import java.util.Iterator;
import java.lang.Number;
import java.util.Set;
import p.tp2;
import java.lang.IllegalArgumentException;
import p.az5;
import p.o51;
import android.app.ActivityManager;
import p.qw6;
import java.util.concurrent.Executor;
import java.lang.Package;
import java.lang.StringBuilder;
import java.lang.ClassLoader;
import p.rw6;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import p.ml1;
import p.p16;
import p.iq;
import p.jj;
import p.ae4;
import p.vc3;
import android.content.Intent;
import java.util.Map$Entry;
import java.lang.RuntimeException;

public final class vy5	// class@002a8e from classes.dex
{
    public final Context a;
    public final Class b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public Executor g;
    public Executor h;
    public qw6 i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean m;
    public final long n;
    public final ia4 o;
    public final LinkedHashSet p;
    public HashSet q;

    public void vy5(Context p0,Class p1,String p2){
       co5.o(p0, "context");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new ArrayList();
       this.e = new ArrayList();
       this.f = new ArrayList();
       this.k = 1;
       this.l = true;
       this.n = -1;
       this.o = new ia4();
       this.p = new LinkedHashSet();
    }
    public final void a(ka4[] p0){
       if (this.q == null) {
          this.q = new HashSet();
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          vy5 tq = this.q;
          co5.i(tq);
          tq.add(Integer.valueOf(oobject.a));
          tq = this.q;
          co5.i(tq);
          tq.add(Integer.valueOf(oobject.b));
       }
       this.o.a(Arrays.copyOf(p0, p0.length));
       return;
    }
    public final xy5 b(){
       vy5 g;
       int i1;
       int i2;
       az5 uoaz5;
       vy5 k;
       vy5 a;
       vy5 ovy52;
       vy5 g1;
       vy5 h1;
       o51 v15;
       int i5;
       boolean i7;
       Map map;
       p16 op16;
       o51 j1;
       o51 b1;
       o51 a3;
       xy5 b2;
       int i8;
       vy5 ovy5 = this;
       if ((g = ovy5.g) == null && ovy5.h == null) {
          bk h = ck.H;
          ovy5.h = h;
          ovy5.g = h;
       }else if(g != null && ovy5.h == null){
          ovy5.h = g;
       }else if(g == null){
          ovy5.g = ovy5.h;
       }
       g = ovy5.q;
       vy5 p = ovy5.p;
       int i = 1;
       if (g != null) {
          Iterator iterator = g.iterator();
          while (true) {
             if (iterator.hasNext()) {
                i1 = iterator.next().intValue();
                if (!(i2 = p.contains(Integer.valueOf(i1)) ^ i)) {
                   throw new IllegalArgumentException(tp2.k("Inconsistency detected. A Migration was supplied to addMigration\(Migration... migrations\) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom\(int... startVersions\). Start version: ", i1).toString());
                }
                continue ;
             }
          }
       }
       if ((g = ovy5.i) == null) {
          uoaz5 = new az5();
       }
       vy5 ovy51 = uoaz5;
       String str = "Required value was null.";
       if ((ovy5.n) > 0) {
          if (ovy5.c != null) {
             throw new IllegalArgumentException(str.toString());
          }else {
             throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
          }
       }else {
          vy5 c = ovy5.c;
          vy5 o = ovy5.o;
          vy5 d = ovy5.d;
          vy5 j = ovy5.j;
          if ((k = ovy5.k) != null) {
             a = ovy5.a;
             String str1 = "context";
             co5.o(a, str1);
             if (k != i) {
                ovy52 = k;
             }else {
                Object systemServic = a.getSystemService("activity");
                if (systemServic instanceof ActivityManager) {
                }else {
                   systemServic = null;
                }
                if (systemServic != null && !systemServic.isLowRamDevice()) {
                   i8 = 3;
                }else {
                   i8 = 2;
                }
             }
             if ((g1 = ovy5.g) != null) {
                if ((h1 = ovy5.h) != null) {
                   String str2 = str;
                   int b = true;
                   String str3 = str1;
                   o51 oo51 = v15;
                   v15 = new o51(a, c, ovy51, o, d, j, ovy52, g1, h1, ovy5.l, ovy5.m, p, ovy5.e, ovy5.f);
                   k = this.b;
                   co5.o(k, "klass");
                   Package package = k.getPackage();
                   co5.i(package);
                   String name = package.getName();
                   String canonicalNam = k.getCanonicalName();
                   co5.i(canonicalNam);
                   co5.l(name, "fullPackage");
                   int i3 = 0;
                   o = (!name.length())? 1: 0;
                   if (!o) {
                      canonicalNam = canonicalNam.substring((name.length() + b));
                      co5.l(canonicalNam, "this as java.lang.String\).substring\(startIndex\)");
                   }
                   char c1 = '.';
                   canonicalNam = canonicalNam.replace(c1, '_');
                   co5.l(canonicalNam, "this as java.lang.String…replace\(oldChar, newChar\)");
                   canonicalNam = canonicalNam.concat("_Impl");
                   try{
                      j = (!name.length())? 1: 0;
                      name = (j)? canonicalNam: name+c1+canonicalNam;
                      Class uClass = Class.forName(name, b, k.getClassLoader());
                      co5.j(uClass, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                      xy5 oxy5 = uClass.newInstance();
                      oxy5.getClass();
                      o51 oo511 = oo51;
                      oxy5.d = oxy5.g(oo511);
                      BitSet uBitSet = new BitSet();
                      Iterator iterator1 = oxy5.j().iterator();
                      while (true) {
                         xy5 h2 = oxy5.h;
                         int i4 = -1;
                         o51 ae4 p1 = oo511.p;
                         if (iterator1.hasNext()) {
                            Class uClass1 = iterator1.next();
                            if ((i5 = p1.size() + i4) >= 0) {
                               while (true) {
                                  int i6 = i5 - 1;
                                  if (uClass1.isAssignableFrom(p1.get(i5).getClass())) {
                                     uBitSet.set(i5);
                                     i4 = i5;
                                  }else if(i6 < 0){
                                     i5 = i6;
                                  }
                               }
                            }
                            i5 = (i4 >= 0)? 1: 0;
                            if (i5) {
                               h2.put(uClass1, p1.get(i4));
                            }else {
                               throw new IllegalArgumentException("A required auto migration spec \("+uClass1.getCanonicalName()+"\) is missing in the database configuration.".toString());
                            }
                         }else if((i2 = p1.size() + i4) >= 0){
                            while (true) {
                               i7 = i2 - 1;
                               if (!uBitSet.get(i2)) {
                                  throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                               }
                               if (i7 >= 0) {
                                  i2 = i7;
                               }
                            }
                         }
                         iterator1 = oxy5.h(h2).iterator();
                         while (iterator1.hasNext()) {
                            ka4 oka4 = iterator1.next();
                            ka4 a1 = oka4.a;
                            o51 d1 = oo511.d;
                            ia4 a2 = d1.a;
                            if (a2.containsKey(Integer.valueOf(a1))) {
                               if ((map = a2.get(Integer.valueOf(a1))) == null) {
                                  map = ml1.a;
                               }
                               i7 = map.containsKey(Integer.valueOf(oka4.b));
                            }else {
                               i7 = false;
                            }
                            if (!i7) {
                               ka4[] oka4Array = new ka4[b];
                               oka4Array[i3] = oka4;
                               d1.a(oka4Array);
                            }else {
                               continue ;
                            }
                         }
                         if ((op16 = xy5.s(p16.class, oxy5.i())) != null) {
                            op16.getClass();
                         }
                         xy5 e = oxy5.e;
                         if (xy5.s(iq.class, oxy5.i()) == null) {
                            i2 = (oo511.g == 3)? true: false;
                            oxy5.i().setWriteAheadLoggingEnabled(i2);
                            oxy5.g = oo511.e;
                            oxy5.b = oo511.h;
                            oxy5.c = new jj(oo511.i, b);
                            oxy5.f = oo511.f;
                            if ((j1 = oo511.j) != null) {
                               if ((b1 = oo511.b) != null) {
                                  e.getClass();
                                  a3 = oo511.a;
                                  co5.o(a3, str3);
                                  if ((b2 = e.a.b) != null) {
                                     p1 = new ae4(a3, b1, j1, e, b2);
                                  }else {
                                     co5.N("internalQueryExecutor");
                                     throw null;
                                  }
                               }else {
                                  throw new IllegalArgumentException(str2.toString());
                               }
                            }
                            BitSet uBitSet1 = new BitSet();
                            Iterator iterator2 = oxy5.k().entrySet().iterator();
                            while (true) {
                               o51 o1 = oo511.o;
                               if (iterator2.hasNext()) {
                                  Map$Entry uEntry = iterator2.next();
                                  Class key = uEntry.getKey();
                                  Iterator iterator3 = uEntry.getValue().iterator();
                                  while (true) {
                                     if (iterator3.hasNext()) {
                                        Class uClass2 = iterator3.next();
                                        if ((i8 = o1.size() + i4) >= 0) {
                                           while (true) {
                                              i5 = i8 - 1;
                                              if (uClass2.isAssignableFrom(o1.get(i8).getClass())) {
                                                 uBitSet1.set(i8);
                                              }else if(i5 < 0){
                                                 i8 = i5;
                                              }
                                           }
                                           a3 = (i8 >= 0)? 1: 0;
                                           if (a3) {
                                              oxy5.k.put(uClass2, o1.get(i8));
                                           }else {
                                              throw new IllegalArgumentException("A required type converter \("+uClass2+"\) for "+key.getCanonicalName()+" is missing in the database configuration.".toString());
                                           }
                                        }
                                        i8 = -1;
                                     }else {
                                        continue ;
                                     }
                                  }
                               }else if((b = o1.size() + i4) >= 0){
                                  while (true) {
                                     i1 = b - 1;
                                     if (!uBitSet1.get(b)) {
                                        throw new IllegalArgumentException("Unexpected type converter "+o1.get(b)+". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                     }
                                     if (i1 >= 0) {
                                        b = i1;
                                     }
                                  }
                               }
                               break ;
                            }
                            return oxy5;
                         }else {
                            e.getClass();
                            co5.o(null, "autoCloser");
                            throw null;
                         }
                      }
                   }catch(java.lang.ClassNotFoundException e0){
                      throw new RuntimeException("Cannot find implementation for "+k.getCanonicalName()+". "+canonicalNam+" does not exist");
                   }catch(java.lang.IllegalAccessException e0){
                      throw new RuntimeException("Cannot access the constructor "+k+".canonicalName");
                   }catch(java.lang.InstantiationException e0){
                      throw new RuntimeException("Failed to create an instance of "+k+".canonicalName");
                   }
                }else {
                   throw new IllegalArgumentException(str.toString());
                }
             }else {
                throw new IllegalArgumentException(str.toString());
             }
          }else {
             throw null;
          }
       }
    }
}
