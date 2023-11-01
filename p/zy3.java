package p.zy3;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class zy3 extends Enum implements tb3	// class@002f8d from classes.dex
{
    public final int a;
    public static final zy3 b;
    public static final zy3 c;
    public static final zy3 t;
    public static final zy3 v;
    public static final zy3[] w;

    static {
       zy3 ozy3 = new zy3("UNSYNCED", 0, 0);
       zy3.b = ozy3;
       zy3 ozy31 = new zy3("LINE_SYNCED", 1, 1);
       zy3.c = ozy31;
       zy3 ozy32 = new zy3("SYLLABLE_SYNCED", 2, 2);
       zy3.t = ozy32;
       zy3 ozy33 = new zy3("UNRECOGNIZED", 3, -1);
       zy3.v = ozy33;
       zy3[] ozy3Array = new zy3[]{ozy3,ozy31,ozy32,ozy33};
       zy3.w = ozy3Array;
    }
    public void zy3(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static zy3 valueOf(String p0){
       return Enum.valueOf(zy3.class, p0);
    }
    public static zy3[] values(){
       return zy3.w.clone();
    }
    public final int getNumber(){
       if (this != zy3.v) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
