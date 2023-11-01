package p.qq5;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.vf;
import java.lang.String;
import p.xe3;
import java.util.HashSet;
import java.lang.Object;
import java.util.Set;
import java.util.List;
import p.b43;
import p.iu2;
import p.ty0;
import p.c03;
import p.fu2;
import p.sp6;
import p.au2;
import p.do5;
import p.st2;
import p.d73;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.x03;
import p.su2;
import p.k23;
import p.a73;
import java.util.Iterator;
import com.spotify.litenetwork.webapi.model.RecommendedTrack;
import com.spotify.litenetwork.webapi.model.RecommendedAlbum;
import java.io.Serializable;
import p.gu2;
import p.i13;
import java.lang.Enum;
import java.lang.Iterable;
import p.ab2;
import p.pq5;
import p.jg2;
import java.lang.Class;
import p.a43;
import p.ys5;
import p.z23;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.up0;
import p.yf2;

public final class qq5 implements ObservableTransformer	// class@0023f6 from classes.dex
{
    public final Set a;
    public final String b;
    public static final xe3 c;

    static {
       qq5.c = new xe3(new vf(", "), new vf(", "));
    }
    public void qq5(String p0,HashSet p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public static b43 a(Set p0,String p1,List p2){
       RecommendedTrack e;
       String str1;
       iu2 oiu2 = ty0.k().k(c03.b).c(do5.n0(sp6.a0));
       st2 ost2 = ty0.j().d("addToPlaylist");
       d73 uod73 = new d73();
       if (!TextUtils.isEmpty(p1)) {
          uod73.D0(ty0.k().o("title").k(x03.b).s(ty0.z().d(p1)).g());
       }
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          RecommendedTrack recommendedT = iterator.next();
          RecommendedTrack a = recommendedT.a;
          if (p0.contains(a)) {
             continue ;
          }else {
             RecommendedTrack d = recommendedT.d;
             Serializable serializable = null;
             String str = (d == null)? serializable: d.c;
             iu2 oiu21 = oiu2.o(recommendedT.a).d("click", ost2.a("uri", a)).p(ty0.o().c(ty0.n().g(str).e(sp6.o0)));
             su2 osu2 = ty0.z().d(recommendedT.b);
             if ((e = recommendedT.e) == null) {
                str1 = serializable;
             }else {
                ab2 uoab2 = ab2.b(e).m(new pq5(0));
                uoab2.getClass();
                str1 = qq5.c.r(uoab2);
             }
             oiu21 = oiu21.s(osu2.a(str1));
             if (recommendedT.c != null) {
                serializable = "explicit";
             }
             uod73.D0(oiu21.b("label", serializable).g());
          }
       }
       return ty0.B().j("tracks").e(uod73.I0()).g();
    }
    public final ObservableSource apply(Observable p0){
       return p0.map(new up0(8, this));
    }
}
