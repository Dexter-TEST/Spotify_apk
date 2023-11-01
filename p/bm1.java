package p.bm1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class bm1 extends Enum	// class@0010ef from classes.dex
{
    public static final bm1 a;
    public static final bm1[] b;

    static {
       bm1 uobm1 = new bm1();
       bm1.a = uobm1;
       bm1[] uobm1Array = new bm1[]{uobm1};
       bm1.b = uobm1Array;
    }
    public void bm1(){
       super("DismissButtonClicked", 0);
    }
    public static bm1 valueOf(String p0){
       return Enum.valueOf(bm1.class, p0);
    }
    public static bm1[] values(){
       return bm1.b.clone();
    }
}
