package p.yh0;
import android.widget.AdapterView$OnItemClickListener;
import p.au1;
import android.view.View;
import android.widget.AdapterView;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.String;
import p.co5;
import java.lang.ref.Reference;
import p.lv1;

public final class yh0 implements AdapterView$OnItemClickListener	// class@002db7 from classes.dex
{
    public final au1 a;
    public final WeakReference b;
    public final WeakReference c;
    public final AdapterView$OnItemClickListener t;
    public final boolean v;

    public void yh0(au1 p0,View p1,AdapterView p2){
       super();
       this.a = p0;
       this.b = new WeakReference(p2);
       this.c = new WeakReference(p1);
       this.t = p2.getOnItemClickListener();
       this.v = true;
    }
    public final void onItemClick(AdapterView p0,View p1,int p2,long p3){
       yh0 tt;
       View view;
       co5.o(p1, "view");
       if ((tt = this.t) == null) {
       }else {
          tt.onItemClick(p0, p1, p2, p3);
       }
       view = this.c.get();
       AdapterView uAdapterView = this.b.get();
       if (view != null && uAdapterView != null) {
          lv1.A(this.a, view, uAdapterView);
       }
       return;
    }
}
