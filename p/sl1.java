package p.sl1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class sl1 extends Enum	// class@00264d from classes.dex
{
    public static final sl1 A;
    public static final sl1 B;
    public static final sl1 C;
    public static final sl1[] D;
    public static final sl1 a;
    public static final sl1 b;
    public static final sl1 c;
    public static final sl1 t;
    public static final sl1 v;
    public static final sl1 w;
    public static final sl1 x;
    public static final sl1 y;
    public static final sl1 z;

    static {
       sl1 osl1 = new sl1("ERROR_CORRECTION", 0);
       sl1.a = osl1;
       sl1 osl11 = new sl1("CHARACTER_SET", 1);
       sl1.b = osl11;
       sl1 osl12 = new sl1("DATA_MATRIX_SHAPE", 2);
       sl1.c = osl12;
       sl1 osl13 = new sl1("MIN_SIZE", 3);
       sl1.t = osl13;
       sl1 osl14 = new sl1("MAX_SIZE", 4);
       sl1.v = osl14;
       sl1 osl15 = new sl1("MARGIN", 5);
       sl1.w = osl15;
       sl1 osl16 = new sl1("PDF417_COMPACT", 6);
       sl1.x = osl16;
       sl1 osl17 = new sl1("PDF417_COMPACTION", 7);
       sl1.y = osl17;
       sl1 osl18 = new sl1("PDF417_DIMENSIONS", 8);
       sl1.z = osl18;
       sl1 osl19 = new sl1("AZTEC_LAYERS", 9);
       sl1.A = osl19;
       sl1 osl110 = new sl1("QR_VERSION", 10);
       sl1.B = osl110;
       sl1 osl111 = new sl1("GS1_FORMAT", 11);
       sl1.C = osl111;
       sl1[] osl1Array = new sl1[12];
       osl1Array[0] = osl1;
       osl1Array[1] = osl11;
       osl1Array[2] = osl12;
       osl1Array[3] = osl13;
       osl1Array[4] = osl14;
       osl1Array[5] = osl15;
       osl1Array[6] = osl16;
       osl1Array[7] = osl17;
       osl1Array[8] = osl18;
       osl1Array[9] = osl19;
       osl1Array[10] = osl110;
       osl1Array[11] = osl111;
       sl1.D = osl1Array;
    }
    public void sl1(String p0,int p1){
       super(p0, p1);
    }
    public static sl1 valueOf(String p0){
       return Enum.valueOf(sl1.class, p0);
    }
    public static sl1[] values(){
       return sl1.D.clone();
    }
}
