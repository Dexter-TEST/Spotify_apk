package p.x1;
import java.util.List;
import p.eh3;
import java.util.AbstractList;
import java.lang.Object;

public abstract class x1 extends AbstractList implements List, eh3	// class@002bf0 from classes.dex
{

    public void x1(){
       super();
    }
    public abstract int a();
    public abstract Object b(int p0);
    public final Object remove(int p0){
       return this.b(p0);
    }
    public final int size(){
       return this.a();
    }
}
