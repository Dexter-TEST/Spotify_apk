package p.v04;
import p.q74;
import java.lang.Object;
import java.lang.Class;
import p.p74;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class v04 implements q74	// class@002957 from classes.dex
{
    public final q74[] a;

    public void v04(q74[] p0){
       super();
       this.a = p0;
    }
    public final p74 a(Class p0){
       object oobject;
       v04 ta = this.a;
       int len = ta.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             throw new UnsupportedOperationException("No factory is available for message type: ".concat(p0.getName()));
          }
          oobject = ta[i];
          if (oobject.b(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject.a(p0);
    }
    public final boolean b(Class p0){
       v04 ta = this.a;
       int len = ta.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (ta[i].b(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
}
