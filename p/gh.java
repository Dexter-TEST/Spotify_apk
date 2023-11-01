package p.gh;
import p.lh;
import android.content.DialogInterface$OnClickListener;
import p.mh;
import java.lang.Object;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import p.lg;
import java.lang.CharSequence;
import java.lang.String;
import android.util.Log;
import p.r8;
import android.content.Context;
import p.o8;
import android.widget.AdapterView;
import p.s8;
import p.q8;
import android.view.View;
import p.dh;
import android.content.DialogInterface;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.Adapter;
import android.widget.ListAdapter;

public final class gh implements lh, DialogInterface$OnClickListener	// class@00170f from classes.dex
{
    public s8 a;
    public ListAdapter b;
    public CharSequence c;
    public final mh t;

    public void gh(mh p0){
       this.t = p0;
       super();
    }
    public final boolean a(){
       gh ta;
       boolean b = ((ta = this.a) != null)? ta.isShowing(): false;
       return b;
    }
    public final int b(){
       return 0;
    }
    public final Drawable d(){
       return null;
    }
    public final void dismiss(){
       gh ta;
       if ((ta = this.a) != null) {
          ta.dismiss();
          this.a = null;
       }
       return;
    }
    public final void f(CharSequence p0){
       this.c = p0;
    }
    public final void g(Drawable p0){
       Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
    public final void h(int p0){
       Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }
    public final void i(int p0){
       Log.e("AppCompatSpinner", "Cannot set horizontal \(original\) offset for MODE_DIALOG, ignoring");
    }
    public final void j(int p0){
       Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }
    public final void k(int p0,int p1){
       gh tc;
       if (this.b == null) {
          return;
       }
       gh tt = this.t;
       r8 or8 = new r8(tt.getPopupContext());
       if ((tc = this.c) != null) {
          or8.c.d = tc;
       }
       r8 c = or8.c;
       c.g = this.b;
       c.h = this;
       c.j = tt.getSelectedItemPosition();
       c.i = true;
       s8 os8 = or8.a();
       this.a = os8;
       q8 e = os8.w.e;
       dh.d(e, p0);
       dh.c(e, p1);
       this.a.show();
       return;
    }
    public final int l(){
       return 0;
    }
    public final CharSequence m(){
       return this.c;
    }
    public final void onClick(DialogInterface p0,int p1){
       gh tt = this.t;
       tt.setSelection(p1);
       if (tt.getOnItemClickListener() != null) {
          tt.performItemClick(null, p1, this.b.getItemId(p1));
       }
       this.dismiss();
       return;
    }
    public final void p(ListAdapter p0){
       this.b = p0;
    }
}
