package p.yh3;
import java.lang.Comparable;
import java.lang.Object;
import p.ib3;
import p.gb3;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.co5;

public final class yh3 implements Comparable	// class@002dba from classes.dex
{
    public final int a;
    public static final yh3 b;

    static {
       yh3.b = new yh3();
    }
    public void yh3(){
       super();
       int i = 0;
       int i1 = 255;
       int i2 = (1 <= new ib3(i, i1).b)? 1: 0;
       if (i2) {
          i2 = (8 <= new ib3(i, i1).b)? 1: 0;
          if (i2) {
             i2 = (22 <= new ib3(i, i1).b)? 1: 0;
             if (i2) {
                i = 1;
             }
          }
       }
       if (i) {
          this.a = 0x10816;
          return;
       }else {
          throw new IllegalArgumentException("Version components are out of range: 1.8.22".toString());
       }
    }
    public final int compareTo(Object p0){
       co5.o(p0, "other");
       return (this.a - p0.a);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 instanceof yh3) {
       }else {
          p0 = null;
       }
       if (p0 == null) {
          return false;
       }else if(this.a == p0.a){
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return this.a;
    }
    public final String toString(){
       return "1.8.22";
    }
}
