package p.bv3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class bv3 extends Enum	// class@001141 from classes.dex
{
    public final String a;
    public static final bv3 b;
    public static final bv3 c;
    public static final bv3[] t;

    static {
       bv3 uobv3 = new bv3("FACEBOOK", 0, "facebook");
       bv3.b = uobv3;
       bv3 uobv31 = new bv3("INSTAGRAM", 1, "instagram");
       bv3.c = uobv31;
       bv3[] uobv3Array = new bv3[]{uobv3,uobv31};
       bv3.t = uobv3Array;
    }
    public void bv3(String p0,int p1,String p2){
       this.a = p2;
    }
    public static bv3 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(bv3.class, p0);
    }
    public static bv3[] values(){
       return Arrays.copyOf(bv3.t, 2);
    }
    public final String toString(){
       return this.a;
    }
}
