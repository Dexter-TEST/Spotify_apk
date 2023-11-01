package p.l86;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View;
import java.lang.Object;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import p.z14;
import p.wl3;
import android.widget.ListAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Adapter;

public final class l86 implements AdapterView$OnItemClickListener	// class@001d05 from classes.dex
{
    public final int a;
    public final View b;

    public void l86(View p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onItemClick(AdapterView p0,View p1,int p2,long p3){
       Object obj;
       l86 tb = this.b;
       switch (this.a){
           case 0:
           default:
             int i = 0;
             if (p2 < 0) {
                z14 v = tb.v;
                obj = (!v.a())? i: v.c.getSelectedItem();
             }else {
                obj = tb.getAdapter().getItem(p2);
             }
             z14.a(tb, obj);
             AdapterView$OnItemClickListener onItemClickL = tb.getOnItemClickListener();
             z14 v1 = tb.v;
             if (onItemClickL != null) {
                if (p1 == null || p2 < 0) {
                   if (v1.a()) {
                      i = v1.c.getSelectedView();
                   }
                   p1 = i;
                   p2 = (!v1.a())? -1: v1.c.getSelectedItemPosition();
                   if (!v1.a()) {
                      p3 = Long.MIN_VALUE;
                   }else {
                      p3 = v1.c.getSelectedItemId();
                   }
                }
                View view = p1;
                int i1 = p2;
                long l = p3;
                onItemClickL.onItemClick(v1.c, view, i1, l);
             }
             v1.dismiss();
             return;
       }
       tb.n(p2);
       return;
    }
}
