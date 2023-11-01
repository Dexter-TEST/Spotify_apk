package p.n36;
import p.vt5;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import p.co5;

public abstract class n36	// class@001f5e from classes.dex
{
    public static final boolean a;

    static {
       String str;
       boolean b = true;
       if ((str = new vt5(5).apply("rx3.purge-enabled")) == null) {
       }else {
          b = "true".equals(str);
       }
       n36.a = b;
    }
}
