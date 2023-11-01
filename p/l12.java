package p.l12;
import p.ln6;
import p.w53;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.v55;
import p.x55;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import androidx.fragment.app.k;
import p.p12;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.jo3;
import p.ko3;
import p.w02;
import java.lang.String;
import p.vt2;
import p.x05;
import p.wd5;
import p.p77;
import p.j8;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import com.spotify.hubs.liteintegration.HubsView;
import p.zk;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Object;
import android.content.res.Resources;
import java.lang.NullPointerException;
import io.reactivex.rxjava3.core.Observable;
import p.bm;
import p.bi5;
import p.av2;
import p.mx6;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import java.util.Objects;
import p.r02;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fx6;
import p.k12;
import p.j12;
import p.uu2;
import p.fh5;

public abstract class l12 extends Fragment implements ln6, w53	// class@001cc2 from classes.dex
{
    public wd5 a;
    public p77 b;
    public ko3 c;
    public g54 t;
    public p12 v;
    public j8 w;
    public final fn0 x;
    public zk y;
    public static final int z;

    public void l12(){
       super();
       this.x = new fn0();
    }
    public final v55 h(){
       return x55.J;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       this.v = this.t.r(this.requireActivity(), p12.class);
       jo3 ojo3 = this.c.newBuilder(this.requireContext());
       ojo3.d(this);
       ojo3.c(R.id.hubs_favorite_button, "favorites:button", new w02(0));
       ojo3.c(R.id.hubs_favorite_button_2lines, "favorites:button2", new w02(1));
       ojo3.c(R.id.hubs_offlined_favorite_row, "entity:favoritesRow", new x05(this.requireContext(), this.a, this.b));
       this.w = ojo3.a();
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       HubsView hubsView;
       View view = p0.inflate(R.layout.favorites_fragment, p1, false);
       int i = 0x7f0a0275;
       if ((hubsView = ry7.q(view, i)) == null) {
          throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
       }
       zk ozk = new zk(view, hubsView);
       this.y = ozk;
       return ozk.a;
    }
    public final void onDestroyView(){
       this.y = null;
       super.onDestroyView();
    }
    public void onStart(){
       super.onStart();
       zk b = this.y.b;
       Objects.requireNonNull(b);
       l12 tx = this.x;
       tx.c(this.w.i().filter(new bm(15)).startWithItem(new av2(false)).switchMap(new mx6(11, this)).observeOn(id.a()).distinctUntilChanged().subscribe(new r02(b, 2)));
       tx.c(this.w.i().filter(new bm(16)).map(new fx6(29)).map(new k12(false)).subscribe(new j12(this, 1)));
       tx.c(this.w.i().filter(new bm(17)).map(new k12(1)).map(new k12(2)).observeOn(id.a()).subscribe(new j12(this, false)));
    }
    public final void onStop(){
       this.x.e();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       l12 tw = this.w;
       this.y.b.b(tw.b, tw.t);
       this.y.b.setHasExternalToolbar(false);
    }
    public abstract Observable u();
}
