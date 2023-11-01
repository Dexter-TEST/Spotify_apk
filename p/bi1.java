package p.bi1;
import p.yy6;
import com.google.android.material.tabs.TabLayout;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import java.lang.Math;
import p.je;
import android.graphics.Rect;

public final class bi1 extends yy6	// class@0010cb from classes.dex
{

    public void bi1(){
       super(0);
    }
    public final void B(TabLayout p0,View p1,View p2,float p3,Drawable p4){
       double d2;
       float f;
       float f1;
       RectF rectF = yy6.s(p0, p1);
       RectF rectF1 = yy6.s(p0, p2);
       int i = ((rectF.left - rectF1.left) < 0)? 1: 0;
       double d = 0x3ff0000000000000;
       double d1 = 2.00f;
       if (i) {
          d2 = ((double)p3 * 0x400921fb54442d18) / d1;
          f = (float)(d - Math.cos(d2));
          f1 = (float)Math.sin(d2);
       }else {
          d2 = ((double)p3 * 0x400921fb54442d18) / d1;
          f1 = (float)(d - Math.cos(d2));
          f = (float)Math.sin(d2);
       }
       int i1 = (int)rectF.left;
       int i2 = Math.round((f * (float)((int)rectF1.left - i1))) + i1;
       int i3 = (int)rectF.right;
       int i4 = Math.round((f1 * (float)((int)rectF1.right - i3))) + i3;
       p4.setBounds(i2, p4.getBounds().top, i4, p4.getBounds().bottom);
       return;
    }
}
