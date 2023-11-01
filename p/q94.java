package p.q94;
import java.lang.Object;
import android.util.SparseArray;
import p.tj1;

public final class q94	// class@002359 from classes.dex
{
    public final SparseArray a;
    public tj1 b;

    public void q94(int p0){
       super();
       this.a = new SparseArray(p0);
    }
    public final void a(tj1 p0,int p1,int p2){
       q94 ta;
       int i = p0.a(p1);
       q94 oq94 = ((ta = this.a) == null)? null: ta.get(i);
       if (oq94 == null) {
          oq94 = new q94(1);
          ta.put(p0.a(p1), oq94);
       }
       if (p2 > p1) {
          oq94.a(p0, (p1 + 1), p2);
       }else {
          oq94.b = p0;
       }
       return;
    }
}
