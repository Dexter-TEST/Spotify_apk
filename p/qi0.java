package p.qi0;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import p.lv1;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;

public final class qi0 extends FrameLayout$LayoutParams	// class@0023a6 from classes.dex
{
    public final int a;
    public float b;

    public void qi0(){
       super(-1, -1);
       this.a = 0;
       this.b = 0x3f000000;
    }
    public void qi0(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 0;
       this.b = 0x3f000000;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, lv1.n);
       this.a = typedArray.getInt(0, 0);
       this.b = typedArray.getFloat(1, 0x3f000000);
       typedArray.recycle();
    }
    public void qi0(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = 0;
       this.b = 0x3f000000;
    }
}
