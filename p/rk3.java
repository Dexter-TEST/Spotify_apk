package p.rk3;
import java.lang.Object;
import android.view.View;
import java.util.List;
import p.zr5;
import android.view.ViewGroup$LayoutParams;
import p.ir5;
import p.pr5;

public final class rk3	// class@002504 from classes.dex
{
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public void rk3(){
       super();
       this.a = true;
       this.h = 0;
       this.i = 0;
       this.k = null;
    }
    public final void a(View p0){
       int i = this.k.size();
       View view = null;
       int i1 = Integer.MAX_VALUE;
       int i2 = 0;
       while (i2 < i) {
          zr5 a = this.k.get(i2).a;
          ir5 layoutParams = a.getLayoutParams();
          if (a != p0 && !layoutParams.c()) {
             int i3 = layoutParams.a() - this.d;
             if ((i3 = i3 * this.e) >= 0 && i3 < i1) {
                view = a;
                if (!i3) {
                   break ;
                }else {
                   i1 = i3;
                }
             }
          }
          i2 = i2 + 1;
       }
       this.d = (view == null)? -1: view.getLayoutParams().a();
       return;
    }
    public final View b(pr5 p0){
       rk3 tk;
       zr5 a;
       if ((tk = this.k) != null) {
          int i = tk.size();
          int i1 = 0;
          while (true) {
             if (i1 < i) {
                a = this.k.get(i1).a;
                ir5 layoutParams = a.getLayoutParams();
                if (layoutParams.c() || this.d != layoutParams.a()) {
                   i1 = i1 + 1;
                }else {
                   this.a(a);
                   break ;
                }
             }else {
                a = null;
                break ;
             }
          }
          return a;
       }else {
          this.d = this.d + this.e;
          return p0.d(this.d);
       }
    }
}
