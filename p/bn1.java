package p.bn1;
import io.reactivex.rxjava3.core.ObservableTransformer;
import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import java.lang.String;
import p.ju2;
import p.iu2;
import p.au2;
import p.l03;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import p.ys5;
import p.k23;
import io.reactivex.rxjava3.core.ObservableSource;
import p.up0;
import p.w00;
import com.google.common.collect.c;
import p.d73;
import java.util.Iterator;
import p.ry7;
import p.tt2;
import p.a73;

public final class bn1 implements ObservableTransformer	// class@0010f8 from classes.dex
{
    public final int a;
    public final Observable b;
    public final Object c;

    public void bn1(Context p0,Observable p1){
       this.a = 1;
       super();
       this.c = p0;
       this.b = p1;
    }
    public void bn1(Observable p0,String p1){
       this.a = 0;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final ju2 a(ju2 p0){
       iu2 oiu2 = p0.a().c(l03.a(true));
       Map map = p0.m();
       if (map.containsKey("click")) {
          HashMap hashMap = new HashMap(map);
          hashMap.remove("click");
          oiu2 = oiu2.m(hashMap);
       }
       return oiu2.h(this.b(p0.j())).g();
    }
    public final ObservableSource apply(Observable p0){
       bn1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return Observable.combineLatest(p0, tb, new up0(6, this));
       }
       return Observable.combineLatest(p0, tb, new up0(5, this));
    }
    public final ys5 b(List p0){
       tt2 ott2;
       d73 uod73 = new d73();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ju2 oju2 = iterator.next();
          String str = ry7.C(oju2);
          String str1 = ((ott2 = oju2.m().get("click")) != null && "navigate".equals(ott2.name()))? ott2.b().q("uri"): null;
          if (str == null && (str1 == null && str1.equals(this.c))) {
             uod73.D0(oju2);
          }
          uod73.D0(this.a(oju2));
       }
       return uod73.I0();
    }
}
