package p.ne1;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import android.os.Build$VERSION;
import android.graphics.Insets;
import p.me1;
import p.u3;
import p.vr7;
import p.wr7;
import p.le1;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import android.graphics.PorterDuff$Mode;

public abstract class ne1	// class@001fbd from classes.dex
{
    public static final int[] a;
    public static final int[] b;
    public static final Rect c;

    static {
       int[] ointArray = new int[]{0x10100a0};
       ne1.a = ointArray;
       ointArray = new int[0];
       ne1.b = ointArray;
       ne1.c = new Rect();
    }
    public static void a(Drawable p0){
       int[] state;
       String name = p0.getClass().getName();
       int sDK_INT = Build$VERSION.SDK_INT;
       int[] b = ne1.b;
       int[] a = ne1.a;
       if (sDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
          if ((state = p0.getState()) != null && state.length) {
             p0.setState(b);
          }else {
             p0.setState(a);
          }
          p0.setState(state);
       }else if(sDK_INT >= 29 && (sDK_INT < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name))){
          if ((state = p0.getState()) != null && state.length) {
             p0.setState(b);
          }else {
             p0.setState(a);
          }
          p0.setState(state);
       }
       return;
    }
    public static Rect b(Drawable p0){
       wr7 w;
       Rect c;
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 29;
       if (sDK_INT >= i) {
          Insets insets = me1.a(p0);
          i = u3.a(insets);
          int i1 = u3.x(insets);
          int i2 = u3.A(insets);
          return new Rect(i, i1, i2, u3.C(insets));
       }else if(p0 instanceof vr7){
          w = p0.w;
       }
       if (sDK_INT < i) {
          if (le1.a) {
             try{
                Object[] objArray = new Object[0];
                if ((w = le1.b.invoke(w, objArray)) != null) {
                   c = new Rect(le1.c.getInt(w), le1.d.getInt(w), le1.e.getInt(w), le1.f.getInt(w));
                }
             }catch(java.lang.IllegalAccessException e0){
             }catch(java.lang.reflect.InvocationTargetException e0){
             }
          }
       }else {
          boolean a = le1.a;
       }
       c = ne1.c;
       return c;
    }
    public static PorterDuff$Mode c(int p0,PorterDuff$Mode p1){
       if (p0 == 3) {
          return PorterDuff$Mode.SRC_OVER;
       }
       if (p0 == 5) {
          return PorterDuff$Mode.SRC_IN;
       }
       if (p0 == 9) {
          return PorterDuff$Mode.SRC_ATOP;
       }
       switch (p0){
           case 14:
             return PorterDuff$Mode.MULTIPLY;
           case 15:
             return PorterDuff$Mode.SCREEN;
           case 16:
             return PorterDuff$Mode.ADD;
           default:
             return p1;
       }
    }
}
