package p.c1;
import p.w53;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.an5;
import p.vk7;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import p.wk7;
import p.tk7;
import android.content.Context;
import p.ej4;
import p.zs2;
import p.ac;
import p.jo3;
import p.ko3;
import p.b1;
import p.rt2;
import p.j8;
import p.jl;
import androidx.fragment.app.k;
import p.et0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import android.widget.ImageButton;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.hubs.liteintegration.HubsView;
import p.uu2;
import p.fh5;
import io.reactivex.rxjava3.core.Observable;
import p.tp2;
import p.av2;
import java.lang.Object;
import p.mk4;
import p.yf2;
import p.a1;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.z0;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Completable;
import p.pp;
import p.bi5;
import p.kz6;
import p.ry7;
import p.mq5;

public abstract class c1 extends Fragment implements w53	// class@00117d from classes.dex
{
    public j8 A;
    public String B;
    public String C;
    public GlueToolbar D;
    public ImageButton E;
    public HubsView F;
    public ko3 a;
    public ac b;
    public pm6 c;
    public zg0 t;
    public hv6 v;
    public final fn0 w;
    public final an5 x;
    public final an5 y;
    public zs2 z;
    public static final int G;

    public void c1(){
       super();
       this.w = new fn0();
       this.x = new an5();
       this.y = new an5();
    }
    public final vk7 b(){
       Bundle arguments;
       String str = ((arguments = this.getArguments()) == null)? null: arguments.getString("spotify.fragment.argument.URI");
       wk7 s = (str == null)? wk7.S: new tk7(str);
       return s;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       this.z = new zs2(this.b, this);
       jo3 ojo3 = this.a.newBuilder(this.requireContext());
       ojo3.d(this);
       int i = 0;
       ojo3.b("addToPlaylist", new b1(this, i));
       this.A = ojo3.a();
       ojo3 = this.getArguments();
       String str = null;
       String str1 = (ojo3 == null)? str: ojo3.getString("spotify.fragment.argument.PLAYLIST_URI");
       this.B = str1;
       if (ojo3 != null) {
          str = ojo3.getString("spotify.fragment.argument.URI");
       }
       this.C = str;
       if (this.B != null && str != null) {
          i = true;
       }
       jl.h(i, "Missing parameters");
       if (this.B == null || this.C == null) {
          et0.d(this.getActivity());
       }
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view = p0.inflate(R.layout.fragment_assisted_curation_hubs_fragment, p1, false);
       GlueToolbarLayout glueToolbarL = view.findViewById(R.id.toolbar_layout);
       this.D = GlueToolbars.createGlueToolbar(glueToolbarL);
       ImageButton imageButton = this.getLayoutInflater().inflate(R.layout.up_button, glueToolbarL, false);
       this.E = imageButton;
       this.D.addView(ToolbarSide.START, imageButton, R.id.action_close);
       HubsView hubsView = view.findViewById(R.id.hubs_view);
       this.F = hubsView;
       c1 tA = this.A;
       hubsView.b(tA.b, tA.t);
       return view;
    }
    public final void onDestroyView(){
       this.D = null;
       this.E = null;
       this.F = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       c1 tw = this.w;
       tw.c(tp2.i(5, this.A.i()).startWithItem(new av2(false)).map(new mk4(23)).switchMap(new a1(this, false)).observeOn(id.a()).subscribe(new z0(this, 3)));
       tw.c(tp2.i(7, this.A.i()).map(new mk4(24)).flatMapSingle(new a1(this, 1)).map(new mk4(25)).observeOn(id.a()).subscribe(new z0(this, 4)));
       tw.c(this.x.flatMapCompletable(new a1(this, 2)).subscribe());
       c1 ty = this.y;
       tw.c(ty.map(new mk4(22)).observeOn(id.a()).subscribe(new z0(this, false)));
       tw.c(ty.filter(new pp(6)).observeOn(id.a()).subscribe(new z0(this, 1)));
       tw.c(ry7.e(this.E).subscribe(new z0(this, 2)));
    }
    public final void onStop(){
       this.w.e();
       super.onStop();
    }
    public abstract Completable u(String p0,String p1);
    public abstract Completable v(mq5 p0);
    public abstract Observable w(String p0,boolean p1);
}
