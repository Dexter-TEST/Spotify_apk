package p.mo2;
import p.q73;
import java.lang.Enum;
import p.ko2;
import p.lo2;
import java.lang.String;
import p.se0;
import java.lang.Class;
import java.lang.Object;

public abstract class mo2 extends Enum implements q73	// class@001ed3 from classes.dex
{
    public final se0 a;
    public static final ko2 b;
    public static final mo2[] c;

    static {
       ko2 oko2 = new ko2();
       mo2.b = oko2;
       mo2[] omo2Array = new mo2[]{oko2,new lo2()};
       mo2.c = omo2Array;
    }
    public void mo2(String p0,int p1,String p2){
       super(p0, p1);
       this.a = new se0(this, p2);
    }
    public static mo2 valueOf(String p0){
       return Enum.valueOf(mo2.class, p0);
    }
    public static mo2[] values(){
       return mo2.c.clone();
    }
}
