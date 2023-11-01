package p.h94;
import p.g94;
import java.lang.Object;
import java.util.Collection;
import io.reactivex.rxjava3.core.Observable;
import p.dt5;
import com.google.common.collect.d;
import com.google.common.collect.c;
import java.util.List;
import p.ys5;
import p.ik;
import java.util.Iterator;
import p.aq6;
import p.i1;
import java.util.Map;
import java.util.ArrayList;
import java.lang.AssertionError;
import p.l1;
import java.lang.Iterable;
import p.ab2;
import p.rp;
import p.jg2;
import p.e16;
import p.yf2;
import p.cw0;
import p.xv0;
import io.reactivex.rxjava3.core.ObservableTransformer;

public final class h94 implements g94	// class@001808 from classes.dex
{
    public final int a;
    public final Object b;

    public void h94(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Observable a(Collection p0){
       Observable observable;
       Collection uCollection;
       int i;
       switch (this.a){
           case 0:
             break;
           default:
             h94 tb = this.b;
             return tb.J.a(p0).compose(new xv0(tb, 0));
       }
       if (p0.isEmpty()) {
          observable = Observable.just(dt5.x);
       }else {
          c uoc = d.o(p0).a();
          if (uoc.isEmpty()) {
             observable = Observable.just(ys5.v);
          }else {
             ik oik = new ik();
             Iterator iterator = uoc.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   aq6 uoaq6 = iterator.next();
                   aq6 b = uoaq6.b;
                   if ((uCollection = oik.c.get(b)) == null) {
                      ArrayList uArrayList = new ArrayList(oik.v);
                      if (uArrayList.add(uoaq6)) {
                         i = oik.t + 1;
                         oik.t = i;
                         oik.c.put(b, uArrayList);
                      }else {
                         throw new AssertionError("New Collection violated the Collection spec");
                      }
                   }else if(uCollection.add(uoaq6)){
                      i = oik.t + 1;
                      oik.t = i;
                   }
                }else {
                   observable = Observable.merge(ab2.b(oik.a().b()).m(new rp(16)).d());
                }
             }
          }
          observable = observable.flatMapSingle(new e16(13, this));
       }
       return observable;
    }
}
