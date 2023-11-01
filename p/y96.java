package p.y96;
import p.j80;
import java.lang.Object;
import java.lang.String;
import java.security.MessageDigest;
import p.co5;
import p.b17;
import java.lang.Math;
import p.vv7;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import p.kg4;
import p.tp2;
import p.e70;
import p.u96;
import p.uk;

public final class y96 extends j80	// class@0003d6 from classes2.dex
{
    public final byte[][] v;
    public final int[] w;

    public void y96(byte[][] p0,int[] p1){
       super(j80.t.a);
       this.v = p0;
       this.w = p1;
    }
    private final Object writeReplace(){
       return this.t();
    }
    public final String a(){
       return this.t().a();
    }
    public final j80 c(String p0){
       MessageDigest instance = MessageDigest.getInstance(p0);
       y96 tv = this.v;
       int len = tv.length;
       int i = 0;
       int i1 = 0;
       while (i < len) {
          int i2 = len + i;
          y96 tw = this.w;
          int i3 = tw[i];
          i1 = i3 - i1;
          instance.update(tv[i], tw[i2], i1);
          i = i + 1;
          i1 = i3;
       }
       byte[] uobyteArray = instance.digest();
       co5.l(uobyteArray, "digestBytes");
       return new j80(uobyteArray);
    }
    public final int d(){
       return this.w[(this.v.length - 1)];
    }
    public final String e(){
       return this.t().e();
    }
    public final boolean equals(Object p0){
       boolean b;
       if (p0 == this) {
       }else {
          b = 0;
          if (!p0 instanceof j80 || (p0.d() != this.d() || !this.m(b, p0, this.d()))) {
          label_001f :
             return b;
          }
       }
       b = true;
       goto label_001f ;
    }
    public final int f(byte[] p0,int p1){
       co5.o(p0, "other");
       return this.t().f(p0, p1);
    }
    public final byte[] h(){
       return this.s();
    }
    public final int hashCode(){
       j80 tb;
       if ((tb = this.b) != null) {
       }else {
          y96 tv = this.v;
          int len = tv.length;
          int i = 0;
          int i1 = 1;
          int i2 = 0;
          while (i < len) {
             int i3 = len + i;
             y96 tw = this.w;
             i3 = tw[i3];
             int i4 = tw[i];
             object oobject = tv[i];
             i2 = i4 - i2;
             i2 = i2 + i3;
             for (; i3 < i2; i3 = i3 + 1) {
                i1 = i1 * 31;
                i1 = i1 + oobject[i3];
             }
             i = i + 1;
             i2 = i4;
          }
          this.b = i1;
          tb = i1;
       }
       return tb;
    }
    public final byte i(int p0){
       int i;
       y96 tv = this.v;
       y96 tw = this.w;
       co5.p((long)tw[(tv.length - 1)], (long)p0, 1);
       int i1 = (!(i = b17.y(this, p0)))? 0: tw[(i - 1)];
       return tv[i][((p0 - i1) + tw[(tv.length + i)])];
    }
    public final int j(byte[] p0,int p1){
       co5.o(p0, "other");
       return this.t().j(p0, p1);
    }
    public final boolean l(int p0,int p1,int p2,byte[] p3){
       int i1;
       co5.o(p3, "other");
       boolean b = false;
       if (p0 >= 0 && (p0 <= (this.d() - p2) && (p1 >= 0 && p1 <= (p3.length - p2)))) {
          p2 = p2 + p0;
          int i = b17.y(this, p0);
          while (true) {
             if (p0 < p2) {
                y96 tw = this.w;
                if (!i) {
                   i1 = 0;
                }else {
                   i1 = i - 1;
                   i1 = tw[i1];
                }
                int i2 = tw[i] - i1;
                y96 tv = this.v;
                int i3 = tv.length + i;
                i2 = i2 + i1;
                i2 = Math.min(p2, i2) - p0;
                i1 = p0 - i1;
                i1 = i1 + tw[i3];
                if (co5.d(i1, p1, i2, tv[i], p3)) {
                   p1 = p1 + i2;
                   p0 = p0 + i2;
                   i = i + 1;
                }
             }else {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public final boolean m(int p0,j80 p1,int p2){
       int i2;
       co5.o(p1, "other");
       boolean b = false;
       if (p0 >= 0 && p0 <= (this.d() - p2)) {
          p2 = p2 + p0;
          int i = b17.y(this, p0);
          int i1 = 0;
          while (true) {
             if (p0 < p2) {
                y96 tw = this.w;
                if (!i) {
                   i2 = 0;
                }else {
                   i2 = i - 1;
                   i2 = tw[i2];
                }
                int i3 = tw[i] - i2;
                y96 tv = this.v;
                int i4 = tv.length + i;
                i3 = i3 + i2;
                i3 = Math.min(p2, i3) - p0;
                i2 = p0 - i2;
                i2 = i2 + tw[i4];
                if (p1.l(i1, i2, i3, tv[i])) {
                   i1 = i1 + i3;
                   p0 = p0 + i3;
                   i = i + 1;
                }
             }else {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public final j80 n(int p0,int p1){
       j80 oj80;
       p1 = co5.E(this, p1);
       int i = 0;
       int i1 = (p0 >= 0)? 1: 0;
       if (i1) {
          i1 = (p1 <= this.d())? 1: 0;
          String str = "endIndex=";
          if (i1) {
             int i2 = ((i1 = p1 - p0) >= 0)? 1: 0;
             if (i2) {
                if (!p0 && p1 == this.d()) {
                   oj80 = this;
                }else if(p0 == p1){
                   oj80 = j80.t;
                }else {
                   int i3 = b17.y(this, p0);
                   p1--;
                   p1 = b17.y(this, p1);
                   i2 = p1 + 1;
                   y96 tv = this.v;
                   co5.o(tv, "<this>");
                   vv7.i(i2, tv.length);
                   Object[] objArray = Arrays.copyOfRange(tv, i3, i2);
                   co5.l(objArray, "copyOfRange\(this, fromIndex, toIndex\)");
                   int[] ointArray = new int[(objArray.length * 2)];
                   y96 tw = this.w;
                   if (i3 <= p1) {
                      int i4 = 0;
                      int i5 = i3;
                      while (true) {
                         int i6 = tw[i5] - p0;
                         ointArray[i4] = Math.min(i6, i1);
                         i6 = i4 + 1;
                         i4 = i4 + objArray.length;
                         int i7 = tv.length + i5;
                         ointArray[i4] = tw[i7];
                         if (i5 != p1) {
                            i5 = i5 + 1;
                            i4 = i6;
                         }
                      }
                   }
                   if (i3) {
                      i = tw[(i3 - 1)];
                   }
                   p1 = objArray.length;
                   ointArray[p1] = (p0 - i) + ointArray[p1];
                   oj80 = new y96(objArray, ointArray);
                }
                return oj80;
             }else {
                throw new IllegalArgumentException(str+p1+" < beginIndex="+p0.toString());
             }
          }else {
             throw new IllegalArgumentException(kg4.r(str, p1, " > length\(")+this.d()+')'.toString());
          }
       }else {
          throw new IllegalArgumentException(tp2.l("beginIndex=", p0, " < 0").toString());
       }
    }
    public final j80 p(){
       return this.t().p();
    }
    public final void r(e70 p0,int p1){
       int i4;
       e70 a;
       co5.o(p0, "buffer");
       int i = 0;
       int i1 = i + p1;
       int i2 = b17.y(this, i);
       int i3 = 0;
       while (i3 < i1) {
          y96 tw = this.w;
          if (!i2) {
             i4 = 0;
          }else {
             i4 = i2 - 1;
             i4 = tw[i4];
          }
          int i5 = tw[i2] - i4;
          y96 tv = this.v;
          int i6 = tv.length + i2;
          i5 = i5 + i4;
          i5 = Math.min(i1, i5) - i3;
          i4 = i3 - i4;
          i4 = i4 + tw[i6];
          i6 = i4 + i5;
          u96 ou96 = new u96(tv[i2], i4, i6, true);
          if ((a = p0.a) == null) {
             ou96.g = ou96;
             ou96.f = ou96;
             p0.a = ou96;
          }else {
             u96 g = a.g;
             co5.i(g);
             g.b(ou96);
          }
          i3 = i3 + i5;
          i2 = i2 + 1;
       }
       p0.b = p0.b + (long)p1;
       return;
    }
    public final byte[] s(){
       byte[] uobyteArray = new byte[this.d()];
       y96 tv = this.v;
       int len = tv.length;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (i < len) {
          int i3 = len + i;
          y96 tw = this.w;
          i3 = tw[i3];
          int i4 = tw[i];
          i1 = i4 - i1;
          int i5 = i3 + i1;
          uk.j0(i2, i3, i5, tv[i], uobyteArray);
          i2 = i2 + i1;
          i = i + 1;
          i1 = i4;
       }
       return uobyteArray;
    }
    public final j80 t(){
       return new j80(this.s());
    }
    public final String toString(){
       return this.t().toString();
    }
}
