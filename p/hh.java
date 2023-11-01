package p.hh;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.content.res.Resources$Theme;
import java.lang.Object;
import android.os.Build$VERSION;
import android.widget.ThemedSpinnerAdapter;
import p.fh;
import android.widget.Adapter;
import android.view.View;
import android.view.ViewGroup;
import android.database.DataSetObserver;

public final class hh implements ListAdapter, SpinnerAdapter	// class@001855 from classes.dex
{
    public final SpinnerAdapter a;
    public final ListAdapter b;

    public void hh(SpinnerAdapter p0,Resources$Theme p1){
       super();
       this.a = p0;
       if (p0 instanceof ListAdapter) {
          this.b = p0;
       }
       if (p1 != null && (Build$VERSION.SDK_INT >= 23 && p0 instanceof ThemedSpinnerAdapter)) {
          fh.a(p0, p1);
       }
       return;
    }
    public final boolean areAllItemsEnabled(){
       hh tb;
       if ((tb = this.b) != null) {
          return tb.areAllItemsEnabled();
       }
       return true;
    }
    public final int getCount(){
       hh ta;
       int i = ((ta = this.a) == null)? 0: ta.getCount();
       return i;
    }
    public final View getDropDownView(int p0,View p1,ViewGroup p2){
       hh ta;
       View view = ((ta = this.a) == null)? null: ta.getDropDownView(p0, p1, p2);
       return view;
    }
    public final Object getItem(int p0){
       hh ta;
       Object obj = ((ta = this.a) == null)? null: ta.getItem(p0);
       return obj;
    }
    public final long getItemId(int p0){
       hh ta;
       long l = ((ta = this.a) == null)? -1: ta.getItemId(p0);
       return l;
    }
    public final int getItemViewType(int p0){
       return 0;
    }
    public final View getView(int p0,View p1,ViewGroup p2){
       return this.getDropDownView(p0, p1, p2);
    }
    public final int getViewTypeCount(){
       return 1;
    }
    public final boolean hasStableIds(){
       hh ta;
       boolean b = ((ta = this.a) != null && ta.hasStableIds())? true: false;
       return b;
    }
    public final boolean isEmpty(){
       boolean b = (!this.getCount())? true: false;
       return b;
    }
    public final boolean isEnabled(int p0){
       hh tb;
       if ((tb = this.b) != null) {
          return tb.isEnabled(p0);
       }
       return true;
    }
    public final void registerDataSetObserver(DataSetObserver p0){
       hh ta;
       if ((ta = this.a) != null) {
          ta.registerDataSetObserver(p0);
       }
       return;
    }
    public final void unregisterDataSetObserver(DataSetObserver p0){
       hh ta;
       if ((ta = this.a) != null) {
          ta.unregisterDataSetObserver(p0);
       }
       return;
    }
}
