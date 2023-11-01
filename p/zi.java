package p.zi;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class zi extends Enum	// class@002f06 from classes.dex
{
    public static final zi a;
    public static final zi b;
    public static final zi[] c;

    static {
       zi ozi = new zi("AUTO", 0);
       zi.a = ozi;
       zi ozi1 = new zi("EXPLICIT_ONLY", 1);
       zi.b = ozi1;
       zi[] oziArray = new zi[]{ozi,ozi1};
       zi.c = oziArray;
    }
    public void zi(String p0,int p1){
       super(p0, p1);
    }
    public static zi valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(zi.class, p0);
    }
    public static zi[] values(){
       return Arrays.copyOf(zi.c, 2);
    }
}
