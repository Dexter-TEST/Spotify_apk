package p.en0;
import p.xj0;
import java.util.ArrayList;
import p.zl0;
import java.util.HashMap;
import p.bu1;
import java.lang.Class;
import p.jv6;
import p.cn5;
import java.lang.Object;
import java.util.Iterator;
import p.ym0;
import java.util.List;
import java.util.Collection;
import p.w11;
import java.util.Set;
import p.x11;
import java.util.HashSet;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.k91;
import java.util.AbstractCollection;
import p.vi3;
import p.bn0;
import p.um5;
import java.util.Map$Entry;
import p.za4;
import p.cn0;
import p.ll;
import p.qt;
import p.dn0;

public final class en0 extends xj0	// class@0014bb from classes.dex
{
    public final HashMap H;
    public final HashMap I;
    public final HashMap J;
    public final bu1 K;
    public static final int L;

    public void en0(ArrayList p0,zl0[] p1){
       object oobject;
       w11 ow11;
       Iterator iterator2;
       Class uClass;
       boolean i2;
       Iterator iterator3;
       Set set1;
       zl0 ozl01;
       en0 tI;
       Map$Entry uEntry;
       vi3 value;
       k91 ok911;
       super();
       this.H = new HashMap();
       this.I = new HashMap();
       this.J = new HashMap();
       bu1 uobu1 = new bu1();
       this.K = uobu1;
       ArrayList uArrayList = new ArrayList();
       int i = 2;
       Class[] uClassArray = new Class[i];
       uClassArray[0] = jv6.class;
       uClassArray[1] = cn5.class;
       uArrayList.add(zl0.b(uobu1, bu1.class, uClassArray));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.addAll(iterator.next().getComponents());
       }
       int len = p1.length;
       int i1 = 0;
       while (i1 < len) {
          if ((oobject = p1[i1]) != null) {
             uArrayList.add(oobject);
          }
          i1 = i1 + 1;
       }
       HashMap hashMap = new HashMap(uArrayList.size());
       Iterator iterator1 = uArrayList.iterator();
       while (true) {
          if (iterator1.hasNext()) {
             zl0 ozl0 = iterator1.next();
             ow11 = new w11(ozl0);
             iterator2 = ozl0.a.iterator();
             while (true) {
                if (iterator2.hasNext()) {
                   uClass = iterator2.next();
                   i2 = (ozl0.d == null)? 1: 0;
                   i2 = i2 ^ 1;
                   x11 ox11 = new x11(uClass, i2);
                   if (!hashMap.containsKey(ox11)) {
                      hashMap.put(ox11, new HashSet());
                   }
                   Set set = hashMap.get(ox11);
                   if (!set.isEmpty() && !i2) {
                      break ;
                   }else {
                      set.add(ow11);
                   }
                }else {
                   continue ;
                }
             }
             Object[] objArray = new Object[]{uClass};
             throw new IllegalArgumentException(String.format("Multiple components provide %s.", objArray));
          }else {
             iterator1 = hashMap.values().iterator();
             while (iterator1.hasNext()) {
                iterator3 = iterator1.next().iterator();
                while (iterator3.hasNext()) {
                   ow11 = iterator3.next();
                   iterator2 = ow11.a.b.iterator();
                   while (iterator2.hasNext()) {
                      k91 ok91 = iterator2.next();
                      ok91.getClass();
                      i2 = (ok91.b == i)? true: false;
                      if ((set1 = hashMap.get(new x11(ok91.a, i2))) == null) {
                      }else {
                         Iterator iterator4 = set1.iterator();
                         while (iterator4.hasNext()) {
                            w11 ow111 = iterator4.next();
                            ow11.b.add(ow111);
                            ow111.c.add(ow11);
                         }
                      }
                   }
                }
             }
             HashSet hashSet = new HashSet();
             iterator = hashMap.values().iterator();
             while (iterator.hasNext()) {
                hashSet.addAll(iterator.next());
             }
             HashSet hashSet1 = new HashSet();
             iterator3 = hashSet.iterator();
             while (iterator3.hasNext()) {
                ow11 = iterator3.next();
                if (ow11.c.isEmpty()) {
                   hashSet1.add(ow11);
                }else {
                   continue ;
                }
             }
             i1 = 0;
             while (!hashSet1.isEmpty()) {
                ow11 = hashSet1.iterator().next();
                hashSet1.remove(ow11);
                i1 = i1 + 1;
                iterator2 = ow11.b.iterator();
                while (iterator2.hasNext()) {
                   w11 ow112 = iterator2.next();
                   ow112.c.remove(ow11);
                   if (ow112.c.isEmpty()) {
                      hashSet1.add(ow112);
                   }else {
                      continue ;
                   }
                }
             }
             if (i1 == uArrayList.size()) {
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   ozl01 = iterator.next();
                   this.H.put(ozl01, new vi3(new bn0(this, ozl01)));
                }
                en0 tH = this.H;
                iterator1 = tH.entrySet().iterator();
                while (true) {
                   tI = this.I;
                   if (iterator1.hasNext()) {
                      uEntry = iterator1.next();
                      zl0 key = uEntry.getKey();
                      iterator2 = (key.d == null)? 1: 0;
                      if (!iterator2) {
                      }else {
                         value = uEntry.getValue();
                         Iterator iterator5 = key.a.iterator();
                         while (iterator5.hasNext()) {
                            tI.put(iterator5.next(), value);
                         }
                      }
                   }else {
                      break ;
                   }
                }
                iterator = tH.keySet().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      ozl01 = iterator.next();
                      iterator3 = ozl01.b.iterator();
                      do {
                         if (iterator3.hasNext()) {
                            ok911 = iterator3.next();
                            iterator2 = (ok911.b == 1)? 1: 0;
                            if (iterator2) {
                               ok911 = ok911.a;
                               if (tI.containsKey(ok911)) {
                                  continue ;
                               }else {
                               }
                            }else {
                               continue ;
                            }
                         }else {
                            continue ;
                         }
                      } while (tI.containsKey(ok911));
                      Object[] objArray1 = new Object[i];
                      objArray1[0] = ozl01;
                      objArray1[1] = ok911;
                      throw new za4(String.format("Unsatisfied dependency for component %s: %s", objArray1));
                   }else {
                      hashMap = new HashMap();
                      iterator1 = this.H.entrySet().iterator();
                      while (iterator1.hasNext()) {
                         uEntry = iterator1.next();
                         zl0 key1 = uEntry.getKey();
                         i = (key1.d == null)? 1: 0;
                         if (i) {
                         }else {
                            value = uEntry.getValue();
                            Iterator iterator6 = key1.a.iterator();
                            while (iterator6.hasNext()) {
                               Class uClass1 = iterator6.next();
                               if (!hashMap.containsKey(uClass1)) {
                                  hashMap.put(uClass1, new HashSet());
                               }
                               hashMap.get(uClass1).add(value);
                            }
                         }
                      }
                      iterator = hashMap.entrySet().iterator();
                      while (iterator.hasNext()) {
                         Map$Entry uEntry1 = iterator.next();
                         Set value1 = uEntry1.getValue();
                         this.J.put(uEntry1.getKey(), new vi3(new cn0(value1)));
                      }
                      return;
                   }
                }
             }else {
                hashSet1 = new ArrayList();
                iterator1 = hashSet.iterator();
                while (iterator1.hasNext()) {
                   w11 ow113 = iterator1.next();
                   if (!ow113.c.isEmpty() && !ow113.b.isEmpty()) {
                      hashSet1.add(ow113.a);
                   }else {
                      continue ;
                   }
                }
                throw new ll(hashSet1);
             }
          }
       }
    }
    public final um5 b(Class p0){
       return this.I.get(p0);
    }
    public final um5 c(){
       vi3 ovi3;
       if ((ovi3 = this.J.get(qt.class)) != null) {
          return ovi3;
       }
       return dn0.a;
    }
}
