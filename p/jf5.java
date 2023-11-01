package p.jf5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class jf5 extends Enum	// class@001ac7 from classes.dex
{
    public static final jf5 a;
    public static final jf5 b;
    public static final jf5 c;
    public static final jf5[] t;

    static {
       jf5 ojf5 = new jf5("IMMEDIATELY", 0);
       jf5.a = ojf5;
       jf5 ojf51 = new jf5("ADVANCE_PAST_TRACK", 1);
       jf5.b = ojf51;
       jf5 ojf52 = new jf5("ADVANCE_PAST_CONTEXT", 2);
       jf5.c = ojf52;
       jf5[] ojf5Array = new jf5[]{ojf5,ojf51,ojf52};
       jf5.t = ojf5Array;
    }
    public void jf5(String p0,int p1){
       super(p0, p1);
    }
    public static jf5 valueOf(String p0){
       return Enum.valueOf(jf5.class, p0);
    }
    public static jf5[] values(){
       return jf5.t.clone();
    }
}
