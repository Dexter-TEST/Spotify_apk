package p.lk7;
import android.view.ViewTreeObserver$OnPreDrawListener;
import p.gq5;
import android.view.ViewTreeObserver;
import p.wb0;
import java.lang.Object;
import p.fl6;
import p.b17;
import android.view.View;

public final class lk7 implements ViewTreeObserver$OnPreDrawListener	// class@001d72 from classes.dex
{
    public boolean a;
    public final gq5 b;
    public final ViewTreeObserver c;
    public final vb0 t;

    public void lk7(gq5 p0,ViewTreeObserver p1,wb0 p2){
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final boolean onPreDraw(){
       fl6 uofl6;
       lk7 tb = this.b;
       if ((uofl6 = b17.o(tb)) != null) {
          lk7 tc = this.c;
          if (tc.isAlive()) {
             tc.removeOnPreDrawListener(this);
          }else {
             tb.a.getViewTreeObserver().removeOnPreDrawListener(this);
          }
          if (this.a == null) {
             this.a = true;
             this.t.d(uofl6);
          }
       }
       return true;
    }
}
