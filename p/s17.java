package p.s17;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class s17 extends Enum	// class@00259f from classes.dex
{
    public static final s17[] a;

    static {
       s17[] os17Array = new s17[]{new s17("GREEN", 0),new s17("WHITE", 1),new s17("BLACK", 2)};
       s17.a = os17Array;
    }
    public void s17(String p0,int p1){
       super(p0, p1);
    }
    public static s17 valueOf(String p0){
       return Enum.valueOf(s17.class, p0);
    }
    public static s17[] values(){
       return s17.a.clone();
    }
}
