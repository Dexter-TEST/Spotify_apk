package p.m13;
import p.st2;
import p.n13;
import java.lang.String;
import p.a23;
import java.lang.Object;
import p.co5;
import java.io.Serializable;
import p.eb3;
import p.l13;
import p.zt2;
import p.au2;
import p.oi;
import p.io2;
import java.util.Arrays;

public final class m13 extends st2	// class@001e05 from classes.dex
{
    public final String a;
    public final a23 b;
    public final n13 c;

    public void m13(n13 p0,String p1,a23 p2){
       co5.o(p1, "name");
       co5.o(p2, "data");
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public final st2 a(String p0,Serializable p1){
       st2 ost2;
       if (eb3.g(this.b, p0, p1)) {
          ost2 = this;
       }else {
          ost2 = new l13(this);
          ost2.b = ost2.b.q(p0, p1);
       }
       return ost2;
    }
    public final n13 b(){
       return this.c;
    }
    public final st2 c(au2 p0){
       st2 ost2;
       if (oi.k(this.b, p0)) {
          ost2 = this;
       }else {
          ost2 = new l13(this);
          ost2.c(p0);
       }
       return ost2;
    }
    public final st2 d(String p0){
       st2 ost2;
       if (io2.j(this.a, p0)) {
          ost2 = this;
       }else {
          ost2 = new l13(this);
          ost2.a = p0;
       }
       return ost2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof m13) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || !io2.j(this.b, p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b};
       return Arrays.hashCode(objArray);
    }
}
