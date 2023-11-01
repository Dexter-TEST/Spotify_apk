package p.xo5;
import p.dr0;
import p.mm2;
import p.ll1;
import java.lang.String;
import java.util.List;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import p.pl;
import java.lang.Integer;
import p.dj0;

public final class xo5	// class@002cba from classes.dex
{
    public final mm2 a;
    public final Map b;
    public static final xo5 c;

    static {
       dr0 uodr0 = new dr0(20, 0);
       mm2 uodr01 = new mm2("", -1, ll1.a, -1);
       xo5.c = dr0.c(uodr0);
    }
    public void xo5(mm2 p0,LinkedHashMap p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Set a(){
       Collection uCollection = this.b.values();
       ArrayList uArrayList = new ArrayList(aj0.b0(uCollection));
       Iterator iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(Integer.valueOf((int)iterator.next().f));
       }
       return dj0.F0(uArrayList);
    }
}
