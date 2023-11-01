package p.wf4;
import p.zf2;
import p.gi3;
import p.hs5;
import p.lg4;
import p.gg4;
import android.os.Bundle;
import java.lang.Object;
import p.qf4;
import java.lang.String;
import p.co5;
import p.ll1;
import java.util.List;
import p.jc7;

public final class wf4 extends gi3 implements zf2	// class@002b27 from classes.dex
{
    public final hs5 a;
    public final lg4 b;
    public final gg4 c;
    public final Bundle t;

    public void wf4(hs5 p0,lg4 p1,gg4 p2,Bundle p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       super(1);
    }
    public final Object invoke(Object p0){
       co5.o(p0, "it");
       this.a.a = true;
       this.b.a(this.c, this.t, p0, ll1.a);
       return jc7.a;
    }
}
