package p.ih2;
import p.zv6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.HashSet;

public final class ih2 extends Enum implements zv6	// class@001992 from classes.dex
{
    public static final ih2 a;
    public static final ih2[] b;

    static {
       ih2 oih2 = new ih2();
       ih2.a = oih2;
       ih2[] oih2Array = new ih2[]{oih2};
       ih2.b = oih2Array;
    }
    public void ih2(){
       super("INSTANCE", 0);
    }
    public static ih2 valueOf(String p0){
       return Enum.valueOf(ih2.class, p0);
    }
    public static ih2[] values(){
       return ih2.b.clone();
    }
    public final Object get(){
       return new HashSet();
    }
}
