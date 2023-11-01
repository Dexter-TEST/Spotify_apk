package p.kb1;
import p.p91;
import p.cp7;
import p.vq2;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.Object;
import p.l91;

public class kb1 extends p91	// class@001bdd from classes.dex
{
    public int m;

    public void kb1(cp7 p0){
       super(p0);
       this.e = (p0 instanceof vq2)? 2: 3;
       return;
    }
    public final void d(int p0){
       if (this.j != null) {
          return;
       }
       this.j = true;
       this.g = p0;
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(iterator.next());
       }
       return;
    }
}
