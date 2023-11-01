package p.qx2;
import p.fu2;
import p.ru2;
import java.lang.Enum;
import p.nx2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.bu2;

public abstract class qx2 extends Enum implements fu2, ru2	// class@002431 from classes.dex
{
    public final String a;
    public static final nx2 b;
    public static final qx2[] c;

    static {
       nx2 onx2 = new nx2();
       qx2.b = onx2;
       qx2[] oqx2Array = new qx2[]{onx2};
       qx2.c = oqx2Array;
    }
    public void qx2(){
       super("TRACK_CLOUD", 0);
       this.a = "glue2:trackCloud";
    }
    public static qx2 valueOf(String p0){
       return Enum.valueOf(qx2.class, p0);
    }
    public static qx2[] values(){
       return qx2.c.clone();
    }
    public final String c(){
       return this.a;
    }
    public final String d(){
       return bu2.t.a;
    }
}
