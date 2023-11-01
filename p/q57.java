package p.q57;
import p.r57;
import java.lang.Enum;
import p.m57;
import p.n57;
import p.o57;
import p.p57;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class q57 extends Enum implements r57	// class@002338 from classes.dex
{
    public static final m57 a;
    public static final n57 b;
    public static final q57[] c;

    static {
       m57 om57 = new m57();
       q57.a = om57;
       n57 on57 = new n57();
       q57.b = on57;
       q57[] oq57Array = new q57[]{om57,on57,new o57(),new p57()};
       q57.c = oq57Array;
    }
    public void q57(String p0,int p1){
       super(p0, p1);
    }
    public static q57 valueOf(String p0){
       return Enum.valueOf(q57.class, p0);
    }
    public static q57[] values(){
       return q57.c.clone();
    }
}
