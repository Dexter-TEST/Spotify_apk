package p.k14;
import p.j14;
import java.lang.Class;
import p.fa7;
import p.he3;
import java.lang.Object;
import p.ca7;
import java.lang.String;
import java.lang.StringBuilder;

public final class k14 extends j14	// class@001b88 from classes.dex
{

    public void k14(Class p0,fa7 p1,he3 p2,he3[] p3,he3 p4,he3 p5,Object p6,Object p7,boolean p8){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public final he3 m(Class p0,fa7 p1,he3 p2,he3[] p3){
       k14 v10 = new k14(p0, p1, p2, p3, this.A, this.B, this.c, this.t, this.v);
       return v10;
    }
    public final he3 n(){
       he3 ohe3;
       if (this.v != null) {
          ohe3 = this;
       }else {
          k14 v0 = new k14(this.a, this.y, this.w, this.x, this.A.n(), this.B.n(), this.c, this.t, true);
       }
       return ohe3;
    }
    public final String toString(){
       return "[map type; class "+this.a.getName()+", "+this.A+" -> "+this.B+"]";
    }
}
