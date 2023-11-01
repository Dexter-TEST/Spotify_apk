package p.z12;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import p.dr0;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class z12 extends Enum implements tb3	// class@002e69 from classes.dex
{
    private final int value;
    private static final z12[] $VALUES;
    public static final z12 a;
    public static final z12 b;
    public static final z12 c;
    private static final ub3 internalValueMap;
    public static final z12 t;
    public static final z12 v;
    public static final z12 w;

    static {
       z12 oz12 = new z12("BLOCKING", 0, 0);
       z12.a = oz12;
       z12 oz121 = new z12("BACKGROUND_SYNC", 1, 1);
       z12.b = oz121;
       z12 oz122 = new z12("ASYNC", 2, 2);
       z12.c = oz122;
       z12 oz123 = new z12("PUSH_INITIATED", 3, 3);
       z12.t = oz123;
       z12 oz124 = new z12("RECONNECT", 4, 4);
       z12.v = oz124;
       z12 oz125 = new z12("UNRECOGNIZED", 5, -1);
       z12.w = oz125;
       z12[] oz12Array = new z12[]{oz12,oz121,oz122,oz123,oz124,oz125};
       z12.$VALUES = oz12Array;
       z12.internalValueMap = new dr0(9);
    }
    public void z12(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static z12 valueOf(String p0){
       return Enum.valueOf(z12.class, p0);
    }
    public static z12[] values(){
       return z12.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != z12.w) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
