package p.qy7;
import p.q15;
import p.f25;
import p.n25;
import p.p18;
import java.util.concurrent.Executor;
import java.lang.Object;
import p.a28;
import p.j07;
import p.t5;
import java.lang.Runnable;
import java.lang.Exception;

public final class qy7 implements q15, f25, n25, p18	// class@00243f from classes.dex
{
    public final int a;
    public final Executor b;
    public final a28 c;
    public final Object t;

    public void qy7(Executor p0,Object p1,a28 p2,int p3){
       this.a = p3;
       this.b = p0;
       this.t = p1;
       this.c = p2;
       super();
    }
    public final void a(){
       qy7 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.i();
             return;
       }
       tc.i();
       return;
    }
    public final void b(j07 p0){
       qy7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.execute(new t5(this, 21, p0));
             return;
       }
       tb.execute(new t5(this, 17, p0));
       return;
    }
    public final void c(Exception p0){
       qy7 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.j(p0);
             return;
       }
       tc.j(p0);
       return;
    }
    public final void onSuccess(Object p0){
       qy7 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.k(p0);
             return;
       }
       tc.k(p0);
       return;
    }
}
