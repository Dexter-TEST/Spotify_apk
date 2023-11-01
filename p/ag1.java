package p.ag1;
import p.db7;
import java.lang.String;
import p.lx;
import java.util.Map;
import p.v10;
import p.xe7;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.CharSequence;
import p.cb7;
import java.lang.StringBuilder;
import java.lang.Character;
import java.lang.Throwable;
import p.zf1;

public final class ag1 extends db7	// class@000f76 from classes.dex
{
    public final int F;

    public void ag1(int p0){
       this.F = p0;
       super();
    }
    public final v10 e(String p0,lx p1,int p2,int p3,Map p4){
       switch (this.F){
           case 0:
             break;
           case 1:
             if (p1 == lx.w) {
                return super.e(p0, p1, p2, p3, p4);
             }
             throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(p1)));
             break;
           default:
             if (p1 == lx.C) {
                return super.e(p0, p1, p2, p3, p4);
             }
             throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(p1)));
       }
       if (p1 == lx.x) {
          return super.e(p0, p1, p2, p3, p4);
       }
       throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(p1)));
    }
    public final boolean[] s(String p0){
       int i2;
       int i3;
       int i4;
       String str = "Requested contents should be 8 digits long, but got ";
       int i = 8;
       String str1 = "Contents do not pass checksum";
       int i1 = 7;
       switch (this.F){
           case 0:
             break;
           case 1:
             if ((i2 = p0.length()) != i1) {
                if (i2 == i) {
                   try{
                      if (!cb7.K(p0)) {
                         throw new IllegalArgumentException(str1);
                      }
                   }catch(p.sc2 e0){
                      throw new IllegalArgumentException("Illegal contents");
                   }
                }else {
                   throw new IllegalArgumentException(str.concat(String.valueOf(i2)));
                }
             }else {
                try{
                   p0 = p0+cb7.L(p0);
                }catch(p.sc2 e13){
                   throw new IllegalArgumentException(e13);
                }
             }
             boolean[] uobooleanArr1 = new boolean[67];
             int i7 = xe7.b(uobooleanArr1, 0, cb7.G, true) + 0;
             for (i = 0; i <= 3; i = i + 1) {
                i7 = i7 + xe7.b(uobooleanArr1, i7, cb7.J[Character.digit(p0.charAt(i), 10)], 0);
             }
             i = xe7.b(uobooleanArr1, i7, cb7.H, 0) + i7;
             for (i7 = 4; i7 <= i1; i7 = i7 + 1) {
                i = i + xe7.b(uobooleanArr1, i, cb7.J[Character.digit(p0.charAt(i7), 10)], true);
             }
             xe7.b(uobooleanArr1, i, cb7.G, true);
             return uobooleanArr1;
             break;
           default:
             if ((i2 = p0.length()) != i1) {
                if (i2 == i) {
                   try{
                      if (!cb7.K(p0)) {
                         throw new IllegalArgumentException(str1);
                      }
                   }catch(p.sc2 e0){
                      throw new IllegalArgumentException("Illegal contents");
                   }
                }else {
                   throw new IllegalArgumentException(str.concat(String.valueOf(i2)));
                }
             }else {
                try{
                   p0 = p0+cb7.L(zf1.M(p0));
                }catch(p.sc2 e13){
                   throw new IllegalArgumentException(e13);
                }
             }
             if ((i2 = Character.digit(p0.charAt(0), 10)) && i2 != 1) {
                throw new IllegalArgumentException("Number system must be 0 or 1");
             }else {
                i2 = zf1.M[i2][Character.digit(p0.charAt(i1), 10)];
                boolean[] uobooleanArr2 = new boolean[51];
                i = xe7.b(uobooleanArr2, 0, cb7.G, true) + 0;
                for (i3 = 1; i3 <= 6; i3 = i3 + 1) {
                   i1 = Character.digit(p0.charAt(i3), 10);
                   i4 = i3 - 6;
                   i4 = i2 >> i4;
                   if ((i4 = i4 & true) == 1) {
                      i1 = i1 + 10;
                   }
                   i = i + xe7.b(uobooleanArr2, i, cb7.K[i1], 0);
                }
                xe7.b(uobooleanArr2, i, cb7.I, 0);
                return uobooleanArr2;
             }
       }
       i2 = p0.length();
       str = 12;
       if (i2 != str) {
          if (i2 == 13) {
             try{
                if (!cb7.K(p0)) {
                   throw new IllegalArgumentException(str1);
                }
             }catch(p.sc2 e0){
                throw new IllegalArgumentException("Illegal contents");
             }
          }else {
             throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(i2)));
          }
       }else {
          try{
             p0 = p0+cb7.L(p0);
          }catch(p.sc2 e13){
             throw new IllegalArgumentException(e13);
          }
       }
       i2 = zf1.L[Character.digit(p0.charAt(0), 10)];
       boolean[] uobooleanArr = new boolean[95];
       i3 = xe7.b(uobooleanArr, 0, cb7.G, true) + 0;
       for (i4 = 1; i4 <= 6; i4 = i4 + 1) {
          int i5 = Character.digit(p0.charAt(i4), 10);
          int i6 = i4 - 6;
          i6 = i2 >> i6;
          if ((i6 = i6 & true) == 1) {
             i5 = i5 + 10;
          }
          i3 = i3 + xe7.b(uobooleanArr, i3, cb7.K[i5], 0);
       }
       i2 = xe7.b(uobooleanArr, i3, cb7.H, 0) + i3;
       for (; i1 <= str; i1 = i1 + 1) {
          i2 = i2 + xe7.b(uobooleanArr, i2, cb7.J[Character.digit(p0.charAt(i1), 10)], true);
       }
       xe7.b(uobooleanArr, i2, cb7.G, true);
       return uobooleanArr;
    }
}
