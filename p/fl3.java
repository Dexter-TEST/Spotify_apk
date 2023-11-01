package p.fl3;
import p.yq5;
import p.a07;
import p.el3;
import p.kn;
import p.uf;
import java.lang.Object;
import p.dn;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p.xe0;
import java.util.concurrent.Executor;
import p.ry7;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public abstract class fl3 extends yq5	// class@0015ec from classes.dex
{
    public final kn t;

    public void fl3(a07 p0){
       super();
       el3 uoel3 = new el3(this);
       uf ouf = new uf(1, this);
       dn uodn = new dn(p0);
       if (uodn.a == null) {
          Object b = dn.b;
          _monitor_enter(b);
          if (dn.c == null) {
             dn.c = Executors.newFixedThreadPool(2);
          }
          _monitor_exit(b);
          uodn.a = dn.c;
       }
       kn okn = new kn(ouf, new xe0(uodn.a, p0));
       this.t = okn;
       okn.d.add(uoel3);
       return;
    }
    public final int d(){
       return this.t.f.size();
    }
}
