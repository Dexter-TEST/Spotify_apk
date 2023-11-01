package p.yq5;
import java.lang.Object;
import p.zq5;
import p.zr5;
import p.x67;
import java.lang.String;
import p.w67;
import java.util.List;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import p.ir5;
import androidx.recyclerview.widget.RecyclerView;
import p.ar5;
import android.database.Observable;
import java.lang.IllegalStateException;

public abstract class yq5	// class@002e0b from classes.dex
{
    public final zq5 a;
    public boolean b;
    public int c;

    public void yq5(){
       super();
       this.a = new zq5();
       this.b = false;
       this.c = 1;
    }
    public final void b(zr5 p0,int p1){
       zr5 k;
       int i = (p0.s == null)? 1: 0;
       if (i) {
          p0.c = p1;
          if (this.b != null) {
             p0.e = this.e(p1);
          }
          p0.j = (p0.j & 0xfdf8) | 1;
          w67.a("RV OnBindView");
       }
       p0.s = this;
       p0.f();
       this.n(p0, p1);
       if (i) {
          if ((k = p0.k) != null) {
             k.clear();
          }
          p0.j = p0.j & 0xfbff;
          ViewGroup$LayoutParams layoutParams = p0.a.getLayoutParams();
          if (layoutParams instanceof ir5) {
             layoutParams.c = true;
          }
          w67.b();
       }
       return;
    }
    public int c(yq5 p0,zr5 p1,int p2){
       if (p0 == this) {
          return p2;
       }
       return -1;
    }
    public abstract int d();
    public long e(int p0){
       return -1;
    }
    public int f(int p0){
       return 0;
    }
    public final void g(){
       this.a.b();
    }
    public final void h(int p0){
       this.a.d(p0, 1, null);
    }
    public final void i(int p0,int p1){
       this.a.c(p0, p1);
    }
    public final void j(int p0,int p1,Object p2){
       this.a.d(p0, p1, p2);
    }
    public final void k(int p0,int p1){
       this.a.e(p0, p1);
    }
    public final void l(int p0,int p1){
       this.a.f(p0, p1);
    }
    public void m(RecyclerView p0){
    }
    public abstract void n(zr5 p0,int p1);
    public abstract zr5 o(int p0,RecyclerView p1);
    public void p(RecyclerView p0){
    }
    public boolean q(zr5 p0){
       return false;
    }
    public void r(zr5 p0){
    }
    public void s(zr5 p0){
    }
    public void t(zr5 p0){
    }
    public final void u(ar5 p0){
       this.a.registerObserver(p0);
    }
    public final void v(boolean p0){
       if (this.a.a()) {
          throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
       }
       this.b = p0;
       return;
    }
}
