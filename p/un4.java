package p.un4;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class un4 extends Enum implements tb3	// class@0028e4 from classes.dex
{
    public final int a;
    public static final un4 b;
    public static final un4 c;
    public static final un4[] t;

    static {
       un4 oun4 = new un4("NULL_VALUE", 0, 0);
       un4.b = oun4;
       un4 oun41 = new un4("UNRECOGNIZED", 1, -1);
       un4.c = oun41;
       un4[] oun4Array = new un4[]{oun4,oun41};
       un4.t = oun4Array;
    }
    public void un4(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static un4 valueOf(String p0){
       return Enum.valueOf(un4.class, p0);
    }
    public static un4[] values(){
       return un4.t.clone();
    }
    public final int getNumber(){
       if (this != un4.c) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
