package p.tl3;
import android.database.DataSetObserver;
import java.lang.Object;
import p.y01;
import android.widget.BaseAdapter;
import p.wl3;

public final class tl3 extends DataSetObserver	// class@002793 from classes.dex
{
    public final int a;
    public final Object b;

    public void tl3(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onChanged(){
       tl3 tb = this.b;
       switch (this.a){
           case 0:
             if (tb.a()) {
                tb.c();
             }
             break;
           default:
             tb.a = true;
             tb.notifyDataSetChanged();
             return;
       }
       return;
    }
    public final void onInvalidated(){
       tl3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.a = false;
             tb.notifyDataSetInvalidated();
             return;
       }
       tb.dismiss();
       return;
    }
}
