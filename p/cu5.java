package p.cu5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class cu5 extends Enum	// class@00127d from classes.dex
{
    public final String a;
    public static final cu5 b;
    public static final cu5 c;
    public static final cu5[] t;

    static {
       cu5 uocu5 = new cu5("MOBILE_APP_INSTALL", 0, "MOBILE_APP_INSTALL");
       cu5.b = uocu5;
       cu5 uocu51 = new cu5("CUSTOM_APP_EVENTS", 1, "CUSTOM_APP_EVENTS");
       cu5.c = uocu51;
       cu5[] uocu5Array = new cu5[]{uocu5,uocu51};
       cu5.t = uocu5Array;
    }
    public void cu5(String p0,int p1,String p2){
       this.a = p2;
    }
    public static cu5 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(cu5.class, p0);
    }
    public static cu5[] values(){
       return Arrays.copyOf(cu5.t, 2);
    }
    public final String toString(){
       return this.a;
    }
}
