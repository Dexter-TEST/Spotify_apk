package p.fi5;
import p.hi5;
import java.lang.String;
import java.lang.Object;

public final class fi5 extends hi5	// class@0015d3 from classes.dex
{

    public void fi5(){
       super("IS_NULL", 2);
    }
    public final boolean apply(Object p0){
       boolean b = (p0 == null)? true: false;
       return b;
    }
    public final String toString(){
       return "Predicates.isNull\(\)";
    }
}
