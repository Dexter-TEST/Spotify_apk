package p.k57;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class k57 extends Enum	// class@001bae from classes.dex
{
    public final String a;
    public static final k57 b;
    public static final k57 c;
    public static final k57 t;
    public static final k57 v;
    public static final k57 w;
    public static final k57[] x;

    static {
       k57 ok57 = new k57("TLS_1_3", 0, "TLSv1.3");
       k57.b = ok57;
       k57 ok571 = new k57("TLS_1_2", 1, "TLSv1.2");
       k57.c = ok571;
       k57 ok572 = new k57("TLS_1_1", 2, "TLSv1.1");
       k57.t = ok572;
       k57 ok573 = new k57("TLS_1_0", 3, "TLSv1");
       k57.v = ok573;
       k57 ok574 = new k57("SSL_3_0", 4, "SSLv3");
       k57.w = ok574;
       k57[] ok57Array = new k57[]{ok57,ok571,ok572,ok573,ok574};
       k57.x = ok57Array;
    }
    public void k57(String p0,int p1,String p2){
       super(p0, p1);
       this.a = p2;
    }
    public static k57 valueOf(String p0){
       return Enum.valueOf(k57.class, p0);
    }
    public static k57[] values(){
       return k57.x.clone();
    }
}
