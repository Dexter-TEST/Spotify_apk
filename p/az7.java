package p.az7;
import java.io.FilenameFilter;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import p.tz0;

public class az7 implements FilenameFilter	// class@001024 from classes.dex
{
    public final int a;
    public final String b;

    public void az7(String p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public boolean accept(File p0,String p1){
       String str = ".cls_temp";
       boolean b = true;
       boolean b1 = false;
       az7 tb = this.b;
       switch (this.a){
           case 0:
             if (!p1.startsWith(String.valueOf(tb).concat("-")) || !p1.endsWith(".apk")) {
                b = false;
             }
             break;
           case 1:
             if (!p1.contains(tb) || p1.endsWith(str)) {
                b = false;
             }
             return b;
             break;
           case 2:
             if (!p1.equals(tb+".cls")) {
                if (!p1.contains(tb) || p1.endsWith(str)) {
                   b = 0;
                }
                b1 = b;
             }
             return b1;
             break;
           default:
             return p1.startsWith(tb);
       }
       return b;
    }
}
