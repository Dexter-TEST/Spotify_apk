package p.fy7;
import p.q63;
import p.fx7;
import java.io.InputStream;

public final class fy7 extends q63	// class@001664 from classes.dex
{
    public final q63 a;
    public final long b;
    public final long c;

    public void fy7(fx7 p0,long p1,long p2){
       super();
       this.a = p0;
       long l = this.J(p1);
       this.b = l;
       this.c = this.J((l + p2));
    }
    public final long J(long p0){
       long l = 0;
       if ((p0 - l) < 0) {
          return l;
       }
       fy7 ta = this.a;
       if ((p0 - ta.x()) > 0) {
          p0 = ta.x();
       }
       return p0;
    }
    public final void close(){
    }
    public final long x(){
       return (this.c - this.b);
    }
    public final InputStream y(long p0,long p1){
       p0 = this.J(this.b);
       return this.a.y(p0, (this.J((p1 + p0)) - p0));
    }
}
