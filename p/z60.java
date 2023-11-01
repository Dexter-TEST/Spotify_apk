package p.z60;
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
import androidx.fragment.app.k;
import p.d70;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.jo3;
import p.ko3;
import p.j8;
import com.spotify.hubs.liteintegration.HubsView;
import p.uu2;
import p.fh5;
import p.kz6;
import p.ry7;
import p.y60;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import p.tp2;
import p.rm;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.av2;
import java.lang.Object;
import p.up0;
import java.util.Objects;
import p.r02;

public class z60 extends Fragment implements w53	// class@002e94 from classes.dex
{
    public ko3 a;
    public g54 b;
    public d70 c;
    public final fn0 t;
    public View v;
    public j8 w;
    public HubsView x;
    public static final int y;

    public void z60(){
       super();
       this.t = new fn0();
    }
    public final vk7 b(){
       return wk7.c;
    }
    public final v55 h(){
       return x55.E;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.c = this.b.r(this.requireActivity(), d70.class);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       jo3 ojo3 = this.a.newBuilder(this.requireContext());
       ojo3.d(this);
       this.w = ojo3.a();
       View view = p0.inflate(R.layout.fragment_browse, p1, false);
       HubsView hubsView = view.findViewById(R.id.hubs_view);
       this.x = hubsView;
       z60 tw = this.w;
       hubsView.b(tw.b, tw.t);
       this.x.setHasExternalToolbar(false);
       this.v = view.findViewById(R.id.search_text_container);
       return view;
    }
    public final void onDestroyView(){
       this.x = null;
       this.v = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       z60 tt = this.t;
       tt.c(ry7.e(this.v).subscribe(new y60(this, 0)));
       tt.c(tp2.i(19, this.w.i()).map(new rm(20)).map(new rm(21)).observeOn(id.a()).subscribe(new y60(this, 1)));
       z60 tx = this.x;
       Objects.requireNonNull(tx);
       tt.c(tp2.i(20, this.w.i()).startWithItem(new av2(0)).map(new rm(22)).switchMap(new up0(17, this)).observeOn(id.a()).subscribe(new r02(tx, 5)));
    }
    public final void onStop(){
       this.t.e();
       super.onStop();
    }
}
