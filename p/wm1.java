package p.wm1;
import io.reactivex.rxjava3.core.ObservableTransformer;
import android.content.Context;
import p.rf5;
import java.lang.Object;
import p.w05;
import p.vm1;
import p.zv6;
import io.reactivex.rxjava3.core.Observable;
import p.ju2;
import java.lang.String;
import p.ze5;
import com.google.common.collect.c;
import p.w51;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import p.tt2;
import java.util.HashMap;
import p.st2;
import java.lang.Enum;
import java.io.Serializable;
import p.n13;
import p.iu2;
import p.su2;
import p.ty0;
import p.k23;
import java.lang.Class;
import p.do5;
import java.util.Arrays;
import p.ys5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.um1;
import p.rg2;

public final class wm1 implements ObservableTransformer	// class@002b63 from classes.dex
{
    public final w05 a;
    public final w05 b;
    public final Observable c;
    public final Observable d;
    public final Observable e;

    public void wm1(Context p0,rf5 p1){
       super();
       this.a = new w05(p0, 1);
       this.b = new w05(p0, 2);
       this.c = Observable.defer(new vm1(p1, 0));
       this.d = Observable.defer(new vm1(p1, 1));
       this.e = Observable.defer(new vm1(p1, 2));
    }
    public static ju2 a(ju2 p0,String p1,ze5 p2){
       tt2 ott2;
       if (p0 == null) {
          return null;
       }
       w51.h(4, "initialCapacity");
       Object[] objArray = new Object[4];
       Iterator iterator = p0.j().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          ju2 oju2 = iterator.next();
          if ("primary_buttons".equals(oju2.group())) {
             String str = "click";
             if ((ott2 = oju2.m().get(str)) != null && "playFromContext".equals(ott2.name())) {
                HashMap hashMap = new HashMap(oju2.m());
                hashMap.put(str, ott2.a().a("action", p2.name()).b());
                iu2 oiu2 = oju2.a().m(hashMap);
                if (p1 != null) {
                   oiu2 = oiu2.s(ty0.z().d(p1));
                }
                oju2 = oiu2.g();
             }
          }
          oju2.getClass();
          int i1 = i + 1;
          if (objArray.length < i1) {
             objArray = Arrays.copyOf(objArray, do5.t(objArray.length, i1));
          }
          objArray[i] = oju2;
          i = i1;
       }
       return p0.a().h(c.m(i, objArray)).g();
    }
    public final ObservableSource apply(Observable p0){
       return Observable.combineLatest(p0, this.c, this.d, this.e, new um1(this)).distinctUntilChanged();
    }
}
