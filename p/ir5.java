package p.ir5;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import p.zr5;

public class ir5 extends ViewGroup$MarginLayoutParams	// class@0019ef from classes.dex
{
    public zr5 a;
    public final Rect b;
    public boolean c;
    public boolean t;

    public void ir5(int p0,int p1){
       super(p0, p1);
       this.b = new Rect();
       this.c = true;
       this.t = false;
    }
    public void ir5(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Rect();
       this.c = true;
       this.t = false;
    }
    public void ir5(ViewGroup$LayoutParams p0){
       super(p0);
       this.b = new Rect();
       this.c = true;
       this.t = false;
    }
    public void ir5(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.b = new Rect();
       this.c = true;
       this.t = false;
    }
    public void ir5(ir5 p0){
       super(p0);
       this.b = new Rect();
       this.c = true;
       this.t = false;
    }
    public final int a(){
       return this.a.e();
    }
    public final boolean b(){
       boolean b = ((this.a.j & 0x02))? true: false;
       return b;
    }
    public final boolean c(){
       return this.a.k();
    }
}
