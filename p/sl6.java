package p.sl6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class sl6 extends Enum	// class@002652 from classes.dex
{
    public static final sl6 a;
    public static final sl6 b;
    public static final sl6 c;
    public static final sl6[] t;

    static {
       sl6 osl6 = new sl6("LANGUAGE_ONBOARDING", 0);
       sl6.a = osl6;
       sl6 osl61 = new sl6("TO_SKIPPABLE", 1);
       sl6.b = osl61;
       sl6 osl62 = new sl6("TO_NON_SKIPPABLE", 2);
       sl6.c = osl62;
       sl6[] osl6Array = new sl6[]{osl6,osl61,osl62};
       sl6.t = osl6Array;
    }
    public void sl6(String p0,int p1){
       super(p0, p1);
    }
    public static sl6 valueOf(String p0){
       return Enum.valueOf(sl6.class, p0);
    }
    public static sl6[] values(){
       return sl6.t.clone();
    }
}
