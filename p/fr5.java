package p.fr5;
import p.wg7;
import p.hr5;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import p.ir5;
import java.lang.Class;
import android.view.ViewGroup$MarginLayoutParams;

public final class fr5 implements wg7	// class@001623 from classes.dex
{
    public final int a;
    public final hr5 b;

    public void fr5(hr5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final int a(View p0){
       int i;
       ViewGroup$MarginLayoutParams rightMargin;
       fr5 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             i = hr5.T(p0) + p0.getRight();
             rightMargin = p0.getLayoutParams().rightMargin;
             break;
           default:
             tb.getClass();
             i = hr5.G(p0) + p0.getBottom();
             rightMargin = p0.getLayoutParams().bottomMargin;
       }
       return (i + rightMargin);
    }
    public final int b(View p0){
       int i;
       ViewGroup$MarginLayoutParams leftMargin;
       fr5 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             i = p0.getLeft() - hr5.Q(p0);
             leftMargin = p0.getLayoutParams().leftMargin;
             break;
           default:
             tb.getClass();
             i = p0.getTop() - hr5.V(p0);
             leftMargin = p0.getLayoutParams().topMargin;
       }
       return (i - leftMargin);
    }
    public final int c(){
       hr5 f;
       int paddingRight;
       fr5 tb = this.b;
       switch (this.a){
           case 0:
             f = tb.F;
             paddingRight = tb.getPaddingRight();
             break;
           default:
             f = tb.G;
             paddingRight = tb.getPaddingBottom();
       }
       return (f - paddingRight);
    }
}
