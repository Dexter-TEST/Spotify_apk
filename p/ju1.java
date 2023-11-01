package p.ju1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ju1 extends Enum	// class@001b46 from classes.dex
{
    public final String a;
    public static final ju1 b;
    public static final ju1 c;
    public static final ju1 t;
    public static final ju1 v;
    public static final ju1 w;
    public static final ju1[] x;

    static {
       ju1 oju1 = new ju1("UNKNOWN", 0, "unknown");
       ju1.b = oju1;
       ju1 oju11 = new ju1("TIMEOUT", 1, "timeout");
       ju1.c = oju11;
       ju1 oju12 = new ju1("CLIENT_ERROR", 3, "client_error");
       ju1.t = oju12;
       ju1 oju13 = new ju1("SERVER_ERROR", 4, "server_error");
       ju1.v = oju13;
       ju1 oju14 = new ju1("NOT_FOUND", 5, "not_found");
       ju1.w = oju14;
       ju1[] oju1Array = new ju1[]{oju1,oju11,new ju1("STREAM_TIMEOUT", 2, "stream_timeout"),oju12,oju13,oju14};
       ju1.x = oju1Array;
    }
    public void ju1(String p0,int p1,String p2){
       this.a = p2;
    }
    public static ju1 valueOf(String p0){
       return Enum.valueOf(ju1.class, p0);
    }
    public static ju1[] values(){
       return ju1.x.clone();
    }
}
