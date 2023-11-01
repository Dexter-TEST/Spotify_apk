package p.if5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class if5 extends Enum	// class@001983 from classes.dex
{
    public static final if5 a;
    public static final if5 b;
    public static final if5 c;
    public static final if5[] t;

    static {
       if5 oif5 = new if5("REPLACE", 0);
       if5.a = oif5;
       if5 oif51 = new if5("ENQUEUE", 1);
       if5.b = oif51;
       if5 oif52 = new if5("PUSH", 2);
       if5.c = oif52;
       if5[] oif5Array = new if5[]{oif5,oif51,oif52};
       if5.t = oif5Array;
    }
    public void if5(String p0,int p1){
       super(p0, p1);
    }
    public static if5 valueOf(String p0){
       return Enum.valueOf(if5.class, p0);
    }
    public static if5[] values(){
       return if5.t.clone();
    }
}
