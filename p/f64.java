package p.f64;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import p.b74;
import p.e64;
import java.lang.Object;
import p.lg;
import android.content.DialogInterface;
import p.ol3;
import p.nl3;
import p.l64;
import android.view.MenuItem;
import p.c74;
import android.view.KeyEvent;
import android.view.Window;
import android.app.Dialog;
import android.view.View;
import android.view.KeyEvent$DispatcherState;

public final class f64 implements DialogInterface$OnKeyListener, DialogInterface$OnClickListener, DialogInterface$OnDismissListener, b74	// class@00156a from classes.dex
{
    public final e64 a;
    public s8 b;
    public ol3 c;

    public void f64(e64 p0){
       super();
       this.a = p0;
    }
    public final void b(e64 p0,boolean p1){
       f64 tb;
       if (p1 || (p0 == this.a && (tb = this.b) != null)) {
          tb.dismiss();
       }
       return;
    }
    public final void onClick(DialogInterface p0,int p1){
       f64 tc = this.c;
       if (tc.w == null) {
          tc.w = new nl3(tc);
       }
       this.a.q(tc.w.b(p1), null, 0);
       return;
    }
    public final void onDismiss(DialogInterface p0){
       this.c.b(this.a, true);
    }
    public final boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       Window window;
       View decorView;
       KeyEvent$DispatcherState keyDispatche;
       Window window1;
       View decorView1;
       KeyEvent$DispatcherState keyDispatche1;
       f64 ta = this.a;
       if (p1 == 82 || p1 == 4) {
          if (!p2.getAction() && !p2.getRepeatCount()) {
             if ((window = this.b.getWindow()) != null && ((decorView = window.getDecorView()) != null && (keyDispatche = decorView.getKeyDispatcherState()) != null)) {
                keyDispatche.startTracking(p2, this);
                return true;
             }
          }else if(p2.getAction() == 1 && (!p2.isCanceled() && ((window1 = this.b.getWindow()) != null && ((decorView1 = window1.getDecorView()) != null && ((keyDispatche1 = decorView1.getKeyDispatcherState()) != null && keyDispatche1.isTracking(p2)))))){
             ta.c(true);
             p0.dismiss();
             return true;
          }
       }
       return ta.performShortcut(p1, p2, 0);
    }
    public final boolean p(e64 p0){
       return false;
    }
}
