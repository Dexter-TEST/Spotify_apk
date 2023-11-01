package p.sz0;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import p.tz0;

public final class sz0 implements FilenameFilter	// class@0026c8 from classes.dex
{
    public static final sz0 a;

    static {
       sz0.a = new sz0();
    }
    public void sz0(){
       super();
    }
    public final boolean accept(File p0,String p1){
       return p1.startsWith("event");
    }
}
