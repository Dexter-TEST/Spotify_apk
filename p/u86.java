package p.u86;
import p.ir0;
import p.x86;
import java.lang.Object;
import p.mk7;
import p.ne4;
import java.lang.Long;
import androidx.lifecycle.b;
import p.ll1;
import java.lang.String;

public final class u86 implements ir0	// class@002863 from classes.dex
{
    public final int a;
    public final x86 b;

    public void u86(x86 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       u86 tb = this.b;
       u86 ta = this.a;
       switch (ta){
           case 0:
             int i = ((p0 = tb.A.e()) != null && p0.c == true)? 1: 0;
             if (i) {
                i = tb.A;
                mk7 omk7 = i.e();
                String str = null;
                if (omk7 != null) {
                   str = mk7.a(omk7, str, ll1.a, true, 53);
                }
                i.k(str);
             }
             break;
           case 1:
             switch (ta){
                 case 1:
                   tb.A.l(p0);
                   break;
                 default:
                   tb.A.l(p0);
             }
             return;
             break;
           default:
             switch (ta){
                 case 1:
                   tb.A.l(p0);
                   break;
                 default:
                   tb.A.l(p0);
             }
             return;
       }
       return;
    }
}
