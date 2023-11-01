package p.w45;
import p.x45;
import p.hr5;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import p.ir5;
import java.lang.Class;
import java.lang.Object;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;

public final class w45 extends x45	// class@002ac5 from classes.dex
{
    public final int d;

    public void w45(hr5 p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final int e(View p0){
       int i;
       ViewGroup$MarginLayoutParams rightMargin;
       switch (this.d){
           case 0:
             this.b.getClass();
             i = hr5.T(p0) + p0.getRight();
             rightMargin = p0.getLayoutParams().rightMargin;
             break;
           default:
             this.b.getClass();
             i = hr5.G(p0) + p0.getBottom();
             rightMargin = p0.getLayoutParams().bottomMargin;
       }
       return (i + rightMargin);
    }
    public final int f(View p0){
       ir5 layoutParams;
       int i;
       ViewGroup$MarginLayoutParams rightMargin;
       switch (this.d){
           case 0:
             layoutParams = p0.getLayoutParams();
             this.b.getClass();
             i = hr5.N(p0) + layoutParams.leftMargin;
             rightMargin = layoutParams.rightMargin;
             break;
           default:
             layoutParams = p0.getLayoutParams();
             this.b.getClass();
             i = hr5.M(p0) + layoutParams.topMargin;
             rightMargin = layoutParams.bottomMargin;
       }
       return (i + rightMargin);
    }
    public final int g(View p0){
       int i;
       ViewGroup$MarginLayoutParams leftMargin;
       switch (this.d){
           case 0:
             this.b.getClass();
             i = p0.getLeft() - hr5.Q(p0);
             leftMargin = p0.getLayoutParams().leftMargin;
             break;
           default:
             this.b.getClass();
             i = p0.getTop() - hr5.V(p0);
             leftMargin = p0.getLayoutParams().topMargin;
       }
       return (i - leftMargin);
    }
    public final int h(){
       switch (this.d){
           case 0:
           default:
             return this.b.G;
       }
       return this.b.F;
    }
    public final int i(){
       x45 tb;
       hr5 f;
       int paddingRight;
       switch (this.d){
           case 0:
             tb = this.b;
             f = tb.F;
             paddingRight = tb.getPaddingRight();
             break;
           default:
             tb = this.b;
             f = tb.G;
             paddingRight = tb.getPaddingBottom();
       }
       return (f - paddingRight);
    }
    public final int k(){
       switch (this.d){
           case 0:
           default:
             return this.b.E;
       }
       return this.b.D;
    }
    public final int n(){
       switch (this.d){
           case 0:
           default:
             return this.b.getPaddingTop();
       }
       return this.b.getPaddingLeft();
    }
    public final int o(){
       x45 tb;
       int i;
       int paddingRight;
       switch (this.d){
           case 0:
             tb = this.b;
             i = tb.F - tb.getPaddingLeft();
             paddingRight = this.b.getPaddingRight();
             break;
           default:
             tb = this.b;
             i = tb.G - tb.getPaddingTop();
             paddingRight = this.b.getPaddingBottom();
       }
       return (i - paddingRight);
    }
    public final int q(View p0){
       switch (this.d){
           case 0:
           default:
             this.b.W(p0, this.c);
             return this.c.bottom;
       }
       this.b.W(p0, this.c);
       return this.c.right;
    }
    public final int r(View p0){
       switch (this.d){
           case 0:
           default:
             this.b.W(p0, this.c);
             return this.c.top;
       }
       this.b.W(p0, this.c);
       return this.c.left;
    }
    public final void u(int p0){
       switch (this.d){
           case 0:
           default:
             this.b.b0(p0);
             return;
       }
       this.b.a0(p0);
       return;
    }
    public final int w(View p0){
       ir5 layoutParams;
       int i;
       ViewGroup$MarginLayoutParams bottomMargin;
       switch (this.d){
           case 0:
             layoutParams = p0.getLayoutParams();
             this.b.getClass();
             i = hr5.M(p0) + layoutParams.topMargin;
             bottomMargin = layoutParams.bottomMargin;
             break;
           default:
             layoutParams = p0.getLayoutParams();
             this.b.getClass();
             i = hr5.N(p0) + layoutParams.leftMargin;
             bottomMargin = layoutParams.rightMargin;
       }
       return (i + bottomMargin);
    }
    public final int x(){
       switch (this.d){
           case 0:
           default:
             return this.b.getPaddingBottom();
       }
       return this.b.getPaddingRight();
    }
}
