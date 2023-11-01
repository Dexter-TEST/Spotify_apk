package p.vu1;
import java.lang.Runnable;
import p.ys5;
import p.i77;
import p.hs3;
import p.lf1;
import java.lang.Object;
import java.util.Set;
import p.pv1;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Integer;
import p.xt1;
import java.lang.String;
import java.lang.Long;
import p.fw1;
import p.is7;
import p.ew1;
import p.yu1;
import p.bw1;
import java.lang.Throwable;
import java.util.Collection;
import java.lang.StringBuilder;
import p.vf;
import java.lang.Iterable;
import p.gv1;

public final class vu1 implements Runnable	// class@002a66 from classes.dex
{
    public final List a;
    public final i77 b;
    public final hs3 c;
    public final if1 t;

    public void vu1(ys5 p0,i77 p1,hs3 p2,lf1 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final HashSet a(Set p0,pv1 p1,List p2){
       HashSet hashSet = new HashSet();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Integer integer = iterator.next();
          if (integer.intValue() >= 0 && integer.intValue() < p2.size()) {
             xt1 oxt1 = p2.get(integer.intValue());
             this.t.d(oxt1.b, p1);
             hashSet.add(Long.valueOf(oxt1.a));
          }
       }
       return hashSet;
    }
    public synchronized final void run(){
       bw1 uobw1;
       this.b.n();
       Iterator iterator = this.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             fw1 uofw1 = iterator.next();
             is7 ois7 = uofw1.get();
             while (true) {
                if (ois7 instanceof ew1) {
                   ew1 g = ois7.G;
                   ew1 h = ois7.H;
                   vu1 tc = this.c;
                   try{
                      uobw1 = h.a(g);
                   }catch(p.cb4 e0){
                      tc.a("No HTTP transport available to publish events.");
                      uobw1 = new bw1();
                   }catch(java.io.IOException e4){
                      Object[] objArray = new Object[]{e4.getMessage()};
                      tc.b("Error publishing events: %s", objArray);
                      uobw1 = new bw1();
                   }
                   HashSet hashSet = this.a(uobw1.b, pv1.A, g);
                   hashSet.addAll(this.a(uobw1.c, pv1.z, g));
                   this.c.a("".append(hashSet.size()).append(" Events to be deleted from DB: ").append(new vf(" ").r(hashSet)).toString());
                   uofw1.a(hashSet);
                   if (uofw1 instanceof gv1 && (!hashSet.isEmpty() && uobw1.a == null)) {
                      uofw1.b(g.get(0));
                   }
                   if (uobw1.a != null) {
                      break ;
                   }else {
                      ois7 = uofw1.get();
                   }
                }else {
                   continue ;
                }
             }
             this.c.a("Backoff requested");
             return;
          }else {
             this.c.a("No more events to sync");
             return;
          }
       }
    }
}
