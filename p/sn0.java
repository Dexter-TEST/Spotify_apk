package p.sn0;
import java.lang.String;
import java.lang.Class;
import io.github.davidburstrom.contester.ConTesterDriver;

public abstract class sn0	// class@00265e from classes.dex
{
    public static final boolean a;

    static {
       boolean b;
       try{
          Class.forName("io.github.davidburstrom.contester.ConTesterDriver");
          b = true;
       }catch(java.lang.ClassNotFoundException e0){
          b = false;
       }
       sn0.a = b;
    }
    public static void a(String p0){
       if (sn0.a) {
          ConTesterDriver.visitBreakpoint(p0);
       }
       return;
    }
}
