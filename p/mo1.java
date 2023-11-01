package p.mo1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class mo1 extends Enum	// class@0002bb from classes2.dex
{
    public final int a;
    public static final mo1 b;
    public static final mo1 c;
    public static final mo1 t;
    public static final mo1 v;
    public static final mo1 w;
    public static final mo1 x;
    public static final mo1[] y;

    static {
       mo1 omo1 = new mo1("NO_ERROR", 0, 0);
       mo1.b = omo1;
       mo1 omo11 = new mo1("PROTOCOL_ERROR", 1, 1);
       mo1.c = omo11;
       mo1 omo12 = new mo1("INTERNAL_ERROR", 2, 2);
       mo1.t = omo12;
       mo1 omo13 = new mo1("FLOW_CONTROL_ERROR", 3, 3);
       mo1.v = omo13;
       mo1 omo14 = new mo1("REFUSED_STREAM", 7, 7);
       mo1.w = omo14;
       mo1 omo15 = new mo1("CANCEL", 8, 8);
       mo1.x = omo15;
       mo1[] omo1Array = new mo1[14];
       omo1Array[0] = omo1;
       omo1Array[1] = omo11;
       omo1Array[2] = omo12;
       omo1Array[3] = omo13;
       omo1Array[4] = new mo1("SETTINGS_TIMEOUT", 4, 4);
       omo1Array[5] = new mo1("STREAM_CLOSED", 5, 5);
       omo1Array[6] = new mo1("FRAME_SIZE_ERROR", 6, 6);
       omo1Array[7] = omo14;
       omo1Array[8] = omo15;
       omo1Array[9] = new mo1("COMPRESSION_ERROR", 9, 9);
       omo1Array[10] = new mo1("CONNECT_ERROR", 10, 10);
       omo1Array[11] = new mo1("ENHANCE_YOUR_CALM", 11, 11);
       omo1Array[12] = new mo1("INADEQUATE_SECURITY", 12, 12);
       omo1Array[13] = new mo1("HTTP_1_1_REQUIRED", 13, 13);
       mo1.y = omo1Array;
    }
    public void mo1(String p0,int p1,int p2){
       this.a = p2;
    }
    public static mo1 valueOf(String p0){
       return Enum.valueOf(mo1.class, p0);
    }
    public static mo1[] values(){
       return mo1.y.clone();
    }
}
