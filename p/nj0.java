package p.nj0;
import p.ng2;
import p.gi3;
import p.xw0;
import p.is5;
import java.lang.Object;
import p.jc7;
import p.vw0;
import java.lang.String;
import p.co5;

public final class nj0 extends gi3 implements ng2	// class@001fe9 from classes.dex
{
    public final xw0[] a;
    public final is5 b;

    public void nj0(xw0[] p0,is5 p1){
       this.a = p0;
       this.b = p1;
       super(2);
    }
    public final Object b(Object p0,Object p1){
       co5.o(p0, "<anonymous parameter 0>");
       co5.o(p1, "element");
       p0 = this.b;
       is5 a = p0.a;
       p0.a = a + 1;
       p0[a] = p1;
       return jc7.a;
    }
}
