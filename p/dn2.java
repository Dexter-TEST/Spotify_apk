package p.dn2;
import java.lang.Object;
import android.util.SparseIntArray;
import p.u44;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import java.lang.Math;
import p.gn2;

public final class dn2	// class@00137c from classes.dex
{
    public final SparseIntArray a;
    public final SparseIntArray b;
    public final SparseIntArray c;
    public final int d;
    public final int e;
    public final boolean f;

    public void dn2(int p0,boolean p1,int p2){
       super();
       this.a = new SparseIntArray();
       this.b = new SparseIntArray();
       this.c = new SparseIntArray();
       this.d = p0;
       this.e = p2;
       this.f = p1;
    }
    public final int a(int p0,u44 p1){
       int i = -1;
       dn2 td = this.d;
       dn2 te = this.e;
       if (p0 == (p1.b.X + i)) {
          return Math.max(te, td);
       }
       dn2 tc = this.c;
       if ((i = tc.get(p0, i)) >= 0) {
          return i;
       }
       GridLayoutManager x = p1.b.X;
       int i1 = ((((x + 1) * td) + Math.max(((te - td) * 2), 0)) / x) - this.c(p0, p1);
       tc.put(p0, i1);
       return i1;
    }
    public final int b(int p0,u44 p1){
       int i;
       dn2 ta = this.a;
       if ((i = ta.get(p0, -1)) >= 0) {
          return i;
       }
       p1 = p1.b;
       int i1 = p1.c0.b(p0, p1.X);
       ta.put(p0, i1);
       return i1;
    }
    public final int c(int p0,u44 p1){
       int i;
       dn2 td = this.d;
       if (!p0) {
          return Math.max(this.e, td);
       }
       dn2 tb = this.b;
       if ((i = tb.get(p0, -1)) >= 0) {
          return i;
       }
       int i1 = td - this.a((p0 - 1), p1);
       tb.put(p0, i1);
       return i1;
    }
}
