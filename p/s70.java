package p.s70;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class s70 extends Enum	// class@0025cf from classes.dex
{
    public static final s70[] a;

    static {
       s70[] os70Array = new s70[]{new s70("LARGE", 0),new s70("SMALL", 1)};
       s70.a = os70Array;
    }
    public void s70(String p0,int p1){
       super(p0, p1);
    }
    public static s70 valueOf(String p0){
       return Enum.valueOf(s70.class, p0);
    }
    public static s70[] values(){
       return s70.a.clone();
    }
}
