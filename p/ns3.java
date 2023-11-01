package p.ns3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class ns3 extends Enum	// class@00203c from classes.dex
{
    public static final ns3 a;
    public static final ns3 b;
    public static final ns3 c;
    public static final ns3 t;
    public static final ns3 v;
    public static final ns3 w;
    public static final ns3 x;
    public static final ns3[] y;

    static {
       ns3 ons3 = new ns3("REQUESTS", 0);
       ns3.a = ons3;
       ns3 ons31 = new ns3("INCLUDE_ACCESS_TOKENS", 1);
       ns3.b = ons31;
       ns3 ons32 = new ns3("INCLUDE_RAW_RESPONSES", 2);
       ns3.c = ons32;
       ns3 ons33 = new ns3("APP_EVENTS", 4);
       ns3.t = ons33;
       ns3 ons34 = new ns3("DEVELOPER_ERRORS", 5);
       ns3.v = ons34;
       ns3 ons35 = new ns3("GRAPH_API_DEBUG_WARNING", 6);
       ns3.w = ons35;
       ns3 ons36 = new ns3("GRAPH_API_DEBUG_INFO", 7);
       ns3.x = ons36;
       ns3[] ons3Array = new ns3[]{ons3,ons31,ons32,new ns3("CACHE", 3),ons33,ons34,ons35,ons36};
       ns3.y = ons3Array;
    }
    public void ns3(String p0,int p1){
       super(p0, p1);
    }
    public static ns3 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(ns3.class, p0);
    }
    public static ns3[] values(){
       return Arrays.copyOf(ns3.y, 8);
    }
}
