package p.hj2;
import java.lang.Object;
import java.util.HashSet;
import java.util.LinkedHashSet;
import p.mz5;
import java.lang.String;
import p.co5;
import java.util.Set;
import java.util.Collections;

public final class hj2	// class@001861 from classes.dex
{
    public final HashSet a;
    public static hj2 b;

    public void hj2(int p0){
       if (p0 != 1) {
          super();
          this.a = new HashSet();
          return;
       }else {
          super();
          this.a = new LinkedHashSet();
          return;
       }
    }
    public synchronized final void a(mz5 p0){
       co5.o(p0, "route");
       this.a.remove(p0);
    }
    public final Set b(){
       hj2 ta = this.a;
       _monitor_enter(ta);
       _monitor_exit(ta);
       return Collections.unmodifiableSet(this.a);
    }
}
