package p.v40;
import p.z40;
import java.lang.Object;
import java.util.List;
import p.ye7;
import p.sg0;
import p.cy5;
import p.ew5;
import p.zg0;
import p.p40;
import p.y37;
import java.lang.String;
import p.co5;

public final class v40 implements z40	// class@002979 from classes.dex
{
    public final sg0 a;
    public final cy5 b;
    public final ew5 c;
    public final zg0 d;
    public final p40 e;
    public final y37 f;
    public long g;
    public static final List h;

    static {
       v40.h = ye7.J("com.spotify.music");
    }
    public void v40(sg0 p0,cy5 p1,ew5 p2,zg0 p3,p40 p4,y37 p5){
       co5.o(p0, "data");
       co5.o(p1, "retrofit");
       co5.o(p2, "bootstrapInjector");
       co5.o(p3, "clock");
       co5.o(p4, "eventLogger");
       co5.o(p5, "timeKeeper");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
}
