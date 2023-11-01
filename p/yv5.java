package p.yv5;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class yv5 extends Enum implements tb3	// class@002e36 from classes.dex
{
    public final int a;
    public static final yv5 b;
    public static final yv5 c;
    public static final yv5[] t;

    static {
       yv5 oyv5 = new yv5("BLOCKING", 0, 0);
       yv5.b = oyv5;
       yv5 oyv51 = new yv5("UNRECOGNIZED", 3, -1);
       yv5.c = oyv51;
       yv5[] oyv5Array = new yv5[]{oyv5,new yv5("BACKGROUND_SYNC", 1, 1),new yv5("ASYNC", 2, 2),oyv51};
       yv5.t = oyv5Array;
    }
    public void yv5(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static yv5 valueOf(String p0){
       return Enum.valueOf(yv5.class, p0);
    }
    public static yv5[] values(){
       return yv5.t.clone();
    }
    public final int getNumber(){
       if (this != yv5.c) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
