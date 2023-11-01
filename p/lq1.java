package p.lq1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class lq1 extends Enum implements tb3	// class@001da0 from classes.dex
{
    public final int a;
    public static final lq1 A;
    public static final lq1[] B;
    public static final lq1 b;
    public static final lq1 c;
    public static final lq1 t;
    public static final lq1 v;
    public static final lq1 w;
    public static final lq1 x;
    public static final lq1 y;
    public static final lq1 z;

    static {
       lq1 olq1 = new lq1("SUCCESS", 0, 0);
       lq1.b = olq1;
       lq1 olq11 = new lq1("GENERIC", 1, 1);
       lq1.c = olq11;
       lq1 olq12 = new lq1("DISK_FULL", 2, 8);
       lq1.t = olq12;
       lq1 olq13 = new lq1("EXPIRED", 3, 14);
       lq1.v = olq13;
       lq1 olq14 = new lq1("TOO_MANY_TRACKS", 4, 19);
       lq1.w = olq14;
       lq1 olq15 = new lq1("NOT_ALLOWED", 5, 23);
       lq1.x = olq15;
       lq1 olq16 = new lq1("CONNECTION_DISABLED", 6, 36);
       lq1.y = olq16;
       lq1 olq17 = new lq1("DEVICE_LIMIT_REACHED", 7, 7028);
       lq1.z = olq17;
       lq1 olq18 = new lq1("UNRECOGNIZED", 8, -1);
       lq1.A = olq18;
       lq1[] olq1Array = new lq1[9];
       olq1Array[0] = olq1;
       olq1Array[1] = olq11;
       olq1Array[2] = olq12;
       olq1Array[3] = olq13;
       olq1Array[4] = olq14;
       olq1Array[5] = olq15;
       olq1Array[6] = olq16;
       olq1Array[7] = olq17;
       olq1Array[8] = olq18;
       lq1.B = olq1Array;
    }
    public void lq1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static lq1 a(int p0){
       if (!p0) {
          return lq1.b;
       }
       if (p0 == 1) {
          return lq1.c;
       }
       if (p0 == 8) {
          return lq1.t;
       }
       if (p0 == 14) {
          return lq1.v;
       }
       if (p0 == 19) {
          return lq1.w;
       }
       if (p0 == 23) {
          return lq1.x;
       }
       if (p0 == 36) {
          return lq1.y;
       }
       if (p0 != 7028) {
          return null;
       }
       return lq1.z;
    }
    public static lq1 valueOf(String p0){
       return Enum.valueOf(lq1.class, p0);
    }
    public static lq1[] values(){
       return lq1.B.clone();
    }
    public final int getNumber(){
       if (this != lq1.A) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
