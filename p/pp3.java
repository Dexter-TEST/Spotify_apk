package p.pp3;
import p.cm5;
import p.oo0;
import java.lang.Object;
import p.wc;
import p.ay6;
import p.wf2;

public final class pp3 implements cm5	// class@0022a6 from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final oo0 g;
    public final ay6 h;

    public void pp3(boolean p0,boolean p1,int p2,int p3,boolean p4,boolean p5,oo0 p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = new ay6(new wc(2, this));
    }
    public final boolean a(){
       pp3 opp3;
       boolean b = ((opp3 = this.b()) != null)? opp3.a(): this.a;
       return b;
    }
    public final pp3 b(){
       return this.h.getValue();
    }
    public final boolean c(){
       pp3 opp3;
       boolean b = ((opp3 = this.b()) != null)? opp3.c(): this.b;
       return b;
    }
    public final int d(){
       pp3 opp3;
       int i = ((opp3 = this.b()) != null)? opp3.d(): this.c;
       return i;
    }
    public final int e(){
       pp3 opp3;
       int i = ((opp3 = this.b()) != null)? opp3.e(): this.d;
       return i;
    }
    public final boolean f(){
       pp3 opp3;
       boolean b = ((opp3 = this.b()) != null)? opp3.f(): this.e;
       return b;
    }
    public final boolean g(){
       pp3 opp3;
       boolean b = ((opp3 = this.b()) != null)? opp3.g(): this.f;
       return b;
    }
}
