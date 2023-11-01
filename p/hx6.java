package p.hx6;
import p.yf2;
import p.tg1;
import java.lang.Object;
import p.tt;
import java.util.ArrayList;
import p.jt1;
import p.aq6;
import p.ks0;
import java.util.AbstractCollection;
import p.ct1;
import com.google.common.collect.d;
import p.mt1;
import java.lang.Iterable;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Throwable;
import p.at1;
import p.eo5;

public final class hx6 implements yf2	// class@0018e1 from classes.dex
{
    public final int a;
    public final tg1 b;

    public void hx6(tg1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       hx6 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             return new at1(tb, p0);
       }
       ArrayList uArrayList = new ArrayList(2);
       if (p0.a != null) {
          uArrayList.add(new jt1(tb.D, tb.E));
       }
       p0 = p0.b;
       if (!p0.isEmpty()) {
          uArrayList.add(new ct1(p0));
       }
       if (uArrayList.isEmpty()) {
          uArrayList.add(new mt1());
       }
       return Observable.fromIterable(uArrayList);
    }
}
