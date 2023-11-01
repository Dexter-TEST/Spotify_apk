package p.um6;
import p.zf2;
import p.gi3;
import p.ym6;
import p.rv;
import java.lang.StackTraceElement;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.o60;
import p.sm6;
import p.jl;
import p.jc7;

public final class um6 extends gi3 implements zf2	// class@0028dd from classes.dex
{
    public final int a;
    public final ym6 b;
    public final rv c;
    public final StackTraceElement[] t;

    public void um6(ym6 p0,rv p1,StackTraceElement[] p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super(1);
    }
    public final void a(Throwable p0){
       sm6 osm6;
       um6 tt = this.t;
       um6 tc = this.c;
       um6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "cause");
             tb.c.a(tc);
             osm6 = new sm6("Failed to read SnackBar message from SnackBarConfiguration.", p0, tt);
             jl.f(osm6.a, osm6);
             return;
       }
       co5.o(p0, "cause");
       tb.c.a(tc);
       osm6 = new sm6("Failed to read SnackBar action text from SnackBarConfiguration.", p0, tt);
       jl.f(osm6.a, osm6);
       return;
    }
    public final Object invoke(Object p0){
       jc7 a = jc7.a;
       switch (this.a){
           case 0:
           default:
             this.a(p0);
             return a;
       }
       this.a(p0);
       return a;
    }
}
