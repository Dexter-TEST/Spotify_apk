package p.km;
import p.w53;
import androidx.fragment.app.Fragment;
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
import p.cn;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.zs2;
import p.ac;
import p.jl;
import androidx.fragment.app.k;
import p.et0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.tl;
import java.util.ArrayList;
import p.kz6;
import p.ry7;
import p.jm;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import p.aq6;
import p.td7;
import java.util.Map;
import java.util.Collections;
import io.reactivex.rxjava3.core.Single;
import p.zp3;
import p.d16;
import p.yf2;
import p.am0;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import p.tp2;
import p.rm;
import p.up0;
import p.bi5;
import p.pp;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.t34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.f37;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.IllegalArgumentException;
import androidx.viewpager2.widget.ViewPager2;
import p.yq5;
import com.spotify.legacyglue.widgetstate.ViewPagerIndicator;

public class km extends Fragment implements w53	// class@001c44 from classes.dex
{
    public boolean A;
    public tl B;
    public final fn0 a;
    public g54 b;
    public ac c;
    public cn t;
    public zs2 v;
    public View w;
    public ViewPager2 x;
    public ViewPagerIndicator y;
    public String z;
    public static final int C;

    public void km(){
       super();
       this.a = new fn0();
    }
    public final vk7 b(){
       Bundle arguments;
       String str = ((arguments = this.getArguments()) == null)? null: arguments.getString("spotify.fragment.argument.PLAYLIST_URI");
       wk7 s = (str == null)? wk7.S: new tk7(str);
       return s;
    }
    public final v55 h(){
       return x55.t;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       Bundle arguments;
       super.onCreate(p0);
       this.t = this.b.r(this, cn.class);
       this.v = new zs2(this.c, this);
       String str = ((arguments = this.getArguments()) == null)? null: arguments.getString("spotify.fragment.argument.PLAYLIST_URI");
       this.z = str;
       boolean b = false;
       boolean b1 = (str != null)? true: false;
       jl.h(b1, "Missing parameter");
       if (this.z == null) {
          et0.d(this.getActivity());
       }
       if (p0 == null) {
          b = true;
       }
       this.A = b;
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.fragment_assisted_curation, p1, false);
    }
    public final void onDestroyView(){
       super.onDestroyView();
       this.w = null;
       this.x = null;
       this.y = null;
    }
    public final void onSaveInstanceState(Bundle p0){
       km tB;
       if ((tB = this.B) != null) {
          p0.putInt("adapter.counter", tB.D);
          p0.putParcelableArrayList("adapter.cards", tB.E);
       }
       return;
    }
    public final void onStart(){
       aq6 uoaq61;
       super.onStart();
       int i = 0;
       km ta = this.a;
       ta.c(ry7.e(this.w).subscribe(new jm(this, i)));
       km tt = this.t;
       km tz = this.z;
       km tA = this.A;
       tt.getClass();
       aq6 uoaq6 = td7.d(tz);
       cn v = tt.v;
       Observable observable = (uoaq6 != null && (uoaq6 = uoaq6.t) != null)? v.e(uoaq6, Collections.emptyMap()).flatMapObservable(new d16(tz, 3)): Observable.empty();
       Observable observable1 = (tA != null)? Observable.empty().mergeWith(Completable.j(new am0(28, tt))): tt.t;
       observable1 = tp2.i(12, observable1).map(new rm(7)).filter(new up0(2, tz)).flatMap(new d16(tz, 4));
       String str = ((uoaq61 = td7.d(tz)) == null)? null: uoaq61.t;
       if (str != null) {
          Maybe maybe = v.d(str, Collections.emptyMap()).filter(new pp(13));
          maybe.getClass();
          t34 ot34 = new t34(maybe, id.a(), i);
          ta.c(Observable.merge(Observable.empty().onErrorResumeWith(Observable.empty()), observable1.onErrorResumeWith(Observable.empty()), observable.onErrorResumeWith(Observable.empty()), new f37(ot34, 4, new d16(tz, 5)).onErrorResumeWith(Observable.empty())).observeOn(id.a()).subscribe(new jm(this, 1)));
          this.A = i;
          ta.c(new ok0(1, new up0(10, this)).subscribe());
          return;
       }else {
          throw new IllegalArgumentException(tz);
       }
    }
    public final void onStop(){
       this.a.e();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       this.w = p0.findViewById(R.id.search_text_container);
       this.B = new tl(this, p1);
       ViewPager2 viewPager2 = p0.findViewById(R.id.viewpager);
       this.x = viewPager2;
       viewPager2.setAdapter(this.B);
       ViewPagerIndicator viewPagerInd = p0.findViewById(R.id.page_indicator);
       this.y = viewPagerInd;
       viewPagerInd.setupWithViewPager(this.x);
    }
}
