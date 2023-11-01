package p.t40;
import p.yf2;
import p.v40;
import java.lang.Object;
import p.k40;
import java.lang.String;
import p.co5;
import p.eo5;
import p.md;
import p.ew5;

public final class t40 implements yf2	// class@0026f6 from classes.dex
{
    public final v40 a;

    public void t40(v40 p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       md b;
       co5.o(p0, "data");
       if ((b = eo5.b) != null) {
          b.g("bootstrap-inject");
       }
       this.a.c.d(p0.a());
       if ((b = eo5.b) != null) {
          b.c("bootstrap-inject");
       }
       return p0;
    }
}
