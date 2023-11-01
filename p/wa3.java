package p.wa3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class wa3 extends Enum	// class@002af9 from classes.dex
{
    public static final wa3 a;
    public static final wa3 b;
    public static final wa3 c;
    public static final wa3 t;
    public static final wa3 v;
    public static final wa3 w;
    public static final wa3[] x;

    static {
       wa3 owa3 = new wa3("Unknown", 0);
       wa3.a = owa3;
       wa3 owa31 = new wa3("Analysis", 1);
       wa3.b = owa31;
       wa3 owa32 = new wa3("AnrReport", 2);
       wa3.c = owa32;
       wa3 owa33 = new wa3("CrashReport", 3);
       wa3.t = owa33;
       wa3 owa34 = new wa3("CrashShield", 4);
       wa3.v = owa34;
       wa3 owa35 = new wa3("ThreadCheck", 5);
       wa3.w = owa35;
       wa3[] owa3Array = new wa3[]{owa3,owa31,owa32,owa33,owa34,owa35};
       wa3.x = owa3Array;
    }
    public void wa3(String p0,int p1){
       super(p0, p1);
    }
    public static wa3 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(wa3.class, p0);
    }
    public static wa3[] values(){
       return Arrays.copyOf(wa3.x, 6);
    }
    public final String toString(){
       int i;
       String str;
       if ((i = this.ordinal()) != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   str = (i != 5)? "Unknown": "ThreadCheck";
                }else {
                   str = "CrashShield";
                }
             }else {
                str = "CrashReport";
             }
          }else {
             str = "AnrReport";
          }
       }else {
          str = "Analysis";
       }
       return str;
    }
}
