package p.ku0;
import p.hr0;
import java.lang.Object;
import p.or7;
import p.lu0;
import p.sb4;
import java.lang.Class;
import p.iz7;
import java.lang.Runnable;
import p.er7;
import p.hu0;

public final class ku0 implements hr0	// class@001c82 from classes.dex
{
    public final int a;
    public final Object b;

    public void ku0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void accept(Object p0){
       ku0 tb = this.b;
       switch (this.a){
           case 0:
             lu0 b = tb.b;
             b.getClass();
             b.d.post(new iz7(b, p0, 14));
             return;
           case 1:
             tb.c.accept(p0);
             return;
           default:
             tb.e.d(p0);
             return;
       }
    }
}
