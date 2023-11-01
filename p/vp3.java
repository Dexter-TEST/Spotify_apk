package p.vp3;
import p.b5;
import p.wp3;
import java.lang.Object;
import p.wn6;
import p.tn6;
import p.rn6;

public final class vp3 implements b5	// class@002a3c from classes.dex
{
    public final int a;
    public final wp3 b;
    public final long c;

    public void vp3(wp3 p0,long p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       wn6 own6;
       vp3 tc = this.c;
       vp3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             own6 = tb.a.edit();
             own6.b(wp3.y, tc);
             own6.f();
             return;
       }
       own6 = tb.a.edit();
       own6.b(wp3.x, tc);
       own6.f();
       return;
    }
}
