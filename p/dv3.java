package p.dv3;
import p.yf2;
import p.hv3;
import java.lang.Object;
import p.mt3;
import java.lang.Class;
import p.vp;
import java.lang.String;
import io.reactivex.rxjava3.core.Single;
import p.l94;
import java.lang.Throwable;
import java.io.IOException;
import p.yt3;
import p.op;
import p.rt3;
import p.vt3;
import p.tt3;

public final class dv3 implements yf2	// class@0013c3 from classes.dex
{
    public final int a;
    public final hv3 b;

    public void dv3(hv3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       dv3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             if (p0 instanceof IOException) {
                p0 = new yt3();
             }else if(p0 instanceof op && p0.a == rt3.c){
                p0 = new vt3();
             }else {
                p0 = new tt3();
             }
             return p0;
       }
       tb.getClass();
       return tb.t.e(p0.A, p0.B).map(new l94(12)).onErrorReturn(new dv3(tb, 1));
    }
}
