package p.nx5;
import p.xj0;
import p.zl0;
import p.en0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.lang.Object;
import p.k91;
import java.lang.Class;
import p.cn5;
import java.util.Collections;
import p.tm0;
import p.mx5;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.um5;
import p.qt;

public final class nx5 extends xj0	// class@00206b from classes.dex
{
    public final Set H;
    public final Set I;
    public final Set J;
    public final Set K;
    public final tm0 L;

    public void nx5(zl0 p0,en0 p1){
       super();
       HashSet hashSet = new HashSet();
       HashSet hashSet1 = new HashSet();
       HashSet hashSet2 = new HashSet();
       HashSet hashSet3 = new HashSet();
       Iterator iterator = p0.b.iterator();
       while (iterator.hasNext()) {
          k91 ok91 = iterator.next();
          ok91.getClass();
          int i = (ok91.b == 2)? 1: 0;
          ok91 = ok91.a;
          if (i) {
             hashSet2.add(ok91);
          }else {
             hashSet.add(ok91);
          }
       }
       if (!p0.f.isEmpty()) {
          hashSet.add(cn5.class);
       }
       this.H = Collections.unmodifiableSet(hashSet);
       this.I = Collections.unmodifiableSet(hashSet1);
       this.J = Collections.unmodifiableSet(hashSet2);
       this.K = Collections.unmodifiableSet(hashSet3);
       this.L = p1;
       return;
    }
    public final Object a(Class p0){
       if (this.H.contains(p0)) {
          Object obj = this.L.a(p0);
          if (!p0.equals(cn5.class)) {
             return obj;
          }
          return new mx5();
       }else {
          Object[] objArray = new Object[]{p0};
          throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", objArray));
       }
    }
    public final um5 b(Class p0){
       if (this.I.contains(p0)) {
          return this.L.b(p0);
       }
       Object[] objArray = new Object[]{p0};
       throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", objArray));
    }
    public final um5 c(){
       qt oqt = qt.class;
       if (this.K.contains(oqt)) {
          return this.L.c();
       }
       Object[] objArray = new Object[]{oqt};
       throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", objArray));
    }
    public final Set d(){
       qt oqt = qt.class;
       if (this.J.contains(oqt)) {
          return this.L.d();
       }
       Object[] objArray = new Object[]{oqt};
       throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", objArray));
    }
}
