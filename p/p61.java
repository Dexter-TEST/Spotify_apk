package p.p61;
import p.s90;
import java.util.concurrent.Executor;
import java.lang.Object;
import p.bx5;
import p.ca0;
import p.wk0;
import p.bv5;

public final class p61 implements s90	// class@0002f6 from classes2.dex
{
    public final Executor a;
    public final s90 b;

    public void p61(Executor p0,s90 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean J(){
       return this.b.J();
    }
    public final bx5 b(){
       return this.b.b();
    }
    public final void cancel(){
       this.b.cancel();
    }
    public final Object clone(){
       return this.clone();
    }
    public final s90 clone(){
       return new p61(this.a, this.b.clone());
    }
    public final void x(ca0 p0){
       this.b.x(new wk0(this, 2, p0));
    }
    public final bv5 y(){
       return this.b.y();
    }
}
