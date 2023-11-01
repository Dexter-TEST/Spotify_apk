package p.ti7;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ti7 extends Enum	// class@00277c from classes.dex
{
    public final String a;
    public static final ti7 b;
    public static final ti7[] c;

    static {
       ti7 oti7 = new ti7("UNKNOWN", 2, "unknown");
       ti7.b = oti7;
       ti7[] oti7Array = new ti7[]{new ti7("LOAD", 0, "load"),new ti7("RELOAD", 1, "reload"),oti7};
       ti7.c = oti7Array;
    }
    public void ti7(String p0,int p1,String p2){
       this.a = p2;
    }
    public static ti7 valueOf(String p0){
       return Enum.valueOf(ti7.class, p0);
    }
    public static ti7[] values(){
       return ti7.c.clone();
    }
    public final String toString(){
       return this.a;
    }
}
