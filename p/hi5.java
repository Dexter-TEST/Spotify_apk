package p.hi5;
import p.ci5;
import java.lang.Enum;
import p.di5;
import p.ei5;
import p.fi5;
import p.gi5;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class hi5 extends Enum implements ci5	// class@00185b from classes.dex
{
    public static final gi5 a;
    public static final hi5[] b;

    static {
       gi5 ogi5 = new gi5();
       hi5.a = ogi5;
       hi5[] ohi5Array = new hi5[]{new di5(),new ei5(),new fi5(),ogi5};
       hi5.b = ohi5Array;
    }
    public void hi5(String p0,int p1){
       super(p0, p1);
    }
    public static hi5 valueOf(String p0){
       return Enum.valueOf(hi5.class, p0);
    }
    public static hi5[] values(){
       return hi5.b.clone();
    }
}
