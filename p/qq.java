package p.qq;
import p.oo4;
import java.lang.Object;
import p.iz0;
import p.po4;
import p.bs;
import p.vg3;
import java.lang.String;
import p.jz0;
import java.nio.charset.Charset;
import android.util.JsonWriter;

public final class qq implements oo4	// class@0023f9 from classes.dex
{
    public static final qq a;

    static {
       qq.a = new qq();
    }
    public void qq(){
       super();
    }
    public final void a(Object p0,Object p1){
       p1.c(p0.a, "generator");
       p1.c(p0.b.getBytes(jz0.a), "identifier");
       p1.d("startedAt", p0.c);
       p1.c(p0.d, "endedAt");
       p1.e();
       vg3 b = p1.b;
       b.name("crashed");
       p1.e();
       b.value(p0.e);
       p1.c(p0.f, "app");
       p1.c(p0.g, "user");
       p1.c(p0.h, "os");
       p1.c(p0.i, "device");
       p1.c(p0.j, "events");
       p1.a(p0.k, "generatorType");
    }
}
