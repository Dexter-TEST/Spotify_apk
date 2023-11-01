package p.yw6;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import java.lang.Float;
import p.wh7;
import p.eh7;
import android.view.ViewGroup$LayoutParams;
import p.al7;
import p.cl7;
import android.graphics.PointF;
import java.lang.Math;
import p.td0;
import java.lang.Object;
import android.graphics.Rect;
import p.fh7;
import androidx.appcompat.widget.SwitchCompat;
import p.p56;
import android.graphics.drawable.Drawable;
import java.lang.Integer;

public final class yw6 extends Property	// class@002e40 from classes.dex
{
    public final int a;

    public void yw6(int p0,Class p1,String p2){
       this.a = p0;
       super(p1, p2);
    }
    public final Float a(View p0){
       switch (this.a){
           case 6:
             return Float.valueOf(al7.a.g(p0));
           case 8:
             return Float.valueOf((float)p0.getLayoutParams().width);
           case 9:
             return Float.valueOf((float)p0.getLayoutParams().height);
           case 10:
             return Float.valueOf((float)eh7.f(p0));
           default:
             return Float.valueOf((float)eh7.e(p0));
       }
    }
    public final void b(View p0,PointF p1){
       switch (this.a){
           case 3:
             al7.a(p0, p0.getLeft(), p0.getTop(), Math.round(p1.x), Math.round(p1.y));
             return;
           case 4:
             al7.a(p0, Math.round(p1.x), Math.round(p1.y), p0.getRight(), p0.getBottom());
             return;
           default:
             int i = Math.round(p1.x);
             int i1 = Math.round(p1.y);
             al7.a(p0, i, i1, (p0.getWidth() + i), (p0.getHeight() + i1));
             return;
       }
    }
    public final void c(View p0,Float p1){
       switch (this.a){
           case 6:
             al7.a.h(p0, p1.floatValue());
             return;
           case 8:
             p0.getLayoutParams().width = p1.intValue();
             p0.requestLayout();
             return;
           case 9:
             p0.getLayoutParams().height = p1.intValue();
             p0.requestLayout();
             return;
           case 10:
             eh7.k(p0, p1.intValue(), p0.getPaddingTop(), eh7.e(p0), p0.getPaddingBottom());
             return;
           default:
             eh7.k(p0, eh7.f(p0), p0.getPaddingTop(), p1.intValue(), p0.getPaddingBottom());
             return;
       }
    }
    public final void d(td0 p0,PointF p1){
       int i;
       int i1;
       switch (this.a){
           case 1:
             p0.getClass();
             p0.a = Math.round(p1.x);
             i = Math.round(p1.y);
             p0.b = i;
             i1 = p0.f + 1;
             p0.f = i1;
             if (i1 == p0.g) {
                al7.a(p0.e, p0.a, i, p0.c, p0.d);
                p0.f = 0;
                p0.g = 0;
             }
             break;
           default:
             p0.getClass();
             p0.c = Math.round(p1.x);
             i = Math.round(p1.y);
             p0.d = i;
             i1 = p0.g + 1;
             p0.g = i1;
             if (p0.f == i1) {
                al7.a(p0.e, p0.a, p0.b, p0.c, i);
                p0.f = 0;
                p0.g = 0;
             }
             return;
       }
       return;
    }
    public final Object get(Object p0){
       switch (this.a){
           case 0:
             return Float.valueOf(p0.Q);
           case 1:
             return null;
           case 2:
             return null;
           case 3:
             return null;
           case 4:
             return null;
           case 5:
             return null;
           case 6:
             return this.a(p0);
           case 7:
             return fh7.a(p0);
           case 8:
             return this.a(p0);
           case 9:
             return this.a(p0);
           case 10:
             return this.a(p0);
           case 11:
             return this.a(p0);
           default:
             return Integer.valueOf(p0.getLevel());
       }
    }
    public final void set(Object p0,Object p1){
       switch (this.a){
           case 0:
             p0.setThumbPosition(p1.floatValue());
             return;
           case 1:
             this.d(p0, p1);
             return;
           case 2:
             this.d(p0, p1);
             return;
           case 3:
             this.b(p0, p1);
             return;
           case 4:
             this.b(p0, p1);
             return;
           case 5:
             this.b(p0, p1);
             return;
           case 6:
             this.c(p0, p1);
             return;
           case 7:
             fh7.c(p0, p1);
             return;
           case 8:
             this.c(p0, p1);
             return;
           case 9:
             this.c(p0, p1);
             return;
           case 10:
             this.c(p0, p1);
             return;
           case 11:
             this.c(p0, p1);
             return;
           default:
             p0.setLevel(p1.intValue());
             return;
       }
    }
}
