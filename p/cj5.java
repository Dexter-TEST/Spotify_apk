package p.cj5;
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
import p.gj5;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.jo3;
import p.ko3;
import p.qj0;
import p.wd5;
import p.p77;
import java.lang.String;
import p.vt2;
import p.g02;
import p.j8;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import io.reactivex.rxjava3.core.Observable;
import p.rp;
import p.bi5;
import p.av2;
import java.lang.Object;
import p.k12;
import p.yf2;
import p.mx6;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import java.util.Objects;
import p.r02;
import com.spotify.hubs.liteintegration.HubsView;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.vs3;
import p.uu2;
import p.fh5;

public class cj5 extends Fragment implements w53	// class@00121c from classes.dex
{
    public ko3 a;
    public g54 b;
    public wd5 c;
    public p77 t;
    public gj5 v;
    public j8 w;
    public HubsView x;
    public final fn0 y;
    public static final int z;

    public void cj5(){
       super();
       this.y = new fn0();
    }
    public final vk7 b(){
       return wk7.D;
    }
    public final v55 h(){
       return x55.Q;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.v = this.b.r(this, gj5.class);
       jo3 ojo3 = this.a.newBuilder(this.requireContext());
       ojo3.d(this);
       ojo3.c(R.id.hubs_component_premium_coming_feature, "premium:comingSoon", new qj0(this.c, this.t, 0));
       ojo3.c(R.id.hubs_component_premium_feature, "premium:feature", new qj0(this.c, this.t, 1));
       ojo3.c(R.id.hubs_component_premium_upsell, "premium:upsell", new g02(2));
       ojo3.c(R.id.hubs_component_premium_text_link, "premium:textLink", new g02(1));
       this.w = ojo3.a();
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.fragment_premium, p1, false);
    }
    public final void onDestroyView(){
       this.x = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       cj5 tx = this.x;
       Objects.requireNonNull(tx);
       tx = this.y;
       tx.c(this.w.i().filter(new rp(1)).startWithItem(new av2(false)).map(new k12(27)).switchMap(new mx6(20, this)).observeOn(id.a()).subscribe(new r02(tx, 3)));
       tx.c(this.w.i().filter(new rp(2)).map(new k12(28)).map(new k12(29)).observeOn(id.a()).subscribe(new vs3(12, this)));
    }
    public final void onStop(){
       this.y.e();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       HubsView hubsView = p0.findViewById(R.id.hubs_view);
       this.x = hubsView;
       cj5 tw = this.w;
       hubsView.b(tw.b, tw.t);
       this.x.setHasExternalToolbar(false);
    }
}
