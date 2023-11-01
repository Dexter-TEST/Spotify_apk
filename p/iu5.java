package p.iu5;
import p.w53;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import java.lang.Object;
import com.google.common.collect.d;
import p.pp;
import p.fn0;
import p.vk7;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import p.tk7;
import java.lang.IllegalStateException;
import p.v55;
import p.x55;
import android.content.Context;
import p.ej4;
import p.ju5;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.EditText;
import p.xe7;
import p.aq6;
import p.td7;
import io.reactivex.rxjava3.core.Single;
import p.cm7;
import io.reactivex.rxjava3.core.Observable;
import p.ox7;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.ha5;
import p.b5;
import p.gu5;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kz6;
import p.ry7;
import p.co5;
import p.k37;
import p.rm;
import p.yf2;
import p.hu5;
import java.util.Objects;
import p.a01;
import p.xb;
import android.widget.TextView;
import p.zf2;
import p.f37;
import p.ap5;
import p.up0;
import p.bi5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.s36;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import p.mw;
import p.dm2;
import p.n6;
import p.em2;
import p.wh7;
import android.graphics.drawable.Drawable;
import p.dh7;

public class iu5 extends Fragment implements w53	// class@001a08 from classes.dex
{
    public String A;
    public final fn0 a;
    public g54 b;
    public pm6 c;
    public EditText t;
    public ju5 v;
    public View w;
    public View x;
    public View y;
    public View z;
    public static final d B;
    public static final pp C;

    static {
       iu5.B = d.s(Integer.valueOf(6), Integer.valueOf(2), Integer.valueOf(5), Integer.valueOf(4));
       iu5.C = new pp(18);
    }
    public void iu5(){
       super();
       this.a = new fn0();
    }
    public final vk7 b(){
       Bundle arguments = this.getArguments();
       String str = null;
       if (arguments == null) {
       }else {
          str = arguments.getString("spotify.fragment.argument.URI", str);
       }
       if (str != null) {
          return new tk7(str);
       }else {
          throw new IllegalStateException("Missing spotify.fragment.argument.URI");
       }
    }
    public final v55 h(){
       return x55.R;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.v = this.b.r(this, ju5.class);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.fragment_rename_playlist, p1, false);
    }
    public final void onDestroyView(){
       this.t = null;
       this.w = null;
       this.x = null;
       this.y = null;
       this.z = null;
       this.A = null;
       super.onDestroyView();
    }
    public final void onPause(){
       super.onPause();
       xe7.B(this.t);
    }
    public final void onStart(){
       aq6 uoaq6;
       super.onStart();
       boolean b = false;
       this.t.setEnabled(b);
       iu5 tv = this.v;
       if ((uoaq6 = td7.d(this.b().a)) == null) {
          throw new IllegalStateException("Could not parse URI");
       }
       tv.getClass();
       iu5 ta = this.a;
       ta.c(ox7.C(tv.t.l(uoaq6.t).toObservable()).observeOn(id.a()).doAfterTerminate(new ha5(21, this)).subscribe(new gu5(this, 2)));
       ta.c(ry7.e(this.x).observeOn(id.a()).subscribe(new gu5(this, 3)));
       tv = this.t;
       co5.q(tv, "$this$textChangeEvents");
       k37 ok37 = new k37(tv, b);
       Observable observable = ok37.map(new rm(19));
       iu5 tz = this.z;
       Objects.requireNonNull(tz);
       ta.c(observable.map(new hu5(this, b)).observeOn(id.a()).subscribe(new a01(tz, 1)));
       ta.c(ry7.e(this.y).observeOn(id.a()).subscribe(new gu5(this, 4)));
       ta.c(ry7.e(this.requireView()).observeOn(id.a()).subscribe(new gu5(this, 5)));
       ta.c(Observable.merge(ry7.e(this.z), ap5.m(this.t, xb.a).filter(new up0(4, this)).filter(iu5.C)).observeOn(s36.c).switchMap(new hu5(this, 1)).observeOn(id.a()).subscribe(new gu5(this, b), new gu5(this, 1)));
       return;
    }
    public final void onStop(){
       super.onStop();
       this.a.e();
    }
    public final void onViewCreated(View p0,Bundle p1){
       GlueToolbarLayout glueToolbarL = p0.findViewById(R.id.toolbar_layout);
       GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(glueToolbarL);
       View view = this.getLayoutInflater().inflate(R.layout.up_button, glueToolbarL, false);
       this.x = view;
       glueToolbar.addView(ToolbarSide.START, view, R.id.action_close);
       this.t = p0.findViewById(R.id.input_name);
       this.z = p0.findViewById(R.id.positive_button);
       this.y = p0.findViewById(R.id.negative_button);
       view = p0.findViewById(R.id.loading_view);
       this.w = view;
       view.setVisibility(8);
       mw.b(this.t).d(14.00f, 2);
       em2 em2.d = new em2(dm2.a, n6.b(p0.getContext(), R.color.gray_30), n6.b(p0.getContext(), R.color.gray_background), true, 0);
       dh7.q(p0.findViewById(R.id.background), em2.d);
    }
}
