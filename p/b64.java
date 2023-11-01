package p.b64;
import android.widget.BaseAdapter;
import p.e64;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.lang.Object;
import p.l64;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ListMenuItemView;
import p.e74;

public final class b64 extends BaseAdapter	// class@001062 from classes.dex
{
    public final e64 a;
    public int b;
    public boolean c;
    public final boolean t;
    public final LayoutInflater v;
    public final int w;

    public void b64(e64 p0,LayoutInflater p1,boolean p2,int p3){
       super();
       this.b = -1;
       this.t = p2;
       this.v = p1;
       this.a = p0;
       this.w = p3;
       this.a();
    }
    public final void a(){
       e64 v;
       b64 ta = this.a;
       if ((v = ta.v) != null) {
          ta.i();
          e64 j = ta.j;
          int i = j.size();
          int i1 = 0;
          while (i1 < i) {
             if (j.get(i1) == v) {
                this.b = i1;
                return;
             }
             i1 = i1 + 1;
          }
       }
       this.b = -1;
       return;
    }
    public final l64 b(int p0){
       e64 j;
       b64 ta = this.a;
       if (this.t != null) {
          ta.i();
          j = ta.j;
       }else {
          j = ta.l();
       }
       if ((ta = this.b) >= null && p0 >= ta) {
          p0++;
       }
       return j.get(p0);
    }
    public final int getCount(){
       e64 j;
       b64 ta = this.a;
       if (this.t != null) {
          ta.i();
          j = ta.j;
       }else {
          j = ta.l();
       }
       if (this.b < null) {
          return j.size();
       }else {
          return (j.size() - 1);
       }
    }
    public final Object getItem(int p0){
       return this.b(p0);
    }
    public final long getItemId(int p0){
       return (long)p0;
    }
    public final View getView(int p0,View p1,ViewGroup p2){
       int i;
       boolean b = false;
       if (p1 == null) {
          p1 = this.v.inflate(this.w, p2, b);
       }
       l64 b1 = this.b(p0).b;
       l64 b2 = ((i = p0 - 1) >= 0)? this.b(i).b: b1;
       View view = p1;
       if (this.a.m() && b1 != b2) {
          b = true;
       }
       view.setGroupDividerEnabled(b);
       View view1 = p1;
       if (this.c != null) {
          view.setForceShowIcon(true);
       }
       view1.b(this.b(p0));
       return p1;
    }
    public final void notifyDataSetChanged(){
       this.a();
       super.notifyDataSetChanged();
    }
}
