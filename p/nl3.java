package p.nl3;
import android.widget.BaseAdapter;
import p.ol3;
import p.e64;
import java.util.ArrayList;
import java.lang.Object;
import p.l64;
import java.lang.Class;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import p.e74;

public final class nl3 extends BaseAdapter	// class@001ffe from classes.dex
{
    public int a;
    public final ol3 b;

    public void nl3(ol3 p0){
       this.b = p0;
       super();
       this.a = -1;
       this.a();
    }
    public final void a(){
       e64 v;
       ol3 c = this.b.c;
       if ((v = c.v) != null) {
          c.i();
          e64 j = c.j;
          int i = j.size();
          int i1 = 0;
          while (i1 < i) {
             if (j.get(i1) == v) {
                this.a = i1;
                return;
             }
             i1 = i1 + 1;
          }
       }
       this.a = -1;
       return;
    }
    public final l64 b(int p0){
       nl3 tb = this.b;
       ol3 c = tb.c;
       c.i();
       e64 j = c.j;
       tb.getClass();
       p0 = p0 + 0;
       if ((tb = this.a) >= null && p0 >= tb) {
          p0++;
       }
       return j.get(p0);
    }
    public final int getCount(){
       nl3 tb = this.b;
       ol3 c = tb.c;
       c.i();
       tb.getClass();
       int i = c.j.size() + 0;
       if (this.a < null) {
          return i;
       }
       return (i - 1);
    }
    public final Object getItem(int p0){
       return this.b(p0);
    }
    public final long getItemId(int p0){
       return (long)p0;
    }
    public final View getView(int p0,View p1,ViewGroup p2){
       if (p1 == null) {
          p1 = this.b.b.inflate(R.layout.abc_list_menu_item_layout, p2, false);
       }
       p1.b(this.b(p0));
       return p1;
    }
    public final void notifyDataSetChanged(){
       this.a();
       super.notifyDataSetChanged();
    }
}
