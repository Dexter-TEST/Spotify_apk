package p.ak1;
import android.text.method.TransformationMethod;
import java.lang.Object;
import java.lang.CharSequence;
import android.view.View;
import p.hj1;
import java.lang.Class;
import android.graphics.Rect;

public final class ak1 implements TransformationMethod	// class@000f9a from classes.dex
{
    public final TransformationMethod a;

    public void ak1(TransformationMethod p0){
       super();
       this.a = p0;
    }
    public final CharSequence getTransformation(CharSequence p0,View p1){
       ak1 ta;
       if (p1.isInEditMode()) {
          return p0;
       }
       if ((ta = this.a) != null) {
          p0 = ta.getTransformation(p0, p1);
       }
       if (p0 != null && hj1.a().b() == 1) {
          hj1 ohj1 = hj1.a();
          ohj1.getClass();
          p0 = ohj1.f(0, p0.length(), p0);
       }
       return p0;
    }
    public final void onFocusChanged(View p0,CharSequence p1,boolean p2,int p3,Rect p4){
       ak1 ta;
       if ((ta = this.a) != null) {
          ta.onFocusChanged(p0, p1, p2, p3, p4);
       }
       return;
    }
}
