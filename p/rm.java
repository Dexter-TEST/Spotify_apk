package p.rm;
import p.yf2;
import p.bi5;
import p.ci5;
import p.pg2;
import p.y00;
import p.e96;
import p.yg2;
import p.g10;
import p.f10;
import p.x00;
import java.lang.Object;
import p.mm0;
import p.xz5;
import p.sm0;
import p.qm0;
import java.lang.CharSequence;
import p.u01;
import p.om0;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View;
import p.vz5;
import p.pm0;
import p.wz5;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p.rm0;
import p.qz5;
import p.ht6;
import p.kt6;
import android.content.Context;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.tu6;
import p.l95;
import java.util.Map;
import p.k95;
import java.lang.Class;
import android.util.AttributeSet;
import p.hm1;
import p.bc2;
import p.n6;
import java.lang.String;
import p.x66;
import p.vu2;
import p.b96;
import p.u76;
import java.lang.Boolean;
import p.cv2;
import p.av2;
import p.i37;
import p.l51;
import p.do5;
import p.us;
import p.b01;
import p.ie0;
import p.mi;
import com.spotify.litenetwork.webapi.model.LitePlaylistsObject;
import p.u7;
import com.spotify.webapi.service.models.Pager;
import p.ko1;
import java.util.List;
import p.ys5;
import p.nq5;
import p.fu;
import p.t63;
import p.m65;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.connectiontype.InternetState;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.litenetwork.webapi.model.RecommendedTracks;
import p.r45;
import p.x7;
import p.jj5;
import p.w56;
import p.sm;
import p.m66;
import p.j66;
import p.a76;
import p.nd5;
import p.e;
import p.i;
import p.ad6;
import p.nu;
import java.lang.NullPointerException;
import p.t10;
import p.g;
import com.spotify.socialgraph.proto.SocialgraphV2$SocialGraphEntity;
import com.spotify.webapi.service.models.Image;
import p.mo;
import p.ow0;
import p.bw0;
import com.spotify.playerlimited.player.models.OfflineTracksResources;
import com.spotify.playerlimited.player.models.OfflineState;
import p.qr;
import p.yi4;
import java.lang.Long;
import com.spotify.litesettings.settings.SettingsActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.litesettings.settings.StorageLocationSettingsActivity;
import android.view.ViewGroup;
import p.o85;
import p.xj0;
import p.zk2;
import p.eo5;
import p.pi4;

public final class rm implements yf2, bi5, ci5, pg2, y00, e96, yg2, g10, f10, x00	// class@00251b from classes.dex
{
    public final int a;

    public void rm(int p0){
       this.a = p0;
       super();
    }
    public void a(Object p0,mm0 p1){
       switch (this.a){
           case 20:
             p0.setTitle(p1.d);
             p0.setSubtitle(p1.e);
             p0 = p0.h();
             int i = (p1.f != null)? 0: 4;
             p0.setVisibility(i);
             return;
             break;
           case 21:
             p0.setText(p1.d);
             p0.t.setImageDrawable(p1.e);
             return;
           case 22:
             return;
           case 23:
             p0.setTitle(p1.d);
             p0.setSubtitle(p1.e);
             p0.b.setMax(12);
             p0.c.setText(p1.i);
             p0.t.setText(p1.h);
             return;
           case 24:
             p0.setTitle(p1.d);
             p0.setSubtitle(p1.e);
             return;
           case 25:
             p0.setTitle(p1.d);
             p0.setSubtitle(p1.e);
             return;
           default:
             p0.c.setText(p1.d);
             p0.t.setText(p1.e);
             p0.v.setText(p1.f);
             Context context = p0.a.getContext();
             if (p1.g != null) {
                p0.d(tu6.r(context));
             }else if(p1.h == null){
                k95 ok95 = l95.c.get(TextView.class);
                ok95.getClass();
                View view = ok95.a(context, null, ok95.b());
                if (view instanceof TextView && !view instanceof hm1) {
                   bc2.a(view, context);
                }
                view.setText(p1.i);
                view.setTextColor(n6.b(context, R.color.glue_row_title_color_muted));
                p0.d(view);
             }
             return;
       }
    }
    public Object apply(Object p0){
       ko1 oko1;
       int i = 11;
       boolean b = false;
       switch (this.a){
           case 0:
             return p0.b.toString().trim();
           case 1:
             return new a76(p0);
           case 2:
             p0.getClass();
             return p0;
           case 3:
             return new j66();
           case 4:
             return new m66();
           case 5:
             return new x7(p0.m, p0.n, null);
           case 6:
             return r45.d(p0);
           case 7:
             return p0.b();
           case 8:
             p0.getClass();
             return p0;
           case 9:
             return p0.a;
           case 10:
             return p0.b;
           case 11:
             if (p0.connectionType().isOffline() && (p0.flightModeEnabled() && !p0.mobileDataDisabled())) {
                b = true;
             }
             return Boolean.valueOf(b);
             break;
           case 12:
             p0 = (p0.booleanValue())? Observable.timer(300, TimeUnit.MILLISECONDS, s36.b): Observable.empty();
             return p0;
             break;
           case 13:
             oko1 = new ko1(i);
             oko1.q(t63.t(p0.items));
             oko1.t = p0.next;
             return oko1.j();
           case 14:
             oko1 = new ko1(i);
             oko1.q(nq5.e(p0.items));
             oko1.t = p0.next;
             return oko1.j();
           case 15:
             return new u7(p0);
           case 16:
             return Boolean.valueOf((ie0.E.O(p0.b).isEmpty() ^ 1));
           case 17:
             return p0.b;
           case 18:
             return do5.u0(p0);
           case 19:
             return p0.b;
           case 20:
             p0.getClass();
             return p0;
           case 21:
             return p0.a;
           case 22:
             p0.getClass();
             return p0;
           case 23:
             p0.getClass();
             return p0;
           case 24:
             p0.getClass();
             return p0;
           case 25:
             return p0.a;
           case 26:
             if (!p0.b.length()) {
                b = true;
             }
             return Boolean.valueOf(b);
             break;
           case 27:
             return p0.a;
           case 28:
             return new x66(p0);
           default:
             p0.getClass();
             return p0;
       }
    }
    public Object apply(Object p0,Object p1){
       ad6 uoad6;
       switch (this.a){
           case 27:
             break;
           case 28:
             p0.getClass();
             uoad6 = new ad6(p0);
             if (p1 == null) {
                throw new NullPointerException("Null gender");
             }
             uoad6.d = p1;
             return uoad6.a();
             break;
           default:
             p0.getClass();
             uoad6 = new ad6(p0);
             uoad6.f(p1);
             return uoad6.a();
       }
       p0.getClass();
       uoad6 = new ad6(p0);
       if (p1 == null) {
          throw new NullPointerException("Null birthday");
       }
       uoad6.c = p1;
       return uoad6.a();
    }
    public boolean apply(Object p0){
       boolean b = false;
       switch (this.a){
           case 0:
             if (p0 != null && p0.g()) {
                b = true;
             }
             break;
           default:
             if (p0 != null && p0.url != null) {
                b = true;
             }
             return b;
       }
       return b;
    }
    public Object c(Object p0,Object p1,Object p2){
       ConnectionType uConnectionT;
       mo t = mo.t;
       boolean b = false;
       switch (this.a){
           case 2:
             boolean b1 = ((uConnectionT = p2.connectionType()) != ConnectionType.CONNECTION_TYPE_UNKNOWN && uConnectionT.isOffline())? false: true;
             boolean b2 = (!p2.mobileDataDisabled() && !p2.flightModeEnabled())? false: true;
             if (p0.booleanValue() || (p1.booleanValue() || !uConnectionT.isCellularNetwork())) {
                b = true;
             }
             return new qr(b1, b2, b);
             break;
           case 4:
           case 5:
             if (p1.booleanValue() == null || !p2.isCellularNetwork()) {
                t = p0;
             }
             return t;
             break;
           case 6:
             if (p0.booleanValue() || (p1.booleanValue() || !p2.isCellularNetwork())) {
                b = true;
             }
             return Boolean.valueOf(b);
             break;
           case 7:
             if (p1.booleanValue() == null || !p2.isCellularNetwork()) {
                t = p0;
             }
             return t;
             break;
           default:
             return Boolean.TRUE;
       }
       return new bw0(p0, p1, p2);
    }
    public Object h(RecyclerView p0){
       ht6 oht6;
       switch (this.a){
           case 18:
           default:
             oht6 = new ht6(xj0.x0(p0.getContext(), p0, R.layout.storage_row_muted));
             eo5.P(oht6);
             return oht6;
       }
       oht6 = new ht6(xj0.x0(p0.getContext(), p0, R.layout.storage_row));
       eo5.P(oht6);
       return oht6;
    }
    public boolean test(Object p0){
       switch (this.a){
           case 0:
           default:
             return p0.c();
       }
       return p0.booleanValue();
    }
    public boolean test(Object p0,Object p1){
       boolean b = (!(p0.a - p1.a) && (!(p0.b - p1.b) && p0.d == p1.d))? true: false;
       return b;
    }
}
