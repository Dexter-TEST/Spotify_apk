package p.ir3;
import p.bx6;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.IllegalStateException;
import p.hr3;

public final class ir3	// class@0019ed from classes.dex
{
    private Object _next;
    private long _state;
    public final int a;
    public final boolean b;
    public final int c;
    public final AtomicReferenceArray d;
    public static final AtomicReferenceFieldUpdater e;
    public static final AtomicLongFieldUpdater f;
    public static final bx6 g;

    static {
       ir3.g = new bx6("REMOVE_FROZEN");
       ir3.e = AtomicReferenceFieldUpdater.newUpdater(ir3.class, Object.class, "_next");
       ir3.f = AtomicLongFieldUpdater.newUpdater(ir3.class, "_state");
    }
    public void ir3(int p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
       int i = p0 - 1;
       this.c = i;
       this._next = null;
       this._state = 0;
       this.d = new AtomicReferenceArray(p0);
       int i1 = 0;
       int i2 = (i <= 0x3fffffff)? 1: 0;
       if (i2) {
          if (!((p0 & i))) {
             i1 = 1;
          }
          if (i1) {
             return;
          }else {
             throw new IllegalStateException("Check failed.".toString());
          }
       }else {
          throw new IllegalStateException("Check failed.".toString());
       }
    }
    public final int a(Object p0){
       ir3 a;
       ir3 oir3 = this;
       Object obj = p0;
       while (true) {
          ir3 _state = oir3._state;
          long l = 0x3000000000000000 & _state;
          int i = 0;
          int i1 = 1;
          if (l - i) {
             if ((0x2000000000000000 & _state) - i) {
                i1 = 2;
             }
             return i1;
          }else {
             l = 0x3fffffff & _state;
             l = l >> 0;
             int i2 = (int)l;
             long l1 = 0xfffffffc0000000 & _state;
             l = 30;
             l1 = l1 >> l;
             int i3 = (int)l1;
             ir3 c = oir3.c;
             int i4 = i3 + 2;
             i4 = i4 & c;
             int i5 = i2 & c;
             if (i4 == i5) {
                return i1;
             }
             i5 = 0x3fffffff;
             if (oir3.b == null) {
                int i6 = i3 & c;
                if (oir3.d.get(i6) != null) {
                   if ((a = oir3.a) >= 1024) {
                      i3 = i3 - i2;
                      i2 = i3 & i5;
                      int i7 = a >> 1;
                      if (i2 <= i7) {
                         continue ;
                      }
                   }
                   return i1;
                }
             }
             i2 = i3 + 1;
             i2 = i2 & i5;
             long l2 = 0xf00000003fffffff & _state;
             l = (long)i2 << l;
             long l3 = l2 | l;
             if (ir3.f.compareAndSet(this, _state, l3)) {
                oir3.d.set((i3 & c), obj);
                a = oir3;
                while (true) {
                   long ir3 l4 = a._state & 0x1000000000000000;
                   if (l4) {
                      a = a.e();
                      l4 = a.d;
                      int i8 = a.c & i3;
                      Object obj1 = l4.get(i8);
                      if (obj1 instanceof hr3 && obj1.a == i3) {
                         l4.set(i8, obj);
                      }else {
                         a = null;
                      }
                      if (a == null) {
                         break ;
                      }else {
                         continue ;
                      }
                   }else {
                      break ;
                   }
                }
                return 0;
             }
          }
       }
    }
    public final boolean b(){
       while (true) {
          ir3 t_state = this._state;
          long l = 0x2000000000000000;
          long l1 = t_state & l;
          if (l1) {
             return true;
          }
          l1 = 0x1000000000000000 & t_state;
          if (l1) {
             return false;
          }
          l1 = t_state | l;
          if (!ir3.f.compareAndSet(this, t_state, l1)) {
             continue ;
          }else {
             break ;
          }
       }
       return true;
    }
    public final int c(){
       ir3 t_state = this._state;
       return (0x3fffffff & ((int)((t_state & 0xfffffffc0000000) >> 30) - (int)((0x3fffffff & t_state) >> 0)));
    }
    public final boolean d(){
       ir3 t_state = this._state;
       long l = 0;
       if ((int)((0x3fffffff & t_state) >> l) == (int)((t_state & 0xfffffffc0000000) >> 30)) {
          l = true;
       }
       return l;
    }
    public final ir3 e(){
       ir3 t_next;
       long l2;
       hr3 ohr3;
       while (true) {
          ir3 t_state = this._state;
          long l = 0x1000000000000000;
          long l1 = t_state & l;
          if (!(l1)) {
             l2 = t_state | l;
             if (ir3.f.compareAndSet(this, t_state, l2)) {
                t_state = l2;
             }
          }
          while ((t_next = this._next) == null) {
             AtomicReferenceFieldUpdater e = ir3.e;
             int i = this.a * 2;
             ir3 oir3 = new ir3(i, this.b);
             l1 = 0x3fffffff & t_state;
             l1 = l1 >> 0;
             int i1 = (int)l1;
             l2 = 0xfffffffc0000000 & t_state;
             l2 = l2 >> 30;
             i = (int)l2;
             while (true) {
                ir3 tc = this.c;
                int i2 = i1 & tc;
                int i3 = tc & i;
                if (i2 != i3) {
                   if ((ohr3 = this.d.get(i2)) == null) {
                      ohr3 = new hr3(i1);
                   }
                   int i4 = oir3.c & i1;
                   oir3.d.set(i4, ohr3);
                   i1 = i1 + 1;
                }else {
                   break ;
                }
             }
             l1 = 0xefffffffffffffff & t_state;
             oir3._state = l1;
          }
          return t_next;
       }
    }
    public final Object f(){
       Object obj;
       ir3 oir3 = this;
       while (true) {
          ir3 _state = oir3._state;
          long l = _state & 0x1000000000000000;
          if (l) {
             return ir3.g;
          }
          l = _state & 0x3fffffff;
          l = l >> 0;
          int i = (int)l;
          l = 0xfffffffc0000000 & _state;
          l = l >> 30;
          int i1 = (int)l;
          ir3 c = oir3.c;
          i1 = i1 & c;
          int i2 = c & i;
          if (i1 == i2) {
             return null;
          }
          if ((obj = oir3.d.get(i2)) == null) {
             if (oir3.b != null) {
                return null;
             }
          }else if(obj instanceof hr3){
             return null;
          }else {
             i2 = i + 1;
             i2 = i2 & 0x3fffffff;
             long l1 = _state & -1073741824;
             long l2 = (long)i2 << 0;
             l1 = l1 | l2;
             Object obj1 = obj;
             if (ir3.f.compareAndSet(this, _state, l1)) {
                oir3.d.set((oir3.c & i), null);
                return obj1;
             }else if(oir3.b != null){
                c = oir3;
                do {
                   ir3 _state1 = c._state;
                   long l3 = _state1 & 0x3fffffff;
                   l3 = l3 >> 0;
                   int i3 = (int)l3;
                   l1 = _state1 & 0x1000000000000000;
                   if (l1) {
                      c = c.e();
                   }else {
                      l3 = _state1 & -1073741824;
                      long l4 = l3 | l2;
                      if (ir3.f.compareAndSet(c, _state1, l4)) {
                         i2 = c.c & i3;
                         c.d.set(i2, null);
                         c = null;
                      }else {
                         continue ;
                      }
                   }
                   if (c == null) {
                      break ;
                   }else {
                      continue ;
                   }
                } while (c == null);
                return obj1;
             }
          }
       }
    }
}
