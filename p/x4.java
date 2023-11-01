package p.x4;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class x4 extends Enum implements tb3	// class@002c0b from classes.dex
{
    public final int a;
    public static final x4 b;
    public static final x4 c;
    public static final x4 t;
    public static final x4 v;
    public static final x4 w;
    public static final x4[] x;

    static {
       x4 ox4 = new x4("URI", 0, 0);
       x4.b = ox4;
       x4 ox41 = new x4("SUBMIT", 1, 1);
       x4.c = ox41;
       x4 ox42 = new x4("DISMISS", 2, 2);
       x4.t = ox42;
       x4 ox43 = new x4("NO_ACTION", 3, 3);
       x4.v = ox43;
       x4 ox44 = new x4("UNRECOGNIZED", 4, -1);
       x4.w = ox44;
       x4[] ox4Array = new x4[]{ox4,ox41,ox42,ox43,ox44};
       x4.x = ox4Array;
    }
    public void x4(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static x4 valueOf(String p0){
       return Enum.valueOf(x4.class, p0);
    }
    public static x4[] values(){
       return x4.x.clone();
    }
    public final int getNumber(){
       if (this != x4.w) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
