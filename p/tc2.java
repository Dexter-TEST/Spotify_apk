package p.tc2;
import java.lang.Runnable;
import p.uc2;
import java.lang.Object;
import android.view.ViewParent;
import android.view.View;
import android.os.SystemClock;
import android.view.MotionEvent;

public final class tc2 implements Runnable	// class@002741 from classes.dex
{
    public final int a;
    public final uc2 b;

    public void tc2(uc2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       ViewParent parent;
       tc2 tb = this.b;
       switch (this.a){
           case 0:
             if ((parent = tb.t.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
             }
             break;
           default:
             tb.a();
             uc2 t = tb.t;
             if (t.isEnabled() && (!t.isLongClickable() && tb.c())) {
                t.getParent().requestDisallowInterceptTouchEvent(true);
                long l = SystemClock.uptimeMillis();
                MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0, 0, 0);
                t.onTouchEvent(motionEvent);
                motionEvent.recycle();
                tb.x = true;
             }
             return;
       }
       return;
    }
}
