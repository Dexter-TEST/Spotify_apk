package p.zi3;
import java.util.AbstractList;
import java.lang.Class;
import p.dd;
import p.gs3;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import java.util.NoSuchElementException;
import p.yi3;
import java.lang.String;

public final class zi3 extends AbstractList	// class@002f01 from classes.dex
{
    public final List a;
    public final Iterator b;
    public static final dd c;

    static {
       zi3.c = gs3.a(zi3.class);
    }
    public void zi3(List p0,Iterator p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object get(int p0){
       zi3 ta = this.a;
       if (ta.size() > p0) {
          return ta.get(p0);
       }
       zi3 tb = this.b;
       if (!tb.hasNext()) {
          throw new NoSuchElementException();
       }
       ta.add(tb.next());
       return this.get(p0);
    }
    public final Iterator iterator(){
       return new yi3(this);
    }
    public final int size(){
       zi3 ta;
       dd c = zi3.c;
       c.b("potentially expensive size\(\) call");
       c.b("blowup running");
       while (true) {
          zi3 tb = this.b;
          ta = this.a;
          if (!tb.hasNext()) {
             break ;
          }else {
             ta.add(tb.next());
          }
       }
       return ta.size();
    }
}
