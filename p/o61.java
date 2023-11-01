package p.o61;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class o61 extends Enum	// class@0020b8 from classes.dex
{
    public final String a;
    public static final o61 b;
    public static final o61 c;
    public static final o61[] t;

    static {
       o61 oo61 = new o61("NONE", 0, null);
       o61.b = oo61;
       o61 oo611 = new o61("FRIENDS", 2, "friends");
       o61.c = oo611;
       o61[] oo61Array = new o61[]{oo61,new o61("ONLY_ME", 1, "only_me"),oo611,new o61("EVERYONE", 3, "everyone")};
       o61.t = oo61Array;
    }
    public void o61(String p0,int p1,String p2){
       this.a = p2;
    }
    public static o61 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(o61.class, p0);
    }
    public static o61[] values(){
       return Arrays.copyOf(o61.t, 4);
    }
}
