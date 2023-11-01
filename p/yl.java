package p.yl;
import p.yf2;
import p.cm;
import android.content.Context;
import java.lang.Object;
import com.spotify.litenetwork.webapi.model.RecommendedGenre;
import java.lang.Class;
import java.util.Locale;
import java.lang.String;
import p.xj0;
import java.util.Set;
import java.util.List;
import p.b43;
import p.qq5;
import com.spotify.litenetwork.webapi.model.RecommendedTracks;
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
import java.util.HashSet;
import java.util.Iterator;
import p.jq5;
import p.aq6;
import p.td7;
import p.yp6;
import java.io.Serializable;
import p.gu2;
import p.i13;
import java.lang.Enum;
import p.a43;
import p.ys5;
import p.z23;

public final class yl implements yf2	// class@002de3 from classes.dex
{
    public final int a;
    public final cm b;
    public final Context c;

    public void yl(cm p0,Context p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object apply(Object p0){
       RecommendedGenre a;
       int i = 0x7f12004c;
       yl tc = this.c;
       yl tb = this.b;
       switch (this.a){
           case 0:
             cm t = tb.t;
             String str = tc.getString(R.string.assisted_curation_card_title_recent_plays);
             iu2 oiu2 = ty0.k().k(c03.b).c(do5.n0(sp6.a0));
             st2 ost2 = ty0.j().d("addToPlaylist");
             d73 uod73 = new d73();
             if (!TextUtils.isEmpty(str)) {
                uod73.D0(ty0.k().o("title").k(x03.b).s(ty0.z().d(str)).g());
             }
             HashSet hashSet = new HashSet(10);
             p0 = p0.iterator();
             while (p0.hasNext()) {
                jq5 ojq5 = p0.next();
                jq5 c = ojq5.c;
                aq6 uoaq6 = td7.d(c);
                if (!t.contains(c) && (!hashSet.contains(c) && (uoaq6 != null && uoaq6.b == yp6.w))) {
                   uod73.D0(oiu2.o(ojq5.c).d("click", ost2.a("uri", c)).p(ty0.o().c(ty0.n().g(ojq5.d).e(sp6.o0))).s(ty0.z().d(ojq5.e).a(ojq5.g)).g());
                   hashSet.add(ojq5.c);
                }
             }
             return ty0.B().j("tracks").e(uod73.I0()).g();
             break;
           case 1:
             return tb.f(tc, p0, i);
           case 2:
             return tb.f(tc, p0, i);
           case 3:
             tb.getClass();
             String str1 = ((a = p0.a) == null)? "": xj0.k(a, Locale.getDefault());
             Object[] objArray = new Object[]{str1};
             return qq5.a(tb.t, tc.getString(R.string.assisted_curation_card_title_genre, objArray), p0.b);
             break;
           default:
             return tb.f(tc, p0, R.string.assisted_curation_card_title_similar_to);
       }
    }
}
