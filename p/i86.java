package p.i86;
import android.view.View$OnFocusChangeListener;
import java.lang.Object;
import android.view.View;
import p.df1;
import p.im1;
import com.google.android.material.textfield.TextInputLayout;
import p.ig0;
import androidx.appcompat.widget.SearchView;
import com.spotify.litesignup.phonesignup.view.OtpInputView;

public final class i86 implements View$OnFocusChangeListener	// class@001946 from classes.dex
{
    public final int a;
    public final Object b;

    public void i86(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onFocusChange(View p0,boolean p1){
       SearchView searchView;
       i86 tb = this.b;
       switch (this.a){
           case 0:
             if ((searchView = tb.f0) != null) {
                searchView.onFocusChange(tb, p1);
             }
             return;
             break;
           case 1:
           case 2:
             tb.a.setEndIconActivated(p1);
             if (!p1) {
                tb.f(false);
                tb.j = false;
             }
             return;
             break;
           default:
             if (!p1) {
                tb.a(-1);
             }
             return;
       }
       tb.e(ig0.d(tb));
       return;
    }
}
