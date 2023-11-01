package p.aj0;
import p.ye7;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.Collection;

public abstract class aj0 extends ye7	// class@000f90 from classes.dex
{

    public static final int b0(Iterable p0){
       co5.o(p0, "<this>");
       int i = (p0 instanceof Collection)? p0.size(): 10;
       return i;
    }
}
