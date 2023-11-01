package p.pj2;
import android.view.View$OnClickListener;
import p.dt0;
import p.ct0;
import p.i77;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import p.h25;
import p.us0;
import p.up0;

public final class pj2 implements View$OnClickListener	// class@002271 from classes.dex
{
    public final dt0 a;
    public final ct0 b;
    public final i77 c;

    public void pj2(dt0 p0,ct0 p1,i77 p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onClick(View p0){
       dt0 j;
       pj2 ta = this.a;
       ta.getClass();
       if ((j = ta.j) != null) {
          j.a(ta);
       }
       if (this.b.g != null) {
          this.c.b.e();
       }
       return;
    }
}
