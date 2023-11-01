package p.dk0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.lang.Object;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import java.lang.String;
import p.tp2;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import p.yj0;
import java.util.Map$Entry;
import p.w51;
import java.util.Objects;
import p.io2;
import p.ap5;
import java.lang.Math;
import java.util.Arrays;
import p.zj0;
import java.lang.Integer;
import java.util.LinkedHashMap;
import java.util.Collection;
import p.ck0;

public final class dk0 extends AbstractMap implements Serializable	// class@00135f from classes.dex
{
    public Object a;
    public int[] b;
    public Object[] c;
    public Object[] t;
    public int v;
    public int w;
    public zj0 x;
    public zj0 y;
    public ck0 z;
    public static final Object A;

    static {
       dk0.A = new Object();
    }
    public void dk0(){
       super();
       this.c(3);
    }
    public void dk0(int p0){
       super();
       this.c(12);
    }
    private void readObject(ObjectInputStream p0){
       int i;
       p0.defaultReadObject();
       if ((i = p0.readInt()) < 0) {
          throw new InvalidObjectException(tp2.k("Invalid size: ", i));
       }
       this.c(i);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.put(p0.readObject(), p0.readObject());
       }
       return;
    }
    private void writeObject(ObjectOutputStream p0){
       Map map;
       p0.defaultWriteObject();
       p0.writeInt(this.size());
       Iterator iterator = ((map = this.a()) != null)? map.entrySet().iterator(): new yj0(this, 1);
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p0.writeObject(uEntry.getKey());
          p0.writeObject(uEntry.getValue());
       }
       return;
    }
    public final Map a(){
       dk0 ta = this.a;
       if (ta instanceof Map) {
          return ta;
       }
       return null;
    }
    public final int b(Object p0){
       int i2;
       int i5;
       if (this.f()) {
          return -1;
       }
       int i = w51.Q(p0);
       int i1 = (1 << (this.v & 0x1f)) - 1;
       dk0 ta = this.a;
       Objects.requireNonNull(ta);
       if (!(i2 = w51.R((i & i1), ta))) {
          return -1;
       }
       int i3 = ~ i1;
       i = i & i3;
       while (true) {
          i2 = i2 - 1;
          int i4 = this.h()[i2];
          if ((i5 = i4 & i3) == i && io2.j(p0, this.d(i2))) {
             return i2;
          }
          if (!(i2 = i4 & i1)) {
             break ;
          }
       }
       return -1;
    }
    public final void c(int p0){
       int i = 1;
       boolean b = (p0 >= 0)? true: false;
       ap5.d("Expected size must be >= 0", b);
       this.v = Math.min(Math.max(p0, i), 0x3fffffff);
       return;
    }
    public final void clear(){
       if (this.f()) {
          return;
       }
       this.v = this.v + 32;
       Map map = this.a();
       Object obj = null;
       if (map != null) {
          this.v = Math.min(Math.max(this.size(), 3), 0x3fffffff);
          map.clear();
          this.a = obj;
          this.w = 0;
       }else {
          Arrays.fill(this.i(), 0, this.w, obj);
          Arrays.fill(this.j(), 0, this.w, obj);
          dk0 ta = this.a;
          Objects.requireNonNull(ta);
          if (ta instanceof byte[]) {
             Arrays.fill(ta, 0);
          }else if(ta instanceof short[]){
             Arrays.fill(ta, 0);
          }else {
             Arrays.fill(ta, 0);
          }
          Arrays.fill(this.h(), 0, this.w, 0);
          this.w = 0;
       }
       return;
    }
    public final boolean containsKey(Object p0){
       Map map;
       boolean b;
       if ((map = this.a()) != null) {
          b = map.containsKey(p0);
       }else if(this.b(p0) != -1){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public final boolean containsValue(Object p0){
       Map map;
       if ((map = this.a()) != null) {
          return map.containsValue(p0);
       }
       int i = 0;
       while (true) {
          if (i >= this.w) {
             return false;
          }
          if (io2.j(p0, this.l(i))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public final Object d(int p0){
       return this.i()[p0];
    }
    public final void e(int p0,int p1){
       int i3;
       dk0 ta = this.a;
       Objects.requireNonNull(ta);
       int[] ointArray = this.h();
       Object[] objArray = this.i();
       Object[] objArray1 = this.j();
       int i = this.size() - 1;
       if (p0 < i) {
          object oobject = objArray[i];
          objArray[p0] = oobject;
          objArray1[p0] = objArray1[i];
          objArray[i] = null;
          objArray1[i] = null;
          ointArray[p0] = ointArray[i];
          ointArray[i] = 0;
          int i1 = w51.Q(oobject) & p1;
          int i2 = w51.R(i1, ta);
          i = i + 1;
          if (i2 == i) {
             p0++;
             w51.S(i1, p0, ta);
          }else {
             while (true) {
                i2 = i2 - 1;
                i3 = ointArray[i2];
                if ((i1 = i3 & p1) == i) {
                   break ;
                }else {
                   i2 = i1;
                }
             }
             p0++;
             ointArray[i2] = (p0 & p1) | (i3 & (~ p1));
          }
       }else {
          objArray[p0] = null;
          objArray1[p0] = null;
          ointArray[p0] = 0;
       }
       return;
    }
    public final Set entrySet(){
       dk0 ty;
       if ((ty = this.y) == null) {
          ty = new zj0(this, 0);
          this.y = ty;
       }
       return ty;
    }
    public final boolean f(){
       boolean b = (this.a == null)? true: false;
       return b;
    }
    public final Object g(Object p0){
       int i1;
       Object a = dk0.A;
       if (this.f()) {
          return a;
       }
       int i = (1 << (this.v & 0x1f)) - 1;
       dk0 ta = this.a;
       Objects.requireNonNull(ta);
       if ((i1 = w51.M(p0, null, i, ta, this.h(), this.i(), null)) == -1) {
          return a;
       }
       this.e(i1, i);
       this.w = this.w - 1;
       this.v = this.v + 32;
       return this.l(i1);
    }
    public final Object get(Object p0){
       Map map;
       int i;
       if ((map = this.a()) != null) {
          return map.get(p0);
       }
       if ((i = this.b(p0)) == -1) {
          return null;
       }
       return this.l(i);
    }
    public final int[] h(){
       dk0 tb = this.b;
       Objects.requireNonNull(tb);
       return tb;
    }
    public final Object[] i(){
       dk0 tc = this.c;
       Objects.requireNonNull(tc);
       return tc;
    }
    public final boolean isEmpty(){
       boolean b = (!this.size())? true: false;
       return b;
    }
    public final Object[] j(){
       dk0 tt = this.t;
       Objects.requireNonNull(tt);
       return tt;
    }
    public final int k(int p0,int p1,int p2,int p3){
       Object obj = w51.p(p1);
       p1--;
       if (p3) {
          p3++;
          w51.S((p2 & p1), p3, obj);
       }
       dk0 ta = this.a;
       Objects.requireNonNull(ta);
       int[] ointArray = this.h();
       int i = 0;
       while (i <= p0) {
          for (int i1 = w51.R(i, ta); i1; i1 = i3 & p0) {
             int i2 = i1 - 1;
             int i3 = ointArray[i2];
             int i4 = ~ p0;
             i4 = i4 & i3;
             i4 = i4 | i;
             int i5 = i4 & p1;
             w51.S(i5, i1, obj);
             i1 = ~ p1;
             i1 = i1 & i4;
             i4 = w51.R(i5, obj) & p1;
             i1 = i1 | i4;
             ointArray[i2] = i1;
          }
          i = i + 1;
       }
       this.a = obj;
       this.v = ((Integer.numberOfLeadingZeros(p1) - 32) & 0x1f) | (this.v & 0xe0);
       return p1;
    }
    public final Set keySet(){
       dk0 tx;
       if ((tx = this.x) == null) {
          tx = new zj0(this, 1);
          this.x = tx;
       }
       return tx;
    }
    public final Object l(int p0){
       return this.j()[p0];
    }
    public final Object put(Object p0,Object p1){
       dk0 v;
       Object[] objArray;
       Map map;
       int len;
       dk0 uodk0 = this;
       object obj = p0;
       Object obj1 = p1;
       int i = -1;
       int i1 = 4;
       int i2 = 2;
       int i3 = 32;
       if (this.f()) {
          ap5.j("Arrays already allocated", this.f());
          v = uodk0.v;
          int i4 = Math.max((v + 1), i2);
          int i5 = Integer.highestOneBit(i4);
          if (i4 > (int)((double)i5 * 0x3ff0000000000000) && (i5 = i5 << 1) <= 0) {
             i5 = 0x40000000;
          }
          i4 = Math.max(i1, i5);
          uodk0.a = w51.p(i4);
          uodk0.v = ((Integer.numberOfLeadingZeros((i4 + i)) - 32) & 0x1f) | (uodk0.v & 0xe0);
          int[] ointArray = new int[v];
          uodk0.b = ointArray;
          objArray = new Object[v];
          uodk0.c = objArray;
          Object[] objArray1 = new Object[v];
          uodk0.t = objArray1;
       }
       if ((map = this.a()) != null) {
          return map.put(obj, obj1);
       }else {
          int[] ointArray1 = this.h();
          objArray = this.i();
          Object[] objArray2 = this.j();
          dk0 w = uodk0.w;
          int i6 = w + 1;
          int i7 = w51.Q(p0);
          int i8 = (1 << (uodk0.v & 0x1f)) - 1;
          int i9 = i7 & i8;
          dk0 a = uodk0.a;
          Objects.requireNonNull(a);
          i = w51.R(i9, a);
          int i10 = 0;
          if (!i) {
             if (i6 > i8) {
                int i11 = (i8 < i3)? 4: 2;
                i8 = uodk0.k(i8, ((i8 + 1) * i11), i7, w);
             }else {
                v = uodk0.a;
                Objects.requireNonNull(v);
                w51.S(i9, i6, v);
             }
          }else {
             i9 = ~ i8;
             i2 = i7 & i9;
             int i12 = 0;
             while (true) {
                i = i - 1;
                int i13 = ointArray1[i];
                if ((i3 = i13 & i9) == i2 && io2.j(obj, objArray[i])) {
                   obj = objArray2[i];
                   objArray2[i] = obj1;
                   return obj;
                }else {
                   i1 = i13 & i8;
                   i13 = i2;
                   i2 = i12 + 1;
                   if (!i1) {
                      if (i2 >= 9) {
                         LinkedHashMap linkedHashMa = new LinkedHashMap((((1 << (uodk0.v & 0x1f)) - 1) + 1), 0x3f800000);
                         if (this.isEmpty()) {
                            i10 = -1;
                         }
                         len = i10;
                         while (len >= 0) {
                            linkedHashMa.put(uodk0.d(len), uodk0.l(len));
                            if ((len = len + 1) < uodk0.w) {
                               continue ;
                            }
                            len = -1;
                         }
                         uodk0.a = linkedHashMa;
                         uodk0.b = null;
                         uodk0.c = null;
                         uodk0.t = null;
                         uodk0.v = uodk0.v + 32;
                         return linkedHashMa.put(obj, obj1);
                      }else {
                         i1 = 32;
                         if (i6 > i8) {
                            i1 = (i8 < i1)? 4: 2;
                            i8 = uodk0.k(i8, ((i8 + 1) * i1), i7, w);
                         }else {
                            ointArray1[i] = (i6 & i8) | i3;
                         }
                      }
                   }else {
                      i = i1;
                      i12 = i2;
                      i2 = i13;
                      i3 = 32;
                   }
                }
             }
          }
          len = this.h().length;
          if (i6 > len && (i = Math.min(0x3fffffff, ((Math.max(1, (len >> 1)) + len) | 1))) != len) {
             uodk0.b = Arrays.copyOf(this.h(), i);
             uodk0.c = Arrays.copyOf(this.i(), i);
             uodk0.t = Arrays.copyOf(this.j(), i);
          }
          this.h()[w] = ((~ i8) & i7) | (i8 & 0x00);
          this.i()[w] = obj;
          this.j()[w] = obj1;
          uodk0.w = i6;
          uodk0.v = uodk0.v + 32;
          return null;
       }
    }
    public final Object remove(Object p0){
       Map map;
       if ((map = this.a()) != null) {
          return map.remove(p0);
       }
       if ((p0 = this.g(p0)) == dk0.A) {
          p0 = null;
       }
       return p0;
    }
    public final int size(){
       Map map;
       int i = ((map = this.a()) != null)? map.size(): this.w;
       return i;
    }
    public final Collection values(){
       dk0 tz;
       if ((tz = this.z) == null) {
          tz = new ck0(this);
          this.z = tz;
       }
       return tz;
    }
}
