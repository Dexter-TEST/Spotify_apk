package p.p9;
import p.ir0;
import p.hr0;
import java.lang.Object;
import p.g9;
import p.cb;
import p.sl6;
import java.lang.String;
import p.f9;
import p.bb;

public final class p9 implements ir0	// class@00221d from classes.dex
{
    public final int a;
    public final hr0 b;

    public void p9(hr0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       p9 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.accept(bb.a);
             return;
       }
       tb.accept(new cb(p0.b, p0.a));
       return;
    }
}
