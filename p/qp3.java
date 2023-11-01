package p.qp3;
import p.b5;
import p.rp3;
import java.lang.Object;
import java.lang.Boolean;
import p.t00;
import p.ew5;

public final class qp3 implements b5	// class@0023eb from classes.dex
{
    public final int a;
    public final rp3 b;

    public void qp3(rp3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       qp3 tb = this.b;
       switch (this.a){
           case 0:
             tb.a.b(false);
             return;
           case 1:
             tb.c.onNext(Boolean.TRUE);
             return;
           default:
             tb.c.onNext(Boolean.FALSE);
             return;
       }
    }
}
