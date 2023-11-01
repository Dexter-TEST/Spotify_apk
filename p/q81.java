package p.q81;
import java.util.Set;
import p.hj2;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Iterator;
import p.qt;

public final class q81	// class@00234d from classes.dex
{
    public final String a;
    public final hj2 b;

    public void q81(Set p0,hj2 p1){
       super();
       this.a = q81.a(p0);
       this.b = p1;
    }
    public static String a(Set p0){
       StringBuilder str = "";
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          qt oqt = iterator.next();
          str = str.append(oqt.a).append('/').append(oqt.b);
          if (iterator.hasNext()) {
             str = str.append(' ');
          }
       }
       return str;
    }
}
