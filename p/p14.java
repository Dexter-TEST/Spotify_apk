package p.p14;
import p.z77;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;

public final class p14 extends z77	// class@0021d0 from classes.dex
{
    public final int b;

    public void p14(int p0,Iterator p1){
       this.b = p0;
       super(p1);
    }
    public final Object a(Object p0){
       p14 tb = this.b;
       switch (tb){
           case 0:
             switch (tb){
                 case 0:
                   p0 = p0.getKey();
                   break;
                 default:
                   p0 = p0.getValue();
             }
             break;
           default:
             switch (tb){
                 case 0:
                   p0 = p0.getKey();
                   break;
                 default:
                   p0 = p0.getValue();
             }
             return p0;
       }
       return p0;
    }
}
