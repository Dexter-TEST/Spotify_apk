package p.f20;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class f20 extends Enum	// class@001541 from classes.dex
{
    public static final f20 a;
    public static final f20 b;
    public static final f20 c;
    public static final f20 t;
    public static final f20 v;
    public static final f20 w;
    public static final f20 x;
    public static final f20[] y;

    static {
       f20 uof20 = new f20("UNKNOWN", 0);
       f20.a = uof20;
       f20 uof201 = new f20("LOW", 1);
       f20.b = uof201;
       f20 uof202 = new f20("NORMAL", 2);
       f20.c = uof202;
       f20 uof203 = new f20("HIGH", 3);
       f20.t = uof203;
       f20 uof204 = new f20("VERY_HIGH", 4);
       f20.v = uof204;
       f20 uof205 = new f20("HIFI", 5);
       f20.w = uof205;
       f20 uof206 = new f20("HIFI_24", 6);
       f20.x = uof206;
       f20[] uof20Array = new f20[]{uof20,uof201,uof202,uof203,uof204,uof205,uof206};
       f20.y = uof20Array;
    }
    public void f20(String p0,int p1){
       super(p0, p1);
    }
    public static f20 valueOf(String p0){
       return Enum.valueOf(f20.class, p0);
    }
    public static f20[] values(){
       return f20.y.clone();
    }
}
