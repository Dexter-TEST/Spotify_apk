package p.y22;
import java.lang.Object;
import p.zl6;
import p.cq7;
import p.vh0;
import java.lang.Enum;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Long;
import java.lang.Integer;
import p.tb3;
import p.i80;
import p.s74;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Double;
import p.ji2;
import p.cc3;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.util.Map$Entry;
import com.google.protobuf.c;
import java.util.List;
import java.util.Collections;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Comparable;

public final class y22	// class@002d35 from classes.dex
{
    public final zl6 a;
    public boolean b;

    static {
       y22 oy22 = new y22(0);
    }
    public void y22(){
       super();
       this.a = new zl6(16);
    }
    public void y22(int p0){
       super();
       this.a = new zl6(0);
       this.c();
       this.c();
    }
    public static int a(cq7 p0,int p1,Object p2){
       p1 = vh0.E0(p1);
       if (p0 == cq7.v) {
          p1 = p1 * 2;
       }
       return (y22.b(p0, p2) + p1);
    }
    public static int b(cq7 p0,Object p1){
       int i2;
       int i = 1;
       int i1 = 8;
       switch (p0.ordinal()){
           case 0:
             p1.doubleValue();
             return i1;
           case 1:
             p1.floatValue();
             return 4;
           case 2:
             return vh0.I0(p1.longValue());
           case 3:
             return vh0.I0(p1.longValue());
           case 4:
             return vh0.w0(p1.intValue());
           case 5:
             p1.longValue();
             return i1;
           case 6:
             p1.intValue();
             return 4;
           case 7:
             p1.booleanValue();
             return i;
           case 8:
             if (!p1 instanceof i80) {
                return vh0.D0(p1);
             }
             i2 = p1.size();
             return (vh0.G0(i2) + i2);
             break;
           case 9:
             return p1.getSerializedSize();
           case 10:
             i2 = p1.getSerializedSize();
             return (vh0.G0(i2) + i2);
           case 11:
             if (p1 instanceof i80) {
                i2 = p1.size();
                return (vh0.G0(i2) + i2);
             }else {
                i2 = p1.length;
                return (vh0.G0(i2) + i2);
             }
             break;
           case 12:
             return vh0.G0(p1.intValue());
           case 13:
             if (p1 instanceof tb3) {
                return vh0.w0(p1.getNumber());
             }
             return vh0.w0(p1.intValue());
             break;
           case 14:
             p1.intValue();
             return 4;
           case 15:
             p1.longValue();
             return i1;
           case 16:
             i2 = p1.intValue();
             int i3 = i2 << 1;
             return vh0.G0(((i2 >> 31) ^ i3));
           case 17:
             long l = p1.longValue();
             long l1 = l << i;
             return vh0.I0(((l >> 63) ^ l1));
           default:
             throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
       }
    }
    public static void e(ji2 p0,Object p1){
       int i;
       p1.getClass();
       switch (p0.b.a.ordinal()){
           case 0:
             v0 = p1 instanceof Integer;
             break;
           case 1:
             v0 = p1 instanceof Long;
             break;
           case 2:
             v0 = p1 instanceof Float;
             break;
           case 3:
             v0 = p1 instanceof Double;
             break;
           case 4:
             v0 = p1 instanceof Boolean;
             break;
           case 5:
             v0 = p1 instanceof String;
             break;
           case 6:
             if (!p1 instanceof i80 && !p1 instanceof byte[]) {
             label_003b :
                i = 0;
             }else {
             label_0027 :
                i = 1;
             }
             break;
           case 7:
             if (!p1 instanceof Integer && !p1 instanceof tb3) {
                goto label_003b ;
             }else {
                goto label_0027 ;
             }
             break;
           case 8:
             v0 = p1 instanceof s74;
             break;
           default:
             goto label_003b ;
       }
       if (v0) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0.a),p0.b.a,p1.getClass().getName()};
       throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", objArray));
    }
    public static void f(vh0 p0,cq7 p1,int p2,Object p3){
       if (p1 == cq7.v) {
          p0.a1(p2, 3);
          p3.writeTo(p0);
          p0.a1(p2, 4);
       }else {
          p0.a1(p2, p1.b);
          switch (p1.ordinal()){
              case 0:
                p0.T0(Double.doubleToRawLongBits(p3.doubleValue()));
                break;
              case 1:
                p0.R0(Float.floatToRawIntBits(p3.floatValue()));
                break;
              case 2:
                p0.e1(p3.longValue());
                break;
              case 3:
                p0.e1(p3.longValue());
                break;
              case 4:
                p0.V0(p3.intValue());
                break;
              case 5:
                p0.T0(p3.longValue());
                break;
              case 6:
                p0.R0(p3.intValue());
                break;
              case 7:
                p0.L0((byte)p3.booleanValue());
                break;
              case 8:
                if (p3 instanceof i80) {
                   p0.P0(p3);
                }else {
                   p0.Z0(p3);
                }
                break;
              case 9:
                p3.writeTo(p0);
                break;
              case 10:
                p0.X0(p3);
                break;
              case 11:
                if (p3 instanceof i80) {
                   p0.P0(p3);
                }else {
                   p0.N0(p3, p3.length);
                }
                break;
              case 12:
                p0.c1(p3.intValue());
                break;
              case 13:
                if (p3 instanceof tb3) {
                   p0.V0(p3.getNumber());
                }else {
                   p0.V0(p3.intValue());
                }
                break;
              case 14:
                p0.R0(p3.intValue());
                break;
              case 15:
                p0.T0(p3.longValue());
                break;
              case 16:
                int i = p3.intValue();
                p2 = i << 1;
                p0.c1(((i >> 31) ^ p2));
                break;
              case 17:
                long l = p3.longValue();
                long l1 = l << 1;
                p0.e1(((l >> 63) ^ l1));
                break;
              default:
          }
       }
       return;
    }
    public final void c(){
       Map$Entry uEntry1;
       if (this.b != null) {
          return;
       }
       int i = 0;
       int i1 = 0;
       while (true) {
          y22 ta = this.a;
          if (i1 < ta.i()) {
             Map$Entry uEntry = ta.h(i1);
             if (uEntry.getValue() instanceof c) {
                uEntry.getValue().makeImmutable();
             }
             i1 = i1 + 1;
          }else if(ta.t == null){
             while (i < ta.i()) {
                uEntry1 = ta.h(i);
                if (uEntry1.getKey().c != null) {
                   uEntry1.setValue(Collections.unmodifiableList(uEntry1.getValue()));
                }
                i = i + 1;
             }
             Iterator iterator = ta.j().iterator();
             while (iterator.hasNext()) {
                uEntry1 = iterator.next();
                if (uEntry1.getKey().c != null) {
                   uEntry1.setValue(Collections.unmodifiableList(uEntry1.getValue()));
                }
             }
          }
          if (ta.t == null) {
             Map map = (ta.c.isEmpty())? Collections.emptyMap(): Collections.unmodifiableMap(ta.c);
             ta.c = map;
             map = (ta.w.isEmpty())? Collections.emptyMap(): Collections.unmodifiableMap(ta.w);
             ta.w = map;
             ta.t = true;
          }
          this.b = true;
          return;
       }
    }
    public final Object clone(){
       y22 ta;
       Map$Entry uEntry;
       ji2 key;
       y22 oy22 = new y22();
       int i = 0;
       while (true) {
          ta = this.a;
          if (i < ta.i()) {
             uEntry = ta.h(i);
             key = uEntry.getKey();
             oy22.d(key, uEntry.getValue());
             i = i + 1;
          }else {
             break ;
          }
       }
       Iterator iterator = ta.j().iterator();
       while (iterator.hasNext()) {
          uEntry = iterator.next();
          key = uEntry.getKey();
          oy22.d(key, uEntry.getValue());
       }
       return oy22;
    }
    public final void d(ji2 p0,Object p1){
       if (p0.c != null) {
          if (p1 instanceof List) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.addAll(p1);
             p1 = uArrayList.iterator();
             while (p1.hasNext()) {
                y22.e(p0, p1.next());
             }
             p1 = uArrayList;
          }else {
             throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
          }
       }else {
          y22.e(p0, p1);
       }
       this.a.m(p0, p1);
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof y22) {
          return false;
       }
       return this.a.f(p0.a);
    }
    public final int hashCode(){
       return this.a.l();
    }
}
