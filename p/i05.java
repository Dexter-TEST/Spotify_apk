package p.i05;
import p.f05;
import androidx.fragment.app.Fragment;
import java.util.EnumMap;
import p.c05;
import java.lang.Class;
import p.h05;
import java.lang.Enum;
import java.lang.Object;
import java.util.Map;
import java.util.Collections;
import p.fn0;
import android.content.Context;
import java.lang.String;
import android.content.Intent;
import p.xj0;
import p.ej4;
import android.os.Bundle;
import p.j05;
import p.ej7;
import p.vi7;
import p.g54;
import io.reactivex.rxjava3.core.Observable;
import p.ew0;
import p.rp;
import p.bi5;
import p.xl6;
import p.yf2;
import java.util.Objects;
import p.up0;
import p.mx6;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.vs3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;

public class i05 extends Fragment implements f05	// class@0018fb from classes.dex
{
    public g54 a;
    public final fn0 b;
    public j05 c;
    public static final Map t;

    static {
       EnumMap uEnumMap = new EnumMap(c05.class);
       h05 v8 = new h05(0x7f120264, 0x7f120262, 0x7f120263, 0x7f120267, 1);
       uEnumMap.put(c05.a, v8);
       v8 = new h05(0x7f120266, 0x7f120265, 0x7f120267, 0, 2);
       uEnumMap.put(c05.b, v8);
       v8 = new h05(0x7f12026a, 0x7f120269, 0x7f120267, 0, 3);
       uEnumMap.put(c05.c, v8);
       v8 = new h05(0x7f120261, 0x7f120260, 0x7f120268, 0, 0);
       uEnumMap.put(c05.t, v8);
       i05.t = Collections.unmodifiableMap(uEnumMap);
    }
    public void i05(){
       super();
       this.b = new fn0();
    }
    public final void f(int p0){
       if (p0 != 1) {
       }else {
          this.startActivity(xj0.s(this.requireContext(), "spotify:favorites"));
       }
       return;
    }
    public final void m(){
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.c = this.a.r(this, j05.class);
    }
    public final void onStart(){
       super.onStart();
       Map t = i05.t;
       Objects.requireNonNull(t);
       Objects.requireNonNull(t);
       this.b.c(this.c.t.c().filter(new rp(12)).map(new xl6(9)).map(new xl6(10)).filter(new up0(0, t)).map(new mx6(27, t)).observeOn(id.a()).subscribe(new vs3(19, this)));
    }
    public final void onStop(){
       super.onStop();
       this.b.e();
    }
}
