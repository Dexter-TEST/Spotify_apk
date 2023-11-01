package p.gi5;
import p.hi5;
import java.lang.String;
import java.lang.Object;

public final class gi5 extends hi5	// class@001715 from classes.dex
{

    public void gi5(){
       super("NOT_NULL", 3);
    }
    public final boolean apply(Object p0){
       boolean b = (p0 != null)? true: false;
       return b;
    }
    public final String toString(){
       return "Predicates.notNull\(\)";
    }
}
