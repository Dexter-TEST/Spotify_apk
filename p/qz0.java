package p.qz0;
import java.util.Comparator;
import java.lang.Object;
import java.io.File;
import p.tz0;
import java.lang.String;

public final class qz0 implements Comparator	// class@002441 from classes.dex
{
    public static final qz0 a;

    static {
       qz0.a = new qz0();
    }
    public void qz0(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int h = tz0.h;
       return p0.getName().substring(0, h).compareTo(p1.getName().substring(0, h));
    }
}
