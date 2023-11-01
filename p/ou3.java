package p.ou3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ou3 extends Enum	// class@002190 from classes.dex
{
    public static final ou3 a;
    public static final ou3 b;
    public static final ou3 c;
    public static final ou3[] t;

    static {
       ou3 oou3 = new ou3("LANDING", 0);
       ou3.a = oou3;
       ou3 oou31 = new ou3("LOGIN_IN_PROGRESS", 1);
       ou3.b = oou31;
       ou3 oou32 = new ou3("LOGGED_IN", 2);
       ou3.c = oou32;
       ou3[] oou3Array = new ou3[]{oou3,oou31,oou32};
       ou3.t = oou3Array;
    }
    public void ou3(String p0,int p1){
       super(p0, p1);
    }
    public static ou3 valueOf(String p0){
       return Enum.valueOf(ou3.class, p0);
    }
    public static ou3[] values(){
       return ou3.t.clone();
    }
}
