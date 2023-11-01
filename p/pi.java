package p.pi;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class pi extends Enum	// class@00226e from classes.dex
{
    public static final pi a;
    public static final pi b;
    public static final pi c;
    public static final pi[] t;

    static {
       pi opi = new pi("MOBILE_APP_INSTALL", 0);
       pi.a = opi;
       pi opi1 = new pi("CUSTOM", 1);
       pi.b = opi1;
       pi opi2 = new pi("OTHER", 2);
       pi.c = opi2;
       pi[] opiArray = new pi[]{opi,opi1,opi2};
       pi.t = opiArray;
    }
    public void pi(String p0,int p1){
       super(p0, p1);
    }
    public static pi valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(pi.class, p0);
    }
    public static pi[] values(){
       return Arrays.copyOf(pi.t, 3);
    }
}
