package p.fy5;
import p.gr0;
import p.gy5;
import java.lang.Object;
import p.yq6;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import p.fr6;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import android.content.Context;
import p.n6;
import android.graphics.PorterDuff$Mode;
import p.ce7;
import p.kp0;
import java.lang.Runnable;

public final class fy5 implements gr0	// class@001662 from classes.dex
{
    public final int a;
    public final gy5 b;

    public void fy5(gy5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       View view;
       int i = 8;
       Object obj = null;
       fy5 tb = this.b;
       switch (this.a){
           case 0:
             tb.y.removeCallbacksAndMessages(obj);
             if ((p0 = tb.getView()) != null) {
                p0.setVisibility(i);
             }
             break;
           default:
             tb.v.setText(R.string.retry_bar_reinstall_label);
             tb.w.setText(obj);
             tb.w.setVisibility(i);
             boolean b = false;
             tb.w.setClickable(b);
             tb.w.setFocusable(b);
             if ((p0 = tb.t.getProgressDrawable()) != null) {
                p0.setColorFilter(n6.b(tb.requireContext(), R.color.retry_bar_error), PorterDuff$Mode.SRC_IN);
             }
             tb.x.o(b, 1, 1, 0x3f800000);
             p0 = tb.y;
             p0.removeCallbacksAndMessages(obj);
             if ((view = tb.getView()) != null) {
                p0.postDelayed(new kp0(view, 2), 300);
             }
             return;
       }
       return;
    }
}
