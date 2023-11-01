package p.ex5;
import p.fx5;
import java.lang.String;
import p.hp5;
import p.u54;
import p.g70;
import p.gg1;

public final class ex5 extends fx5	// class@001519 from classes.dex
{
    public final int b;
    public final long c;
    public final g70 t;
    public final Object v;

    public void ex5(String p0,long p1,hp5 p2){
       this.b = 1;
       super();
       this.v = p0;
       this.c = p1;
       this.t = p2;
    }
    public void ex5(u54 p0,long p1,g70 p2){
       this.b = 0;
       this.v = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final long f(){
       return this.c;
    }
    public final u54 x(){
       ex5 tv = this.v;
       switch (this.b){
           case 0:
           default:
             u54 ou54 = (tv == null)? null: gg1.P(tv);
             return ou54;
       }
       return tv;
    }
    public final g70 y(){
       return this.t;
    }
}
