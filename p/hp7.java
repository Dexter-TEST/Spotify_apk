package p.hp7;
import p.c64;
import p.b6;
import p.ip7;
import android.content.Context;
import p.xf;
import p.e64;
import p.a6;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import android.view.View;
import java.lang.Object;
import java.lang.ref.Reference;
import android.view.MenuInflater;
import p.lw6;
import java.lang.CharSequence;
import java.lang.ref.WeakReference;
import android.content.res.Resources;
import java.lang.String;
import p.w5;
import android.view.MenuItem;

public final class hp7 extends b6 implements c64	// class@00189c from classes.dex
{
    public final Context c;
    public final e64 t;
    public a6 v;
    public WeakReference w;
    public final ip7 x;

    public void hp7(ip7 p0,Context p1,xf p2){
       this.x = p0;
       super();
       this.c = p1;
       this.v = p2;
       e64 uoe64 = new e64(p1);
       uoe64.l = 1;
       this.t = uoe64;
       uoe64.e = this;
    }
    public final void a(){
       hp7 tx = this.x;
       if (tx.N != this) {
          return;
       }
       if (!((tx.U ^ 0x01))) {
          tx.O = this;
          tx.P = this.v;
       }else {
          this.v.c(this);
       }
       this.v = null;
       tx.D0(false);
       ip7 k = tx.K;
       if (k.B == null) {
          k.e();
       }
       tx.H.setHideOnContentScrollEnabled(tx.Z);
       tx.N = null;
       return;
    }
    public final View b(){
       hp7 tw;
       View view = ((tw = this.w) != null)? tw.get(): null;
       return view;
    }
    public final e64 c(){
       return this.t;
    }
    public final MenuInflater d(){
       return new lw6(this.c);
    }
    public final CharSequence e(){
       return this.x.K.getSubtitle();
    }
    public final CharSequence f(){
       return this.x.K.getTitle();
    }
    public final void g(){
       if (this.x.N != this) {
          return;
       }
       hp7 tt = this.t;
       tt.w();
       this.v.g(this, tt);
       tt.v();
       return;
    }
    public final boolean h(){
       return this.x.K.J;
    }
    public final void i(View p0){
       this.x.K.setCustomView(p0);
       this.w = new WeakReference(p0);
    }
    public final void j(int p0){
       this.m(this.x.F.getResources().getString(p0));
    }
    public final void k(e64 p0){
       ActionBarContextView t;
       if (this.v == null) {
          return;
       }
       this.g();
       if ((t = this.x.K.t) != null) {
          t.l();
       }
       return;
    }
    public final boolean l(e64 p0,MenuItem p1){
       hp7 tv;
       if ((tv = this.v) != null) {
          return tv.f(this, p1);
       }
       return false;
    }
    public final void m(CharSequence p0){
       this.x.K.setSubtitle(p0);
    }
    public final void n(int p0){
       this.o(this.x.F.getResources().getString(p0));
    }
    public final void o(CharSequence p0){
       this.x.K.setTitle(p0);
    }
    public final void p(boolean p0){
       this.b = p0;
       this.x.K.setTitleOptional(p0);
    }
}
