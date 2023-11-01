package p.tw3;
import p.yq5;
import p.hz3;
import p.g37;
import p.jy3;
import p.cq2;
import p.qw3;
import java.util.Collection;
import p.zr5;
import p.rw3;
import java.lang.Object;
import java.util.List;
import p.lw3;
import p.q87;
import p.ax3;
import p.bq2;
import java.lang.String;
import android.view.View;
import p.sw3;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import p.co5;
import p.cx3;
import android.content.Context;
import p.bx3;
import android.view.ViewGroup$LayoutParams;

public final class tw3 extends yq5	// class@0027f5 from classes.dex
{
    public final hz3 t;
    public final g37 v;
    public final ng2 w;
    public q87 x;
    public dq2 y;

    public void tw3(hz3 p0,g37 p1,jy3 p2){
       super();
       this.t = p0;
       this.v = p1;
       this.w = p2;
       this.x = p0.f;
       this.y = cq2.a;
    }
    public final int d(){
       return this.t.a.a.size();
    }
    public final void n(zr5 p0,int p1){
       int i;
       tw3 tt = this.t;
       lw3 olw3 = tt.a.a.get(p1);
       p0.u.a(olw3, this.t, this.v, p1, this.x);
       tw3 ty = this.y;
       if (ty instanceof bq2) {
          bq2 a = ty.a;
          if (p1 < a) {
             i = olw3.b.length();
          }else if(p1 == a){
             i = ty.b;
          }else {
          label_0033 :
             i = 0;
          }
       }else {
          goto label_0033 ;
       }
       rw3 u = p0.u;
       u.setHighlightedState(i);
       if (tt.h != null) {
          u.setOnClickListener(new sw3(this, olw3, p1));
       }
       return;
    }
    public final zr5 o(int p0,RecyclerView p1){
       Context context;
       cx3 uocx3;
       co5.o(p1, "parent");
       tw3 tt = this.t;
       String str = "parent.context";
       if (tt.i == null) {
          context = p1.getContext();
          co5.l(context, str);
          uocx3 = new cx3(context);
       }else {
          context = p1.getContext();
          co5.l(context, str);
          uocx3 = new bx3(context);
       }
       ViewGroup$LayoutParams layoutParams = (tt.j != null)? new ViewGroup$LayoutParams(-1, -1): new ViewGroup$LayoutParams(-1, -2);
       uocx3.setLayoutParams(layoutParams);
       return new rw3(uocx3);
    }
}
