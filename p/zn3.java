package p.zn3;
import p.b5;
import p.bo3;
import java.lang.Object;
import p.an5;

public final class zn3 implements b5	// class@002f2e from classes.dex
{
    public final int a;
    public final bo3 b;

    public void zn3(bo3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       zn3 tb = this.b;
       switch (this.a){
           case 0:
             tb.m.onNext(tb);
             return;
           case 1:
             tb.l.onNext(tb);
             return;
           case 2:
             tb.j.onNext(tb);
             return;
           case 3:
             tb.o.onNext(tb);
             return;
           case 4:
             tb.n.onNext(tb);
             return;
           case 5:
             tb.k.onNext(tb);
             return;
           default:
             tb.p.onNext(tb);
             return;
       }
    }
}
