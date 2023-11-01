package p.j3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class j3 extends Enum	// class@001a5f from classes.dex
{
    public final boolean a;
    public static final j3[] A;
    public static final j3 b;
    public static final j3 c;
    public static final j3 t;
    public static final j3 v;
    public static final j3 w;
    public static final j3 x;
    public static final j3 y;
    public static final j3 z;

    static {
       j3 oj3 = new j3(1, "FACEBOOK_APPLICATION_WEB", 1);
       j3.b = oj3;
       j3 oj31 = new j3(3, "FACEBOOK_APPLICATION_SERVICE", 1);
       j3.c = oj31;
       j3 oj32 = new j3(4, "WEB_VIEW", 1);
       j3.t = oj32;
       j3 oj33 = new j3(5, "CHROME_CUSTOM_TAB", 1);
       j3.v = oj33;
       j3 oj34 = new j3(8, "DEVICE_AUTH", 1);
       j3.w = oj34;
       j3 oj35 = new j3(9, "INSTAGRAM_APPLICATION_WEB", 1);
       j3.x = oj35;
       j3 oj36 = new j3(10, "INSTAGRAM_CUSTOM_CHROME_TAB", 1);
       j3.y = oj36;
       j3 oj37 = new j3(11, "INSTAGRAM_WEB_VIEW", 1);
       j3.z = oj37;
       j3[] oj3Array = new j3[12];
       oj3Array[0] = new j3(0, "NONE", 0);
       oj3Array[1] = oj3;
       oj3Array[2] = new j3(2, "FACEBOOK_APPLICATION_NATIVE", 1);
       oj3Array[3] = oj31;
       oj3Array[4] = oj32;
       oj3Array[5] = oj33;
       oj3Array[6] = new j3(6, "TEST_USER", 1);
       oj3Array[7] = new j3(7, "CLIENT_TOKEN", 1);
       oj3Array[8] = oj34;
       oj3Array[9] = oj35;
       oj3Array[10] = oj36;
       oj3Array[11] = oj37;
       j3.A = oj3Array;
    }
    public void j3(int p0,String p1,boolean p2){
       this.a = p2;
    }
    public static j3 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(j3.class, p0);
    }
    public static j3[] values(){
       return Arrays.copyOf(j3.A, 12);
    }
}
