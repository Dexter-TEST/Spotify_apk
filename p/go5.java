package p.go5;
import android.view.View$OnTouchListener;
import p.au1;
import android.view.View;
import java.lang.Object;
import java.lang.ref.WeakReference;
import p.gi7;
import android.view.MotionEvent;
import java.lang.String;
import p.co5;
import java.lang.ref.Reference;
import p.lv1;

public final class go5 implements View$OnTouchListener	// class@00174b from classes.dex
{
    public final au1 a;
    public final WeakReference b;
    public final WeakReference c;
    public final View$OnTouchListener t;
    public final boolean v;

    public void go5(au1 p0,View p1,View p2){
       super();
       this.a = p0;
       this.b = new WeakReference(p2);
       this.c = new WeakReference(p1);
       this.t = gi7.f(p2);
       this.v = true;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       View view;
       go5 tt;
       co5.o(p0, "view");
       co5.o(p1, "motionEvent");
       view = this.c.get();
       View view1 = this.b.get();
       boolean b = true;
       if (view != null && (view1 != null && p1.getAction() == b)) {
          lv1.A(this.a, view, view1);
       }
       if ((tt = this.t) == null || !tt.onTouch(p0, p1)) {
          b = false;
       }
       return b;
    }
}
