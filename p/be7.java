package p.be7;
import p.pb3;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.ob3;
import p.cx5;
import p.t65;
import java.util.Map;
import p.q14;
import p.yp5;
import java.lang.Class;
import p.zu5;
import p.bv5;
import p.sm2;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.TreeSet;
import java.util.Comparator;
import p.mp2;
import java.util.Collections;
import java.util.Collection;
import java.lang.Iterable;
import p.av6;

public final class be7 implements pb3	// class@0010ad from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String t;

    public void be7(String p0,String p1){
       co5.o(p0, "userAgent");
       co5.o(p1, "spotifyAppVersion");
       super();
       this.a = p0;
       this.b = "Spotify-Lite";
       this.c = p1;
       this.t = "7e7cf598605d47caba394c628e2735a2";
    }
    public final cx5 intercept(ob3 p0){
       t65[] ot65Array = new t65[]{new t65("App-Platform", "Android"),new t65("Spotify-App", this.b),new t65("Spotify-App-Version", this.c),new t65("X-Client-Id", this.t)};
       yp5 e = p0.e;
       e.getClass();
       zu5 ozu5 = new zu5(e);
       String str = "User-Agent";
       ozu5.c.g(str);
       ozu5.d(str, this.a);
       Iterator iterator = q14.o0(ot65Array).entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          str = uEntry.getKey();
          String value = uEntry.getValue();
          bv5 c = e.c;
          c.getClass();
          Comparator cASE_INSENSI = String.CASE_INSENSITIVE_ORDER;
          co5.l(cASE_INSENSI, "CASE_INSENSITIVE_ORDER");
          TreeSet treeSet = new TreeSet(cASE_INSENSI);
          int i = c.a.length / 2;
          for (int i1 = 0; i1 < i; i1 = i2) {
             int i2 = i1 + 1;
             treeSet.add(c.c(i1));
          }
          Set set = Collections.unmodifiableSet(treeSet);
          co5.l(set, "unmodifiableSet\(result\)");
          if (!set.isEmpty()) {
             Iterator iterator1 = set.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if (av6.i0(iterator1.next(), str, 1)) {
                      iterator1 = 0;
                      break ;
                   }
                }
             }
             if (set) {
                ozu5.a(str, value);
             }
          }
          set = 1;
       }
       return p0.b(ozu5.b());
    }
}
