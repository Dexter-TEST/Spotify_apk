package p.ny5;
import p.jy5;
import java.lang.Enum;
import p.ly5;
import p.my5;
import p.ky5;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class ny5 extends Enum implements jy5	// class@002074 from classes.dex
{
    public static final ny5[] a;
    public static final ny5[] b;

    static {
       ny5[] ony5Array = new ny5[]{new ly5(),new my5(),new ky5()};
       ny5.b = ony5Array;
       ny5.a = ny5.values();
    }
    public void ny5(String p0,int p1){
       super(p0, p1);
    }
    public static ny5 valueOf(String p0){
       return Enum.valueOf(ny5.class, p0);
    }
    public static ny5[] values(){
       return ny5.b.clone();
    }
}
