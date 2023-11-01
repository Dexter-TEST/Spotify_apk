package p.f23;
import p.gu2;
import p.g23;
import p.s23;
import p.m73;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.io2;
import p.e23;
import p.j13;
import java.util.Arrays;

public final class f23 extends gu2	// class@001544 from classes.dex
{
    public final s23 a;
    public final s23 b;
    public final m73 c;
    public final String d;
    public final g23 e;

    public void f23(g23 p0,s23 p1,s23 p2,m73 p3,String p4){
       co5.o(p3, "custom");
       this.e = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
    }
    public final g23 a(){
       return this.e;
    }
    public final gu2 b(String p0){
       gu2 ogu2;
       if (io2.j(this.d, p0)) {
          ogu2 = this;
       }else {
          ogu2 = new e23(this);
          ogu2.d = p0;
       }
       return ogu2;
    }
    public final gu2 d(j13 p0){
       gu2 ogu2;
       if (io2.j(this.a, p0)) {
          ogu2 = this;
       }else {
          ogu2 = new e23(this);
          ogu2.a = p0;
       }
       return ogu2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof f23) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || (!io2.j(this.b, p0.b) || (!io2.j(this.c, p0.c) || !io2.j(this.d, p0.d)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b,this.c,this.d};
       return Arrays.hashCode(objArray);
    }
}
