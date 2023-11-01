package p.m42;
import p.kf7;
import android.content.Context;
import p.vg0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.o26;
import p.ay6;
import p.wf2;
import p.ts6;
import java.util.SortedMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import p.av6;
import java.util.Map;

public final class m42 extends kf7	// class@001e20 from classes.dex
{
    public final Context b;
    public final vg0 c;
    public final ay6 d;

    public void m42(Context p0,vg0 p1){
       co5.o(p0, "context");
       co5.o(p1, "clientInfo");
       super();
       this.b = p0;
       this.c = p1;
       this.d = new ay6(new o26(8, this));
    }
    public final ts6 a(String p0){
       Object obj;
       ts6 y;
       ts6 ots6;
       co5.o(p0, "path");
       m42 td = this.d;
       Set set = td.getValue().keySet();
       co5.l(set, "dirsAndTypeLazy.keys");
       Iterator iterator = set.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             Object obj1 = obj;
             co5.l(obj1, "it");
             if (!av6.D0(p0, obj1, false)) {
                continue ;
             }
          }else {
             obj = null;
          }
          y = ts6.y;
          if (obj != null && (ots6 = td.getValue().get(obj)) != null) {
             y = ots6;
             break ;
          }
          break ;
       }
       return y;
    }
}
