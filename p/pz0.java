package p.pz0;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import p.tz0;

public final class pz0 implements FilenameFilter	// class@0022fb from classes.dex
{
    public static final pz0 a;

    static {
       pz0.a = new pz0();
    }
    public void pz0(){
       super();
    }
    public final boolean accept(File p0,String p1){
       boolean b = (p1.startsWith("event") && !p1.endsWith("_"))? true: false;
       return b;
    }
}
