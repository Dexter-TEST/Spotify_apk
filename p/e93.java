package p.e93;
import java.lang.Iterable;
import p.ch3;
import p.i91;
import java.lang.Object;
import java.util.Iterator;
import p.f93;
import p.wf2;
import p.la6;

public final class e93 implements Iterable, ch3	// class@001441 from classes.dex
{
    public final int a;
    public final Object b;

    public void e93(i91 p0){
       this.a = 1;
       this.b = p0;
       super();
    }
    public final Iterator iterator(){
       e93 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.iterator();
       }
       return new f93(tb.invoke());
    }
}
