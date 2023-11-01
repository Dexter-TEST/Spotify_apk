package p.la5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class la5 extends Enum	// class@001d17 from classes.dex
{
    public static final la5 a;
    public static final la5 b;
    public static final la5 c;
    public static final la5 t;
    public static final la5 v;
    public static final la5[] w;

    static {
       la5 ola5 = new la5("ATTEMPT_MIGRATION", 0);
       la5.a = ola5;
       la5 ola51 = new la5("NOT_GENERATED", 1);
       la5.b = ola51;
       la5 ola52 = new la5("UNREGISTERED", 2);
       la5.c = ola52;
       la5 ola53 = new la5("REGISTERED", 3);
       la5.t = ola53;
       la5 ola54 = new la5("REGISTER_ERROR", 4);
       la5.v = ola54;
       la5[] ola5Array = new la5[]{ola5,ola51,ola52,ola53,ola54};
       la5.w = ola5Array;
    }
    public void la5(String p0,int p1){
       super(p0, p1);
    }
    public static la5 valueOf(String p0){
       return Enum.valueOf(la5.class, p0);
    }
    public static la5[] values(){
       return la5.w.clone();
    }
}
