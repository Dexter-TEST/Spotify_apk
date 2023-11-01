package p.ng4;
import java.lang.Object;
import java.lang.Class;
import p.co5;

public final class ng4	// class@001fd2 from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public void ng4(boolean p0,boolean p1,int p2,boolean p3,boolean p4,int p5,int p6,int p7,int p8){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       boolean b1 = false;
       if (p0 == null || !co5.c(ng4.class, p0.getClass())) {
          return b1;
       }
       if (this.a == p0.a && (this.b == p0.b && this.c == p0.c)) {
          p0.getClass();
          if (co5.c(null, null) && (this.d == p0.d && (this.e == p0.e && (this.f == p0.f && (this.g == p0.g && (this.h == p0.h && this.i == p0.i)))))) {
          label_0059 :
             return b;
          }
       }
       b = false;
       goto label_0059 ;
    }
    public final int hashCode(){
       return ((((((((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + 0) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i);
    }
}
