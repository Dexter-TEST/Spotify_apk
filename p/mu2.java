package p.mu2;
import p.ou2;
import java.util.ArrayList;
import java.lang.Object;
import p.vt2;
import java.util.Iterator;
import java.util.List;

public final class mu2 implements ou2	// class@001f07 from classes.dex
{
    public final List a;

    public void mu2(ArrayList p0){
       super();
       this.a = p0;
    }
    public final vt2 a(int p0){
       vt2 ovt2;
       Iterator iterator = this.a.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          if ((ovt2 = iterator.next().a(p0)) != null) {
             break ;
          }
       }
       return ovt2;
    }
}
