package p.hr7;
import java.lang.StringBuilder;
import java.lang.String;
import p.re;
import java.lang.ClassCastException;

public abstract class hr7	// class@0018ad from classes.dex
{

    public static String a(StringBuilder p0,String p1,char p2){
       return p0+p1+p2;
    }
    public static void b(re p0){
       if (p0 == null) {
          return;
       }
       throw new ClassCastException();
    }
}
