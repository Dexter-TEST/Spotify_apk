package p.uw7;
import p.oo4;
import java.lang.Object;
import p.q18;
import p.po4;
import p.s08;
import p.vg3;
import java.lang.String;

public final class uw7 implements oo4	// class@002937 from classes.dex
{
    public static final uw7 a;

    static {
       uw7.a = new uw7();
    }
    public void uw7(){
       super();
    }
    public final void a(Object p0,Object p1){
       p1.d("requestTimeMs", p0.a);
       p1.d("requestUptimeMs", p0.b);
       p1.c(p0.c, "clientInfo");
       p1.c(p0.d, "logSource");
       p1.c(p0.e, "logSourceName");
       p1.c(p0.f, "logEvent");
       p1.c(p0.g, "qosTier");
    }
}
