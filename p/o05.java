package p.o05;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class o05 extends Enum	// class@002085 from classes.dex
{
    public static final o05 A;
    public static final o05 B;
    public static final o05 C;
    public static final o05[] D;
    public static final o05 a;
    public static final o05 b;
    public static final o05 c;
    public static final o05 t;
    public static final o05 v;
    public static final o05 w;
    public static final o05 x;
    public static final o05 y;
    public static final o05 z;

    static {
       o05 oo05 = new o05("AVAILABLE", 0);
       o05.a = oo05;
       o05 oo051 = new o05("AVAILABLE_RESYNC", 1);
       o05.b = oo051;
       o05 oo052 = new o05("DOWNLOADING", 2);
       o05.c = oo052;
       o05 oo053 = new o05("WAITING", 3);
       o05.t = oo053;
       o05 oo054 = new o05("WAITING_NO_CONNECTION", 4);
       o05.v = oo054;
       o05 oo055 = new o05("WAITING_OFFLINE_MODE", 5);
       o05.w = oo055;
       o05 oo056 = new o05("WAITING_SYNC_NOT_ALLOWED", 6);
       o05.x = oo056;
       o05 oo057 = new o05("WAITING_RESOLVING", 7);
       o05.y = oo057;
       o05 oo058 = new o05("UNAVAILABLE", 8);
       o05.z = oo058;
       o05 oo059 = new o05("UNAVAILABLE_EXPIRED", 9);
       o05.A = oo059;
       o05 oo0510 = new o05("UNAVAILABLE_EXCEEDED", 10);
       o05.B = oo0510;
       o05 oo0511 = new o05("UNAVAILABLE_ERROR", 11);
       o05.C = oo0511;
       o05[] oo05Array = new o05[12];
       oo05Array[0] = oo05;
       oo05Array[1] = oo051;
       oo05Array[2] = oo052;
       oo05Array[3] = oo053;
       oo05Array[4] = oo054;
       oo05Array[5] = oo055;
       oo05Array[6] = oo056;
       oo05Array[7] = oo057;
       oo05Array[8] = oo058;
       oo05Array[9] = oo059;
       oo05Array[10] = oo0510;
       oo05Array[11] = oo0511;
       o05.D = oo05Array;
    }
    public void o05(String p0,int p1){
       super(p0, p1);
    }
    public static o05 valueOf(String p0){
       return Enum.valueOf(o05.class, p0);
    }
    public static o05[] values(){
       return o05.D.clone();
    }
}
