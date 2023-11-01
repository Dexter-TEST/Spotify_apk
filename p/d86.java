package p.d86;
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
import p.f86;
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
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import android.widget.ImageButton;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.hubs.liteintegration.HubsView;
import p.uu2;
import p.fh5;
import java.lang.String;
import android.os.BaseBundle;
import io.reactivex.rxjava3.core.Observable;
import p.ab0;
import p.bi5;
import p.av2;
import java.lang.Object;
import p.i76;
import p.yf2;
import p.ws3;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.c86;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kz6;
import p.ry7;
import p.up0;

public class d86 extends Fragment implements w53	// class@0012fc from classes.dex
{
    public ko3 a;
    public g54 b;
    public zg0 c;
    public f86 t;
    public j8 v;
    public final fn0 w;
    public GlueToolbar x;
    public ImageButton y;
    public HubsView z;
    public static final int A;

    public void d86(){
       super();
       this.w = new fn0();
    }
    public final vk7 b(){
       return wk7.F;
    }
    public final v55 h(){
       return x55.T;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.t = this.b.r(this.requireActivity(), f86.class);
       jo3 ojo3 = this.a.newBuilder(this.requireContext());
       ojo3.d(this);
       this.v = ojo3.a();
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view = p0.inflate(R.layout.fragment_search_see_more, p1, false);
       GlueToolbarLayout glueToolbarL = view.findViewById(R.id.toolbar_layout);
       this.x = GlueToolbars.createGlueToolbar(glueToolbarL);
       ImageButton imageButton = this.getLayoutInflater().inflate(R.layout.up_button, glueToolbarL, false);
       this.y = imageButton;
       this.x.addView(ToolbarSide.START, imageButton, R.id.action_close);
       HubsView hubsView = view.findViewById(R.id.hubs_view);
       this.z = hubsView;
       d86 tv = this.v;
       hubsView.b(tv.b, tv.t);
       return view;
    }
    public final void onDestroyView(){
       this.x = null;
       this.y = null;
       this.z = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       Bundle arguments = this.getArguments();
       String str = null;
       String str1 = (arguments == null)? str: arguments.getString("spotify.fragment.argument.TYPE");
       if (arguments != null) {
          str = arguments.getString("spotify.fragment.argument.QUERY");
       }
       d86 tw = this.w;
       tw.c(this.v.i().filter(new ab0(0)).startWithItem(new av2(0)).map(new i76(8)).switchMap(new ws3(this, str1, str, 8)).observeOn(id.a()).subscribe(new c86(this, 0)));
       tw.c(ry7.e(this.y).subscribe(new c86(this, 1)));
       tw.c(this.v.i().filter(new ab0(1)).map(new i76(9)).flatMapSingle(new up0(19, this)).subscribe(new c86(this, 2)));
       return;
    }
    public final void onStop(){
       this.w.e();
       super.onStop();
    }
}
