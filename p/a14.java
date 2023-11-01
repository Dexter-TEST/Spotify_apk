package p.a14;
import java.util.Map;
import java.io.Serializable;
import p.fh3;
import p.fv1;
import java.lang.Object;
import p.io2;
import java.lang.Integer;
import p.ya6;
import java.io.NotSerializableException;
import java.lang.String;
import p.co5;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map$Entry;
import p.ib3;
import p.gb3;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.lang.OutOfMemoryError;
import java.util.Set;
import p.b14;
import java.lang.IllegalStateException;
import p.x04;
import p.z04;
import java.lang.StringBuilder;
import p.c14;

public final class a14 implements Map, Serializable, fh3	// class@000ef3 from classes.dex
{
    public c14 A;
    public b14 B;
    public boolean C;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] t;
    public int v;
    public int w;
    public int x;
    public int y;
    public b14 z;

    static {
       fv1 uofv1 = new fv1();
    }
    public void a14(){
       super(8);
    }
    public void a14(int p0){
       Object[] objArray = io2.b(p0);
       int[] ointArray = new int[p0];
       if (p0 < 1) {
          p0 = 1;
       }
       p0 = Integer.highestOneBit((p0 * 3));
       int[] ointArray1 = new int[p0];
       super();
       this.a = objArray;
       this.b = null;
       this.c = ointArray;
       this.t = ointArray1;
       this.v = 2;
       this.w = 0;
       this.x = Integer.numberOfLeadingZeros(p0) + 1;
       return;
    }
    private final Object writeReplace(){
       if (this.C != null) {
          return new ya6(this);
       }
       throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }
    public final int a(Object p0){
       int i;
       int i1;
       int i2;
       int i3;
       a14 tw;
       int i4;
       this.b();
       while (true) {
          i = this.g(p0);
          i1 = this.v * 2;
          i2 = this.t.length / 2;
          if (i1 > i2) {
             i1 = i2;
             break ;
          }else {
          }
       }
       i2 = 0;
       while (true) {
          a14 tt = this.t;
          if ((i3 = tt[i]) <= 0) {
             tw = this.w;
             a14 ta = this.a;
             if (tw >= ta.length) {
                this.e(1);
             }else {
                i4 = tw + 1;
                this.w = i4;
                ta[tw] = p0;
                p0[tw] = i;
                tt[i] = i4;
                this.y = this.y + 1;
                if (i2 > this.v) {
                   this.v = i2;
                   break ;
                }
                break ;
             }
          }else {
             i4 = i3 - 1;
             if (co5.c(this.a[i4], p0)) {
                return (- i3);
             }
             if ((i2 = i2 + 1) > i1) {
                i = this.t.length * 2;
                this.h(i);
                continue ;
             }else {
                int i5 = i - 1;
                if (!i) {
                   i = this.t.length - 1;
                }else {
                   i = i5;
                }
             }
          }
       }
       return tw;
    }
    public final void b(){
       if (this.C == null) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public final boolean c(Collection p0){
       Object obj;
       co5.o(p0, "m");
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if ((obj = iterator.next()) != null) {
             try{
                if (!this.d(obj)) {
                   break ;
                }
             }catch(java.lang.ClassCastException e0){
                break ;
             }
          }
       }
       return false;
    }
    public final void clear(){
       gb3 c;
       int i1;
       gb3 ogb3;
       int i3;
       a14 tb;
       this.b();
       int i = this.w - 1;
       ib3 oib3 = new ib3(0, i);
       gb3 b = oib3.b;
       if ((c = oib3.c) > null) {
          if (b >= null) {
          label_0018 :
             i1 = 1;
          label_001b :
             int i2 = (i1)? 0: b;
             while (true) {
                if (i1) {
                   if (i2 == b) {
                      if (i1) {
                         ogb3 = i2;
                         i1 = 0;
                      }else {
                         throw new NoSuchElementException();
                      }
                   }else {
                      ogb3 = c + i2;
                   }
                   a14 tc = this.c;
                   if ((i3 = tc[i2]) >= 0) {
                      this.t[i3] = 0;
                      tc[i2] = -1;
                   }
                   i2 = ogb3;
                }else {
                   io2.s(0, this.w, this.a);
                   if ((tb = this.b) != null) {
                      io2.s(0, this.w, tb);
                      break ;
                   }
                   break ;
                }
             }
             this.y = 0;
             this.w = 0;
             return;
          }
       }else if(b <= null){
          goto label_0018 ;
       }
       i1 = 0;
       goto label_001b ;
    }
    public final boolean containsKey(Object p0){
       boolean b = (this.f(p0) >= 0)? true: false;
       return b;
    }
    public final boolean containsValue(Object p0){
       int i1;
       boolean b;
       a14 tw = this.w;
       while (true) {
          int i = -1;
          if ((i1 = tw + i) >= 0) {
             if (this.c[i1] >= 0) {
                a14 tb = this.b;
                co5.i(tb);
                if (co5.c(tb[i1], p0)) {
                   i = i1;
                   break ;
                }
             }
          }else if(i >= 0){
             b = true;
          }else {
             b = false;
          }
          return b;
       }
    }
    public final boolean d(Map$Entry p0){
       int i;
       co5.o(p0, "entry");
       if ((i = this.f(p0.getKey())) < 0) {
          return false;
       }
       a14 tb = this.b;
       co5.i(tb);
       return co5.c(tb[i], p0.getValue());
    }
    public final void e(int p0){
       int i3;
       a14 tb;
       a14 ta = this.a;
       a14 tw = this.w;
       int i = ta.length - tw;
       int i1 = tw - this.y;
       int i2 = 1;
       i = (i < p0 && (((i + i1)) >= p0 && i1 >= (ta.length / 4)))? 1: 0;
       if (i) {
          this.h(this.t.length);
       }else if((i3 = tw + p0) >= 0){
          if (i3 > ta.length) {
             p0 = (ta.length * 3) / 2;
             if (i3 <= p0) {
                i3 = p0;
             }
             Object[] objArray = Arrays.copyOf(ta, i3);
             String str = "copyOf\(this, newSize\)";
             co5.l(objArray, str);
             this.a = objArray;
             if ((tb = this.b) != null) {
                objArray = Arrays.copyOf(tb, i3);
                co5.l(objArray, str);
             }else {
                objArray = null;
             }
             this.b = objArray;
             int[] ointArray = Arrays.copyOf(this.c, i3);
             co5.l(ointArray, str);
             this.c = ointArray;
             if (i3 >= i2) {
                i2 = i3;
             }
             if ((ointArray = Integer.highestOneBit((i2 * 3))) > this.t.length) {
                this.h(ointArray);
             }
          }
       }else {
          throw new OutOfMemoryError();
       }
       return;
    }
    public final Set entrySet(){
       a14 tB;
       if ((tB = this.B) == null) {
          tB = new b14(this, 0);
          this.B = tB;
       }
       return tB;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 != this) {
          if (p0 instanceof Map) {
             int i = (this.y == p0.size() && this.c(p0.entrySet()))? 1: 0;
             if (!i) {
             label_0022 :
                b = false;
             }
          }else {
             goto label_0022 ;
          }
       }
       return b;
    }
    public final int f(Object p0){
       int i1;
       int i2;
       int i = this.g(p0);
       a14 tv = this.v;
       while (true) {
          if (!(i1 = this.t[i])) {
             return -1;
          }
          if (i1 > 0) {
             i1 = i1 - 1;
             if (co5.c(this.a[i1], p0)) {
                return i1;
             }
          }
          if ((i2 = tv - 1) < 0) {
             break ;
          }else {
             i1 = i - 1;
             if (!i) {
                i = this.t.length - 1;
             }else {
                i = i1;
             }
          }
       }
       return -1;
    }
    public final int g(Object p0){
       int i = (p0 != null)? p0.hashCode(): 0;
       return ((i * -1640531527) >> this.x);
    }
    public final Object get(Object p0){
       int i;
       if ((i = this.f(p0)) < 0) {
          return null;
       }
       a14 tb = this.b;
       co5.i(tb);
       return tb[i];
    }
    public final void h(int p0){
       a14 tb;
       int i;
       a14 tw;
       int i3;
       if (this.w > this.y) {
          tb = this.b;
          i = 0;
          int i1 = 0;
          while (true) {
             tw = this.w;
             if (i < tw) {
                if (this.c[i] >= 0) {
                   tw = this.a;
                   tw[i1] = tw[i];
                   if (tb != null) {
                      tb[i1] = tb[i];
                   }
                   i1 = i1 + 1;
                }
                i = i + 1;
             }else {
                break ;
             }
          }
          io2.s(i1, tw, this.a);
          if (tb != null) {
             io2.s(i1, this.w, tb);
          }
          this.w = i1;
       }
       tb = this.t;
       if (p0 != tb.length) {
          int[] ointArray = new int[p0];
          this.t = ointArray;
          this.x = Integer.numberOfLeadingZeros(p0) + 1;
       }else {
          co5.o(tb, "<this>");
          Arrays.fill(tb, 0, tb.length, 0);
       }
       p0 = 0;
       while (true) {
          if (p0 >= this.w) {
             return;
          }
          int i2 = p0 + 1;
          i = this.g(this.a[p0]);
          tw = this.v;
          while (true) {
             a14 tt = this.t;
             if (!tt[i]) {
                tt[i] = i2;
                this.c[p0] = i;
                p0 = 1;
                break ;
             }else if((i3 = tw - 1) < 0){
                p0 = 0;
                break ;
             }else {
                int i4 = i - 1;
                if (!i) {
                   i = tt.length - 1;
                }else {
                   i = i4;
                }
             }
          }
          if (p0) {
             p0 = i2;
          }else {
          }
       }
       throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
    }
    public final int hashCode(){
       object oobject;
       object oobject1;
       x04 ox04 = new x04(this, 0);
       int i = 0;
       while (true) {
          if (!ox04.hasNext()) {
             return i;
          }
          z04 a = ox04.a;
          z04 c = ox04.c;
          if (a < c.w) {
             int i1 = a + 1;
             ox04.a = i1;
             ox04.b = a;
             int i2 = ((oobject = c.a[a]) != null)? oobject.hashCode(): 0;
             a14 b = c.b;
             co5.i(b);
             int i3 = ((oobject1 = b[ox04.b]) != null)? oobject1.hashCode(): 0;
             i2 = i2 ^ i3;
             ox04.a();
             i = i + i2;
          }else {
             break ;
          }
       }
       throw new NoSuchElementException();
    }
    public final void i(int p0){
       int i6;
       a14 ta = this.a;
       co5.o(ta, "<this>");
       ta[p0] = null;
       int i = this.c[p0];
       int i1 = this.v * 2;
       int i2 = this.t.length / 2;
       if (i1 > i2) {
          i1 = i2;
       }
       int i3 = i1;
       int i4 = 0;
       i1 = i;
       while (true) {
          int i5 = i - 1;
          i = (!i)? this.t.length - 1: i5;
          if ((i4 = i4 + 1) > this.v) {
             this.t[i1] = 0;
             break ;
          }else {
             a14 tt = this.t;
             if (!(i6 = tt[i])) {
                tt[i1] = 0;
                break ;
             }else if(i6 < 0){
                tt[i1] = -1;
             }else {
                int i7 = i6 - 1;
                i5 = this.g(this.a[i7]) - i;
                a14 tt1 = this.t;
                int i8 = tt1.length - 1;
                if ((i5 = i5 & i8) >= i4) {
                   tt1[i1] = i6;
                   this.c[i7] = i1;
                }else {
                label_005c :
                   if ((i3 = i3 - 1) < 0) {
                      this.t[i1] = -1;
                      break ;
                   }
                }
             }
             i1 = i;
             i4 = 0;
             goto label_005c ;
          }
       }
       this.c[p0] = -1;
       this.y = this.y - 1;
       return;
    }
    public final boolean isEmpty(){
       boolean b = (this.y == null)? true: false;
       return b;
    }
    public final Set keySet(){
       a14 tz;
       if ((tz = this.z) == null) {
          tz = new b14(this, 1);
          this.z = tz;
       }
       return tz;
    }
    public final Object put(Object p0,Object p1){
       a14 tb;
       this.b();
       int i = this.a(p0);
       if ((tb = this.b) != null) {
       }else {
          tb = io2.b(this.a.length);
          this.b = tb;
       }
       if (i < 0) {
          i = (- i) - 1;
          object oobject = tb[i];
          tb[i] = p1;
          return oobject;
       }else {
          tb[i] = p1;
          return null;
       }
    }
    public final void putAll(Map p0){
       a14 tb;
       co5.o(p0, "from");
       this.b();
       Set set = p0.entrySet();
       if (set.isEmpty()) {
       }else {
          this.e(set.size());
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             int i = this.a(uEntry.getKey());
             if ((tb = this.b) == null) {
                tb = io2.b(this.a.length);
                this.b = tb;
             }
             if (i >= 0) {
                tb[i] = uEntry.getValue();
             }else {
                i = - i;
                i = i - 1;
                if (!co5.c(uEntry.getValue(), tb[i])) {
                   tb[i] = uEntry.getValue();
                }
             }
          }
       }
       return;
    }
    public final Object remove(Object p0){
       int i;
       this.b();
       if ((i = this.f(p0)) < 0) {
          i = -1;
       }else {
          this.i(i);
       }
       if (i < 0) {
          return null;
       }else {
          a14 tb = this.b;
          co5.i(tb);
          object oobject = tb[i];
          tb[i] = null;
          return oobject;
       }
    }
    public final int size(){
       return this.y;
    }
    public final String toString(){
       String str = new StringBuilder(((this.y * 3) + 2))+"{";
       int i = 0;
       x04 ox04 = new x04(this, i);
       while (true) {
          if (ox04.hasNext()) {
             if (i > 0) {
                str = str.append(", ");
             }
             z04 a = ox04.a;
             z04 c = ox04.c;
             if (a < c.w) {
                int i1 = a + 1;
                ox04.a = i1;
                ox04.b = a;
                object oobject = c.a[a];
                str = (co5.c(oobject, c))? str.append("\(this Map\)"): str.append(oobject);
                str = str.append('=');
                a14 b = c.b;
                co5.i(b);
                oobject = b[ox04.b];
                str = (co5.c(oobject, c))? str.append("\(this Map\)"): str.append(oobject);
                ox04.a();
                i = i + 1;
             }else {
                break ;
             }
          }else {
             str = str+"}";
             co5.l(str, "sb.toString\(\)");
             return str;
          }
       }
       throw new NoSuchElementException();
    }
    public final Collection values(){
       a14 tA;
       if ((tA = this.A) == null) {
          tA = new c14(this);
          this.A = tA;
       }
       return tA;
    }
}
