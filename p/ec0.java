package p.ec0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ec0 extends Enum	// class@00145a from classes.dex
{
    public final int a;
    public final int b;
    public static final ec0 c;
    public static final ec0[] t;

    static {
       ec0 uoec0 = new ec0(0, 10, 10, "SMALL");
       ec0.c = uoec0;
       ec0[] uoec0Array = new ec0[]{uoec0,new ec0(1, 12, 12, "MEDIUM")};
       ec0.t = uoec0Array;
    }
    public void ec0(int p0,int p1,int p2,String p3){
       super(p3, p0);
       this.a = p1;
       this.b = p2;
    }
    public static ec0 valueOf(String p0){
       return Enum.valueOf(ec0.class, p0);
    }
    public static ec0[] values(){
       return ec0.t.clone();
    }
}
