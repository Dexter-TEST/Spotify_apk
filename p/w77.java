package p.w77;
import p.x77;
import java.lang.String;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import p.o77;

public final class w77 extends x77	// class@002ae2 from classes.dex
{

    public void w77(){
       super("INDEPENDENT", 1);
    }
    public final float a(List p0,float p1){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p1);
       }
       return p1;
    }
}
