package p.fb7;
import java.lang.Object;
import java.util.ArrayList;
import p.gb7;
import p.hb7;
import java.util.List;
import p.kb7;
import java.util.Collection;
import java.lang.String;
import p.co5;

public abstract class fb7	// class@001599 from classes.dex
{
    public kb7 a;
    public hb7 b;
    public final ArrayList c;

    public void fb7(){
       super();
       this.c = new ArrayList();
    }
    public final gb7 a(){
       fb7 tb;
       gb7 ogb7;
       if ((tb = this.b) == null) {
          tb = hb7.a;
       }
       fb7 ta = this.a;
       fb7 tc = this.c;
       if (ta != null) {
          tc.addAll(ta.a());
          List list = tb.a();
          if ((list.isEmpty() ^ 0x01)) {
             tc.addAll(list);
          }
          if ((ogb7 = this.b(ta, tb, tc)) != null) {
          label_0036 :
             return ogb7;
          }
       }
       tc.add("No location!");
       ogb7 = this.b(kb7.i, tb, tc);
       goto label_0036 ;
    }
    public abstract gb7 b(kb7 p0,hb7 p1,ArrayList p2);
    public final void c(kb7 p0){
       co5.o(p0, "location");
       this.a = p0;
    }
}
