package p.za2;
import p.ab2;
import java.lang.Iterable;
import java.util.Iterator;

public final class za2 extends ab2	// class@002eb9 from classes.dex
{
    public final Iterable b;

    public void za2(Iterable p0,Iterable p1){
       this.b = p1;
       super(p0);
    }
    public final Iterator iterator(){
       return this.b.iterator();
    }
}
