package p.sm;
import p.w53;
import androidx.fragment.app.Fragment;
import p.qj2;
import p.an5;
import p.fn0;
import p.vk7;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import p.wk7;
import p.tk7;
import p.v55;
import p.x55;
import android.content.Context;
import p.ej4;
import java.lang.Object;
import p.jl;
import androidx.fragment.app.k;
import p.et0;
import p.wm;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.jo3;
import p.ko3;
import p.nm;
import p.rt2;
import p.j8;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.spotify.litecomponents.widgets.view.LiteSearchView;
import com.spotify.hubs.liteintegration.HubsView;
import p.uu2;
import p.fh5;
import p.co5;
import p.a96;
import io.reactivex.rxjava3.core.Observable;
import p.mk4;
import p.yf2;
import p.tp2;
import android.widget.TextView;
import p.zf2;
import p.f37;
import p.ap5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.rm;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.qm;
import java.util.List;
import java.util.Arrays;
import java.lang.Iterable;
import java.util.Objects;
import p.om;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.q06;
import p.pb4;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.id;
import p.pm;
import p.ir0;
import p.kz6;
import p.ry7;
import androidx.recyclerview.widget.RecyclerView;
import p.ha5;
import p.m5;

public class sm extends Fragment implements w53	// class@00265d from classes.dex
{
    public LiteSearchView A;
    public ViewGroup B;
    public HubsView C;
    public ko3 a;
    public g54 b;
    public pm6 c;
    public zg0 t;
    public final an5 v;
    public final an5 w;
    public final fn0 x;
    public wm y;
    public j8 z;
    public static final qj2 D;

    static {
       sm.D = new qj2(1);
    }
    public void sm(){
       super();
       this.v = new an5();
       this.w = new an5();
       this.x = new fn0();
    }
    public final vk7 b(){
       Bundle arguments;
       String str = ((arguments = this.getArguments()) == null)? null: arguments.getString("spotify.fragment.argument.PLAYLIST_URI");
       wk7 s = (str == null)? wk7.S: new tk7(str);
       return s;
    }
    public final v55 h(){
       return x55.A;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       p0 = this.getArguments();
       String str = "spotify.fragment.argument.PLAYLIST_URI";
       int i = (p0 == null)? 0: p0.getString(str);
       int i1 = 0;
       boolean b = (i != null)? true: false;
       Object[] objArray = new Object[]{str};
       jl.i(b, "Missing value for %s", objArray);
       if (i == null) {
          et0.d(this.getActivity());
       }
       this.y = this.b.r(this, wm.class);
       jo3 ojo3 = this.a.newBuilder(this.requireContext());
       ojo3.d(this);
       ojo3.b("addToPlaylist", new nm(this, i1));
       ojo3.b("deleteAll", new nm(this, 1));
       this.z = ojo3.a();
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view = p0.inflate(R.layout.fragment_assisted_curation_search, p1, false);
       this.A = view.findViewById(R.id.search_view);
       this.B = view.findViewById(R.id.search_initial_state);
       HubsView hubsView = view.findViewById(R.id.hubs_view);
       this.C = hubsView;
       sm tz = this.z;
       hubsView.b(tz.b, tz.t);
       return view;
    }
    public final void onDestroyView(){
       this.A = null;
       this.B = null;
       this.C = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       sm tA = this.A;
       co5.q(tA, "$this$queryTextChangeEvents");
       Observable observable = new a96(tA).share();
       Observable[] observableAr = new Observable[]{observable.map(new rm(0)).debounce(500, TimeUnit.MILLISECONDS, s36.b).distinctUntilChanged().map(new rm(1)),tp2.i(10, this.z.i()).map(new rm(2)).map(new qm(this, 1)),tp2.i(11, observable.map(new mk4(26)).share()).map(new rm(3)),this.v.map(new rm(4)),this.w.map(new mk4(27))};
       sm ty = this.y;
       Objects.requireNonNull(ty);
       ty = this.x;
       ty.c(Observable.merge(Arrays.asList(observableAr)).flatMapCompletable(new om(ty, 0)).subscribe());
       tA = this.y;
       ty.c(Observable.create(new q06(tA.F, tA.A)).distinctUntilChanged().observeOn(id.a()).subscribe(new pm(this, 0)));
       ty.c(Observable.merge(tp2.i(8, this.z.i()), ap5.m(this.A.getSearchEditText(), sm.D)).observeOn(id.a()).subscribe(new pm(this, 1)));
       ty.c(this.y.B.hide().observeOn(id.a()).subscribe(new pm(this, 2)));
       ty.c(this.y.D.hide().observeOn(id.a()).subscribe(new pm(this, 3)));
       ty.c(this.y.C.hide().observeOn(id.a()).subscribe(new pm(this, 4)));
       ty.c(this.y.E.map(new mk4(28)).observeOn(id.a()).subscribe(new pm(this, 5)));
       ty.c(tp2.i(9, this.y.E.map(new mk4(29))).observeOn(id.a()).subscribe(new pm(this, 6)));
       ty.c(ry7.e(this.A.getSearchIconView()).map(new qm(this, 0)).observeOn(id.a()).subscribe(new pm(this, 7)));
       RecyclerView recyclerView = this.C.getRecyclerView();
       co5.q(recyclerView, "$this$scrollStateChanges");
       kz6 okz6 = new kz6(recyclerView);
       ty.c(okz6.subscribe(new pm(this, 8)));
       ty.c(new m5(0, new ha5(19, this)));
    }
    public final void onStop(){
       this.x.e();
       super.onStop();
    }
}
