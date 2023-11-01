package p.fk3;
import p.vj3;
import p.ek3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.k02;
import p.uj3;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import p.dk3;
import androidx.lifecycle.a;
import java.lang.ref.Reference;
import java.lang.Enum;
import java.util.HashMap;
import p.kj3;
import java.lang.Class;
import p.ij3;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import p.w16;
import p.ck;
import p.tp2;
import p.a26;
import p.v16;
import java.lang.Boolean;
import java.util.WeakHashMap;
import p.y16;
import java.util.Map$Entry;
import p.x16;

public final class fk3 extends vj3	// class@0015e3 from classes.dex
{
    public final boolean a;
    public k02 b;
    public uj3 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;

    public void fk3(ek3 p0){
       co5.o(p0, "provider");
       super();
       this.a = true;
       this.b = new k02();
       this.c = uj3.b;
       this.h = new ArrayList();
       this.d = new WeakReference(p0);
    }
    public final void a(dk3 p0){
       ek3 uoek3;
       kj3 okj3;
       co5.o(p0, "observer");
       this.e("addObserver");
       uj3 a = uj3.a;
       if (this.c == a) {
       }else {
          a = uj3.b;
       }
       a uoa = new a(p0, a);
       if (this.b.b(p0, uoa) != null) {
          return;
       }else if((uoek3 = this.d.get()) == null){
          return;
       }else {
          int i = 1;
          int i1 = (this.e == null && this.f == null)? 0: 1;
          uj3 ouj3 = this.d(p0);
          this.e = this.e + i;
          while (true) {
             if (uoa.a.compareTo(ouj3) < 0 && this.b.v.containsKey(p0)) {
                fk3 th = this.h;
                th.add(uoa.a);
                kj3.Companion.getClass();
                if ((okj3 = ij3.a(uoa.a)) != null) {
                   uoa.a(uoek3, okj3);
                   i = th.size() - 1;
                   th.remove(i);
                   ouj3 = this.d(p0);
                }else {
                   throw new IllegalStateException("no event up from "+uoa.a);
                }
             }else if(!i1){
                this.i();
                break ;
             }
             break ;
          }
          this.e = this.e - 1;
          return;
       }
    }
    public final uj3 b(){
       return this.c;
    }
    public final void c(dk3 p0){
       co5.o(p0, "observer");
       this.e("removeObserver");
       this.b.c(p0);
    }
    public final uj3 d(dk3 p0){
       fk3 tb = this.b;
       Enum uEnum = null;
       w16 t = (tb.v.containsKey(p0))? tb.v.get(p0).t: uEnum;
       a a = (t != null && (t = t.b) != null)? t.a: uEnum;
       tb = this.h;
       if ((tb.isEmpty() ^ 0x01)) {
          uEnum = tb.get((tb.size() - 1));
       }
       tb = this.c;
       co5.o(tb, "state1");
       if (a == null || a.compareTo(tb) >= 0) {
          a = tb;
       }
       if (uEnum == null || uEnum.compareTo(a) >= 0) {
          uEnum = a;
       }
       return uEnum;
    }
    public final void e(String p0){
       if (this.a != null && !ck.o0().p0()) {
          throw new IllegalStateException(tp2.m("Method ", p0, " must be called on the main thread").toString());
       }
       return;
    }
    public final void f(kj3 p0){
       co5.o(p0, "event");
       this.e("handleLifecycleEvent");
       this.g(p0.a());
    }
    public final void g(uj3 p0){
       fk3 tc;
       if ((tc = this.c) == p0) {
          return;
       }
       uj3 a = uj3.a;
       tc = (tc == uj3.b && p0 == a)? 0: 1;
       if (tc) {
          this.c = p0;
          if (this.f == null && this.e == null) {
             this.f = true;
             this.i();
             this.f = false;
             if (this.c == a) {
                this.b = new k02();
             }
             return;
          }else {
             this.g = true;
             return;
          }
       }else {
          throw new IllegalStateException("no event down from "+this.c+" in component "+this.d.get().toString());
       }
    }
    public final void h(uj3 p0){
       co5.o(p0, "state");
       this.e("setCurrentState");
       this.g(p0);
    }
    public final void i(){
       ek3 uoek3;
       Map$Entry uEntry;
       dk3 key;
       a value;
       int i1;
       kj3 okj3;
       if ((uoek3 = this.d.get()) == null) {
          throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
       }
       while (true) {
          fk3 tb = this.b;
          boolean b = false;
          int i = 1;
          if (tb.t != null) {
             a26 b1 = tb.a;
             co5.i(b1);
             a26 a = this.b.b;
             co5.i(a);
             a a2 = a.b.a;
             if (b1.b.a != a2 || this.c != a2) {
                b1 = 0;
             label_0034 :
                if (!tb) {
                   this.g = b;
                   a = this.b.a;
                   co5.i(a);
                   fk3 th = this.h;
                   if (this.c.compareTo(a.b.a) < 0) {
                      tb = this.b;
                      v16 ov16 = new v16(tb.b, tb.a, i);
                      tb.c.put(ov16, Boolean.FALSE);
                      while (true) {
                         if (ov16.hasNext() && this.g == null) {
                            uEntry = ov16.next();
                            co5.l(uEntry, "next\(\)");
                            key = uEntry.getKey();
                            value = uEntry.getValue();
                            while (true) {
                               if (value.a.compareTo(this.c) > 0 && (this.g == null && this.b.v.containsKey(key))) {
                                  a a1 = value.a;
                                  kj3.Companion.getClass();
                                  co5.o(a1, "state");
                                  if ((i1 = a1.ordinal()) != 2) {
                                     if (i1 != 3) {
                                        okj3 = (i1 != 4)? null: kj3.ON_PAUSE;
                                     }else {
                                        okj3 = kj3.ON_STOP;
                                     }
                                  }else {
                                     okj3 = kj3.ON_DESTROY;
                                  }
                                  if (okj3 != null) {
                                     th.add(okj3.a());
                                     value.a(uoek3, okj3);
                                     i1 = th.size() - 1;
                                     th.remove(i1);
                                  }else {
                                     break ;
                                  }
                               }else {
                                  continue ;
                               }
                            }
                            throw new IllegalStateException("no event down from "+value.a);
                         }
                      }
                   }
                   b1 = this.b.b;
                   if (this.g == null && (b1 != null && this.c.compareTo(b1.b.a) > 0)) {
                      tb = this.b;
                      tb.getClass();
                      x16 ox16 = new x16(tb);
                      tb.c.put(ox16, Boolean.FALSE);
                      while (true) {
                         if (ox16.hasNext() && this.g == null) {
                            uEntry = ox16.next();
                            key = uEntry.getKey();
                            value = uEntry.getValue();
                            while (true) {
                               if (value.a.compareTo(this.c) < 0 && (this.g == null && this.b.v.containsKey(key))) {
                                  th.add(value.a);
                                  kj3.Companion.getClass();
                                  if ((okj3 = ij3.a(value.a)) != null) {
                                     value.a(uoek3, okj3);
                                     i1 = th.size() - 1;
                                     th.remove(i1);
                                  }else {
                                     throw new IllegalStateException("no event up from "+value.a);
                                  }
                               }else {
                                  continue ;
                               }
                            }
                         }else {
                            continue ;
                         }
                      }
                   }else {
                      continue ;
                   }
                }else {
                   this.g = b;
                   return;
                }
             }
          }
          tb = 1;
          goto label_0034 ;
       }
    }
}
