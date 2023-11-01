package p.hf5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class hf5 extends Enum	// class@001840 from classes.dex
{
    public static final hf5 a;
    public static final hf5 b;
    public static final hf5[] c;

    static {
       hf5 ohf5 = new hf5("DEFAULT", 0);
       hf5.a = ohf5;
       hf5 ohf51 = new hf5("ALARM", 1);
       hf5.b = ohf51;
       hf5[] ohf5Array = new hf5[]{ohf5,ohf51};
       hf5.c = ohf5Array;
    }
    public void hf5(String p0,int p1){
       super(p0, p1);
    }
    public static hf5 valueOf(String p0){
       return Enum.valueOf(hf5.class, p0);
    }
    public static hf5[] values(){
       return hf5.c.clone();
    }
}
