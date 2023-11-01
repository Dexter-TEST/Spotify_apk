package p.ou0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class ou0 extends Enum	// class@00218d from classes.dex
{
    public static final ou0 a;
    public static final ou0 b;
    public static final ou0 c;
    public static final ou0[] t;

    static {
       ou0 oou0 = new ou0("USER_DATA", 0, "user_data");
       ou0.a = oou0;
       ou0 oou01 = new ou0("APP_DATA", 1, "app_data");
       ou0.b = oou01;
       ou0 oou02 = new ou0("CUSTOM_DATA", 2, "custom_data");
       ou0.c = oou02;
       ou0[] oou0Array = new ou0[]{oou0,oou01,oou02,new ou0("CUSTOM_EVENTS", 3, "custom_events")};
       ou0.t = oou0Array;
    }
    public void ou0(String p0,int p1,String p2){
       super(p0, p1);
    }
    public static ou0 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(ou0.class, p0);
    }
    public static ou0[] values(){
       return Arrays.copyOf(ou0.t, 4);
    }
}
