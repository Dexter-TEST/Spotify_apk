package p.xh0;
import android.view.View$OnClickListener;
import p.au1;
import android.view.View;
import java.lang.Object;
import java.lang.ref.WeakReference;
import p.gi7;
import java.lang.String;
import p.co5;
import java.lang.ref.Reference;
import p.lv1;

public final class xh0 implements View$OnClickListener	// class@002c76 from classes.dex
{
    public final au1 a;
    public final WeakReference b;
    public final WeakReference c;
    public final View$OnClickListener t;
    public final boolean v;

    public void xh0(au1 p0,View p1,View p2){
       super();
       this.a = p0;
       this.b = new WeakReference(p2);
       this.c = new WeakReference(p1);
       this.t = gi7.e(p2);
       this.v = true;
    }
    public final void onClick(View p0){
       xh0 tt;
       View view;
       co5.o(p0, "view");
       if ((tt = this.t) == null) {
       }else {
          tt.onClick(p0);
       }
       p0 = this.c.get();
       view = this.b.get();
       if (p0 != null && view != null) {
          lv1.A(this.a, p0, view);
       }
       return;
    }
}
