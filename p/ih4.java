package p.ih4;
import p.zf2;
import p.gi3;
import p.jh4;
import java.lang.Object;
import p.kh4;
import java.lang.String;
import p.co5;
import java.lang.Boolean;

public final class ih4 extends gi3 implements zf2	// class@001994 from classes.dex
{
    public final jh4 a;
    public final int[] b;
    public final int c;
    public final int t;

    public void ih4(jh4 p0,int[] p1,int p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       super(1);
    }
    public final Object invoke(Object p0){
       co5.o(p0, "it");
       jh4 g = this.a.g;
       ih4 tb = this.b;
       g[0] = tb[0];
       g[1] = tb[1];
       return Boolean.valueOf(p0.dispatchNestedPreScroll(this.c, this.t, g, null));
    }
}
