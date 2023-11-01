package p.ze0;
import p.ty0;
import java.lang.Object;
import p.e27;
import java.lang.ref.Reference;
import p.d27;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p.ef0;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;

public final class ze0 extends ty0	// class@002eda from classes.dex
{
    public final int m;
    public final Object n;

    public void ze0(int p0,Object p1){
       this.m = p0;
       this.n = p1;
       super();
    }
    public final void r(int p0){
       d27 uod27;
       switch (this.m){
           case 0:
           default:
             ze0 tn = this.n;
             tn.d = true;
             if ((uod27 = tn.e.get()) != null) {
                uod27.a();
             }
             return;
       }
       return;
    }
    public final void s(Typeface p0,boolean p1){
       ef0 v1;
       d27 uod27;
       ze0 tn = this.n;
       switch (this.m){
           case 0:
             Chip v = tn.v;
             v1 = (v.U0 != null)? v.V: tn.getText();
             break;
           default:
             if (!p1) {
                tn.d = true;
                if ((uod27 = tn.e.get()) != null) {
                   uod27.a();
                }
             }
             return;
       }
       tn.setText(v1);
       tn.requestLayout();
       tn.invalidate();
       return;
    }
}
