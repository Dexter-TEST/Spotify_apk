package p.wk2;
import java.lang.Enum;
import p.uk2;
import p.vk2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class wk2 extends Enum	// class@002b52 from classes.dex
{
    public final int a;
    public static final uk2 b;
    public static final vk2 c;
    public static final wk2[] t;

    static {
       uk2 ouk2 = new uk2();
       wk2.b = ouk2;
       vk2 ovk2 = new vk2();
       wk2.c = ovk2;
       wk2[] owk2Array = new wk2[]{ouk2,ovk2};
       wk2.t = owk2Array;
    }
    public void wk2(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static wk2 valueOf(String p0){
       return Enum.valueOf(wk2.class, p0);
    }
    public static wk2[] values(){
       return wk2.t.clone();
    }
    public abstract void a(Canvas p0,float p1,Paint p2);
}
