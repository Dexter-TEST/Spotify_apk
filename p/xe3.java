package p.xe3;
import p.vf;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Object;
import java.lang.Class;
import java.lang.CharSequence;
import java.lang.Appendable;
import java.lang.String;
import java.lang.NullPointerException;

public final class xe3 extends vf	// class@002c5e from classes.dex
{
    public final vf c;

    public void xe3(vf p0,vf p1){
       this.c = p0;
       super(p1, 0);
    }
    public final void e(StringBuilder p0,Iterator p1){
       Object obj;
       Appendable uAppendable;
       if (p1 == null) {
          throw new NullPointerException("parts");
       }
       while (true) {
          xe3 tc = this.c;
          if (p1.hasNext()) {
             if ((obj = p1.next()) != null) {
                tc.getClass();
                uAppendable = p0+vf.w(obj);
             }
          }
          while (p1.hasNext()) {
             if ((obj = p1.next()) != null) {
                uAppendable.append(tc.b).append(vf.w(obj));
             }else {
                continue ;
             }
          }
          return;
       }
    }
}
