package p.yg0;
import android.accounts.Account;
import p.sk;
import java.lang.String;
import p.mf6;
import java.lang.Object;
import java.util.Set;
import java.util.Collections;
import java.util.Map;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import p.tp2;

public final class yg0	// class@002dae from classes.dex
{
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final mf6 g;
    public Integer h;

    public void yg0(Account p0,sk p1,String p2,String p3,mf6 p4){
       super();
       this.a = p0;
       Set set = (p1 == null)? Collections.emptySet(): Collections.unmodifiableSet(p1);
       this.b = set;
       Map map = Collections.emptyMap();
       this.d = map;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       HashSet hashSet = new HashSet(set);
       Iterator iterator = map.values().iterator();
       if (!iterator.hasNext()) {
          this.c = Collections.unmodifiableSet(hashSet);
          return;
       }else {
          tp2.v(iterator.next());
          throw null;
       }
    }
}
