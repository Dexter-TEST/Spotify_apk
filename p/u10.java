package p.u10;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.System;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class u10 implements Cloneable	// class@00281f from classes.dex
{
    public int[] a;
    public int b;

    public void u10(){
       super();
       this.b = 0;
       int[] ointArray = new int[1];
       this.a = ointArray;
    }
    public void u10(int[] p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(boolean p0){
       this.d((this.b + 1));
       if (p0) {
          u10 ta = this.a;
          u10 tb = this.b;
          int i = tb / 32;
          ta[i] = (1 << (tb & 0x1f)) | ta[i];
       }
       this.b = this.b + 1;
       return;
    }
    public final void c(int p0,int p1){
       if (p1 < 0 || p1 > 32) {
          throw new IllegalArgumentException("Num bits must be between 0 and 32");
       }
       this.d((this.b + p1));
       while (p1 > 0) {
          int i = p1 - 1;
          i = p0 >> i;
          int i1 = 1;
          if ((i = i & i1) != i1) {
             i1 = false;
          }
          this.a(i1);
          p1--;
       }
       return;
    }
    public final Object clone(){
       return new u10(this.a.clone(), this.b);
    }
    public final void d(int p0){
       u10 ta = this.a;
       if (p0 > (ta.length << 5)) {
          int[] ointArray = new int[((p0 + 31) / 32)];
          System.arraycopy(ta, 0, ointArray, 0, ta.length);
          this.a = ointArray;
       }
       return;
    }
    public final boolean e(int p0){
       if (((1 << (p0 & 0x1f)) & this.a[(p0 / 32)])) {
          return 1;
       }
       return false;
    }
    public final boolean equals(Object p0){
       if (!p0 instanceof u10) {
          return false;
       }
       if (this.b == p0.b && Arrays.equals(this.a, p0.a)) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       return (Arrays.hashCode(this.a) + (this.b * 31));
    }
    public final String toString(){
       int i1;
       u10 tb = this.b;
       StringBuilder str = new StringBuilder((((tb / 8) + tb) + 1));
       for (int i = 0; i < this.b; i = i + 1) {
          if (!(i1 = i & 0x07)) {
             str = str.append(' ');
          }
          char c = (this.e(i))? 'X': '.';
          str = str.append(c);
       }
       return str;
    }
}
