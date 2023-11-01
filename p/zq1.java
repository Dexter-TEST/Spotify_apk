package p.zq1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class zq1 extends Enum implements tb3	// class@002f46 from classes.dex
{
    public final int a;
    public static final zq1 b;
    public static final zq1 c;
    public static final zq1 t;
    public static final zq1[] v;

    static {
       zq1 ozq1 = new zq1("DEFAULT", 0, 0);
       zq1.b = ozq1;
       zq1 ozq11 = new zq1("ALARM", 1, 1);
       zq1.c = ozq11;
       zq1 ozq12 = new zq1("UNRECOGNIZED", 2, -1);
       zq1.t = ozq12;
       zq1[] ozq1Array = new zq1[]{ozq1,ozq11,ozq12};
       zq1.v = ozq1Array;
    }
    public void zq1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static zq1 valueOf(String p0){
       return Enum.valueOf(zq1.class, p0);
    }
    public static zq1[] values(){
       return zq1.v.clone();
    }
    public final int getNumber(){
       if (this != zq1.t) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
