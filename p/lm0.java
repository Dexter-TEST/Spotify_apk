package p.lm0;
import p.yq5;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p.km0;
import p.do5;
import p.eb1;
import p.mi;
import p.uf;
import java.lang.Object;
import p.xl3;
import p.mm0;
import p.zr5;
import android.view.View;
import io.reactivex.rxjava3.core.Observer;
import p.hn7;
import android.view.View$OnClickListener;
import p.h10;
import p.f10;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import p.e10;
import p.g10;
import p.qm0;
import p.an5;
import java.util.Collection;

public final class lm0 extends yq5	// class@001d7c from classes.dex
{
    public final SparseArray t;
    public final ArrayList v;
    public Observer w;

    public void lm0(){
       super();
       this.t = new SparseArray();
       this.v = new ArrayList(10);
    }
    public final void A(List p0){
       if (!this.d()) {
          this.z(p0);
          this.g();
       }else {
          this.z(p0);
          mi.d(new km0(this, p0)).a(new uf(1, this));
       }
       return;
    }
    public final int d(){
       return this.v.size();
    }
    public final long e(int p0){
       return this.v.get(p0).a;
    }
    public final int f(int p0){
       return this.v.get(p0).b;
    }
    public final void n(zr5 p0,int p1){
       mm0 omm0 = this.v.get(p1);
       lm0 tw = this.w;
       p0 = p0.a;
       if (tw != null && omm0.c != null) {
          if (!omm0.a(p0, tw)) {
             p0.setOnClickListener(new hn7(tw, 2, omm0));
          }
       }else {
          omm0.a(p0, null);
          p0.setOnClickListener(null);
          p0.setClickable(false);
       }
       this.t.get(this.f(p1)).c.a(p0, omm0);
       return;
    }
    public final zr5 o(int p0,RecyclerView p1){
       h10 oh10 = this.t.get(p0);
       oh10.getClass();
       return new e10(oh10.b.h(p1));
    }
    public final void w(qm0 p0,qm0 p1){
       int i;
       lm0 tv = this.v;
       if (tv.contains(p1)) {
          return;
       }
       if ((i = tv.indexOf(p0)) > -1) {
          i++;
          tv.add(i, p1);
       }
       return;
    }
    public final int x(qm0 p0){
       return this.v.indexOf(p0);
    }
    public final void y(an5 p0){
       if (p0 != this.w) {
          this.w = p0;
       }
       return;
    }
    public final void z(List p0){
       lm0 tv = this.v;
       tv.clear();
       tv.addAll(p0);
    }
}
