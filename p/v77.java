package p.v77;
import p.x77;
import java.lang.String;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import p.o77;

public final class v77 extends x77	// class@00299b from classes.dex
{

    public void v77(){
       super("SEQUENTIAL", 0);
    }
    public final float a(List p0,float p1){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1 = iterator.next().a(p1);
       }
       return p1;
    }
}
