package p.qg;
import android.widget.EditText;
import java.lang.Object;
import p.nj1;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import p.mj1;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import p.ej4;
import android.content.res.TypedArray;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import java.lang.Class;

public final class qg	// class@00239c from classes.dex
{
    public final EditText a;
    private final nj1 b;

    public void qg(EditText p0){
       super();
       this.a = p0;
       this.b = new nj1(p0);
    }
    public final KeyListener a(KeyListener p0){
       if ((p0 instanceof NumberKeyListener ^ 0x01)) {
          p0 = this.b.a.Z(p0);
       }
       return p0;
    }
    public final void b(AttributeSet p0,int p1){
       TypedArray typedArray = this.a.getContext().obtainStyledAttributes(p0, ej4.L, p1, 0);
       boolean b = true;
       if (typedArray.hasValue(14)) {
          b = typedArray.getBoolean(14, b);
       }
       typedArray.recycle();
       this.d(b);
       return;
    }
    public final InputConnection c(InputConnection p0,EditorInfo p1){
       qg tb = this.b;
       if (p0 == null) {
          tb.getClass();
          p0 = null;
       }else {
          p0 = tb.a.a0(p0, p1);
       }
       return p0;
    }
    public final void d(boolean p0){
       this.b.a.V(p0);
    }
}
