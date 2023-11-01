package p.p45;
import p.n45;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.ab3;
import java.lang.Class;
import java.lang.Object;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import java.lang.String;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.q45;
import p.co3;
import java.lang.Boolean;
import p.tn6;
import p.ok0;
import p.ko1;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Completable;
import p.jp3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageView;
import android.content.Context;
import android.content.Intent;
import p.xj0;
import p.ej4;
import android.os.Bundle;
import p.ej7;
import p.vi7;
import p.g54;
import io.reactivex.rxjava3.core.Observable;
import p.rp;
import p.bi5;
import p.mx6;
import p.yf2;
import p.s02;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.vs3;
import p.ir0;

public class p45 extends Fragment implements n45	// class@0021ed from classes.dex
{
    public g54 a;
    public ac b;
    public q45 c;
    public final fn0 t;
    public static final int v;

    public void p45(){
       super();
       this.t = new fn0();
    }
    public final void c(){
       p45 tb = this.b;
       tb.getClass();
       wo3 owo3 = LiteInteraction.l();
       owo3.f("lite/sevenday-trial/offboarding-dialog");
       owo3.h("spotify:sevenday-trial:offboarding-dialog");
       owo3.g("spotify:undefined");
       owo3.d("hit");
       owo3.c("close-dialog");
       owo3.e("positive_button");
       tb.a.a(owo3.build());
    }
    public final void e(){
       q45 t = this.c.t;
       this.t.c(t.c.s(t.i, Boolean.FALSE).subscribe());
       p45 tb = this.b;
       tb.getClass();
       jp3 ojp3 = LitePageView.i();
       ojp3.d("exit");
       ojp3.c("lite/sevenday-trial/offboarding-dialog");
       ojp3.e("spotify:sevenday-trial:offboarding-dialog");
       tb.a.a(ojp3.build());
    }
    public final void i(){
       this.startActivity(xj0.s(this.requireContext(), "spotify:premium"));
       p45 tb = this.b;
       tb.getClass();
       wo3 owo3 = LiteInteraction.l();
       owo3.f("lite/sevenday-trial/offboarding-dialog");
       owo3.h("spotify:sevenday-trial:offboarding-dialog");
       owo3.g("spotify:premium");
       owo3.d("hit");
       owo3.c("navigate-forward");
       owo3.e("negative_button");
       tb.a.a(owo3.build());
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.c = this.a.r(this, q45.class);
    }
    public final void onStart(){
       super.onStart();
       q45 t = this.c.t;
       this.t.c(t.c.r(t.i).filter(new rp(0)).switchMap(new mx6(19, this)).compose(new s02(2)).observeOn(id.a()).subscribe(new vs3(11, this)));
    }
    public final void onStop(){
       this.t.e();
       super.onStop();
    }
}
