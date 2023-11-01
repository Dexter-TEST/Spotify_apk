package p.dv5;
import p.fv5;
import p.u54;
import java.lang.Object;
import p.j80;
import java.io.File;
import p.f70;
import p.on;
import p.xe7;
import p.nn6;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;

public final class dv5 extends fv5	// class@0013c5 from classes.dex
{
    public final int a;
    public final u54 b;
    public final Object c;

    public void dv5(fv5 p0,u54 p1){
       this.a = 2;
       super();
       this.c = p0;
       this.b = p1;
    }
    public void dv5(u54 p0,Object p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final long a(){
       dv5 tc = this.c;
       switch (this.a){
           case 0:
             return tc.length();
           case 1:
             return (long)tc.d();
           default:
             return tc.a();
       }
    }
    public final u54 b(){
       return this.b;
    }
    public final void d(f70 p0){
       dv5 tc = this.c;
       switch (this.a){
           case 0:
             on oon = xe7.c0(tc);
             p0.A(oon);
             eb3.d(oon, null);
             return;
           case 1:
             p0.v(tc);
             return;
           default:
             tc.d(p0);
             return;
       }
    }
}
