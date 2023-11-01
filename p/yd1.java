package p.yd1;
import p.w53;
import p.sd1;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.an5;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import p.zd1;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.jo3;
import p.ko3;
import p.x05;
import p.wd5;
import p.p77;
import java.lang.String;
import p.vt2;
import p.wd1;
import p.rt2;
import p.j8;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import android.widget.FrameLayout;
import com.spotify.hubs.liteintegration.HubsView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import p.lq5;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Object;
import android.content.res.Resources;
import java.lang.NullPointerException;
import io.reactivex.rxjava3.core.Observable;
import p.wn3;
import p.ew0;
import p.zh0;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.fx6;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.ud1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kz6;
import p.bm;
import p.bi5;
import p.k33;
import java.util.Objects;
import p.vd1;
import io.reactivex.rxjava3.core.Completable;
import p.ug1;
import p.vh1;
import p.lh1;
import p.th1;
import p.mx6;
import p.uu2;
import p.fh5;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import java.lang.CharSequence;

public class yd1 extends Fragment implements w53, sd1	// class@002d94 from classes.dex
{
    public View A;
    public lq5 B;
    public wd5 a;
    public p77 b;
    public ko3 c;
    public g54 t;
    public pe6 v;
    public final fn0 w;
    public final an5 x;
    public zd1 y;
    public j8 z;
    public static final int C;

    public void yd1(){
       super();
       this.w = new fn0();
       this.x = new an5();
    }
    public final vk7 b(){
       return wk7.v;
    }
    public final v55 h(){
       return x55.G;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.y = this.t.r(this, zd1.class);
       jo3 ojo3 = this.c.newBuilder(this.requireContext());
       ojo3.d(this);
       ojo3.c(R.id.hubs_offlined_favorite_row, "entity:favoritesRow", new x05(this.requireContext(), this.a, this.b));
       ojo3.b("delete", new wd1(this, 0));
       ojo3.b("contextMenu", new wd1(this, 1));
       this.z = ojo3.a();
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view1;
       View view2;
       View view3;
       View view = p0.inflate(R.layout.downloaded_episodes_fragment, p1, false);
       int i = 0x7f0a0137;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a0275;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a0638;
             if ((view3 = ry7.q(view, i)) != null) {
                lq5 i1 = new lq5(view, view1, view2, view3, 10);
                this.B = i;
                return i.b;
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroyView(){
       this.A = null;
       this.B = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       yd1 ty = this.y;
       yd1 tw = this.w;
       tw.c(Observable.combineLatest(ty.t.a(), ty.v.e(), new zh0(ty, 1, this.requireContext())).compose(ty.w).map(new fx6(28)).observeOn(id.a()).subscribe(new ud1(this, 0)));
       tw.c(ry7.e(this.A).subscribe(new ud1(this, 1)));
       tw.c(this.z.i().filter(new bm(14)).map(new fx6(26)).map(new fx6(27)).subscribe(new ud1(this, 2)));
       yd1 ty1 = this.y;
       Objects.requireNonNull(ty1);
       tw.c(this.z.i().filter(k33.a).flatMapCompletable(new vd1(ty1, 0)).subscribe());
       ty = this.x;
       ty1 = this.y;
       Objects.requireNonNull(ty1);
       tw.c(ty.ofType(ug1.class).switchMapCompletable(new vd1(ty1, 1)).subscribe());
       tw.c(ty.ofType(vh1.class).subscribe(new ud1(this, 3)));
       ty1 = this.y;
       Objects.requireNonNull(ty1);
       tw.c(ty.ofType(lh1.class).switchMapCompletable(new vd1(ty1, 2)).subscribe());
       tw.c(ty.ofType(th1.class).switchMapCompletable(new mx6(7, this)).subscribe());
    }
    public final void onStop(){
       super.onStop();
       this.w.e();
    }
    public final void onViewCreated(View p0,Bundle p1){
       yd1 tz = this.z;
       this.B.t.b(tz.b, tz.t);
       this.B.t.setHasExternalToolbar(true);
       this.A = this.getLayoutInflater().inflate(R.layout.up_button, this.B.v, false);
       GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(this.B.v);
       glueToolbar.addView(ToolbarSide.START, this.A, R.id.action_close);
       glueToolbar.setTitle(this.getText(R.string.downloaded_episodes_title));
    }
}
