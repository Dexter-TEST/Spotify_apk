package p.q27;
import java.lang.Object;
import java.lang.Class;
import java.util.Arrays;

public final class q27	// class@00231e from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int[] f;

    public void q27(){
       super();
       this.f = new int[4]{255,255,255,255};
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || q27.class != p0.getClass()) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (!Arrays.equals(this.f, p0.f)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       q27 tf;
       int i = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
       int i1 = ((tf = this.f) != null)? Arrays.hashCode(tf): 0;
       return (i + i1);
    }
}
