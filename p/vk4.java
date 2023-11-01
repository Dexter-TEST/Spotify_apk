package p.vk4;
import androidx.fragment.app.Fragment;
import p.fn0;
import android.content.Context;
import p.ej4;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import p.ry7;
import android.widget.ProgressBar;
import com.spotify.legacyglue.icons.SpotifyIconView;
import android.widget.TextView;
import p.t67;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.res.Resources;
import java.lang.String;
import java.lang.NullPointerException;
import p.sb4;
import p.ce7;
import java.lang.Object;
import android.content.Intent;
import p.xj0;
import p.kz6;
import p.ft6;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import p.uk4;
import java.lang.Class;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.rk4;
import p.tk4;
import p.kh1;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.jh1;
import p.xh1;
import p.sh1;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.wh1;
import p.b5;
import p.uh1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.g54;
import p.rf5;
import p.p54;
import p.s02;
import p.jw0;
import p.yf2;
import p.ow0;
import p.iw0;
import p.n54;
import p.nv1;
import com.spotify.mobius.rx3.RxEventSources;
import p.up0;
import p.bm;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.mi;
import p.xk5;
import p.ms3;
import p.qb4;
import p.in0;
import p.yt;
import java.lang.Long;
import java.lang.Float;
import java.lang.Boolean;
import p.zt;
import p.is7;
import p.s81;

public class vk4 extends Fragment	// class@002a11 from classes.dex
{
    public t67 A;
    public ce7 B;
    public final fn0 a;
    public tk4 b;
    public g54 c;
    public ms3 t;
    public zg0 v;
    public pm6 w;
    public Scheduler x;
    public xq7 y;
    public sb4 z;
    public static final int C;

    public void vk4(){
       super();
       this.a = new fn0();
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view1;
       View view2;
       View view3;
       View view4;
       View view5;
       View view6;
       View view = p0.inflate(R.layout.now_playing_bar_fragment, p1, false);
       int i = 0x7f0a00b6;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a00c1;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a00c7;
             if ((view3 = ry7.q(view, i)) != null) {
                i = 0x7f0a00ca;
                if ((view4 = ry7.q(view, i)) != null) {
                   i = 0x7f0a051d;
                   if ((view5 = ry7.q(view, i)) != null) {
                      i = 0x7f0a062e;
                      if ((view6 = ry7.q(view, i)) != null) {
                         t67 i1 = new t67(view, view1, view2, view3, view4, view5, view6);
                         this.A = i;
                         return i.e();
                      }
                   }
                }
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroyView(){
       this.z.b();
       this.A = null;
       super.onDestroyView();
    }
    public final void onStart(){
       super.onStart();
       this.z.f();
    }
    public final void onStop(){
       this.z.g();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       super.onViewCreated(p0, p1);
       this.A.t.setSingleLine();
       this.A.t.setSelected(true);
       this.B = new ce7(this.A.y, null, null);
       this.a.c(ry7.e(this.A.e()).subscribe(new ft6(this, 4, xj0.z0(this.getContext(), "spotify.intent.action.NOW_PLAYING"))));
       vk4 tb = this.b;
       tb.getClass();
       RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
       subtypeEffec.g(kh1.class, new rk4(tb, 0));
       subtypeEffec.g(jh1.class, new rk4(tb, true));
       subtypeEffec.g(xh1.class, new rk4(tb, 2));
       rk4 ork4 = new rk4(tb, 3);
       subtypeEffec.g(sh1.class, ork4);
       subtypeEffec.b(wh1.class, new uk4(this, 0), id.a());
       subtypeEffec.b(uh1.class, new uk4(this, true), id.a());
       ObservableTransformer observableTr = subtypeEffec.h();
       vk4 tc = this.c;
       ObservableSource[] observableSo = new ObservableSource[3];
       observableSo[0] = tc.a.f().distinctUntilChanged().compose(new s02(3)).map(new jw0(13));
       observableSo[1] = tc.a.e().map(new jw0(14));
       g54 a = tc.a;
       a.getClass();
       g54 og54 = a;
       observableSo[2] = og54.C.hide().compose(new iw0(og54, 2)).compose(new n54(a, 4)).map(new jw0(15));
       up0 oup0 = new up0(0, this);
       lb4 olb4 = mi.A(new bm(2), RxConnectables.a(observableTr)).c(RxEventSources.a(observableSo)).a(oup0).b(oup0);
       qb4[] oqb4Array = new qb4[true];
       oqb4Array[0] = this.t;
       yt oyt = new yt();
       oyt.a = "";
       oyt.b = "";
       oyt.c = "";
       oyt.d = Long.valueOf(0);
       oyt.e = Long.valueOf(0);
       oyt.g = Float.valueOf(0);
       oyt.f = Long.valueOf(0);
       Boolean fALSE = Boolean.FALSE;
       oyt.h = fALSE;
       oyt.i = fALSE;
       oyt.j = fALSE;
       oyt.k = fALSE;
       oyt.l = fALSE;
       oyt.m = fALSE;
       oyt.n = fALSE;
       oyt.o = fALSE;
       oyt.p = fALSE;
       oyt.q = fALSE;
       sb4 osb4 = is7.l(olb4.e(in0.g(ms3.h("NPB"), oqb4Array)), oyt.a());
       this.z = osb4;
       osb4.a(RxConnectables.a(new s81(6, this)));
    }
}
