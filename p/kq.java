package p.kq;
import p.oo4;
import java.lang.Object;
import p.jz0;
import p.po4;
import p.vr;
import p.vg3;
import java.lang.String;

public final class kq implements oo4	// class@001c67 from classes.dex
{
    public static final kq a;

    static {
       kq.a = new kq();
    }
    public void kq(){
       super();
    }
    public final void a(Object p0,Object p1){
       p1.c(p0.b, "sdkVersion");
       p1.c(p0.c, "gmpAppId");
       p1.a(p0.d, "platform");
       p1.c(p0.e, "installationUuid");
       p1.c(p0.f, "buildVersion");
       p1.c(p0.g, "displayVersion");
       p1.c(p0.h, "session");
       p1.c(p0.i, "ndkPayload");
    }
}
