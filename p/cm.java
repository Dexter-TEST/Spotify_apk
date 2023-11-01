package p.cm;
import p.vi7;
import p.zp3;
import p.zg5;
import p.e43;
import p.mp3;
import java.util.HashSet;
import java.lang.Object;
import p.t00;
import java.lang.String;
import p.aq6;
import p.td7;
import java.lang.IllegalArgumentException;
import android.content.Context;
import com.spotify.litenetwork.webapi.model.RecommendedTracks;
import p.b43;
import java.util.Locale;
import p.xj0;
import java.util.Set;
import java.util.List;
import p.qq5;
import p.b90;
import io.reactivex.rxjava3.core.Observable;
import p.d90;
import p.bm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;

public final class cm extends vi7	// class@00123a from classes.dex
{
    public final HashSet t;
    public final t00 v;
    public final zp3 w;
    public final zg5 x;
    public final e43 y;
    public final mp3 z;

    public void cm(zp3 p0,zg5 p1,e43 p2,mp3 p3){
       super();
       this.t = new HashSet(10);
       this.v = t00.b(new Object());
       this.w = p0;
       this.x = p1;
       this.y = p2;
       this.z = p3;
    }
    public static String e(String p0){
       aq6 uoaq6;
       String str = ((uoaq6 = td7.d(p0)) == null)? null: uoaq6.t;
       if (str != null) {
          return str;
       }else {
          throw new IllegalArgumentException(p0);
       }
    }
    public final b43 f(Context p0,RecommendedTracks p1,int p2){
       RecommendedTracks a;
       String str = ((a = p1.a) == null)? "": xj0.k(a, Locale.getDefault());
       Object[] objArray = new Object[]{str};
       return qq5.a(this.t, p0.getString(p2, objArray), p1.b);
    }
    public final Observable g(b90 p0){
       return Observable.combineLatest(d90.a(p0), this.v, new bm(14));
    }
}
