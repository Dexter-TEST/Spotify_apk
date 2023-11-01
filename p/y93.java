package p.y93;
import android.view.View$OnTouchListener;
import android.app.Dialog;
import android.graphics.Rect;
import java.lang.Object;
import android.content.Context;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.MotionEvent;
import android.graphics.RectF;
import android.os.Build$VERSION;

public final class y93 implements View$OnTouchListener	// class@002d72 from classes.dex
{
    public final Dialog a;
    public final int b;
    public final int c;
    public final int t;

    public void y93(Dialog p0,Rect p1){
       super();
       this.a = p0;
       this.b = p1.left;
       this.c = p1.top;
       this.t = ViewConfiguration.get(p0.getContext()).getScaledWindowTouchSlop();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       View view = p0.findViewById(0x1020002);
       boolean i = view.getLeft() + this.b;
       int i1 = view.getWidth() + i;
       int i2 = view.getTop() + this.c;
       int i3 = view.getHeight() + i2;
       i = false;
       if (new RectF((float)i, (float)i2, (float)i1, (float)i3).contains(p1.getX(), p1.getY())) {
          return i;
       }
       MotionEvent motionEvent = MotionEvent.obtain(p1);
       if (p1.getAction() == 1) {
          motionEvent.setAction(4);
       }
       if (Build$VERSION.SDK_INT < 28) {
          motionEvent.setAction(i);
          y93 tt = this.t;
          motionEvent.setLocation((float)((- tt) - 1), (float)((- tt) - 1));
       }
       p0.performClick();
       return this.a.onTouchEvent(motionEvent);
    }
}
