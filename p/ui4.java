package p.ui4;
import java.util.concurrent.Callable;
import p.wi4;
import java.lang.Object;
import p.yi4;

public final class ui4 implements Callable	// class@0028b7 from classes.dex
{
    public final wi4 a;
    public final long b;
    public final long c;

    public void ui4(wi4 p0,long p1,long p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Object call(){
       return wi4.c(this.a, this.b, this.c);
    }
}
