package p.j73;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class j73	// class@001a7e from classes.dex
{
    public final Object a;
    public final Object b;
    public final Object c;

    public void j73(Object p0,Object p1,Object p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final IllegalArgumentException a(){
       j73 ta = this.a;
       return new IllegalArgumentException("Multiple entries with same key: "+ta+"="+this.b+" and "+ta+"="+this.c);
    }
}
