package p.sm5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class sm5 extends Enum	// class@00265a from classes.dex
{
    public final String a;
    public static final sm5 b;
    public static final sm5 c;
    public static final sm5 t;
    public static final sm5 v;
    public static final sm5 w;
    public static final sm5 x;
    public static final sm5[] y;

    static {
       sm5 osm5 = new sm5("HTTP_1_0", 0, "http/1.0");
       sm5.b = osm5;
       sm5 osm51 = new sm5("HTTP_1_1", 1, "http/1.1");
       sm5.c = osm51;
       sm5 osm52 = new sm5("SPDY_3", 2, "spdy/3.1");
       sm5.t = osm52;
       sm5 osm53 = new sm5("HTTP_2", 3, "h2");
       sm5.v = osm53;
       sm5 osm54 = new sm5("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
       sm5.w = osm54;
       sm5 osm55 = new sm5("QUIC", 5, "quic");
       sm5.x = osm55;
       sm5[] osm5Array = new sm5[]{osm5,osm51,osm52,osm53,osm54,osm55};
       sm5.y = osm5Array;
    }
    public void sm5(String p0,int p1,String p2){
       this.a = p2;
    }
    public static sm5 valueOf(String p0){
       return Enum.valueOf(sm5.class, p0);
    }
    public static sm5[] values(){
       return sm5.y.clone();
    }
    public final String toString(){
       return this.a;
    }
}
