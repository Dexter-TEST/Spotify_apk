package p.xx0;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import p.ly0;

public final class xx0 implements FilenameFilter	// class@002d04 from classes.dex
{
    public static final xx0 a;

    static {
       xx0.a = new xx0();
    }
    public void xx0(){
       super();
    }
    public final boolean accept(File p0,String p1){
       return p1.startsWith(".ae");
    }
}
