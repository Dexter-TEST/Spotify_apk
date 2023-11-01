package p.ei2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ei2 extends Enum	// class@001490 from classes.dex
{
    public static final ei2 a;
    public static final ei2 b;
    public static final ei2 c;
    public static final ei2 t;
    public static final ei2 v;
    public static final ei2 w;
    public static final ei2[] x;

    static {
       ei2 uoei2 = new ei2("NONE", 0);
       ei2.a = uoei2;
       ei2 uoei21 = new ei2("MALE", 1);
       ei2.b = uoei21;
       ei2 uoei22 = new ei2("FEMALE", 2);
       ei2.c = uoei22;
       ei2 uoei23 = new ei2("NEUTRAL", 3);
       ei2.t = uoei23;
       ei2 uoei24 = new ei2("OTHER", 4);
       ei2.v = uoei24;
       ei2 uoei25 = new ei2("PREFER_NOT_TO_SAY", 5);
       ei2.w = uoei25;
       ei2[] uoei2Array = new ei2[]{uoei2,uoei21,uoei22,uoei23,uoei24,uoei25};
       ei2.x = uoei2Array;
    }
    public void ei2(String p0,int p1){
       super(p0, p1);
    }
    public static ei2 valueOf(String p0){
       return Enum.valueOf(ei2.class, p0);
    }
    public static ei2[] values(){
       return ei2.x.clone();
    }
}
