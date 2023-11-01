package p.ja2;
import java.lang.Runnable;
import p.kv6;
import java.lang.Object;
import p.uy4;

public final class ja2 implements Runnable	// class@001a98 from classes.dex
{
    public final int a;
    public final long b;
    public final Object c;

    public void ja2(long p0,kv6 p1){
       this.a = 0;
       super();
       this.c = p1;
       this.b = p0;
    }
    public void ja2(long p0,uy4 p1){
       this.a = 1;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       ja2 tb = this.b;
       ja2 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.b(tb);
             return;
       }
       tc.a(tb);
       return;
    }
}
