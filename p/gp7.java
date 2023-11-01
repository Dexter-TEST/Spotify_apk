package p.gp7;
import p.tu6;
import p.ip7;
import android.view.View;
import androidx.appcompat.widget.ActionBarContainer;
import p.b6;
import p.a6;
import p.wh7;
import p.hh7;

public final class gp7 extends tu6	// class@001756 from classes.dex
{
    public final int N;
    public final ip7 O;

    public void gp7(ip7 p0,int p1){
       this.N = p1;
       this.O = p0;
       super();
    }
    public final void a(){
       ip7 l;
       hk7 ohk7 = null;
       gp7 tO = this.O;
       switch (this.N){
           case 0:
             break;
           default:
             tO.X = ohk7;
             tO.I.requestLayout();
             return;
       }
       if (tO.T != null && (l = tO.L) != null) {
          float f = 0;
          l.setTranslationY(f);
          tO.I.setTranslationY(f);
       }
       tO.I.setVisibility(8);
       tO.I.setTransitioning(false);
       tO.X = ohk7;
       if ((l = tO.P) != null) {
          l.c(tO.O);
          tO.O = ohk7;
          tO.P = ohk7;
       }
       if ((l = tO.H) != null) {
          hh7.c(l);
       }
       return;
    }
}
