package p.qp6;
import java.lang.Enum;
import p.mp6;
import p.np6;
import p.op6;
import p.pp6;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.rp6;
import android.graphics.Canvas;
import java.lang.CharSequence;
import android.graphics.Paint;

public abstract class qp6 extends Enum	// class@0023ee from classes.dex
{
    public static final pp6 a;
    public static final qp6[] b;

    static {
       pp6 opp6 = new pp6();
       qp6.a = opp6;
       qp6[] oqp6Array = new qp6[]{new mp6(),new np6(),new op6(),opp6};
       qp6.b = oqp6Array;
    }
    public void qp6(String p0,int p1,int p2){
       super(p0, p1);
    }
    public static qp6 valueOf(String p0){
       return Enum.valueOf(qp6.class, p0);
    }
    public static qp6[] values(){
       return qp6.b.clone();
    }
    public abstract void a(rp6 p0,Canvas p1,CharSequence p2,int p3,int p4,float p5,int p6,int p7,int p8,Paint p9);
}
