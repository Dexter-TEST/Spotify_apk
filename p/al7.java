package p.al7;
import android.os.Build$VERSION;
import p.gl7;
import p.fl7;
import p.el7;
import p.dl7;
import p.yw6;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import android.graphics.Rect;
import android.view.View;
import p.qf2;

public abstract class al7	// class@000fa9 from classes.dex
{
    public static final dl7 a;
    public static final yw6 b;

    static {
       int sDK_INT;
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 29) {
          al7.a = new gl7();
       }else if(sDK_INT >= 23){
          al7.a = new fl7();
       }else if(sDK_INT >= 22){
          al7.a = new el7();
       }else {
          al7.a = new dl7();
       }
       al7.b = new yw6(6, Float.class, "translationAlpha");
       yw6 sDK_INT1 = new yw6(7, Rect.class, "clipBounds");
    }
    public static void a(View p0,int p1,int p2,int p3,int p4){
       al7.a.e(p0, p1, p2, p3, p4);
    }
}
