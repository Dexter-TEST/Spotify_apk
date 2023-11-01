package p.b01;
import p.w53;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import java.lang.Object;
import com.google.common.collect.d;
import p.pp;
import p.fn0;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import p.c01;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.EditText;
import p.xe7;
import p.kz6;
import p.ry7;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import io.reactivex.rxjava3.core.Observable;
import p.zz0;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.String;
import p.co5;
import p.k37;
import p.rm;
import p.yf2;
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

public class b01 extends Fragment implements w53	// class@001027 from classes.dex
{
    public g54 a;
    public pm6 b;
    public final fn0 c;
    public c01 t;
    public View v;
    public EditText w;
    public View x;
    public View y;
    public View z;
    public static final d A;
    public static final pp B;

    static {
       b01.A = d.s(Integer.valueOf(6), Integer.valueOf(2), Integer.valueOf(5), Integer.valueOf(4));
       b01.B = new pp(16);
    }
    public void b01(){
       super();
       this.c = new fn0();
    }
    public final vk7 b(){
       return wk7.t;
    }
    public final v55 h(){
       return x55.F;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.t = this.a.r(this, c01.class);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.fragment_create_playlist, p1, false);
    }
    public final void onDestroyView(){
       this.v = null;
       this.w = null;
       this.x = null;
       this.y = null;
       this.z = null;
       super.onDestroyView();
    }
    public final void onPause(){
       super.onPause();
       xe7.B(this.w);
    }
    public final void onResume(){
       super.onResume();
       xe7.a0(this.w);
    }
    public final void onStart(){
       super.onStart();
       b01 tc = this.c;
       tc.c(ry7.e(this.v).observeOn(id.a()).subscribe(new zz0(this, 0)));
       b01 tw = this.w;
       co5.q(tw, "$this$textChangeEvents");
       k37 ok37 = new k37(tw, 0);
       Observable observable = ok37.map(new rm(16));
       b01 tx = this.x;
       Objects.requireNonNull(tx);
       tc.c(observable.observeOn(id.a()).subscribe(new a01(tx, 0)));
       tc.c(ry7.e(this.y).observeOn(id.a()).subscribe(new zz0(this, 1)));
       tc.c(ry7.e(this.requireView()).observeOn(id.a()).subscribe(new zz0(this, 2)));
       tc.c(Observable.merge(ry7.e(this.x), ap5.m(this.w, xb.a).filter(new up0(3, this)).filter(b01.B)).observeOn(s36.c).switchMap(new up0(15, this)).observeOn(id.a()).subscribe(new zz0(this, 3), new zz0(this, 4)));
    }
    public final void onStop(){
       super.onStop();
       this.c.e();
    }
    public final void onViewCreated(View p0,Bundle p1){
       GlueToolbarLayout glueToolbarL = p0.findViewById(R.id.toolbar_layout);
       GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(glueToolbarL);
       View view = this.getLayoutInflater().inflate(R.layout.up_button, glueToolbarL, false);
       this.v = view;
       glueToolbar.addView(ToolbarSide.START, view, R.id.action_close);
       this.w = p0.findViewById(R.id.input_name);
       this.x = p0.findViewById(R.id.positive_button);
       this.y = p0.findViewById(R.id.negative_button);
       view = p0.findViewById(R.id.loading_view);
       this.z = view;
       view.setVisibility(8);
       mw.b(this.w).d(14.00f, 2);
       em2 em2.d = new em2(dm2.a, n6.b(p0.getContext(), R.color.gray_30), n6.b(p0.getContext(), R.color.gray_background), true, 0);
       dh7.q(p0.findViewById(R.id.background), em2.d);
    }
}
