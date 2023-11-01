package p.af3;
import java.lang.Iterable;
import p.jf3;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Iterator;

public final class af3 extends jf3 implements Iterable	// class@000f6f from classes.dex
{
    public final ArrayList a;

    public void af3(){
       super();
       this.a = new ArrayList();
    }
    public final boolean equals(Object p0){
       boolean b = (p0 != this && (!p0 instanceof af3 && p0.a.equals(this.a)))? false: true;
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final Iterator iterator(){
       return this.a.iterator();
    }
}
