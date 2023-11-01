package p.n8;
import android.widget.AdapterView$OnItemClickListener;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import p.o8;
import p.q8;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import p.lg;
import p.jh;
import android.widget.Adapter;
import p.wl3;

public final class n8 implements AdapterView$OnItemClickListener	// class@001f8d from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void n8(Object p0,int p1,Object p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public final void onItemClick(AdapterView p0,View p1,int p2,long p3){
       n8 tc = this.c;
       switch (this.a){
           case 0:
             n8 tb = this.b;
             tc.h.onClick(tb.b, p2);
             if (tc.i == null) {
                tb.b.dismiss();
             }
             break;
           default:
             tc.X.setSelection(p2);
             jh x = tc.X;
             if (x.getOnItemClickListener() != null) {
                x.performItemClick(p1, p2, tc.U.getItemId(p2));
             }
             tc.dismiss();
             return;
       }
       return;
    }
}
