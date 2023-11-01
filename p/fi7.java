package p.fi7;
import java.lang.ThreadLocal;
import android.view.ViewParent;
import android.view.View;
import android.graphics.Matrix;

public abstract class fi7	// class@0015d5 from classes.dex
{
    public static final ThreadLocal a;
    public static final ThreadLocal b;

    static {
       fi7.a = new ThreadLocal();
       fi7.b = new ThreadLocal();
    }
    public static void a(ViewParent p0,View p1,Matrix p2){
       ViewParent parent = p1.getParent();
       if (parent instanceof View && parent != p0) {
          fi7.a(p0, parent, p2);
          p2.preTranslate((float)(- parent.getScrollX()), (float)(- parent.getScrollY()));
       }
       p2.preTranslate((float)p1.getLeft(), (float)p1.getTop());
       if (!p1.getMatrix().isIdentity()) {
          p2.preConcat(p1.getMatrix());
       }
       return;
    }
}
