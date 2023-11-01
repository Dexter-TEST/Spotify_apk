package p.dm;
import p.c1;
import p.v55;
import p.x55;
import android.os.Bundle;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.im;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import java.lang.String;
import io.reactivex.rxjava3.core.Completable;
import p.zg5;
import p.mq5;
import p.np3;
import io.reactivex.rxjava3.core.Observable;
import p.aq6;
import p.td7;
import java.lang.Object;
import p.yp6;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import p.hm;
import p.b90;
import p.d90;
import io.reactivex.rxjava3.core.ObservableTransformer;

public class dm extends c1	// class@001379 from classes.dex
{
    public g54 H;
    public im I;
    public static final int J;

    public void dm(){
       super();
    }
    public final v55 h(){
       return x55.x;
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.I = this.H.r(this.requireActivity(), im.class);
    }
    public final Completable u(String p0,String p1){
       return this.I.v.a(p0, p1);
    }
    public final Completable v(mq5 p0){
       return this.I.w.c(p0);
    }
    public final Observable w(String p0,boolean p1){
       Observable observable;
       dm tI = this.I;
       aq6 uoaq6 = td7.d(p0);
       tI.getClass();
       yp6 j0 = (uoaq6 == null)? yp6.j0: uoaq6.b;
       int i = j0.ordinal();
       int i1 = 1;
       if (i != i1) {
          observable = (i != 3)? Observable.error(new IllegalArgumentException(String.valueOf(uoaq6))): d90.a(new hm(tI, uoaq6, p1, i1));
       }else {
          observable = d90.a(new hm(tI, uoaq6, p1, 0));
       }
       return observable.compose(tI.x);
    }
}
