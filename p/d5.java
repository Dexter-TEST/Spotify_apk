package p.d5;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import p.ej4;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;

public abstract class d5 extends ViewGroup$MarginLayoutParams	// class@0012e4 from classes.dex
{
    public int a;

    public void d5(){
       super(-2, -2);
       this.a = 0x800013;
    }
    public void d5(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, ej4.E);
       this.a = typedArray.getInt(0, 0);
       typedArray.recycle();
    }
    public void d5(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = 0;
    }
    public void d5(d5 p0){
       super(p0);
       this.a = 0;
       this.a = p0.a;
    }
}
