package p.sn3;
import p.b5;
import p.vn3;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import p.tn3;
import java.lang.Runnable;
import p.xy5;

public final class sn3 implements b5	// class@002661 from classes.dex
{
    public final int a;
    public final vn3 b;
    public final List c;

    public void sn3(vn3 p0,List p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       sn3 tc = this.c;
       sn3 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             tb.b.q(new tn3(tb, tc, 2));
             return;
           case 1:
             tb.getClass();
             tb.b.q(new tn3(tb, tc, 4));
             return;
           case 2:
             tb.getClass();
             tb.b.q(new tn3(tb, tc, 3));
             return;
           case 3:
             tb.getClass();
             tb.b.q(new tn3(tb, tc, 0));
             return;
           case 4:
             tb.getClass();
             tb.b.q(new tn3(tb, tc, 1));
             return;
           default:
             tb.getClass();
             tb.b.q(new tn3(tb, tc, 5));
             return;
       }
    }
}
