package p.ph2;
import p.u00;
import p.yf2;
import java.lang.Object;
import java.util.Map;
import java.util.Collection;

public final class ph2 implements u00	// class@00225f from classes.dex
{
    public final yf2 a;
    public final yf2 b;
    public final yf2 c;

    public void ph2(yf2 p0,yf2 p1,yf2 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void accept(Object p0,Object p1){
       Collection uCollection;
       Object obj = this.c.apply(p1);
       if ((uCollection = p0.get(obj)) == null) {
          uCollection = this.a.apply(obj);
          p0.put(obj, uCollection);
       }
       uCollection.add(this.b.apply(p1));
       return;
    }
}
