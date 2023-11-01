package p.m84;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class m84 extends Enum implements tb3	// class@001e45 from classes.dex
{
    public final int a;
    public static final m84 b;
    public static final m84 c;
    public static final m84 t;
    public static final m84[] v;

    static {
       m84 om84 = new m84("FULL", 0, 0);
       m84.b = om84;
       m84 om841 = new m84("TRAILER", 1, 1);
       m84.c = om841;
       m84 om842 = new m84("BONUS", 2, 2);
       m84.t = om842;
       m84[] om84Array = new m84[]{om84,om841,om842};
       m84.v = om84Array;
    }
    public void m84(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static m84 valueOf(String p0){
       return Enum.valueOf(m84.class, p0);
    }
    public static m84[] values(){
       return m84.v.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
