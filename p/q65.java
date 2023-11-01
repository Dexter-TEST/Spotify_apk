package p.q65;
import p.yq5;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Set;
import p.zr5;
import p.gu;
import p.p65;
import androidx.recyclerview.widget.RecyclerView;
import p.al2;
import java.lang.IllegalStateException;

public final class q65 extends yq5	// class@00233f from classes.dex
{
    public final SparseArray t;
    public final HashMap v;
    public int w;
    public List x;

    public void q65(){
       super();
       this.t = new SparseArray();
       this.v = new HashMap(10);
       this.v(false);
    }
    public final int d(){
       q65 tx;
       int i = ((tx = this.x) == null)? 0: tx.size();
       return i;
    }
    public final long e(int p0){
       return (long)p0;
    }
    public final int f(int p0){
       Integer integer;
       q65 tv = this.v;
       if ((integer = tv.get(this.x(p0).getClass())) != null) {
          return integer.intValue();
       }
       throw new IllegalArgumentException("types="+tv.keySet()+", item="+this.x(p0));
    }
    public final void n(zr5 p0,int p1){
       gu ogu = this.t.get(this.f(p1));
       ogu.b.a(p1, p0, ogu.a.cast(this.x(p1)));
    }
    public final zr5 o(int p0,RecyclerView p1){
       return this.t.get(p0).b.b(p1);
    }
    public final void w(Class p0,p65 p1){
       q65 tw = this.w;
       this.w = tw + 1;
       this.t.put(tw, new gu(p0, p1));
       this.v.put(p0, Integer.valueOf(tw));
    }
    public final Object x(int p0){
       q65 tx;
       if ((tx = this.x) != null) {
          return tx.get(p0);
       }
       throw new IllegalStateException();
    }
}
