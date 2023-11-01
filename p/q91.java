package p.q91;
import java.lang.ThreadLocal;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Rect;
import java.lang.Object;
import android.graphics.Matrix;
import android.view.ViewParent;
import android.graphics.RectF;

public abstract class q91	// class@002356 from classes.dex
{
    public static final ThreadLocal a;
    public static final ThreadLocal b;

    static {
       q91.a = new ThreadLocal();
       q91.b = new ThreadLocal();
    }
    public static void a(ViewGroup p0,View p1,Rect p2){
       Matrix matrix;
       RectF rectF;
       p2.set(0, 0, p1.getWidth(), p1.getHeight());
       ThreadLocal a = q91.a;
       if ((matrix = a.get()) == null) {
          matrix = new Matrix();
          a.set(matrix);
       }else {
          matrix.reset();
       }
       q91.b(p0, p1, matrix);
       ThreadLocal b = q91.b;
       if ((rectF = b.get()) == null) {
          rectF = new RectF();
          b.set(rectF);
       }
       rectF.set(p2);
       matrix.mapRect(rectF);
       p2.set((int)(rectF.left + 0x3f000000), (int)(rectF.top + 0x3f000000), (int)(rectF.right + 0x3f000000), (int)(rectF.bottom + 0x3f000000));
       return;
    }
    public static void b(ViewParent p0,View p1,Matrix p2){
       ViewParent parent = p1.getParent();
       if (parent instanceof View && parent != p0) {
          q91.b(p0, parent, p2);
          p2.preTranslate((float)(- parent.getScrollX()), (float)(- parent.getScrollY()));
       }
       p2.preTranslate((float)p1.getLeft(), (float)p1.getTop());
       if (!p1.getMatrix().isIdentity()) {
          p2.preConcat(p1.getMatrix());
       }
       return;
    }
}
