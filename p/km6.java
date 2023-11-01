package p.km6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.util.EnumSet;
import java.lang.Object;
import p.co5;
import java.util.Arrays;

public final class km6 extends Enum	// class@001c42 from classes.dex
{
    public final long a;
    public static final EnumSet b;
    public static final km6 c;
    public static final km6 t;
    public static final km6[] v;

    static {
       km6 okm6 = new km6(1, 1, "Enabled");
       km6.c = okm6;
       km6 okm61 = new km6(2, 2, "RequireConfirm");
       km6.t = okm61;
       km6[] okm6Array = new km6[]{new km6(0, 0, "None"),okm6,okm61};
       km6.v = okm6Array;
       EnumSet uEnumSet = EnumSet.allOf(km6.class);
       co5.l(uEnumSet, "allOf\(SmartLoginOption::class.java\)");
       km6.b = uEnumSet;
    }
    public void km6(int p0,long p1,String p2){
       this.a = p1;
    }
    public static km6 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(km6.class, p0);
    }
    public static km6[] values(){
       return Arrays.copyOf(km6.v, 3);
    }
}
