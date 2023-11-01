package p.wk0;
import p.ca0;
import java.lang.Object;
import p.s90;
import java.lang.Throwable;
import java.util.concurrent.CompletableFuture;
import p.v3;
import p.p61;
import p.jj1;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import p.bx5;
import p.bs2;

public final class wk0 implements ca0	// class@0003a7 from classes2.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void wk0(Object p0,int p1,Object p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public final void g(s90 p0,Throwable p1){
       wk0 tb = this.b;
       switch (this.a){
           case 0:
             this.w(tb, p1);
             return;
           case 1:
             this.w(tb, p1);
             return;
           default:
             this.c.a.execute(new jj1(this, tb, p1, 7));
             return;
       }
    }
    public final void j(s90 p0,bx5 p1){
       wk0 tb = this.b;
       switch (this.a){
           case 0:
             if (p1.a()) {
                this.v(tb, p1.b);
             }else {
                this.x(tb, new bs2(p1));
             }
             return;
             break;
           case 1:
           default:
             this.c.a.execute(new jj1(this, tb, p1, 6));
             return;
       }
       this.v(tb, p1);
       return;
    }
}
