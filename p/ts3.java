package p.ts3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ts3 extends Enum	// class@0027d1 from classes.dex
{
    public static final ts3 a;
    public static final ts3 b;
    public static final ts3 c;
    public static final ts3 t;
    public static final ts3 v;
    public static final ts3 w;
    public static final ts3[] x;

    static {
       ts3 ots3 = new ts3("Integer", 5);
       ts3.a = ots3;
       ts3 ots31 = new ts3("Float", 6);
       ts3.b = ots31;
       ts3 ots32 = new ts3("Boolean", 7);
       ts3.c = ots32;
       ts3 ots33 = new ts3("Enum", 8);
       ts3.t = ots33;
       ts3 ots34 = new ts3("DateTime", 11);
       ts3.v = ots34;
       ts3 ots35 = new ts3("OtherScalar", 12);
       ts3.w = ots35;
       ts3[] ots3Array = new ts3[13];
       ots3Array[0] = new ts3("Array", 0);
       ots3Array[1] = new ts3("Collection", 1);
       ots3Array[2] = new ts3("Map", 2);
       ots3Array[3] = new ts3("POJO", 3);
       ots3Array[4] = new ts3("Untyped", 4);
       ots3Array[5] = ots3;
       ots3Array[6] = ots31;
       ots3Array[7] = ots32;
       ots3Array[8] = ots33;
       ots3Array[9] = new ts3("Textual", 9);
       ots3Array[10] = new ts3("Binary", 10);
       ots3Array[11] = ots34;
       ots3Array[12] = ots35;
       ts3.x = ots3Array;
    }
    public void ts3(String p0,int p1){
       super(p0, p1);
    }
    public static ts3 valueOf(String p0){
       return Enum.valueOf(ts3.class, p0);
    }
    public static ts3[] values(){
       return ts3.x.clone();
    }
}
