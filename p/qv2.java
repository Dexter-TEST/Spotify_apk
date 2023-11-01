package p.qv2;
import p.fu2;
import p.ru2;
import java.lang.Enum;
import p.gv2;
import p.hv2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.bu2;

public abstract class qv2 extends Enum implements fu2, ru2	// class@00241f from classes.dex
{
    public final String a;
    public static final qv2[] b;

    static {
       qv2[] oqv2Array = new qv2[]{new gv2(),new hv2()};
       qv2.b = oqv2Array;
    }
    public void qv2(String p0,int p1,String p2){
       super(p0, p1);
       this.a = p2;
    }
    public static qv2 valueOf(String p0){
       return Enum.valueOf(qv2.class, p0);
    }
    public static qv2[] values(){
       return qv2.b.clone();
    }
    public final String c(){
       return this.a;
    }
    public final String d(){
       return bu2.b.a;
    }
    public final String toString(){
       return this.a;
    }
}
