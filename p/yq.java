package p.yq;
import p.oo4;
import java.lang.Object;
import p.dz0;
import p.po4;
import p.os;
import p.vg3;
import java.lang.String;
import android.util.JsonWriter;

public final class yq implements oo4	// class@002e0e from classes.dex
{
    public static final yq a;

    static {
       yq.a = new yq();
    }
    public void yq(){
       super();
    }
    public final void a(Object p0,Object p1){
       p1.c(p0.a, "batteryLevel");
       p1.a(p0.b, "batteryVelocity");
       p1.e();
       vg3 b = p1.b;
       b.name("proximityOn");
       p1.e();
       b.value(p0.c);
       p1.a(p0.d, "orientation");
       p1.d("ramUsed", p0.e);
       p1.d("diskUsed", p0.f);
    }
}
