package p.c75;
import p.lv1;
import p.gv5;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.reflect.Array;

public final class c75 extends lv1	// class@000191 from classes2.dex
{
    public final int P;
    public final lv1 Q;

    public void c75(lv1 p0,int p1){
       this.P = p1;
       this.Q = p0;
       super();
    }
    public final void a(gv5 p0,Object p1){
       c75 tQ = this.Q;
       switch (this.P){
           case 0:
             if (p1 != null) {
                p1 = p1.iterator();
                while (p1.hasNext()) {
                   tQ.a(p0, p1.next());
                }
             }
             break;
           default:
             if (p1 != null) {
                int length = Array.getLength(p1);
                for (int i = 0; i < length; i = i + 1) {
                   tQ.a(p0, Array.get(p1, i));
                }
             }
             return;
       }
       return;
    }
}
