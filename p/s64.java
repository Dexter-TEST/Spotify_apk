package p.s64;
import p.if6;
import p.c74;
import android.widget.AdapterView$OnItemClickListener;
import java.lang.Object;
import p.b64;
import android.content.Context;
import android.view.View$MeasureSpec;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup;
import p.e64;
import android.view.MenuItem;
import android.graphics.drawable.Drawable;
import p.l64;
import android.widget.AdapterView;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.HeaderViewListAdapter;
import p.pc0;
import android.widget.PopupWindow$OnDismissListener;

public abstract class s64 implements if6, c74, AdapterView$OnItemClickListener	// class@0025ca from classes.dex
{
    public Rect a;

    public void s64(){
       super();
    }
    public static int m(b64 p0,Context p1,int p2){
       int itemViewType;
       int i = 0;
       int i1 = View$MeasureSpec.makeMeasureSpec(i, i);
       int i2 = View$MeasureSpec.makeMeasureSpec(i, i);
       int count = p0.getCount();
       ViewGroup viewGroup = null;
       View view = viewGroup;
       int i3 = 0;
       int i4 = 0;
       while (true) {
          if (i >= count) {
             return i3;
          }
          if ((itemViewType = p0.getItemViewType(i)) != i4) {
             view = null;
             i4 = itemViewType;
          }
          if (viewGroup == null) {
             viewGroup = new FrameLayout(p1);
          }
          view = p0.getView(i, view, viewGroup);
          view.measure(i1, i2);
          if ((itemViewType = view.getMeasuredWidth()) >= p2) {
             break ;
          }else if(itemViewType > i3){
             i3 = itemViewType;
          }
          i = i + 1;
       }
       return p2;
    }
    public static boolean u(e64 p0){
       int i = p0.size();
       boolean b = false;
       int i1 = 0;
       while (i1 < i) {
          MenuItem item = p0.getItem(i1);
          if (item.isVisible() && item.getIcon() != null) {
             b = true;
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return b;
    }
    public final void g(Context p0,e64 p1){
    }
    public final boolean h(l64 p0){
       return false;
    }
    public final boolean k(l64 p0){
       return false;
    }
    public abstract void l(e64 p0);
    public abstract void n(View p0);
    public abstract void o(boolean p0);
    public final void onItemClick(AdapterView p0,View p1,int p2,long p3){
       ListAdapter adapter = p0.getAdapter();
       b64 wrappedAdapt = (adapter instanceof HeaderViewListAdapter)? adapter.getWrappedAdapter(): adapter;
       wrappedAdapt = wrappedAdapt.a;
       MenuItem item = adapter.getItem(p2);
       p2 = ((this instanceof pc0 ^ 0x01))? 0: 4;
       wrappedAdapt.q(item, this, p2);
       return;
    }
    public abstract void p(int p0);
    public abstract void q(int p0);
    public abstract void r(PopupWindow$OnDismissListener p0);
    public abstract void s(boolean p0);
    public abstract void t(int p0);
}
