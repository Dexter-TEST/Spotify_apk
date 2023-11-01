package p.d15;
import p.fx5;
import p.u54;
import p.g70;
import java.lang.IllegalStateException;
import java.lang.String;

public final class d15 extends fx5	// class@0001a7 from classes2.dex
{
    public final u54 b;
    public final long c;

    public void d15(u54 p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final long f(){
       return this.c;
    }
    public final u54 x(){
       return this.b;
    }
    public final g70 y(){
       throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
