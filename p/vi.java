package p.vi;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class vi extends Enum	// class@002a03 from classes.dex
{
    public static final vi a;
    public static final vi b;
    public static final vi c;
    public static final vi[] t;

    static {
       vi ovi = new vi("ARRAY", 0);
       vi.a = ovi;
       vi ovi1 = new vi("BOOL", 1);
       vi.b = ovi1;
       vi ovi2 = new vi("INT", 2);
       vi.c = ovi2;
       vi[] oviArray = new vi[]{ovi,ovi1,ovi2};
       vi.t = oviArray;
    }
    public void vi(String p0,int p1){
       super(p0, p1);
    }
    public static vi valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(vi.class, p0);
    }
    public static vi[] values(){
       return Arrays.copyOf(vi.t, 3);
    }
}
