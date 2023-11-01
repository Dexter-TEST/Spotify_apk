package p.tq2;
import p.b90;
import p.vi7;
import java.lang.Object;
import p.dt5;
import io.reactivex.rxjava3.core.Single;
import p.gj5;
import java.lang.Class;
import java.util.Map;
import p.m73;
import p.xj0;
import p.lq3;
import p.uq2;
import p.ci4;
import java.lang.String;
import java.util.List;
import java.util.Collections;
import p.d90;
import p.mx6;
import p.yf2;
import p.d70;

public final class tq2 implements b90	// class@0027be from classes.dex
{
    public final int a;
    public final boolean b;
    public final vi7 c;

    public void tq2(vi7 p0,boolean p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final Single a(dt5 p0){
       tq2 tb = this.b;
       tq2 tc = this.c;
       switch (this.a){
           case 0:
             Single single = tc.t.c(Collections.singletonList(tc.x.get()), xj0.h(p0, tb));
             if (p0 == dt5.x) {
                single = single.flatMap(new mx6(15, tc));
             }
             return single;
             break;
           case 1:
           default:
             tc.getClass();
             return tc.t.d(xj0.h(p0, tb));
       }
       tc.getClass();
       return tc.t.g(xj0.h(p0, tb));
    }
}
