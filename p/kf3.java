package p.kf3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class kf3 extends Enum	// class@001c00 from classes.dex
{
    public static final kf3 a;
    public static final kf3[] b;

    static {
       kf3 v6 = new kf3(0, false, "UTF8", 8, "UTF-8");
       kf3.a = v6;
       v6 = new kf3(1, true, "UTF16_BE", 16, "UTF-16BE");
       kf3 v1 = new kf3(2, false, "UTF16_LE", 16, "UTF-16LE");
       kf3 v2 = new kf3(3, true, "UTF32_BE", 32, "UTF-32BE");
       kf3 v3 = new kf3(4, false, "UTF32_LE", 32, "UTF-32LE");
       kf3[] okf3Array = new kf3[]{v6,v6,v1,v2,v3};
       kf3.b = okf3Array;
    }
    public void kf3(int p0,boolean p1,String p2,int p3,String p4){
       super(p2, p0);
    }
    public static kf3 valueOf(String p0){
       return Enum.valueOf(kf3.class, p0);
    }
    public static kf3[] values(){
       return kf3.b.clone();
    }
}
