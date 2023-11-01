package p.kr1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class kr1 extends Enum implements tb3	// class@001c69 from classes.dex
{
    public final int a;
    public static final kr1 b;
    public static final kr1 c;
    public static final kr1 t;
    public static final kr1 v;
    public static final kr1[] w;

    static {
       kr1 okr1 = new kr1("BEGINNING", 0, 0);
       kr1.b = okr1;
       kr1 okr11 = new kr1("END", 1, 1);
       kr1.c = okr11;
       kr1 okr12 = new kr1("CURRENT", 2, 2);
       kr1.t = okr12;
       kr1 okr13 = new kr1("UNRECOGNIZED", 3, -1);
       kr1.v = okr13;
       kr1[] okr1Array = new kr1[]{okr1,okr11,okr12,okr13};
       kr1.w = okr1Array;
    }
    public void kr1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static kr1 valueOf(String p0){
       return Enum.valueOf(kr1.class, p0);
    }
    public static kr1[] values(){
       return kr1.w.clone();
    }
    public final int getNumber(){
       if (this != kr1.v) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
