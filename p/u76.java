package p.u76;
import p.w53;
import androidx.fragment.app.Fragment;
import p.qj2;
import p.an5;
import p.fn0;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import p.w86;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.jo3;
import p.ko3;
import p.m76;
import java.lang.String;
import p.rt2;
import p.j8;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import p.co5;
import p.a96;
import com.spotify.litecomponents.widgets.view.LiteSearchView;
import io.reactivex.rxjava3.core.Observable;
import p.rm;
import p.yf2;
import p.tp2;
import android.widget.TextView;
import p.zf2;
import p.f37;
import p.ap5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.i76;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.j76;
import java.util.List;
import java.util.Arrays;
import java.lang.Iterable;
import java.util.Objects;
import p.k76;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.q06;
import p.pb4;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.id;
import p.l76;
import p.ir0;
import p.kz6;
import p.ry7;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.hubs.liteintegration.HubsView;
import p.ha5;
import p.m5;
import p.uu2;
import p.fh5;

public class u76 extends Fragment implements w53	// class@00285a from classes.dex
{
    public ViewGroup A;
    public HubsView B;
    public ko3 a;
    public g54 b;
    public zg0 c;
    public final an5 t;
    public final an5 v;
    public w86 w;
    public j8 x;
    public final fn0 y;
    public LiteSearchView z;
    public static final qj2 C;

    static {
       u76.C = new qj2(2);
    }
    public void u76(){
       super();
       this.t = new an5();
       this.v = new an5();
       this.y = new fn0();
    }
    public final vk7 b(){
       return wk7.E;
    }
    public final v55 h(){
       return x55.S;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.w = this.b.r(this, w86.class);
       jo3 ojo3 = this.a.newBuilder(this.requireContext());
       ojo3.d(this);
       ojo3.b("delete", new m76(this, 0));
       ojo3.b("deleteAll", new m76(this, 1));
       this.x = ojo3.a();
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.fragment_search, p1, false);
    }
    public final void onDestroyView(){
       super.onDestroyView();
       this.z = null;
       this.A = null;
       this.B = null;
    }
    public final void onStart(){
       super.onStart();
       u76 tz = this.z;
       co5.q(tz, "$this$queryTextChangeEvents");
       Observable observable = new a96(tz).share();
       kz6 Observable observable1 = Observable.merge(tp2.i(26, this.x.i()), ap5.m(this.z.getSearchEditText(), u76.C)).share();
       Observable[] observableAr = new Observable[]{observable.map(new i76(4)).debounce(500, TimeUnit.MILLISECONDS, s36.b).distinctUntilChanged().map(new i76(5)),tp2.i(28, tp2.i(27, this.x.i()).map(new i76(6))).map(new j76(this, 2)),tp2.i(23, tp2.i(29, this.x.i()).map(new i76(7)).map(new rm(27))).map(new rm(28)),tp2.i(24, this.x.i()).map(new rm(29)).map(new i76(0)),observable1.map(new j76(this, 0)),tp2.i(25, observable.map(new rm(26)).share()).map(new i76(1)),this.t.map(new i76(2)),this.v.map(new i76(3))};
       u76 tw = this.w;
       Objects.requireNonNull(tw);
       tw = this.y;
       tw.c(Observable.merge(Arrays.asList(observableAr)).flatMapCompletable(new k76(tw, 0)).subscribe());
       tz = this.w;
       tw.c(Observable.create(new q06(tz.B, tz.y)).distinctUntilChanged().observeOn(id.a()).subscribe(new l76(this, 0)));
       observable = observable1.observeOn(id.a());
       tw.c(observable.subscribe(new l76(this, 1)));
       tw.c(this.w.z.hide().observeOn(id.a()).subscribe(new l76(this, 2)));
       tw.c(this.w.A.hide().observeOn(id.a()).subscribe(new l76(this, 3)));
       tw.c(ry7.e(this.z.getSearchIconView()).map(new j76(this, 1)).observeOn(id.a()).subscribe(new l76(this, 4)));
       RecyclerView recyclerView = this.B.getRecyclerView();
       co5.q(recyclerView, "$this$scrollStateChanges");
       observable1 = new kz6(recyclerView);
       tw.c(observable1.subscribe(new l76(this, 5)));
       tw.c(new m5(0, new ha5(22, this)));
    }
    public final void onStop(){
       super.onStop();
       this.y.e();
    }
    public final void onViewCreated(View p0,Bundle p1){
       this.z = p0.findViewById(R.id.search_view);
       this.A = p0.findViewById(R.id.search_initial_state);
       HubsView hubsView = p0.findViewById(R.id.hubs_view);
       this.B = hubsView;
       u76 tx = this.x;
       hubsView.b(tx.b, tx.t);
    }
}
