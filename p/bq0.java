package p.bq0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class bq0 extends Enum	// class@001112 from classes.dex
{
    public static final bq0 a;
    public static final bq0 b;
    public static final bq0 c;
    public static final bq0 t;
    public static final bq0 v;
    public static final bq0 w;
    public static final bq0 x;
    public static final bq0 y;
    public static final bq0[] z;

    static {
       bq0 uobq0 = new bq0("LEFT", 1);
       bq0.a = uobq0;
       bq0 uobq01 = new bq0("TOP", 2);
       bq0.b = uobq01;
       bq0 uobq02 = new bq0("RIGHT", 3);
       bq0.c = uobq02;
       bq0 uobq03 = new bq0("BOTTOM", 4);
       bq0.t = uobq03;
       bq0 uobq04 = new bq0("BASELINE", 5);
       bq0.v = uobq04;
       bq0 uobq05 = new bq0("CENTER", 6);
       bq0.w = uobq05;
       bq0 uobq06 = new bq0("CENTER_X", 7);
       bq0.x = uobq06;
       bq0 uobq07 = new bq0("CENTER_Y", 8);
       bq0.y = uobq07;
       bq0[] uobq0Array = new bq0[9];
       uobq0Array[0] = new bq0("NONE", 0);
       uobq0Array[1] = uobq0;
       uobq0Array[2] = uobq01;
       uobq0Array[3] = uobq02;
       uobq0Array[4] = uobq03;
       uobq0Array[5] = uobq04;
       uobq0Array[6] = uobq05;
       uobq0Array[7] = uobq06;
       uobq0Array[8] = uobq07;
       bq0.z = uobq0Array;
    }
    public void bq0(String p0,int p1){
       super(p0, p1);
    }
    public static bq0 valueOf(String p0){
       return Enum.valueOf(bq0.class, p0);
    }
    public static bq0[] values(){
       return bq0.z.clone();
    }
}
