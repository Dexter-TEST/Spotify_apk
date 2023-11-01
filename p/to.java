package p.to;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class to extends Enum	// class@0027b2 from classes.dex
{
    public static final to a;
    public static final to b;
    public static final to[] c;

    static {
       to oto = new to("DEFAULT", 0);
       to.a = oto;
       to oto1 = new to("ALARM", 1);
       to.b = oto1;
       to[] otoArray = new to[]{oto,oto1};
       to.c = otoArray;
    }
    public void to(String p0,int p1){
       super(p0, p1);
    }
    public static to valueOf(String p0){
       return Enum.valueOf(to.class, p0);
    }
    public static to[] values(){
       return to.c.clone();
    }
}
