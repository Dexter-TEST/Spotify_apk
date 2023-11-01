package p.gj3;
import p.sc4;
import p.l16;
import android.os.Handler;
import android.content.Context;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import android.os.Bundle;
import p.fj3;
import io.reactivex.rxjava3.core.Observable;
import p.bm0;
import p.ti7;
import java.lang.ref.WeakReference;
import p.mg1;
import p.v05;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;

public final class gj3	// class@00171c from classes.dex
{
    public final sc4 a;
    public final l16 b;
    public final Handler c;
    public final Context d;
    public final ConnectivityUtil e;

    public void gj3(sc4 p0,l16 p1,Handler p2,Context p3,ConnectivityUtil p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final fj3 a(View p0,String p1,Bundle p2){
       Observable observable = Observable.empty();
       fj3 p1 = new fj3(p0, this.b, this.a, new bm0(2, p1), p2, this.c, this.d, this.e);
       if (p2 == null) {
          _monitor_enter(p1);
          p1.k(ti7.b);
          _monitor_exit(p1);
       }
       observable.subscribe(new mg1(22, new WeakReference(p1)), new v05(18));
       return p1;
    }
}
