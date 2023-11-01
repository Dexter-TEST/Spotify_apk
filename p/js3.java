package p.js3;
import p.bs3;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.HashSet;

public abstract class js3	// class@001b36 from classes.dex
{
    public static final bs3 a;

    static {
       js3.a = new bs3();
    }
    public static void a(String p0){
       js3.a.getClass();
       HashSet a = bs3.a;
       if (a.contains(p0)) {
       }else {
          a.add(p0);
       }
       return;
    }
}
