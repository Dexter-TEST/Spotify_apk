package p.ty2;
import p.ou2;
import p.c33;
import p.uy2;
import java.lang.Object;
import android.util.SparseArray;
import p.vt2;
import p.xt2;

public final class ty2 implements ou2	// class@002806 from classes.dex
{
    public final c33 a;
    public final SparseArray b;

    public void ty2(c33 p0,uy2[] p1){
       super();
       this.a = p0;
       this.b = new SparseArray(p1.length);
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p1[i];
          this.b.append(oobject.getId(), oobject);
       }
       return;
    }
    public final vt2 a(int p0){
       uy2 ouy2;
       xt2 oxt2 = ((ouy2 = this.b.get(p0)) != null)? ouy2.a(this.a): null;
       return oxt2;
    }
}
