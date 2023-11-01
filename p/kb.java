package p.kb;
import p.wf2;
import p.gi3;
import java.lang.Object;
import p.hm6;
import java.lang.Exception;
import java.lang.String;
import p.co5;
import p.uv5;
import com.spotify.litelyrics.lyrics.widget.LyricsWidgetPresenter;
import p.qw3;
import java.lang.Class;
import android.os.Bundle;
import android.os.Parcelable;
import p.vk7;
import android.os.BaseBundle;
import p.b7;
import androidx.fragment.app.o;
import p.lx3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import p.es0;
import android.content.Context;
import p.ap5;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import p.e46;
import p.k5;
import java.lang.CharSequence;
import android.view.View;
import p.jc7;
import p.oi;
import p.cl;
import p.bl;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import java.lang.Float;
import p.l61;
import java.lang.Enum;
import p.n61;
import p.t65;
import p.wn6;
import p.tn6;
import p.rn6;
import p.cd2;
import java.util.UUID;
import p.i01;
import androidx.activity.a;
import p.ly3;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;

public final class kb extends gi3 implements wf2	// class@001be4 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void kb(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super(0);
    }
    public void kb(hm6 p0,kb p1){
       this.a = 6;
       this.c = p0;
       this.b = p1;
       super(0);
    }
    public final void a(){
       e46 v;
       k5 a;
       LyricsWidgetPresenter m;
       kb tc = this.c;
       kb tb = this.b;
       switch (this.a){
           case 1:
             if (ap5.t(tb.a)) {
                e46 uoe46 = tb.e();
                if ((v = tc.v) == null || (a = v.a) == null) {
                   a = "";
                }
                uoe46.announceForAccessibility(a);
                EncoreButton uEncoreButto = tb.e();
                Context context = uEncoreButto.getContext();
                co5.l(context, "context");
                if (ap5.t(context)) {
                   uEncoreButto.performAccessibilityAction(64, null);
                   uEncoreButto.sendAccessibilityEvent(4);
                }
             }
             return;
             break;
           case 4:
             if ((m = tb.M) != null) {
                LyricsWidgetPresenter b = tb.b;
                b.getClass();
                co5.o(tc, "lyrics");
                Bundle uBundle = new Bundle();
                uBundle.putParcelable("lyrics_bundle", tc);
                uBundle.putString("view_uri", m.a());
                if (!b.b.L()) {
                   lx3 olx3 = new lx3();
                   olx3.setArguments(uBundle);
                   olx3.B(b.b, lx3.class.getSimpleName());
                }
             }
             return;
             break;
           case 5:
           default:
             tb.invoke();
             return;
       }
       co5.l(tc, "exception");
       hm6.a(tb, tc);
       return;
    }
    public final Object invoke(){
       i01 oi01;
       t65 a1;
       wn6 own6;
       t65 a2;
       jc7 a = jc7.a;
       int i = 1;
       kb tc = this.c;
       kb tb = this.b;
       switch (this.a){
           case 0:
             if (tb == null || (oi01 = tb.invoke()) == null) {
                oi01 = tc.getDefaultViewModelCreationExtras();
             }
             return oi01;
             break;
           case 1:
             this.a();
             return a;
           case 2:
             int i1 = tb.ordinal();
             String str = "randomUUID\(\).toString\(\)";
             if (i1) {
                if (i1 != i) {
                   if (i1 == 2) {
                      a1 = tc.a().a;
                      own6 = tc.a.edit();
                      own6.d(n61.c);
                      own6.d(n61.d);
                      own6.e();
                   }else {
                      throw new cd2(10);
                   }
                }else {
                   a1 = tc.a();
                   a2 = a1.a;
                   a1 = a1.b;
                   n61 a3 = tc.a;
                   if (a2 != null && a1 == l61.b) {
                      wn6 own61 = a3.edit();
                      own61.c(n61.c, a2);
                      own61.c(n61.d, "LOGGED_IN");
                      own61.e();
                      a1 = a2;
                   }else {
                      a1 = UUID.randomUUID().toString();
                      co5.l(a1, str);
                      own6 = a3.edit();
                      own6.c(n61.c, a1);
                      own6.c(n61.d, "LOGGED_IN");
                      own6.e();
                   }
                }
             }else {
                tc.getClass();
                a1 = UUID.randomUUID().toString();
                co5.l(a1, str);
                own6 = tc.a.edit();
                own6.c(n61.c, a1);
                own6.c(n61.d, tb.a);
                own6.e();
             }
             return a1;
             break;
           case 3:
             kb okb = tb;
             tc.getClass();
             if (!tb instanceof cl) {
                a2 = 0;
             }
             float f = (a2)? (float)ArtworkView.b(tc) / 2.00f: 0;
             return Float.valueOf(f);
             break;
           case 4:
             this.a();
             return a;
           case 5:
             this.a();
             return a;
           case 6:
             this.a();
             return a;
           default:
             return new ly3(tb, tc);
       }
    }
}
