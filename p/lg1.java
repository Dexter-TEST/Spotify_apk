package p.lg1;
import p.ir0;
import p.t67;
import java.lang.Object;
import p.n06;
import p.p06;

public final class lg1 implements ir0	// class@001d48 from classes.dex
{
    public final int a;
    public final t67 b;

    public void lg1(t67 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       lg1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.y = p0;
             return;
       }
       tb.x = p0;
       return;
    }
}
