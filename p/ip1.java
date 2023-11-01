package p.ip1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class ip1 extends Enum implements tb3	// class@0019d9 from classes.dex
{
    public final int a;
    public static final ip1 b;
    public static final ip1 c;
    public static final ip1 t;
    public static final ip1 v;
    public static final ip1[] w;

    static {
       ip1 oip1 = new ip1("NONE", 0, 0);
       ip1.b = oip1;
       ip1 oip11 = new ip1("OFF", 1, 1);
       ip1.c = oip11;
       ip1 oip12 = new ip1("ON", 2, 2);
       ip1.t = oip12;
       ip1 oip13 = new ip1("UNRECOGNIZED", 3, -1);
       ip1.v = oip13;
       ip1[] oip1Array = new ip1[]{oip1,oip11,oip12,oip13};
       ip1.w = oip1Array;
    }
    public void ip1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static ip1 valueOf(String p0){
       return Enum.valueOf(ip1.class, p0);
    }
    public static ip1[] values(){
       return ip1.w.clone();
    }
    public final int getNumber(){
       if (this != ip1.v) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
