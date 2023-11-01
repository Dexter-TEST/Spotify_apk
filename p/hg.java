package p.hg;
import androidx.appcompat.widget.ContentFrameLayout;
import p.jg;
import p.mt0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.view.MotionEvent;
import android.view.View;
import p.ig;
import android.graphics.drawable.Drawable;
import p.eb3;

public final class hg extends ContentFrameLayout	// class@00184c from classes.dex
{
    public final jg z;

    public void hg(jg p0,mt0 p1){
       this.z = p0;
       super(p1, null);
    }
    public final boolean dispatchKeyEvent(KeyEvent p0){
       boolean b = (!this.z.u(p0) && !super.dispatchKeyEvent(p0))? false: true;
       return b;
    }
    public final boolean onInterceptTouchEvent(MotionEvent p0){
       if (!p0.getAction()) {
          int i = (int)p0.getX();
          int i1 = (int)p0.getY();
          int i2 = -5;
          i = (i >= i2 && (i1 >= i2 && (i <= (this.getWidth() + 5) && i1 <= (this.getHeight() + 5))))? 0: 1;
          if (i) {
             hg tz = this.z;
             tz.s(tz.A(0), true);
             return true;
          }
       }
       return super.onInterceptTouchEvent(p0);
    }
    public final void setBackgroundResource(int p0){
       this.setBackgroundDrawable(eb3.m(this.getContext(), p0));
    }
}
