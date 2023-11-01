package p.jc2;
import java.util.concurrent.Callable;
import p.nc2;
import p.ba5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Boolean;
import p.t65;

public final class jc2 implements Callable	// class@001aaa from classes.dex
{
    public final int a;
    public final nc2 b;
    public final ba5 c;

    public void jc2(nc2 p0,ba5 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object call(){
       jc2 tb = this.b;
       jc2 tc = this.c;
       switch (this.a){
           case 0:
           default:
             co5.l(tc, "event");
             nc2.a(tb, tc);
             t65 ot65 = new t65(tc.a, null);
             return ot65;
       }
       co5.l(tc, "it");
       nc2.a(tb, tc);
       return Boolean.TRUE;
    }
}
