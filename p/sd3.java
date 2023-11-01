package p.sd3;
import p.e1;
import java.util.Iterator;
import p.ci5;
import p.mc6;
import java.util.Set;

public final class sd3 extends e1	// class@002608 from classes.dex
{
    public final int c;
    public final Iterator t;
    public final Object v;

    public void sd3(Iterator p0,ci5 p1){
       this.c = 0;
       this.t = p0;
       this.v = p1;
       super();
    }
    public void sd3(mc6 p0){
       this.c = 1;
       this.v = p0;
       super();
       this.t = p0.b.iterator();
    }
}
