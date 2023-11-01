package p.ol3;
import p.c74;
import android.widget.AdapterView$OnItemClickListener;
import android.content.Context;
import java.lang.Object;
import android.view.LayoutInflater;
import p.e64;
import p.b74;
import p.nl3;
import p.ev6;
import p.f64;
import p.r8;
import p.o8;
import p.s8;
import android.content.DialogInterface$OnDismissListener;
import android.app.Dialog;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import p.l64;
import android.widget.AdapterView;
import android.view.View;
import android.view.MenuItem;

public final class ol3 implements c74, AdapterView$OnItemClickListener	// class@002142 from classes.dex
{
    public Context a;
    public LayoutInflater b;
    public e64 c;
    public ExpandedMenuView t;
    public b74 v;
    public nl3 w;

    public void ol3(Context p0){
       super();
       this.a = p0;
       this.b = LayoutInflater.from(p0);
    }
    public final void b(e64 p0,boolean p1){
       ol3 tv;
       if ((tv = this.v) != null) {
          tv.b(p0, p1);
       }
       return;
    }
    public final void d(){
       ol3 tw;
       if ((tw = this.w) != null) {
          tw.notifyDataSetChanged();
       }
       return;
    }
    public final boolean f(ev6 p0){
       ol3 tv;
       if (!p0.hasVisibleItems()) {
          return false;
       }
       f64 uof64 = new f64(p0);
       e64 a = p0.a;
       r8 or8 = new r8(a);
       ol3 ool3 = new ol3(or8.c.a);
       uof64.c = ool3;
       ool3.v = uof64;
       p0.b(ool3, a);
       f64 c = uof64.c;
       if (c.w == null) {
          c.w = new nl3(c);
       }
       r8 c1 = or8.c;
       r8 or81 = c1;
       or81.g = c.w;
       or81.h = uof64;
       if ((a = p0.o) != null) {
          or81.e = a;
       }else {
          or81.c = p0.n;
          c1.d = p0.m;
       }
       c1.f = uof64;
       s8 os8 = or8.a();
       uof64.b = os8;
       os8.setOnDismissListener(uof64);
       WindowManager$LayoutParams attributes = uof64.b.getWindow().getAttributes();
       attributes.type = 1003;
       attributes.flags = attributes.flags | 0x20000;
       uof64.b.show();
       if ((tv = this.v) != null) {
          tv.p(p0);
       }
       return true;
    }
    public final void g(Context p0,e64 p1){
       ol3 tw;
       if (this.a != null) {
          this.a = p0;
          if (this.b == null) {
             this.b = LayoutInflater.from(p0);
          }
       }
       this.c = p1;
       if ((tw = this.w) != null) {
          tw.notifyDataSetChanged();
       }
       return;
    }
    public final boolean h(l64 p0){
       return false;
    }
    public final boolean i(){
       return false;
    }
    public final void j(b74 p0){
       this.v = p0;
    }
    public final boolean k(l64 p0){
       return false;
    }
    public final void onItemClick(AdapterView p0,View p1,int p2,long p3){
       this.c.q(this.w.b(p2), this, 0);
    }
}
