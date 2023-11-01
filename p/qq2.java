package p.qq2;
import p.w53;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import p.uq2;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.jo3;
import p.ko3;
import p.j8;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import android.widget.TextView;
import com.spotify.hubs.liteintegration.HubsView;
import p.oy6;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Object;
import java.lang.String;
import p.fj3;
import p.gj3;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.sp6;
import p.uu2;
import p.fh5;
import p.q33;
import p.y46;
import android.content.res.Resources;
import java.lang.NullPointerException;
import io.reactivex.rxjava3.core.Observable;
import p.bm;
import p.bi5;
import p.av2;
import p.k12;
import p.yf2;
import p.mx6;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.z33;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.pq2;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kz6;

public class qq2 extends Fragment implements w53	// class@0023f3 from classes.dex
{
    public ko3 a;
    public g54 b;
    public gj3 c;
    public uq2 t;
    public fj3 v;
    public j8 w;
    public final fn0 x;
    public oy6 y;
    public SpotifyIconView z;
    public static final int A;

    public void qq2(){
       super();
       this.x = new fn0();
    }
    public final vk7 b(){
       return wk7.B;
    }
    public final v55 h(){
       return x55.L;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.t = this.b.r(this, uq2.class);
       jo3 ojo3 = this.a.newBuilder(this.requireContext());
       ojo3.d(this);
       this.w = ojo3.a();
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view1;
       View view2;
       View view3;
       View view = p0.inflate(R.layout.home_fragment, p1, false);
       int i = 0x7f0a020c;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a0275;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a0585;
             if ((view3 = ry7.q(view, i)) != null) {
                oy6 i1 = new oy6(view, view1, view2, view3, 11);
                this.y = i;
                fj3 uofj3 = this.c.a(i.b, "spotify:home", p2);
                this.v = uofj3;
                _monitor_enter(uofj3);
                uofj3.f = "lite/home";
                _monitor_exit(uofj3);
                oy6 v = this.y.v;
                this.z = v;
                v.setIcon(sp6.O);
                this.y.t.setHasExternalToolbar(false);
                qq2 tw = this.w;
                this.y.t.b(tw.b, tw.t);
                this.y.t.setHeaderScrollObserver(new q33(1, this));
                return this.y.b;
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroyView(){
       this.v.a();
       this.y = null;
       this.z = null;
       super.onDestroyView();
    }
    public final void onSaveInstanceState(Bundle p0){
       qq2 tv;
       if ((tv = this.v) != null) {
          tv.h(p0);
       }
       return;
    }
    public final void onStart(){
       super.onStart();
       qq2 tx = this.x;
       tx.c(this.w.i().filter(new bm(27)).startWithItem(new av2(false)).map(new k12(18)).switchMap(new mx6(14, this)).observeOn(id.a()).compose(new z33(false, this.v)).subscribe(new pq2(this, false)));
       tx.c(this.w.i().filter(new bm(28)).map(new k12(19)).map(new k12(20)).subscribe(new pq2(this, 1)));
       tx.c(ry7.e(this.z).subscribe(new pq2(this, 2)));
    }
    public final void onStop(){
       this.x.e();
       super.onStop();
    }
}
