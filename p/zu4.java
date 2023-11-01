package p.zu4;
import p.nv1;
import p.ne4;
import java.util.concurrent.CopyOnWriteArrayList;
import p.hr0;
import p.vc1;
import java.lang.Object;
import p.zh0;
import java.util.Iterator;
import java.lang.Boolean;

public final class zu4 extends ne4 implements nv1	// class@002f6a from classes.dex
{
    public final CopyOnWriteArrayList l;

    public void zu4(){
       super();
       this.l = new CopyOnWriteArrayList();
    }
    public final vc1 a(hr0 p0){
       this.l.add(p0);
       return new zh0(this, 9, p0);
    }
    public final void h(){
       this.m(true);
    }
    public final void i(){
       this.m(false);
    }
    public final void m(boolean p0){
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().accept(Boolean.valueOf(p0));
       }
       return;
    }
}
