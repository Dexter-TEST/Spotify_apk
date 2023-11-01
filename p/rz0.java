package p.rz0;
import java.util.Comparator;
import java.lang.Object;
import java.io.File;
import p.tz0;
import java.lang.String;

public final class rz0 implements Comparator	// class@002586 from classes.dex
{
    public static final rz0 a;

    static {
       rz0.a = new rz0();
    }
    public void rz0(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return p1.getName().compareTo(p0.getName());
    }
}
