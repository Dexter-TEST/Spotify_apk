package p.mq1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class mq1 extends Enum implements tb3	// class@001ee3 from classes.dex
{
    public final int a;
    public static final mq1 A;
    public static final mq1[] B;
    public static final mq1 b;
    public static final mq1 c;
    public static final mq1 t;
    public static final mq1 v;
    public static final mq1 w;
    public static final mq1 x;
    public static final mq1 y;
    public static final mq1 z;

    static {
       mq1 omq1 = new mq1("NOT_DOWNLOADED", 0, 0);
       mq1.b = omq1;
       mq1 omq11 = new mq1("ERROR", 1, 1);
       mq1.c = omq11;
       mq1 omq12 = new mq1("DOWNLOADED_EXPIRED", 2, 2);
       mq1.t = omq12;
       mq1 omq13 = new mq1("DOWNLOADED", 3, 3);
       mq1.v = omq13;
       mq1 omq14 = new mq1("WAITING_FOR_REDOWNLOAD", 4, 4);
       mq1.w = omq14;
       mq1 omq15 = new mq1("DOWNLOADING", 5, 5);
       mq1.x = omq15;
       mq1 omq16 = new mq1("WAITING", 6, 6);
       mq1.y = omq16;
       mq1 omq17 = new mq1("WAITING_LIMIT_EXCEEDED", 7, 7);
       mq1.z = omq17;
       mq1 omq18 = new mq1("UNRECOGNIZED", 8, -1);
       mq1.A = omq18;
       mq1[] omq1Array = new mq1[9];
       omq1Array[0] = omq1;
       omq1Array[1] = omq11;
       omq1Array[2] = omq12;
       omq1Array[3] = omq13;
       omq1Array[4] = omq14;
       omq1Array[5] = omq15;
       omq1Array[6] = omq16;
       omq1Array[7] = omq17;
       omq1Array[8] = omq18;
       mq1.B = omq1Array;
    }
    public void mq1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static mq1 a(int p0){
       switch (p0){
           case 0:
             return mq1.b;
           case 1:
             return mq1.c;
           case 2:
             return mq1.t;
           case 3:
             return mq1.v;
           case 4:
             return mq1.w;
           case 5:
             return mq1.x;
           case 6:
             return mq1.y;
           case 7:
             return mq1.z;
           default:
             return null;
       }
    }
    public static mq1 valueOf(String p0){
       return Enum.valueOf(mq1.class, p0);
    }
    public static mq1[] values(){
       return mq1.B.clone();
    }
    public final int getNumber(){
       if (this != mq1.A) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
