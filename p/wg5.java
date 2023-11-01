package p.wg5;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class wg5 extends Enum implements tb3	// class@002b31 from classes.dex
{
    public final int a;
    public static final wg5 b;
    public static final wg5 c;
    public static final wg5 t;
    public static final wg5 v;
    public static final wg5 w;
    public static final wg5 x;
    public static final wg5 y;
    public static final wg5[] z;

    static {
       wg5 owg5 = new wg5("CLIENT_UNKNOWN", 0, 0);
       wg5.b = owg5;
       wg5 owg51 = new wg5("NATIVE_HERMES", 1, 1);
       wg5.c = owg51;
       wg5 owg52 = new wg5("CLIENT", 2, 2);
       wg5.t = owg52;
       wg5 owg53 = new wg5("PYTHON", 3, 3);
       wg5.v = owg53;
       wg5 owg54 = new wg5("JAVA", 4, 4);
       wg5.w = owg54;
       wg5 owg55 = new wg5("WEBPLAYER", 5, 5);
       wg5.x = owg55;
       wg5 owg56 = new wg5("LIBSPOTIFY", 6, 6);
       wg5.y = owg56;
       wg5[] owg5Array = new wg5[]{owg5,owg51,owg52,owg53,owg54,owg55,owg56};
       wg5.z = owg5Array;
    }
    public void wg5(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static wg5 a(int p0){
       switch (p0){
           case 0:
             return wg5.b;
           case 1:
             return wg5.c;
           case 2:
             return wg5.t;
           case 3:
             return wg5.v;
           case 4:
             return wg5.w;
           case 5:
             return wg5.x;
           case 6:
             return wg5.y;
           default:
             return null;
       }
    }
    public static wg5 valueOf(String p0){
       return Enum.valueOf(wg5.class, p0);
    }
    public static wg5[] values(){
       return wg5.z.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
