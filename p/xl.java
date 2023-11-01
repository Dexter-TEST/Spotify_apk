package p.xl;
import p.w53;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.an5;
import p.ul;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.vk7;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import p.wk7;
import p.tk7;
import android.content.Context;
import p.ej4;
import p.cm;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import p.zs2;
import p.ac;
import p.jo3;
import p.ko3;
import p.b1;
import p.rt2;
import p.j8;
import java.lang.IllegalArgumentException;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewTreeObserver;
import p.wl;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import p.tp2;
import p.av2;
import p.vl;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import java.util.Objects;
import p.r02;
import com.spotify.hubs.liteintegration.HubsView;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.rm;
import p.vs3;
import p.uu2;
import p.fh5;

public abstract class xl extends Fragment implements w53	// class@002ca2 from classes.dex
{
    public cm A;
    public zs2 B;
    public j8 C;
    public String D;
    public HubsView E;
    public g54 a;
    public ac b;
    public ko3 c;
    public pm6 t;
    public final fn0 v;
    public final an5 w;
    public final an5 x;
    public final ok0 y;
    public final ok0 z;
    public static final int F;

    public void xl(){
       super();
       this.v = new fn0();
       this.w = new an5();
       this.x = new an5();
       this.y = Completable.j(new ul(this, 0));
       this.z = Completable.j(new ul(this, 1));
    }
    public final vk7 b(){
       Bundle arguments;
       String str = ((arguments = this.getArguments()) == null)? null: arguments.getString("spotify.fragment.argument.PLAYLIST_URI");
       wk7 s = (str == null)? wk7.S: new tk7(str);
       return s;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       Bundle arguments;
       ArrayList stringArrayL;
       super.onCreate(p0);
       String str = ((arguments = this.getArguments()) == null)? null: arguments.getString("spotify.fragment.argument.PLAYLIST_URI");
       this.D = str;
       if (str != null) {
          cm uocm = this.a.r(this, cm.class);
          this.A = uocm;
          if (p0 != null && (stringArrayL = p0.getStringArrayList("hiddenTracks")) != null) {
             uocm.t.addAll(stringArrayL);
          }
          this.B = new zs2(this.b, this);
          jo3 ojo3 = this.c.newBuilder(this.requireContext());
          ojo3.b("addToPlaylist", new b1(this, 1));
          ojo3.d(this);
          this.C = ojo3.a();
          return;
       }else {
          throw new IllegalArgumentException();
       }
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view = p0.inflate(R.layout.fragment_assisted_curation_card, p1, false);
       view.getViewTreeObserver().addOnGlobalLayoutListener(new wl(this));
       return view;
    }
    public final void onSaveInstanceState(Bundle p0){
       xl tA = this.A;
       tA.getClass();
       p0.putStringArrayList("hiddenTracks", new ArrayList(tA.t));
    }
    public final void onStart(){
       super.onStart();
       xl tE = this.E;
       Objects.requireNonNull(tE);
       tE = this.v;
       tE.c(tp2.i(14, this.C.i()).startWithItem(new av2(false)).switchMap(new vl(this, false)).observeOn(id.a()).subscribe(new r02(tE, 4)));
       tE.c(tp2.i(15, this.C.i()).map(new rm(8)).map(new rm(9)).subscribe(new vs3(26, this)));
       tE.c(this.w.flatMapCompletable(new vl(this, 1)).subscribe());
       xl tt = this.t;
       Objects.requireNonNull(tt);
       tE.c(this.x.map(new vl(this, 2)).observeOn(id.a()).subscribe(new vs3(27, tt)));
    }
    public final void onStop(){
       this.v.e();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       HubsView hubsView = p0.findViewById(R.id.hubs_view);
       this.E = hubsView;
       xl tC = this.C;
       hubsView.b(tC.b, tC.t);
       this.E.setHasExternalToolbar(false);
    }
    public abstract Observable u(cm p0,String p1);
}
