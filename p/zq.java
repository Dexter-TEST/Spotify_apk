package p.zq;
import p.oo4;
import java.lang.Object;
import p.fz0;
import p.po4;
import p.gs;
import p.vg3;
import java.lang.String;

public final class zq implements oo4	// class@002f4c from classes.dex
{
    public static final zq a;

    static {
       zq.a = new zq();
    }
    public void zq(){
       super();
    }
    public final void a(Object p0,Object p1){
       p1.d("timestamp", p0.a);
       p1.c(p0.b, "type");
       p1.c(p0.c, "app");
       p1.c(p0.d, "device");
       p1.c(p0.e, "log");
    }
}
