package p.kh7;
import android.view.View;
import p.xp7;
import android.view.WindowInsets;
import p.w27;
import p.vp7;

public abstract class kh7	// class@001c16 from classes.dex
{

    public static xp7 a(View p0){
       WindowInsets windowInsets = w27.e(p0);
       xp7 oxp7 = null;
       if (windowInsets == null) {
          return oxp7;
       }
       xp7 oxp71 = xp7.g(windowInsets, oxp7);
       oxp7 = oxp71.a;
       oxp7.p(oxp71);
       oxp7.d(p0.getRootView());
       return oxp71;
    }
    public static int b(View p0){
       return w27.b(p0);
    }
    public static void c(View p0,int p1){
       w27.g(p0, p1);
    }
    public static void d(View p0,int p1,int p2){
       w27.h(p0, p1, p2);
    }
}
