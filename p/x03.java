package p.x03;
import p.fu2;
import p.ru2;
import java.lang.Enum;
import p.m03;
import p.n03;
import p.o03;
import p.p03;
import p.q03;
import p.r03;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.bu2;

public abstract class x03 extends Enum implements fu2, ru2	// class@002be0 from classes.dex
{
    public final String a;
    public static final m03 b;
    public static final x03[] c;

    static {
       m03 om03 = new m03();
       x03.b = om03;
       x03[] ox03Array = new x03[]{om03,new n03(),new o03(),new p03(),new q03(),new r03()};
       x03.c = ox03Array;
    }
    public void x03(String p0,int p1,String p2){
       super(p0, p1);
       this.a = p2;
    }
    public static x03 valueOf(String p0){
       return Enum.valueOf(x03.class, p0);
    }
    public static x03[] values(){
       return x03.c.clone();
    }
    public final String c(){
       return this.a;
    }
    public final String d(){
       return bu2.v.a;
    }
}
