package p.ps5;
import java.lang.Object;
import p.fh2;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Type;

public final class ps5	// class@0022c2 from classes.dex
{

    public void ps5(){
       super();
    }
    public static String a(fh2 p0){
       String str = p0.getClass().getGenericInterfaces()[0].toString();
       if (str.startsWith("kotlin.jvm.functions.")) {
          str = str.substring(21);
       }
       return str;
    }
}
