package p.kk5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class kk5 extends Enum	// class@001c2f from classes.dex
{
    public static final kk5 a;
    public static final kk5 b;
    public static final kk5 c;
    public static final kk5[] t;

    static {
       kk5 okk5 = new kk5("DEFAULT", 0);
       kk5.a = okk5;
       kk5 okk51 = new kk5("VERY_LOW", 1);
       kk5.b = okk51;
       kk5 okk52 = new kk5("HIGHEST", 2);
       kk5.c = okk52;
       kk5[] okk5Array = new kk5[]{okk5,okk51,okk52};
       kk5.t = okk5Array;
    }
    public void kk5(String p0,int p1){
       super(p0, p1);
    }
    public static kk5 valueOf(String p0){
       return Enum.valueOf(kk5.class, p0);
    }
    public static kk5[] values(){
       return kk5.t.clone();
    }
}
