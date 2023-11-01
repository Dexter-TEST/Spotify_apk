package p.il3;
import com.google.common.collect.c;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.Collection;
import java.util.ArrayList;
import p.dj0;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.List;
import p.eo5;
import java.lang.Class;
import p.ys5;

public final class il3	// class@0019b7 from classes.dex
{
    public List a;

    public void il3(c p0){
       co5.o(p0, "list");
       super();
       this.a = dj0.C0(p0);
    }
    public final void a(Iterable p0){
       if (this.a instanceof c) {
          this.a = new ArrayList(this.a);
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.a.add(iterator.next());
       }
       return;
    }
    public final void b(Iterable p0){
       int i;
       ArrayList uArrayList;
       if (p0 instanceof c) {
          this.a = eo5.e(p0);
       }else if(p0 != null && (!p0 instanceof Collection && p0.isEmpty())){
          uArrayList = 0;
       }else {
          i = 1;
       }
       if (!i) {
          p0.getClass();
          if (p0 instanceof Collection) {
             uArrayList = new ArrayList(p0);
          }else {
             Iterator iterator = p0.iterator();
             uArrayList = new ArrayList();
             iterator.getClass();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next());
             }
          }
          this.a = uArrayList;
       }else {
          il3 ta = this.a;
          if (ta instanceof c) {
             ys5 v = ys5.v;
             co5.l(v, "of\(\)");
             this.a = v;
          }else {
             ta.clear();
          }
       }
       return;
    }
}
