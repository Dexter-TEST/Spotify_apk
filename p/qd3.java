package p.qd3;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import p.ap5;

public final class qd3 implements Iterator	// class@00237c from classes.dex
{
    public boolean a;
    public final Iterator b;

    public void qd3(Iterator p0){
       this.b = p0;
       super();
       this.a = true;
    }
    public final boolean hasNext(){
       return this.b.hasNext();
    }
    public final Object next(){
       this.a = false;
       return this.b.next();
    }
    public final void remove(){
       ap5.j("no calls to next\(\) since the last call to remove\(\)", (this.a ^ 0x01));
       this.b.remove();
    }
}
