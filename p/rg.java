package p.rg;
import android.widget.TextView;
import java.lang.Object;
import p.yj1;
import android.text.InputFilter;
import p.gg1;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import p.ej4;
import android.content.res.TypedArray;
import android.text.method.TransformationMethod;

public final class rg	// class@0024e5 from classes.dex
{
    public final TextView a;
    private final yj1 b;

    public void rg(TextView p0){
       super();
       this.a = p0;
       this.b = new yj1(p0);
    }
    public final InputFilter[] a(InputFilter[] p0){
       return this.b.a.E(p0);
    }
    public final boolean b(){
       return this.b.a.K();
    }
    public final void c(AttributeSet p0,int p1){
       TypedArray typedArray = this.a.getContext().obtainStyledAttributes(p0, ej4.L, p1, 0);
       boolean b = true;
       if (typedArray.hasValue(14)) {
          b = typedArray.getBoolean(14, b);
       }
       typedArray.recycle();
       this.e(b);
       return;
    }
    public final void d(boolean p0){
       this.b.a.U(p0);
    }
    public final void e(boolean p0){
       this.b.a.V(p0);
    }
    public final TransformationMethod f(TransformationMethod p0){
       return this.b.a.Y(p0);
    }
}
