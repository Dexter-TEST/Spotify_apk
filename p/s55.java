package p.s55;
import p.wf2;
import p.gi3;
import p.i77;
import p.ub4;
import p.ka;
import p.ma;
import p.ba;
import p.p46;
import p.ga;
import java.lang.Object;
import p.jc7;

public final class s55 extends gi3 implements wf2	// class@0025c2 from classes.dex
{
    public final int a;
    public final i77 b;

    public void s55(i77 p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final void a(){
       int i = 0;
       int i1 = 3;
       s55 tb = this.b;
       switch (this.a){
           case 0:
             tb.e.e(ga.a);
             return;
           case 1:
             tb.e.e(new ba(new p46(i, i1)));
             return;
           case 2:
             tb.e.e(new ba(new p46(2, 2)));
             return;
           case 3:
             tb.e.e(ka.a);
             return;
           default:
             tb.e.e(new ba(new p46(i, i1)));
             return;
       }
    }
    public final Object invoke(){
       jc7 a = jc7.a;
       switch (this.a){
           case 0:
             this.a();
             return a;
           case 1:
             this.a();
             return a;
           case 2:
             this.a();
             return a;
           case 3:
             this.a();
             return a;
           default:
             this.a();
             return a;
       }
    }
}
