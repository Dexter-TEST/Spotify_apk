package p.ep2;
import java.lang.Runnable;
import p.ce7;
import android.view.View;
import p.nq5;
import java.lang.Object;
import android.widget.Scroller;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.wh7;
import p.dh7;
import java.lang.Math;
import java.lang.Class;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import p.a56;
import p.oi;

public final class ep2 implements Runnable	// class@0014cf from classes.dex
{
    public final int a;
    public final int b;
    public final View c;
    public final nq5 t;
    public final ce7 v;

    public void ep2(ce7 p0,View p1,int p2,nq5 p3){
       this.v = p0;
       super();
       this.c = p1;
       this.a = p2;
       this.b = 0;
       this.t = p3;
    }
    public final void run(){
       ep2 tc;
       int i1;
       ep2 uoep2;
       if ((tc = this.c) != null) {
          ep2 tv = this.v;
          ce7 b = tv.b;
          if (b != null && b.computeScrollOffset()) {
             int i = 1;
             ep2 tb = this.b;
             if (tv.b.getCurrY() >= tb) {
                i1 = -1;
                uoep2 = tb;
             }else {
                tb = this.a;
                if (tv.b.getCurrY() <= tb) {
                   uoep2 = tb;
                   i1 = 1;
                }else {
                   uoep2 = tv.b.getCurrY();
                   i1 = 1;
                   i = 0;
                }
             }
             ep2 tt = this.t;
             tt.c.E(tt.a, tt.b, uoep2, Integer.MIN_VALUE, Integer.MAX_VALUE);
             if (!i) {
                dh7.m(tc, this);
             }else {
                int i2 = (int)(Math.abs(tv.b.getCurrVelocity()) * (float)i1);
                tt.c.getClass();
                if (tt.a.T == null) {
                   oi.g(tt.a).m(i2);
                }
                tv.b.abortAnimation();
             }
          }
       }
       return;
    }
}
