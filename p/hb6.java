package p.hb6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class hb6 extends Enum	// class@00181d from classes.dex
{
    public static final hb6[] A;
    public static final hb6 a;
    public static final hb6 b;
    public static final hb6 c;
    public static final hb6 t;
    public static final hb6 v;
    public static final hb6 w;
    public static final hb6 x;
    public static final hb6 y;
    public static final hb6 z;

    static {
       hb6 ohb6 = new hb6("SDK_INIT_WAIT_LOCK", 0);
       hb6.a = ohb6;
       hb6 ohb61 = new hb6("GAID_FETCH_WAIT_LOCK", 2);
       hb6.b = ohb61;
       hb6 ohb62 = new hb6("INTENT_PENDING_WAIT_LOCK", 3);
       hb6.c = ohb62;
       hb6 ohb63 = new hb6("STRONG_MATCH_PENDING_WAIT_LOCK", 4);
       hb6.t = ohb63;
       hb6 ohb64 = new hb6("USER_SET_WAIT_LOCK", 5);
       hb6.v = ohb64;
       hb6 ohb65 = new hb6("HUAWEI_INSTALL_REFERRER_FETCH_WAIT_LOCK", 6);
       hb6.w = ohb65;
       hb6 ohb66 = new hb6("GOOGLE_INSTALL_REFERRER_FETCH_WAIT_LOCK", 7);
       hb6.x = ohb66;
       hb6 ohb67 = new hb6("SAMSUNG_INSTALL_REFERRER_FETCH_WAIT_LOCK", 8);
       hb6.y = ohb67;
       hb6 ohb68 = new hb6("XIAOMI_INSTALL_REFERRER_FETCH_WAIT_LOCK", 9);
       hb6.z = ohb68;
       hb6[] ohb6Array = new hb6[10];
       ohb6Array[0] = ohb6;
       ohb6Array[1] = new hb6("FB_APP_LINK_WAIT_LOCK", 1);
       ohb6Array[2] = ohb61;
       ohb6Array[3] = ohb62;
       ohb6Array[4] = ohb63;
       ohb6Array[5] = ohb64;
       ohb6Array[6] = ohb65;
       ohb6Array[7] = ohb66;
       ohb6Array[8] = ohb67;
       ohb6Array[9] = ohb68;
       hb6.A = ohb6Array;
    }
    public void hb6(String p0,int p1){
       super(p0, p1);
    }
    public static hb6 valueOf(String p0){
       return Enum.valueOf(hb6.class, p0);
    }
    public static hb6[] values(){
       return hb6.A.clone();
    }
}
