package p.xm;
import p.c1;
import p.v55;
import p.x55;
import android.os.Bundle;
import p.zm;
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
import p.k07;
import java.lang.CharSequence;
import java.util.List;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.ym;
import p.b90;
import p.d90;

public class xm extends c1	// class@002cab from classes.dex
{
    public g54 H;
    public zm I;
    public static final int J;

    public void xm(){
       super();
    }
    public final v55 h(){
       return x55.B;
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.I = this.H.r(this, zm.class);
    }
    public final Completable u(String p0,String p1){
       return this.I.v.a(p0, p1);
    }
    public final Completable v(mq5 p0){
       return this.I.w.c(p0);
    }
    public final Observable w(String p0,boolean p1){
       aq6 uoaq6;
       CharSequence uCharSequenc;
       Observable observable;
       xm tI = this.I;
       if ((uoaq6 = td7.d(p0)) == null) {
          uCharSequenc = null;
       }else {
          tI.getClass();
          uCharSequenc = uoaq6.t;
       }
       zm z = tI.z;
       if (uoaq6 != null && (uoaq6.b == yp6.v && uCharSequenc != null)) {
          List list = k07.a(':').b(uCharSequenc);
          observable = (list.size() != 2)? Observable.error(new IllegalArgumentException("Invalid id, ".concat(uCharSequenc))).compose(z): d90.a(new ym(tI, list, p1, 0)).compose(z);
       }else {
          observable = Observable.error(new IllegalArgumentException(String.valueOf(uoaq6))).compose(z);
       }
       return observable;
    }
}
