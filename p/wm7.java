package p.wm7;
import p.b5;
import java.lang.Object;
import p.fa4;
import p.aq6;
import p.ks0;
import java.lang.Class;
import p.jj1;
import java.lang.Runnable;
import p.xy5;
import p.ko1;
import p.tn6;
import p.u00;
import p.an5;

public final class wm7 implements b5	// class@002b69 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object t;

    public void wm7(Object p0,Object p1,Object p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final void run(){
       wm7 tt = this.t;
       wm7 tc = this.c;
       wm7 tb = this.b;
       switch (this.a){
           case 1:
           default:
             tb.c.accept(tc, tt);
             tb.t.onNext(tt);
             return;
       }
       tb.getClass();
       tb.a.q(new jj1(tb, tc, tt, 5));
       return;
    }
}
