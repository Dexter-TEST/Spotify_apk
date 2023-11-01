package p.p27;
import java.lang.Object;
import java.lang.Class;

public final class p27	// class@0021dd from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int d;

    public void p27(){
       super();
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || p27.class != p0.getClass()) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d);
    }
}
