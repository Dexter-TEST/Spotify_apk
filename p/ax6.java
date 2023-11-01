package p.ax6;
import p.fj1;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.lang.Object;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.Reference;
import p.zj1;

public final class ax6 extends fj1	// class@001011 from classes.dex
{
    public final int a;
    public final WeakReference b;

    public void ax6(EditText p0){
       this.a = 1;
       super();
       this.b = new WeakReference(p0);
    }
    public void ax6(SwitchCompat p0){
       this.a = 0;
       super();
       this.b = new WeakReference(p0);
    }
    public final void a(){
       SwitchCompat switchCompat;
       switch (this.a){
           case 0:
             if ((switchCompat = this.b.get()) != null) {
                switchCompat.d();
             }
             break;
           default:
             return;
       }
       return;
    }
    public final void b(){
       SwitchCompat switchCompat;
       ax6 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             zj1.a(tb.get(), 1);
             return;
       }
       if ((switchCompat = tb.get()) != null) {
          switchCompat.d();
       }
       return;
    }
}
