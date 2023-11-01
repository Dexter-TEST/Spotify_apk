package p.ng;
import android.graphics.PorterDuff$Mode;
import java.lang.Object;
import android.graphics.PorterDuffColorFilter;
import p.mw5;
import p.i77;
import android.graphics.drawable.Drawable;
import p.e57;
import p.ne1;
import android.graphics.drawable.LayerDrawable;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.os.Build$VERSION;
import android.content.Context;

public final class ng	// class@001fd6 from classes.dex
{
    public mw5 a;
    public static final PorterDuff$Mode b;
    public static ng c;

    static {
       ng.b = PorterDuff$Mode.SRC_IN;
    }
    public void ng(){
       super();
    }
    public static synchronized ng a(){
       _monitor_enter(ng.class);
       if (ng.c == null) {
          ng.d();
       }
       _monitor_exit(ng.class);
       return ng.c;
    }
    public static synchronized PorterDuffColorFilter c(int p0,PorterDuff$Mode p1){
       _monitor_enter(ng.class);
       _monitor_exit(ng.class);
       return mw5.h(p0, p1);
    }
    public static synchronized void d(){
       _monitor_enter(ng.class);
       if (ng.c == null) {
          ng ong = new ng();
          ng.c = ong;
          ong.a = mw5.d();
          ng.c.a.l(new i77(1));
       }
       _monitor_exit(ng.class);
       return;
    }
    public static void e(Drawable p0,e57 p1,int[] p2){
       e57 b;
       PorterDuff$Mode h;
       ColorFilter uColorFilter1;
       int[] state = p0.getState();
       int i = (p0.mutate() == p0)? 1: 0;
       if (i) {
          if (p0 instanceof LayerDrawable && p0.isStateful()) {
             int[] ointArray = new int[0];
             p0.setState(ointArray);
             p0.setState(state);
          }
          if ((b = p1.b) == null && p1.a == null) {
             p0.clearColorFilter();
          }else {
             ColorFilter uColorFilter = null;
             b = (b != null)? p1.c: uColorFilter;
             p1 = (p1.a != null)? p1.d: mw5.h;
             if (b != null && p1 != null) {
                uColorFilter = mw5.h(b.getColorForState(p2, 0), p1);
             }
             p0.setColorFilter(uColorFilter);
          }
          if (Build$VERSION.SDK_INT <= 23) {
             p0.invalidateSelf();
          }
       }
       return;
    }
    public synchronized final Drawable b(Context p0,int p1){
       return this.a.g(p0, p1);
    }
}
