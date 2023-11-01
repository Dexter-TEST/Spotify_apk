package p.gc0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class gc0 extends Enum	// class@0016dd from classes.dex
{
    public static final gc0 a;
    public static final gc0 b;
    public static final gc0 c;
    public static final gc0 t;
    public static final gc0 v;
    public static final gc0 w;
    public static final gc0 x;
    public static final gc0 y;
    public static final gc0[] z;

    static {
       gc0 ogc0 = new gc0("NO_TEXT", 0);
       gc0.a = ogc0;
       gc0 ogc01 = new gc0("TITLE_ONLY", 1);
       gc0.b = ogc01;
       gc0 ogc02 = new gc0("TITLE_AND_SUBTITLE", 2);
       gc0.c = ogc02;
       gc0 ogc03 = new gc0("TITLE_AND_METADATA", 3);
       gc0.t = ogc03;
       gc0 ogc04 = new gc0("LARGE_DESCRIPTION_ONLY", 4);
       gc0.v = ogc04;
       gc0 ogc05 = new gc0("LARGE_NO_TEXT", 5);
       gc0.w = ogc05;
       gc0 ogc06 = new gc0("DESCRIPTION_ONLY", 6);
       gc0.x = ogc06;
       gc0 ogc07 = new gc0("SUBTITLE_ONLY", 7);
       gc0.y = ogc07;
       gc0[] ogc0Array = new gc0[]{ogc0,ogc01,ogc02,ogc03,ogc04,ogc05,ogc06,ogc07};
       gc0.z = ogc0Array;
    }
    public void gc0(String p0,int p1){
       super(p0, p1);
    }
    public static gc0 valueOf(String p0){
       return Enum.valueOf(gc0.class, p0);
    }
    public static gc0[] values(){
       return gc0.z.clone();
    }
}
