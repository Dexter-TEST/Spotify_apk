package p.o54;
import p.b5;
import p.p54;
import java.lang.Object;
import p.c0;
import p.t00;

public final class o54 implements b5	// class@0020b2 from classes.dex
{
    public final int a;
    public final p54 b;

    public void o54(p54 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       c0 a = c0.a;
       o54 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.j.onNext(a);
             return;
       }
       tb.i.onNext(a);
       return;
    }
}
