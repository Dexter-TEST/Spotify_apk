package p.tu1;
import p.su1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.s74;
import java.lang.Class;
import p.nc2;

public abstract class tu1	// class@0027e1 from classes.dex
{
    public final su1 a;

    public void tu1(su1 p0){
       co5.o(p0, "eventPublisher");
       super();
       this.a = p0;
    }
    public final void a(Object p0){
       co5.o(p0, "event");
       co5.o(p0, "event");
       p0 = p0.toByteArray();
       co5.l(p0, "event.toByteArray\(\)");
       this.a.c(p0.getClass().getSimpleName(), p0);
    }
}
