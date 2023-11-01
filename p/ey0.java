package p.ey0;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import p.hh0;
import java.lang.CharSequence;
import p.ly0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ey0 implements FilenameFilter	// class@00151d from classes.dex
{
    public final int a;

    public void ey0(){
       this.a = 1;
       super(1);
    }
    public void ey0(int p0){
       this.a = p0;
       super();
    }
    public final boolean accept(File p0,String p1){
       boolean b = false;
       switch (this.a){
           case 0:
             if (p1.length() == 39 && p1.endsWith(".cls")) {
                b = true;
             }
             return b;
             break;
           case 1:
             if (!ly0.A.accept(p0, p1) && ly0.D.matcher(p1).matches()) {
                b = true;
             }
             return b;
             break;
           case 2:
             if (hh0.t.accept(p0, p1) || p1.contains("SessionMissingBinaryImages")) {
                b = true;
             }
             return b;
             break;
           case 3:
           default:
             return p1.endsWith(".cls_temp");
       }
       return true;
    }
}
