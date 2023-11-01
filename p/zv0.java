package p.zv0;
import p.yf2;
import p.cw0;
import p.aq6;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import p.ow0;
import io.reactivex.rxjava3.core.Completable;
import p.wn3;
import p.tk0;
import p.jk0;

public final class zv0 implements yf2	// class@002f6f from classes.dex
{
    public final int a;
    public final cw0 b;
    public final aq6 c;

    public void zv0(cw0 p0,aq6 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object apply(Object p0){
       zv0 tc = this.c;
       zv0 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             p0 = (p0.booleanValue())? tb.l.c(tc, true): tk0.a;
             break;
           default:
             tb.getClass();
             p0 = (p0.booleanValue())? tk0.a: tb.y(tc);
             return p0;
       }
       return p0;
    }
}
