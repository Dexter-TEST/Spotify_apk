package p.by0;
import p.az7;
import java.lang.String;
import java.io.File;

public final class by0 extends az7	// class@001159 from classes.dex
{

    public void by0(){
       super("BeginSession", 1);
    }
    public final boolean accept(File p0,String p1){
       boolean b = (super.accept(p0, p1) && p1.endsWith(".cls"))? true: false;
       return b;
    }
}
