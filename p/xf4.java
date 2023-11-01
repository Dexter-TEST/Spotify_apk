package p.xf4;
import p.zf2;
import p.gi3;
import p.hs5;
import p.lg4;
import p.gk;
import java.lang.Object;
import p.qf4;
import java.lang.String;
import p.co5;
import p.jc7;

public final class xf4 extends gi3 implements zf2	// class@002c68 from classes.dex
{
    public final hs5 a;
    public final hs5 b;
    public final lg4 c;
    public final boolean t;
    public final gk v;

    public void xf4(hs5 p0,hs5 p1,lg4 p2,boolean p3,gk p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       super(1);
    }
    public final Object invoke(Object p0){
       co5.o(p0, "entry");
       this.a.a = true;
       this.b.a = true;
       this.c.m(p0, this.t, this.v);
       return jc7.a;
    }
}
