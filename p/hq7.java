package p.hq7;
import p.ty0;
import java.lang.String;
import p.es3;
import p.uq7;
import p.nx1;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import p.dr7;
import java.util.UUID;
import p.co5;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import java.lang.Class;
import p.j45;
import p.tm1;
import java.lang.Runnable;
import p.ce7;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;

public final class hq7 extends ty0	// class@0018a5 from classes.dex
{
    public final uq7 m;
    public final String n;
    public final nx1 o;
    public final List p;
    public final ArrayList q;
    public final ArrayList r;
    public boolean s;
    public vx5 t;

    static {
       es3.d("WorkContinuationImpl");
    }
    public void hq7(uq7 p0,String p1,nx1 p2,List p3){
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.q = new ArrayList(p3.size());
       this.r = new ArrayList();
       for (int i = 0; i < p3.size(); i++) {
          p1 = p3.get(i).a.toString();
          co5.l(p1, "id.toString\(\)");
          this.q.add(p1);
          this.r.add(p1);
       }
       return;
    }
    public static boolean D(hq7 p0,HashSet p1){
       p1.addAll(p0.q);
       HashSet hashSet = hq7.E(p0);
       Iterator iterator = p1.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (hashSet.contains(iterator.next())) {
                break ;
             }
          }else {
             p1.removeAll(p0.q);
             return false;
          }
       }
       return true;
    }
    public static HashSet E(hq7 p0){
       p0.getClass();
       return new HashSet();
    }
    public final j45 C(){
       if (this.s == null) {
          tm1 otm1 = new tm1(this);
          this.m.D.j(otm1);
          this.t = otm1.b;
       }else {
          TextUtils.join(", ", this.q);
          es3.c().getClass();
       }
       return this.t;
    }
}
