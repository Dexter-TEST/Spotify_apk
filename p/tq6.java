package p.tq6;
import p.c64;
import p.b6;
import android.content.Context;
import androidx.appcompat.widget.ActionBarContextView;
import p.a6;
import p.e64;
import android.view.View;
import java.lang.Object;
import java.lang.ref.Reference;
import android.view.MenuInflater;
import p.lw6;
import java.lang.CharSequence;
import java.lang.ref.WeakReference;
import java.lang.String;
import p.w5;
import android.view.MenuItem;

public final class tq6 extends b6 implements c64	// class@0027c2 from classes.dex
{
    public final Context c;
    public final ActionBarContextView t;
    public final a6 v;
    public WeakReference w;
    public boolean x;
    public final e64 y;

    public void tq6(Context p0,ActionBarContextView p1,a6 p2){
       super();
       this.c = p0;
       this.t = p1;
       this.v = p2;
       e64 uoe64 = new e64(p1.getContext());
       uoe64.l = 1;
       this.y = uoe64;
       uoe64.e = this;
    }
    public final void a(){
       if (this.x != null) {
          return;
       }
       this.x = true;
       this.v.c(this);
       return;
    }
    public final View b(){
       tq6 tw;
       View view = ((tw = this.w) != null)? tw.get(): null;
       return view;
    }
    public final e64 c(){
       return this.y;
    }
    public final MenuInflater d(){
       return new lw6(this.t.getContext());
    }
    public final CharSequence e(){
       return this.t.getSubtitle();
    }
    public final CharSequence f(){
       return this.t.getTitle();
    }
    public final void g(){
       this.v.g(this, this.y);
    }
    public final boolean h(){
       return this.t.J;
    }
    public final void i(View p0){
       this.t.setCustomView(p0);
       WeakReference weakReferenc = (p0 != null)? new WeakReference(p0): null;
       this.w = weakReferenc;
       return;
    }
    public final void j(int p0){
       this.m(this.c.getString(p0));
    }
    public final void k(e64 p0){
       ActionBarContextView t;
       this.g();
       if ((t = this.t.t) != null) {
          t.l();
       }
       return;
    }
    public final boolean l(e64 p0,MenuItem p1){
       return this.v.f(this, p1);
    }
    public final void m(CharSequence p0){
       this.t.setSubtitle(p0);
    }
    public final void n(int p0){
       this.o(this.c.getString(p0));
    }
    public final void o(CharSequence p0){
       this.t.setTitle(p0);
    }
    public final void p(boolean p0){
       this.b = p0;
       this.t.setTitleOptional(p0);
    }
}
