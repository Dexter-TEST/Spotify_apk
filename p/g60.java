package p.g60;
import java.lang.Runnable;
import p.h60;
import p.w40;
import java.lang.Object;
import p.t50;
import p.hb6;
import p.ob6;

public final class g60 implements Runnable	// class@0016a7 from classes.dex
{
    public final int a;
    public final w40 b;
    public final h60 c;

    public void g60(h60 p0,w40 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final void run(){
       g60 tb = this.b;
       switch (this.a){
           case 0:
           default:
             g60 tc = this.c;
             tc.b(tb, tc.d);
             return;
       }
       tb.a.f.e(hb6.t);
       tb.a.p();
       return;
    }
}
