package p.kz6;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import p.co5;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import io.reactivex.rxjava3.core.Observer;
import java.util.stream.Stream;
import p.jl1;
import java.util.Iterator;
import p.k11;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.AutoCloseable;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.mt4;
import p.kg4;
import io.reactivex.rxjava3.core.ObservableSource;
import p.bn5;
import p.lt4;
import p.iv6;
import java.lang.Iterable;
import p.kt4;
import java.util.Objects;
import p.gt4;
import java.lang.NullPointerException;
import p.tp2;
import p.jr4;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.MaybeSource;
import p.c44;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.c82;
import p.it4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CompletionStage;
import p.zo4;
import p.tu6;
import p.xg7;
import android.view.View$OnClickListener;
import p.es5;
import p.mr5;
import p.jz6;
import java.util.ArrayList;
import p.mz6;
import p.cz6;
import p.wh3;
import java.lang.Class;
import java.lang.RuntimeException;
import io.reactivex.rxjava3.core.SingleSource;
import p.vk6;
import io.reactivex.rxjava3.core.SingleObserver;

public final class kz6 extends Observable	// class@001cb3 from classes.dex
{
    public final int a;
    public final Object b;

    public void kz6(int p0,Object p1){
       this.a = p0;
       super();
       this.b = p1;
    }
    public void kz6(View p0){
       this.a = 2;
       co5.q(p0, "view");
       super();
       this.b = p0;
    }
    public void kz6(RecyclerView p0){
       this.a = 1;
       co5.q(p0, "view");
       super();
       this.b = p0;
    }
    public void kz6(TabLayout p0){
       this.a = 0;
       super();
       this.b = p0;
    }
    public static void a(Observer p0,Stream p1){
       jl1 a = jl1.a;
       Iterator iterator = k11.p(p1);
       if (!iterator.hasNext()) {
          p0.onSubscribe(a);
          p0.onComplete();
          p1.close();
          return;
       }else {
          mt4 omt4 = new mt4(p0, iterator, p1);
          p0.onSubscribe(omt4);
          omt4.a();
          return;
       }
    }
    public final void subscribeActual(Observer p0){
       int selectedTabP;
       cz6 uocz6;
       gt4 a;
       object oobject;
       String str = "observer";
       kz6 tb = this.b;
       switch (this.a){
           case 0:
             co5.q(p0, str);
             if (tu6.i(p0)) {
                jz6 ojz6 = new jz6(tb, p0);
                p0.onSubscribe(ojz6);
                TabLayout b0 = tb.b0;
                if (!b0.contains(ojz6)) {
                   b0.add(ojz6);
                }
                if ((selectedTabP = tb.getSelectedTabPosition()) != -1) {
                   if ((uocz6 = tb.f(selectedTabP)) != null) {
                      p0.onNext(new mz6(tb, uocz6));
                   }else {
                      wh3 owh3 = new wh3();
                      co5.G(co5.class.getName(), owh3);
                      throw owh3;
                   }
                }
             }
             return;
             break;
           case 1:
             co5.q(p0, str);
             if (tu6.i(p0)) {
                es5 uoes5 = new es5(tb, p0);
                p0.onSubscribe(uoes5);
                tb.i(uoes5.c);
             }
             return;
             break;
           case 2:
             co5.q(p0, str);
             if (tu6.i(p0)) {
                xg7 oxg7 = new xg7(tb, p0);
                p0.onSubscribe(oxg7);
                tb.setOnClickListener(oxg7);
             }
             return;
             break;
           case 3:
             c82 uoc82 = new c82(1);
             it4 oit4 = new it4(p0, uoc82);
             uoc82.lazySet(oit4);
             p0.onSubscribe(oit4);
             zo4.w(tb, uoc82);
             return;
           case 4:
             kz6.a(p0, tb);
             return;
           case 5:
             tb.subscribe(new c44(p0));
             return;
           case 6:
             jr4 ojr4 = new jr4(p0);
             p0.onSubscribe(ojr4);
             tb.subscribe(ojr4);
             return;
             break;
           case 7:
             gt4 ogt4 = new gt4(p0, tb);
             p0.onSubscribe(ogt4);
             if (ogt4.t == null) {
                int len = tb.length;
                int i = 0;
                while (true) {
                   a = ogt4.a;
                   if (i < len && !ogt4.isDisposed()) {
                      if ((oobject = tb[i]) == null) {
                         a.onError(new NullPointerException(tp2.l("The element at index ", i, " is null")));
                         break ;
                      }else {
                         a.onNext(oobject);
                         i = i + 1;
                      }
                   }else if(!ogt4.isDisposed()){
                      a.onComplete();
                      break ;
                   }
                }
             }
             return;
             break;
           case 8:
             jl1 a1 = jl1.a;
             Iterator iterator = tb.iterator();
             if (!iterator.hasNext()) {
                p0.onSubscribe(a1);
                p0.onComplete();
             }else {
                kt4 okt4 = new kt4(p0, iterator);
                p0.onSubscribe(okt4);
                if (okt4.c == null) {
                   while (!okt4.isDisposed()) {
                      Object obj = iterator.next();
                      Objects.requireNonNull(obj, "The iterator returned a null value");
                      p0.onNext(obj);
                      if (!okt4.isDisposed()) {
                         if (!iterator.hasNext()) {
                            if (!okt4.isDisposed()) {
                               p0.onComplete();
                               break ;
                            }
                         }
                      }
                   }
                }
             }
             return;
             break;
           case 9:
             tb.subscribe(new lt4(p0));
             return;
           case 10:
             tb.subscribe(p0);
             return;
           default:
             tb.subscribe(new vk6(p0));
             return;
       }
    }
}
