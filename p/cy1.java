package p.cy1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class cy1 extends Enum	// class@00129d from classes.dex
{
    public static final cy1 a;
    public static final cy1 b;
    public static final cy1 c;
    public static final cy1 t;
    public static final cy1[] v;

    static {
       cy1 uocy1 = new cy1("NOT_EXTRACTED", 0);
       cy1.a = uocy1;
       cy1 uocy11 = new cy1("EXTRACTING", 1);
       cy1.b = uocy11;
       cy1 uocy12 = new cy1("EXTRACTED", 2);
       cy1.c = uocy12;
       cy1 uocy13 = new cy1("UNNEEDED", 4);
       cy1.t = uocy13;
       cy1[] uocy1Array = new cy1[]{uocy1,uocy11,uocy12,new cy1("FAILED_TO_EXTRACT", 3),uocy13};
       cy1.v = uocy1Array;
    }
    public void cy1(String p0,int p1){
       super(p0, p1);
    }
    public static cy1 valueOf(String p0){
       return Enum.valueOf(cy1.class, p0);
    }
    public static cy1[] values(){
       return cy1.v.clone();
    }
}
