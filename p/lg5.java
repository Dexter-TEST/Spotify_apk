package p.lg5;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class lg5 extends Enum implements tb3	// class@001d4c from classes.dex
{
    public final int a;
    public static final lg5 A;
    public static final lg5 B;
    public static final lg5 C;
    public static final lg5[] D;
    public static final lg5 b;
    public static final lg5 c;
    public static final lg5 t;
    public static final lg5 v;
    public static final lg5 w;
    public static final lg5 x;
    public static final lg5 y;
    public static final lg5 z;

    static {
       lg5 olg5 = new lg5("LIST_UNKNOWN", 0, 0);
       lg5.b = olg5;
       lg5 olg51 = new lg5("LIST_NAME", 1, 1);
       lg5.c = olg51;
       lg5 olg52 = new lg5("LIST_DESCRIPTION", 2, 2);
       lg5.t = olg52;
       lg5 olg53 = new lg5("LIST_PICTURE", 3, 3);
       lg5.v = olg53;
       lg5 olg54 = new lg5("LIST_COLLABORATIVE", 4, 4);
       lg5.w = olg54;
       lg5 olg55 = new lg5("LIST_PL3_VERSION", 5, 5);
       lg5.x = olg55;
       lg5 olg56 = new lg5("LIST_DELETED_BY_OWNER", 6, 6);
       lg5.y = olg56;
       lg5 olg57 = new lg5("LIST_CLIENT_ID", 7, 10);
       lg5.z = olg57;
       lg5 olg58 = new lg5("LIST_FORMAT", 8, 11);
       lg5.A = olg58;
       lg5 olg59 = new lg5("LIST_FORMAT_ATTRIBUTES", 9, 12);
       lg5.B = olg59;
       lg5 olg510 = new lg5("LIST_PICTURE_SIZE", 10, 13);
       lg5.C = olg510;
       lg5[] olg5Array = new lg5[11];
       olg5Array[0] = olg5;
       olg5Array[1] = olg51;
       olg5Array[2] = olg52;
       olg5Array[3] = olg53;
       olg5Array[4] = olg54;
       olg5Array[5] = olg55;
       olg5Array[6] = olg56;
       olg5Array[7] = olg57;
       olg5Array[8] = olg58;
       olg5Array[9] = olg59;
       olg5Array[10] = olg510;
       lg5.D = olg5Array;
    }
    public void lg5(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static lg5 a(int p0){
       switch (p0){
           case 0:
             return lg5.b;
           case 1:
             return lg5.c;
           case 2:
             return lg5.t;
           case 3:
             return lg5.v;
           case 4:
             return lg5.w;
           case 5:
             return lg5.x;
           case 6:
             return lg5.y;
           case 10:
             return lg5.z;
           case 11:
             return lg5.A;
           case 12:
             return lg5.B;
           case 13:
             return lg5.C;
           default:
             return null;
       }
    }
    public static lg5 valueOf(String p0){
       return Enum.valueOf(lg5.class, p0);
    }
    public static lg5[] values(){
       return lg5.D.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
