package p.dt5;
import p.m73;
import java.lang.Object;
import p.k73;
import java.util.Objects;
import p.ap5;
import com.google.common.collect.d;
import p.j73;
import java.lang.Integer;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import p.w51;
import p.at5;
import p.bt5;
import p.ct5;
import com.google.common.collect.b;

public final class dt5 extends m73	// class@0013b3 from classes.dex
{
    public final Object t;
    public final Object[] v;
    public final int w;
    public static final dt5 x;

    static {
       Object[] objArray = new Object[0];
       dt5.x = new dt5(0, null, objArray);
    }
    public void dt5(int p0,Object p1,Object[] p2){
       super();
       this.t = p1;
       this.v = p2;
       this.w = p0;
    }
    public static dt5 k(int p0,Object[] p1,k73 p2){
       object oobject1;
       if (!p0) {
          return dt5.x;
       }
       int i = 0;
       if (p0 == 1) {
          Objects.requireNonNull(p1[i]);
          Objects.requireNonNull(p1[1]);
          return new dt5(1, null, p1);
       }else {
          ap5.h(p0, (p1.length >> 1));
          object oobject = dt5.l(p1, p0, d.m(p0), i);
          if (oobject instanceof Object[]) {
             oobject1 = oobject[2];
             if (p2 != null) {
                p2.c = oobject1;
                int i1 = oobject[1].intValue();
                p1 = Arrays.copyOf(p1, (i1 * 2));
                oobject = oobject[i];
                oobject1 = i1;
             }else {
                throw oobject1.a();
             }
          }
          return new dt5(oobject1, oobject, p1);
       }
    }
    public static Object l(Object[] p0,int p1,int p2,int p3){
       int i3;
       int i4;
       int i5;
       object oobject;
       object oobject1;
       int i6;
       int i7;
       int i8;
       object oobject2;
       Object[] objArray;
       int i = p1;
       int i1 = p2;
       j73 oj73 = null;
       if (i == 1) {
          Objects.requireNonNull(p0[p3]);
          Objects.requireNonNull(p0[(p3 ^ 0x01)]);
          return oj73;
       }else {
          int i2 = i1 - 1;
          int b = -1;
          if (i1 <= 128) {
             byte[] uobyteArray = new byte[i1];
             Arrays.fill(uobyteArray, b);
             i3 = 0;
             b = 0;
             while (i3 < i) {
                i4 = i3 * 2;
                i4 = i4 + p3;
                i5 = b * 2;
                i5 = i5 + p3;
                oobject = p0[i4];
                Objects.requireNonNull(oobject);
                i4 = i4 ^ 1;
                oobject1 = p0[i4];
                Objects.requireNonNull(oobject1);
                i6 = w51.P(oobject.hashCode());
                while (true) {
                   i6 = i6 & i2;
                   i7 = 255;
                   if ((i8 = uobyteArray[i6] & i7) == i7) {
                      uobyteArray[i6] = (byte)i5;
                      if (b < i3) {
                         p0[i5] = oobject;
                         i5 = i5 ^ 0x01;
                         p0[i5] = oobject1;
                      }
                      b = b + 1;
                      break ;
                   }else if(oobject.equals(p0[i8])){
                      i5 = i8 ^ 0x01;
                      oobject2 = p0[i5];
                      Objects.requireNonNull(oobject2);
                      oj73 = new j73(oobject, oobject1, oobject2);
                      p0[i5] = oobject1;
                      break ;
                   }else {
                      i6 = i6 + 1;
                   }
                }
                i3 = i3 + 1;
             }
             if (b != i) {
                objArray = new Object[]{uobyteArray,Integer.valueOf(b),oj73};
                uobyteArray = objArray;
             }
             return uobyteArray;
          }else if(i1 <= 0x8000){
             short[] oshortArray = new short[i1];
             Arrays.fill(oshortArray, b);
             i3 = 0;
             b = 0;
             while (i3 < i) {
                i4 = i3 * 2;
                i4 = i4 + p3;
                i5 = b * 2;
                i5 = i5 + p3;
                oobject = p0[i4];
                Objects.requireNonNull(oobject);
                i4 = i4 ^ 1;
                oobject1 = p0[i4];
                Objects.requireNonNull(oobject1);
                i6 = w51.P(oobject.hashCode());
                while (true) {
                   i6 = i6 & i2;
                   i7 = 0xffff;
                   if ((i8 = oshortArray[i6] & i7) == i7) {
                      oshortArray[i6] = (short)i5;
                      if (b < i3) {
                         p0[i5] = oobject;
                         i5 = i5 ^ 0x01;
                         p0[i5] = oobject1;
                      }
                      b = b + 1;
                      break ;
                   }else if(oobject.equals(p0[i8])){
                      i5 = i8 ^ 0x01;
                      oobject2 = p0[i5];
                      Objects.requireNonNull(oobject2);
                      oj73 = new j73(oobject, oobject1, oobject2);
                      p0[i5] = oobject1;
                      break ;
                   }else {
                      i6 = i6 + 1;
                   }
                }
                i3 = i3 + 1;
             }
             if (b != i) {
                objArray = new Object[]{oshortArray,Integer.valueOf(b),oj73};
                oshortArray = objArray;
             }
             return oshortArray;
          }else {
             int[] ointArray = new int[i1];
             Arrays.fill(ointArray, b);
             i3 = 0;
             i4 = 0;
             while (i3 < i) {
                i5 = i3 * 2;
                i5 = i5 + p3;
                int i9 = i4 * 2;
                i9 = i9 + p3;
                oobject2 = p0[i5];
                Objects.requireNonNull(oobject2);
                i5 = i5 ^ 1;
                object oobject3 = p0[i5];
                Objects.requireNonNull(oobject3);
                i8 = w51.P(oobject2.hashCode());
                while (true) {
                   i8 = i8 & i2;
                   if ((i7 = ointArray[i8]) == b) {
                      ointArray[i8] = i9;
                      if (i4 < i3) {
                         p0[i9] = oobject2;
                         i9 = i9 ^ 0x01;
                         p0[i9] = oobject3;
                      }
                      i4 = i4 + 1;
                      break ;
                   }else if(oobject2.equals(p0[i7])){
                      b = i7 ^ 0x01;
                      oobject = p0[b];
                      Objects.requireNonNull(oobject);
                      oj73 = new j73(oobject2, oobject3, oobject);
                      p0[b] = oobject3;
                      break ;
                   }else {
                      i8 = i8 + 1;
                      b = -1;
                   }
                }
                i3 = i3 + 1;
                b = -1;
             }
             if (i4 != i) {
                objArray = new Object[]{ointArray,Integer.valueOf(i4),oj73};
                ointArray = objArray;
             }
             return ointArray;
          }
       }
    }
    public static Object m(Object p0,Object[] p1,int p2,int p3,Object p4){
       int i;
       int i1;
       int i2;
       object oobject = null;
       if (p4 == null) {
          return oobject;
       }
       if (p2 == 1) {
          p0 = p1[p3];
          Objects.requireNonNull(p0);
          if (p0.equals(p4)) {
             oobject = p1[(p3 ^ 0x01)];
             Objects.requireNonNull(oobject);
          }
          return oobject;
       }else if(p0 == null){
          return oobject;
       }else if(p0 instanceof byte[]){
          p2 = p0;
          p3 = p2.length - 1;
          i = w51.P(p4.hashCode());
          while (true) {
             i = i & p3;
             i1 = 255;
             if ((i2 = p2[i] & i1) == i1) {
                return oobject;
             }
             if (p4.equals(p1[i2])) {
                break ;
             }else {
                i++;
             }
          }
          return p1[(i2 ^ 0x01)];
       }else if(p0 instanceof short[]){
          p2 = p0;
          p3 = p2.length - 1;
          i = w51.P(p4.hashCode());
          while (true) {
             i = i & p3;
             i1 = 0xffff;
             if ((i2 = p2[i] & i1) == i1) {
                return oobject;
             }
             if (p4.equals(p1[i2])) {
                break ;
             }else {
                i++;
             }
          }
          return p1[(i2 ^ 0x01)];
       }else {
          p2 = p0.length - 1;
          p3 = w51.P(p4.hashCode());
          while (true) {
             p3 = p3 & p2;
             if ((i2 = p0[p3]) == -1) {
                return oobject;
             }
             if (p4.equals(p1[i2])) {
                break ;
             }else {
                p3++;
             }
          }
          return p1[(i2 ^ 0x01)];
       }
    }
    public final at5 c(){
       return new at5(this, this.v, 0, this.w);
    }
    public final bt5 d(){
       return new bt5(this, new ct5(0, this.w, this.v));
    }
    public final b e(){
       return new ct5(1, this.w, this.v);
    }
    public final void g(){
    }
    public final Object get(Object p0){
       if ((p0 = dt5.m(this.t, this.v, this.w, 0, p0)) == null) {
          p0 = null;
       }
       return p0;
    }
    public final int size(){
       return this.w;
    }
}
