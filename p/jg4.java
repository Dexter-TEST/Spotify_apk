package p.jg4;
import p.dh4;
import p.eh4;
import p.gg4;
import p.ig4;
import java.util.List;
import p.ng4;
import java.util.Iterator;
import java.lang.Object;
import p.qf4;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;
import p.co5;
import java.lang.IllegalArgumentException;
import p.tp2;
import p.uf4;
import android.os.Bundle;
import p.ye7;

public class jg4 extends dh4	// class@001acf from classes.dex
{
    public final eh4 c;

    public void jg4(eh4 p0){
       super();
       this.c = p0;
    }
    public final gg4 a(){
       return new ig4(this);
    }
    public final void d(List p0,ng4 p1){
       String str;
       gg4 y;
       gg4 c1;
       gg4 ogg4;
       ig4 e1;
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          qf4 oqf4 = iterator.next();
          qf4 b = oqf4.b;
          ig4 c = b.C;
          ig4 e = b.E;
          int i = (c == null && e == null)? 0: 1;
          if (!i) {
             str = "no start destination defined via app:startDestination for ";
             if ((y = b.y) != null) {
                if ((c1 = b.c) == null) {
                   c1 = String.valueOf(y);
                   break ;
                }
             }else {
                c1 = "the root navigation";
                break ;
             }
             break ;
          }else if(e != null){
             ogg4 = b.n(e, false);
          }else {
             ogg4 = b.m(c, false);
          }
          if (ogg4 == null) {
             if (b.D == null) {
                if ((e1 = b.E) == null) {
                   e1 = String.valueOf(b.C);
                }
                b.D = e1;
             }
             e1 = b.D;
             co5.i(e1);
             throw new IllegalArgumentException(tp2.m("navigation destination ", e1, " is not a direct child of this NavGraph"));
          }else {
             this.c.b(ogg4.a).d(ye7.J(this.b().b(ogg4, ogg4.b(oqf4.c))), p1);
          }
       }
       throw new IllegalStateException(str+c1.toString());
    }
}
