package p.rz3;
import p.ir0;
import com.spotify.lite.appmain.MainActivity;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import p.ae2;
import androidx.fragment.app.k;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import p.vm3;
import androidx.fragment.app.Fragment;
import java.lang.String;
import p.yk5;
import p.ad6;
import com.google.android.material.tabs.TabLayout;
import p.cz6;
import p.sp6;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import p.tu6;
import java.util.ArrayList;
import p.uh5;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import android.view.View;
import p.iz6;
import p.jl;
import p.w53;
import p.vk7;
import p.tp2;
import p.ab3;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.mz6;
import p.kb3;
import p.lz6;
import p.jd2;
import android.content.ContextWrapper;
import p.fp3;

public final class rz3 implements ir0	// class@002589 from classes.dex
{
    public final int a;
    public final MainActivity b;

    public void rz3(MainActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       o d1;
       a s;
       TabLayout b;
       cz6 uocz61;
       String str = null;
       int i = 0;
       rz3 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             cz6 d = p0.a().d;
             Fragment uFragment = tb.D(d);
             jl.h(true, "Root fragments must implement IdentifierProvider");
             MainActivity w = tb.W;
             ab3 uoab3 = tp2.k("navigation-tab-", d);
             w.getClass();
             wo3 owo3 = LiteInteraction.l();
             owo3.f("lite/navigation-bar");
             owo3.h("spotify:navigation-bar");
             owo3.g(uFragment.b().a());
             owo3.d("hit");
             owo3.c("navigate-forward");
             if (uoab3 != null) {
                owo3.e(uoab3);
             }
             w.a.a(owo3.build());
             if (p0 instanceof mz6) {
                tb.g0.j(uFragment, d);
             }
             if (p0 instanceof lz6) {
                p0 = tb.g0;
                o oo = p0.l(d);
                int i1 = ((d1 = oo.d) != null)? d1.size(): 0;
                if (i1 > 0) {
                   if ((s = oo.d.get(i).s) >= null) {
                      oo.P(str, s, true);
                   }else {
                      throw new IllegalArgumentException(tp2.k("Bad id: ", s));
                   }
                }
                p0.c.G(uFragment, d);
             }
             break;
           case 1:
             int i2 = 3;
             if (p0 == yk5.b) {
                if (tb.h0.l.f(i2) == null) {
                   p0 = tb.h0.l;
                   cz6 uocz6 = p0.g();
                   uocz6.d(R.string.tab_premium);
                   uocz6.b(R.string.tab_premium_content_description);
                   uocz6.c(tu6.x(tb, sp6.m0, sp6.m0));
                   p0.a(uocz6, i);
                }
             }else if((p0 = tb.h0.l.f(i2)) != null){
                ad6 l = tb.h0.l;
                l.getClass();
                if (p0.f == l) {
                   p0 = p0.d;
                   cz6 d2 = ((b = l.b) != null)? b.d: null;
                   l.i(p0);
                   TabLayout a = l.a;
                   if ((uocz61 = a.remove(p0)) != null) {
                      uocz61.f = str;
                      uocz61.g = str;
                      uocz61.a = str;
                      uocz61.h = -1;
                      uocz61.b = str;
                      uocz61.c = str;
                      uocz61.d = -1;
                      uocz61.e = str;
                      TabLayout.f0.b(uocz61);
                   }
                   int i3 = a.size();
                   for (cz6 uocz62 = p0; uocz62 < i3; uocz62 = uocz62 + 1) {
                      a.get(uocz62).d = uocz62;
                   }
                   if (d2 == p0) {
                      if (!a.isEmpty()) {
                         str = a.get(Math.max(i, (p0 - true)));
                      }
                      l.j(str, true);
                   }
                }else {
                   throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
                }
             }
             tb.h0.l.requestLayout();
             return;
             break;
           case 2:
             tb.getClass();
             if (p0.booleanValue()) {
                p0 = tb.y();
                p0.getClass();
                a uoa = new a(p0);
                uoa.g(R.id.block_lite_container, new vm3(), "BLOCKING_TEST_FRAGMENT", true);
                uoa.e(i);
             }
             return;
             break;
           default:
             tb.d0.getClass();
             fp3.a(tb, p0.booleanValue());
             return;
       }
       return;
    }
}
