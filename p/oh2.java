package p.oh2;
import p.u00;
import p.yf2;
import java.lang.Object;
import java.util.Map;

public final class oh2 implements u00	// class@00211d from classes.dex
{
    public final yf2 a;
    public final yf2 b;

    public void oh2(yf2 p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0,Object p1){
       p0.put(this.b.apply(p1), this.a.apply(p1));
    }
}
