package p.e56;
import java.util.concurrent.Callable;
import p.g56;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import p.j56;
import p.xy5;
import p.hv;

public final class e56 implements Callable	// class@001422 from classes.dex
{
    public final g56 a;
    public final String b;
    public final long c;

    public void e56(g56 p0,String p1,long p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Object call(){
       e56 ta = this.a;
       ta.getClass();
       j56 c = ta.c;
       c.c();
       c.r();
       c.m();
       return j56.d(ta, this.b, this.c);
    }
}
