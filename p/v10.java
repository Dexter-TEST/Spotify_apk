package p.v10;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class v10 implements Cloneable	// class@00295d from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public final int[] t;

    public void v10(int p0,int p1){
       super();
       if (p0 <= 0 || p1 <= 0) {
          throw new IllegalArgumentException("Both dimensions must be greater than 0");
       }
       this.a = p0;
       this.b = p1;
       p0 = (p0 + 31) / 32;
       this.c = p0;
       int[] ointArray = new int[(p0 * p1)];
       this.t = ointArray;
       return;
    }
    public void v10(int p0,int p1,int p2,int[] p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final boolean a(int p0,int p1){
       if (((this.t[((p0 / 32) + (p1 * this.c))] >> (p0 & 0x1f)) & 1)) {
          return 1;
       }
       return false;
    }
    public final void c(int p0,int p1){
       int i = (p0 / 32) + (p1 * this.c);
       v10 tt = this.t;
       tt[i] = (1 << (p0 & 0x1f)) | tt[i];
    }
    public final Object clone(){
       return new v10(this.a, this.b, this.c, this.t.clone());
    }
    public final void d(int p0,int p1,int p2,int p3){
       if (p1 < 0 || p0 < 0) {
          throw new IllegalArgumentException("Left and top must be nonnegative");
       }
       if (p3 <= 0 || p2 <= 0) {
          throw new IllegalArgumentException("Height and width must be at least 1");
       }
       p2 = p2 + p0;
       if ((p3 = p3 + p1) > this.b || p2 > this.a) {
          throw new IllegalArgumentException("The region must fit inside the matrix");
       }
       while (p1 < p3) {
          int i = this.c * p1;
          for (int i1 = p0; i1 < p2; i1 = i1 + 1) {
             int i2 = i1 / 32;
             i2 = i2 + i;
             v10 tt = this.t;
             int i3 = i1 & 0x1f;
             i3 = 1 << i3;
             int i4 = tt[i2] | i3;
             tt[i2] = i4;
          }
          p1++;
       }
       return;
    }
    public final boolean equals(Object p0){
       if (!p0 instanceof v10) {
          return false;
       }
       if (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && Arrays.equals(this.t, p0.t)))) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       v10 ta = this.a;
       return (Arrays.hashCode(this.t) + (((((((ta * 31) + ta) * 31) + this.b) * 31) + this.c) * 31));
    }
    public final String toString(){
       v10 ta = this.a;
       v10 tb = this.b;
       StringBuilder str = new StringBuilder(((ta + 1) * tb));
       for (int i = 0; i < tb; i = i + 1) {
          for (int i1 = 0; i1 < ta; i1 = i1 + 1) {
             String str1 = (this.a(i1, i))? "X ": "  ";
             str = str.append(str1);
          }
          str = str.append("\n");
       }
       return str;
    }
}
