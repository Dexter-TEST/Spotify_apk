package p.gk7;
import p.tu6;
import p.hk7;
import p.p67;
import java.util.ArrayList;
import p.ik7;
import android.view.View;

public final class gk7 extends tu6	// class@001729 from classes.dex
{
    public final int N;
    public boolean O;
    public int P;
    public final Object Q;

    public void gk7(hk7 p0){
       this.N = 0;
       this.Q = p0;
       super();
       this.O = false;
       this.P = 0;
    }
    public void gk7(p67 p0,int p1){
       this.N = 1;
       this.Q = p0;
       this.P = p1;
       super();
       this.O = false;
    }
    public final void a(){
       hk7 d;
       gk7 tQ = this.Q;
       switch (this.N){
           case 0:
             int i = this.P + 1;
             this.P = i;
             if (i == tQ.a.size()) {
                if ((d = tQ.d) != null) {
                   d.a();
                }
                this.P = 0;
                this.O = false;
                tQ.e = false;
             }
             break;
           default:
             if (this.O == null) {
                tQ.a.setVisibility(this.P);
             }
             return;
       }
       return;
    }
    public final void b(View p0){
       switch (this.N){
           case 1:
           default:
             return;
       }
       this.O = true;
       return;
    }
    public final void c(){
       hk7 d;
       gk7 tQ = this.Q;
       switch (this.N){
           case 0:
             break;
           default:
             tQ.a.setVisibility(0);
             return;
       }
       if (this.O == null) {
          this.O = true;
          if ((d = tQ.d) != null) {
             d.c();
          }
       }
       return;
    }
}
