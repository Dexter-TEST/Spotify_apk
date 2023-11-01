package p.fk2;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import p.ye7;
import android.content.res.TypedArray;

public final class fk2 extends ViewGroup$MarginLayoutParams	// class@0015e2 from classes.dex
{
    public final boolean a;
    public final int b;
    public py c;

    public void fk2(int p0){
       super(-1, p0);
       this.b = 2;
    }
    public void fk2(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 2;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, ye7.r);
       this.a = typedArray.getBoolean(1, 1);
       this.b = typedArray.getInt(0, 2);
       typedArray.recycle();
    }
}
