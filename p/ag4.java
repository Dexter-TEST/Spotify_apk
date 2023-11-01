package p.ag4;
import p.zf2;
import p.gi3;
import p.hs5;
import java.util.ArrayList;
import p.is5;
import p.lg4;
import android.os.Bundle;
import java.lang.Object;
import p.qf4;
import java.lang.String;
import p.co5;
import java.util.List;
import p.ll1;
import p.gg4;
import p.jc7;

public final class ag4 extends gi3 implements zf2	// class@000f79 from classes.dex
{
    public final hs5 a;
    public final List b;
    public final is5 c;
    public final lg4 t;
    public final Bundle v;

    public void ag4(hs5 p0,ArrayList p1,is5 p2,lg4 p3,Bundle p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       super(1);
    }
    public final Object invoke(Object p0){
       int i;
       List list;
       co5.o(p0, "entry");
       boolean b = true;
       this.a.a = b;
       ag4 tb = this.b;
       if ((i = tb.indexOf(p0)) != -1) {
          ag4 tc = this.c;
          i = i + b;
          list = tb.subList(tc.a, i);
          tc.a = i;
       }else {
          list = ll1.a;
       }
       this.t.a(p0.b, this.v, p0, list);
       return jc7.a;
    }
}
