package p.wf;
import p.tu6;
import java.lang.Object;
import p.jg;
import android.view.View;
import p.ik7;
import p.fk7;
import p.tf;
import p.xf;
import androidx.appcompat.widget.ActionBarContextView;
import android.widget.PopupWindow;
import android.view.ViewParent;
import p.wh7;
import p.hh7;

public final class wf extends tu6	// class@002b2b from classes.dex
{
    public final int N;
    public final Object O;

    public void wf(int p0,Object p1){
       this.N = p0;
       this.O = p1;
       super();
    }
    public final void a(){
       jg n;
       float f = 0x3f800000;
       wf tO = this.O;
       switch (this.N){
           case 0:
             tO.b.M.setAlpha(f);
             tf b = tO.b;
             b.P.d(null);
             b.P = null;
             return;
           case 1:
             tO.M.setAlpha(f);
             tO.P.d(null);
             tO.P = null;
             return;
           default:
             tO.b.M.setVisibility(8);
             xf b1 = tO.b;
             if ((n = b1.N) != null) {
                n.dismiss();
             }else if(b1.M.getParent() instanceof View){
                hh7.c(b1.M.getParent());
             }
             b1.M.e();
             b1.P.d(null);
             b1.P = null;
             hh7.c(b1.S);
             return;
       }
    }
    public final void c(){
       int i = 0;
       wf tO = this.O;
       switch (this.N){
           case 0:
           case 1:
             tO.M.setVisibility(i);
             if (tO.M.getParent() instanceof View) {
                hh7.c(tO.M.getParent());
             }
             return;
             break;
           default:
             return;
       }
       tO.b.M.setVisibility(i);
       return;
    }
}
