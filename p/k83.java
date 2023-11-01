package p.k83;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class k83 extends Enum	// class@001bc4 from classes.dex
{
    public static final k83 a;
    public static final k83[] b;

    static {
       k83 ok83 = new k83("DISMISS_CTA", 0);
       k83.a = ok83;
       k83[] ok83Array = new k83[]{ok83,new k83("FOOTER_TAP", 1),new k83("SWIPE", 2),new k83("MESSAGE_DISMISSER", 3)};
       k83.b = ok83Array;
    }
    public void k83(String p0,int p1){
       super(p0, p1);
    }
    public static k83 valueOf(String p0){
       return Enum.valueOf(k83.class, p0);
    }
    public static k83[] values(){
       return k83.b.clone();
    }
}
