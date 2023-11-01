package p.y01;
import android.widget.Filterable;
import p.z01;
import android.widget.BaseAdapter;
import android.content.Context;
import p.x01;
import p.tl3;
import java.lang.Object;
import android.view.View;
import android.database.Cursor;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import java.lang.String;
import android.view.ViewGroup;
import p.uv6;
import android.view.LayoutInflater;
import android.widget.Filter;
import p.a11;
import java.lang.IllegalStateException;
import p.tp2;

public abstract class y01 extends BaseAdapter implements Filterable, z01	// class@002d20 from classes.dex
{
    public boolean a;
    public boolean b;
    public Cursor c;
    public int t;
    public x01 v;
    public tl3 w;
    public a11 x;

    public void y01(Context p0){
       super();
       this.b = true;
       this.c = null;
       this.a = false;
       this.t = -1;
       this.v = new x01(this);
       this.w = new tl3(true, this);
    }
    public abstract void a(View p0,Cursor p1);
    public void b(Cursor p0){
       y01 tv;
       y01 tc = this.c;
       if (p0 == tc) {
          tc = null;
       }else if(tc != null){
          if ((tv = this.v) != null) {
             tc.unregisterContentObserver(tv);
          }
          if ((tv = this.w) != null) {
             tc.unregisterDataSetObserver(tv);
          }
       }
       this.c = p0;
       if (p0 != null) {
          if ((tv = this.v) != null) {
             p0.registerContentObserver(tv);
          }
          if ((tv = this.w) != null) {
             p0.registerDataSetObserver(tv);
          }
          this.t = p0.getColumnIndexOrThrow("_id");
          this.a = true;
          this.notifyDataSetChanged();
       }else {
          this.t = -1;
          this.a = false;
          this.notifyDataSetInvalidated();
       }
       if (tc != null) {
          tc.close();
       }
       return;
    }
    public abstract String c(Cursor p0);
    public abstract View d(ViewGroup p0);
    public final int getCount(){
       y01 tc;
       if (this.a != null && (tc = this.c) != null) {
          return tc.getCount();
       }
       return 0;
    }
    public View getDropDownView(int p0,View p1,ViewGroup p2){
       if (this.a == null) {
          return null;
       }
       this.c.moveToPosition(p0);
       if (p1 == null) {
          uv6 ouv6 = this;
          p1 = ouv6.A.inflate(ouv6.z, p2, false);
       }
       this.a(p1, this.c);
       return p1;
    }
    public final Filter getFilter(){
       if (this.x == null) {
          this.x = new a11(this);
       }
       return this.x;
    }
    public final Object getItem(int p0){
       y01 tc;
       if (this.a == null || (tc = this.c) == null) {
          return null;
       }
       tc.moveToPosition(p0);
       return this.c;
    }
    public final long getItemId(int p0){
       y01 tc;
       if (this.a != null && ((tc = this.c) != null && tc.moveToPosition(p0))) {
          return this.c.getLong(this.t);
       }
       return 0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       if (this.a == null) {
          throw new IllegalStateException("this should only be called when the cursor is valid");
       }
       if (!this.c.moveToPosition(p0)) {
          throw new IllegalStateException(tp2.k("couldn\'t move cursor to position ", p0));
       }
       if (p1 == null) {
          p1 = this.d(p2);
       }
       this.a(p1, this.c);
       return p1;
    }
}
