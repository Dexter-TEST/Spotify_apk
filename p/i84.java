package p.i84;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class i84 extends Enum implements tb3	// class@001944 from classes.dex
{
    public final int a;
    public static final i84 A;
    public static final i84 B;
    public static final i84 C;
    public static final i84 D;
    public static final i84 E;
    public static final i84 F;
    public static final i84 G;
    public static final i84[] H;
    public static final i84 b;
    public static final i84 c;
    public static final i84 t;
    public static final i84 v;
    public static final i84 w;
    public static final i84 x;
    public static final i84 y;
    public static final i84 z;

    static {
       i84 oi84 = new i84("OGG_VORBIS_96", 0, 0);
       i84.b = oi84;
       i84 oi841 = new i84("OGG_VORBIS_160", 1, 1);
       i84.c = oi841;
       i84 oi842 = new i84("OGG_VORBIS_320", 2, 2);
       i84.t = oi842;
       i84 oi843 = new i84("MP3_256", 3, 3);
       i84.v = oi843;
       i84 oi844 = new i84("MP3_320", 4, 4);
       i84.w = oi844;
       i84 oi845 = new i84("MP3_160", 5, 5);
       i84.x = oi845;
       i84 oi846 = new i84("MP3_96", 6, 6);
       i84.y = oi846;
       i84 oi847 = new i84("MP3_160_ENC", 7, 7);
       i84.z = oi847;
       i84 oi848 = new i84("AAC_24", 8, 8);
       i84.A = oi848;
       i84 oi849 = new i84("AAC_48", 9, 9);
       i84.B = oi849;
       i84 oi8410 = new i84("FLAC_FLAC", 10, 16);
       i84.C = oi8410;
       i84 oi8411 = new i84("XHE_AAC_24", 11, 18);
       i84.D = oi8411;
       i84 oi8412 = new i84("XHE_AAC_16", 12, 19);
       i84.E = oi8412;
       i84 oi8413 = oi8412;
       i84 oi8414 = new i84("XHE_AAC_12", 13, 20);
       i84.F = oi8414;
       i84 oi8415 = oi8414;
       i84 oi8416 = new i84("FLAC_FLAC_24BIT", 14, 22);
       i84.G = oi8416;
       i84[] oi84Array = new i84[15];
       oi84Array[0] = oi84;
       oi84Array[1] = oi841;
       oi84Array[2] = oi842;
       oi84Array[3] = oi843;
       oi84Array[4] = oi844;
       oi84Array[5] = oi845;
       oi84Array[6] = oi846;
       oi84Array[7] = oi847;
       oi84Array[8] = oi848;
       oi84Array[9] = oi849;
       oi84Array[10] = oi8410;
       oi84Array[11] = oi8411;
       oi84Array[12] = oi8413;
       oi84Array[13] = oi8415;
       oi84Array[14] = oi8416;
       i84.H = oi84Array;
    }
    public void i84(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static i84 a(int p0){
       if (p0 == 16) {
          return i84.C;
       }
       if (p0 == 22) {
          return i84.G;
       }
       switch (p0){
           case 0:
             return i84.b;
           case 1:
             return i84.c;
           case 2:
             return i84.t;
           case 3:
             return i84.v;
           case 4:
             return i84.w;
           case 5:
             return i84.x;
           case 6:
             return i84.y;
           case 7:
             return i84.z;
           case 8:
             return i84.A;
           case 9:
             return i84.B;
           default:
             switch (p0){
                 case 18:
                   return i84.D;
                 case 19:
                   return i84.E;
                 case 20:
                   return i84.F;
                 default:
                   return null;
             }
       }
    }
    public static i84 valueOf(String p0){
       return Enum.valueOf(i84.class, p0);
    }
    public static i84[] values(){
       return i84.H.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
