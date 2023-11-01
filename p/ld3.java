package p.ld3;
import android.view.GestureDetector$SimpleOnGestureListener;
import p.md3;
import android.view.MotionEvent;
import android.view.View;
import p.zr5;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import java.lang.Object;
import p.og1;
import p.wh7;
import p.eh7;

public final class ld3 extends GestureDetector$SimpleOnGestureListener	// class@001d30 from classes.dex
{
    public boolean a;
    public final md3 b;

    public void ld3(md3 p0){
       this.b = p0;
       super();
       this.a = true;
    }
    public final boolean onDown(MotionEvent p0){
       return true;
    }
    public final void onLongPress(MotionEvent p0){
       View view;
       if (this.a == null) {
          return;
       }
       ld3 tb = this.b;
       if ((view = tb.l(p0)) != null && tb.q.L(view) != null) {
          md3 q = tb.q;
          md3 m = tb.m;
          m.getClass();
          int i = (m.f != null)? 0x30003: 0;
          int i1 = eh7.d(q);
          int i2 = i & 0x303030;
          int i3 = 1;
          if (i2) {
             i = i & (~ i2);
             if (!i1) {
                i1 = i2 >> 2;
             }else {
                i1 = i2 >> 1;
                i = i | (-3158065 & i1);
                i1 = (i1 & 0x303030) >> 2;
             }
             i = i | i1;
          }
          if (!((0xff0000 & i))) {
             i3 = 0;
          }
          if (!i3) {
             return;
          }else {
             md3 l = tb.l;
             if (p0.getPointerId(0) == l) {
                i1 = p0.findPointerIndex(l);
                tb.d = p0.getX(i1);
                tb.e = p0.getY(i1);
                tb.i = 0;
                tb.h = 0;
                m.getClass();
             }
          }
       }
       return;
    }
}
