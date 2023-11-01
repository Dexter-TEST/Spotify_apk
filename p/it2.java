package p.it2;
import java.util.AbstractList;
import p.jt2;
import java.lang.Object;
import java.util.List;
import p.ju2;
import java.lang.Class;

public final class it2 extends AbstractList	// class@0019fd from classes.dex
{
    public final jt2 a;

    public void it2(jt2 p0){
       this.a = p0;
       super();
    }
    public final Object get(int p0){
       ju2 oju2 = this.a.b.get(p0);
       oju2.getClass();
       return oju2;
    }
    public final int size(){
       return this.a.size();
    }
}
