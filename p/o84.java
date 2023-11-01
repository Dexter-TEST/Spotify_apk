package p.o84;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class o84 extends Enum implements tb3	// class@0020cd from classes.dex
{
    public final int a;
    public static final o84 b;
    public static final o84 c;
    public static final o84 t;
    public static final o84 v;
    public static final o84[] w;

    static {
       o84 oo84 = new o84("DEFAULT", 0, 0);
       o84.b = oo84;
       o84 oo841 = new o84("SMALL", 1, 1);
       o84.c = oo841;
       o84 oo842 = new o84("LARGE", 2, 2);
       o84.t = oo842;
       o84 oo843 = new o84("XLARGE", 3, 3);
       o84.v = oo843;
       o84[] oo84Array = new o84[]{oo84,oo841,oo842,oo843};
       o84.w = oo84Array;
    }
    public void o84(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static o84 valueOf(String p0){
       return Enum.valueOf(o84.class, p0);
    }
    public static o84[] values(){
       return o84.w.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
