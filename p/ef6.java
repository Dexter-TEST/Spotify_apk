package p.ef6;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import p.ye7;
import p.co5;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import p.av6;

public final class ef6	// class@001479 from classes.dex
{
    public final List a;

    public void ef6(){
       super();
       String[] stringArray = new String[]{"spotify.link","spotify.app.link","spotify-alternate.app.link","spotify.test-app.link","spotify-alternate.test-app.link"};
       this.a = ye7.K(stringArray);
    }
    public final boolean a(String p0){
       boolean b;
       co5.o(p0, "link");
       ef6 ta = this.a;
       if (!ta instanceof Collection || !ta.isEmpty()) {
          Iterator iterator = ta.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (av6.f0(p0, iterator.next())) {
                   b = true;
                   break ;
                }
             }
          }
          return b;
       }
       b = false;
    }
}
