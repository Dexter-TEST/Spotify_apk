package p.aw0;
import p.b5;
import p.cw0;
import java.lang.Object;
import p.c0;
import p.t00;

public final class aw0 implements b5	// class@001002 from classes.dex
{
    public final int a;
    public final cw0 b;

    public void aw0(cw0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       c0 a = c0.a;
       aw0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.I.onNext(a);
             return;
       }
       tb.L.onNext(a);
       return;
    }
}
