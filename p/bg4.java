package p.bg4;
import p.xg4;
import p.vi7;
import p.ce2;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Object;
import p.dj7;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;
import java.util.Set;
import p.co5;

public final class bg4 extends vi7 implements xg4	// class@0010bc from classes.dex
{
    public final LinkedHashMap t;
    public static final ce2 v;

    static {
       bg4.v = new ce2(2);
    }
    public void bg4(){
       super();
       this.t = new LinkedHashMap();
    }
    public final void b(){
       bg4 tt = this.t;
       Iterator iterator = tt.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       tt.clear();
       return;
    }
    public final String toString(){
       String str = "NavControllerViewModel{"+Integer.toHexString(System.identityHashCode(this))+"} ViewModelStores \(";
       Iterator iterator = this.t.keySet().iterator();
       while (iterator.hasNext()) {
          str = str.append(iterator.next());
          if (iterator.hasNext()) {
             str = str.append(", ");
          }
       }
       str = str+')';
       co5.l(str, "sb.toString\(\)");
       return str;
    }
}
