package p.mc2;
import p.ir0;
import p.nc2;
import java.lang.Object;
import p.t65;
import java.lang.String;
import java.lang.Throwable;
import p.pv1;
import p.lf1;
import p.hs3;
import java.lang.StringBuilder;

public final class mc2 implements ir0	// class@001e68 from classes.dex
{
    public final int a;
    public final nc2 b;

    public void mc2(nc2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       mc2 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.e.c("EventSender unexpectedly stopped: "+p0.getMessage(), p0);
             return;
       }
       t65 a = p0.a;
       if ((p0 = p0.b) == null) {
          tb.c.d(a, pv1.y);
          tb.e.a("Event was persisted.");
       }else {
          tb.c.d(a, pv1.x);
          tb.e.c("Event "+a+" persisting failed: "+p0.getMessage(), p0);
       }
       return;
    }
}
