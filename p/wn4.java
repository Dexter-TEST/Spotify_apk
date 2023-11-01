package p.wn4;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class wn4 extends Enum	// class@002b6f from classes.dex
{
    public static final wn4 a;
    public static final wn4 b;
    public static final wn4 c;
    public static final wn4[] t;

    static {
       wn4 own4 = new wn4("SKIP", 1);
       wn4.a = own4;
       wn4 own41 = new wn4("FAIL", 2);
       wn4.b = own41;
       wn4 own42 = new wn4("AS_EMPTY", 3);
       wn4.c = own42;
       wn4[] own4Array = new wn4[]{new wn4("SET", 0),own4,own41,own42,new wn4("DEFAULT", 4)};
       wn4.t = own4Array;
    }
    public void wn4(String p0,int p1){
       super(p0, p1);
    }
    public static wn4 valueOf(String p0){
       return Enum.valueOf(wn4.class, p0);
    }
    public static wn4[] values(){
       return wn4.t.clone();
    }
}
