package p.v86;
import p.yf2;
import p.x86;
import java.lang.String;
import java.lang.Object;
import p.ux5;
import p.mk7;
import p.ll1;
import p.co5;
import java.lang.Class;
import java.util.List;
import androidx.lifecycle.b;

public final class v86 implements yf2	// class@0029a3 from classes.dex
{
    public final int a;
    public final x86 b;
    public final String c;

    public void v86(x86 p0,String p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final mk7 a(ux5 p0){
       mk7 omk7;
       ll1 a = ll1.a;
       v86 tc = this.c;
       v86 tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.l(p0, "resource");
             if ((omk7 = tb.A.e()) != null && (omk7 = omk7.b) != null) {
                a = omk7;
             }
             return x86.f(tc, p0.a, a);
       }
       co5.l(p0, "result");
       tb.getClass();
       return x86.f(tc, p0.a, a);
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
           default:
             return this.a(p0);
       }
       return this.a(p0);
    }
}
