package p.x33;
import p.w53;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.vk7;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import java.lang.Class;
import java.lang.Object;
import p.tk7;
import p.v55;
import p.x55;
import android.content.Context;
import p.ej4;
import androidx.fragment.app.k;
import p.f43;
import p.ej7;
import p.vi7;
import p.g54;
import p.jo3;
import p.ko3;
import p.j8;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import com.spotify.hubs.liteintegration.HubsView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import p.nq5;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import p.uu2;
import p.fh5;
import p.q33;
import p.y46;
import android.content.res.Resources;
import java.lang.NullPointerException;
import io.reactivex.rxjava3.core.Observable;
import p.ab0;
import p.bi5;
import p.av2;
import p.vc5;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.w33;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kz6;
import p.sd5;

public class x33 extends Fragment implements w53	// class@002bfd from classes.dex
{
    public ko3 a;
    public g54 b;
    public final fn0 c;
    public f43 t;
    public j8 v;
    public GlueToolbar w;
    public View x;
    public nq5 y;
    public static final int z;

    public void x33(){
       super();
       this.c = new fn0();
    }
    public final vk7 b(){
       Bundle arguments;
       String str = ((arguments = this.getArguments()) == null)? null: arguments.getString("spotify.fragment.argument.URI");
       str.getClass();
       return new tk7(str);
    }
    public final v55 h(){
       return x55.M;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.t = this.b.r(this.requireActivity(), f43.class);
       jo3 ojo3 = this.a.newBuilder(this.requireContext());
       ojo3.d(this);
       this.v = ojo3.a();
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       HubsView hubsView;
       GlueToolbarLayout glueToolbarL;
       boolean b = false;
       View view = p0.inflate(R.layout.hubs_view_fragment, p1, b);
       int i = 0x7f0a0275;
       if ((hubsView = ry7.q(view, i)) != null) {
          i = 0x7f0a0638;
          if ((glueToolbarL = ry7.q(view, i)) != null) {
             nq5 onq5 = new nq5(view, hubsView, glueToolbarL);
             this.y = onq5;
             this.w = GlueToolbars.createGlueToolbar(onq5.c);
             view = this.getLayoutInflater().inflate(R.layout.up_button, this.y.c, b);
             this.x = view;
             this.w.addView(ToolbarSide.START, view, R.id.action_close);
             x33 tv = this.v;
             this.y.b.b(tv.b, tv.t);
             this.y.b.setHeaderScrollObserver(new q33(5, this));
             return this.y.a;
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroyView(){
       this.y = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       x33 tc = this.c;
       tc.c(this.v.i().filter(new ab0(21)).startWithItem(new av2(false)).switchMap(new vc5(5, this)).observeOn(id.a()).subscribe(new w33(this, false)));
       tc.c(ry7.e(this.x).subscribe(new w33(this, 1)));
       tc.c(this.v.i().filter(new ab0(22)).map(new sd5(20)).map(new sd5(21)).subscribe(new w33(this, 2)));
    }
    public final void onStop(){
       this.c.e();
       super.onStop();
    }
}
