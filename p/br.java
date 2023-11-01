package p.br;
import p.oo4;
import java.lang.Object;
import p.gz0;
import p.po4;
import p.qs;
import p.vg3;
import java.lang.String;
import android.util.JsonWriter;

public final class br implements oo4	// class@001122 from classes.dex
{
    public static final br a;

    static {
       br.a = new br();
    }
    public void br(){
       super();
    }
    public final void a(Object p0,Object p1){
       p1.a(p0.a, "platform");
       p1.c(p0.b, "version");
       p1.c(p0.c, "buildVersion");
       p1.e();
       vg3 b = p1.b;
       b.name("jailbroken");
       p1.e();
       b.value(p0.d);
    }
}
