package p.su3;
import p.qu3;
import androidx.fragment.app.Fragment;
import p.fn0;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import p.tu3;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.an3;
import p.jw0;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import p.rp;
import p.bi5;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import java.lang.Object;
import p.t34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.vs3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;

public class su3 extends Fragment implements qu3	// class@00269f from classes.dex
{
    public g54 a;
    public tu3 b;
    public final fn0 c;
    public static final int t;

    public void su3(){
       super();
       this.c = new fn0();
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.b = this.a.r(this, tu3.class);
    }
    public final void onStart(){
       super.onStart();
       Maybe maybe = this.b.t.d.map(new jw0(11)).filter(new rp(29)).firstElement();
       maybe.getClass();
       t34 ot34 = new t34(maybe, id.a(), 0);
       this.c.c(ot34.subscribe(new vs3(22, this)));
    }
    public final void onStop(){
       this.c.e();
       super.onStop();
    }
}
