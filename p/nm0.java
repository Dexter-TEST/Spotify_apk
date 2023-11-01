package p.nm0;
import android.widget.SeekBar$OnSeekBarChangeListener;
import p.om0;
import p.u01;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import android.widget.SeekBar;
import android.content.Context;
import android.view.View;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;

public final class nm0 implements SeekBar$OnSeekBarChangeListener	// class@002004 from classes.dex
{
    public final u01 a;
    public final Observer b;
    public final om0 c;

    public void nm0(om0 p0,u01 p1,Observer p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (!p2) {
          return;
       }
       p2.g = p1;
       nm0 ta = this.a;
       ta.a(true);
       ta.w.setText(om0.b(p0.getContext(), p1));
       if (ta.y.isShowing()) {
          ta.a(true);
       }
       return;
    }
    public final void onStartTrackingTouch(SeekBar p0){
       this.c.f = true;
       nm0 ta = this.a;
       u01 y = ta.y;
       y.isShowing();
       if (!y.isShowing()) {
          ta.a(false);
       }
       ta.w.setText(om0.b(p0.getContext(), p0.getProgress()));
       if (ta.y.isShowing()) {
          ta.a(true);
       }
       return;
    }
    public final void onStopTrackingTouch(SeekBar p0){
       nm0 tc = this.c;
       tc.f = false;
       u01 y = this.a.y;
       if (y.isShowing()) {
          y.dismiss();
       }
       if (tc.j != tc.g) {
          tc.j = p0.getProgress();
          this.b.onNext(tc);
       }
       return;
    }
}
