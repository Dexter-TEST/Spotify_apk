package p.em;
import p.c1;
import p.v55;
import p.x55;
import android.os.Bundle;
import p.gm;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import androidx.fragment.app.Fragment;
import java.lang.String;
import android.os.BaseBundle;
import p.jl;
import androidx.fragment.app.k;
import p.et0;
import io.reactivex.rxjava3.core.Completable;
import p.zg5;
import p.mq5;
import p.np3;
import io.reactivex.rxjava3.core.Observable;
import p.aq6;
import p.td7;
import java.lang.Object;
import p.yp6;
import java.lang.StringBuilder;
import p.fm;
import java.io.Serializable;
import p.b90;
import p.d90;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;

public class em extends c1	// class@0014ba from classes.dex
{
    public g54 H;
    public gm I;
    public String J;
    public static final int K;

    public void em(){
       super();
    }
    public final v55 h(){
       return x55.B;
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.I = this.H.r(this, gm.class);
       String str = ((p0 = this.getArguments()) == null)? null: p0.getString("spotify.fragment.argument.SPACE_ID");
       this.J = str;
       boolean b = (str != null)? true: false;
       jl.h(b, "Missing parameter");
       if (this.J == null) {
          et0.d(this.getActivity());
       }
       return;
    }
    public final Completable u(String p0,String p1){
       return this.I.v.a(p0, p1);
    }
    public final Completable v(mq5 p0){
       return this.I.w.c(p0);
    }
    public final Observable w(String p0,boolean p1){
       aq6 uoaq6;
       int i;
       Observable observable;
       em tI = this.I;
       em tJ = this.J;
       if ((uoaq6 = td7.d(p0)) == null) {
          i = 0;
       }else {
          tI.getClass();
          i = uoaq6.t;
       }
       gm x = tI.x;
       if (tJ != null && (uoaq6 != null && i != null)) {
          uoaq6 = (uoaq6.b == yp6.b)? "artistURI:"+uoaq6: "albumURI:"+uoaq6;
          fm uoaq61 = new fm(tI, tJ, uoaq6, p1, 0);
          observable = d90.a(uoaq6).compose(x);
       }else {
          observable = Observable.error(new IllegalArgumentException()).compose(x);
       }
       return observable;
    }
}
