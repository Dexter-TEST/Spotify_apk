package p.ln1;
import p.ir0;
import p.qn1;
import java.lang.Object;
import p.z4;
import java.lang.Class;
import p.i77;
import p.rv;
import p.ym6;
import java.lang.Throwable;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import p.jc7;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.et0;
import p.vk7;
import p.tk7;
import p.an1;
import androidx.fragment.app.f;
import java.lang.Boolean;
import android.view.View;
import p.sp6;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.b43;
import p.e43;
import p.au2;
import p.t63;
import com.spotify.hubs.liteintegration.HubsView;
import p.zm1;
import android.os.Bundle;
import p.a23;
import android.os.Parcelable;
import p.ju2;
import p.k23;
import p.aq6;
import p.td7;
import p.bo3;
import java.util.Set;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import p.tu2;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.jn1;
import p.qn1$b;
import p.qn1$c;
import p.cu2;
import java.util.Map;
import p.tt2;
import p.ab3;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import p.en6;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.cv2;
import p.qn1$a;
import p.gf5;
import p.pp;
import p.mn1;
import android.content.Context;
import android.content.Intent;
import p.xj0;

public final class ln1 implements ir0	// class@001d86 from classes.dex
{
    public final int a;
    public final qn1 b;

    public void ln1(qn1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       tt2 ott2;
       au2 uoau2;
       Bundle uBundle;
       String str5;
       aq6 uoaq6;
       qn1 f;
       ju2 oju2;
       boolean i = 21;
       String str = null;
       String str1 = "lite/entity/contextMenu";
       String str2 = "bundle";
       String str3 = "model";
       int i1 = 1;
       int i2 = 0;
       ln1 tb = this.b;
       switch (this.a){
           case 0:
             tb.startActivity(xj0.s(tb.getContext(), p0));
             return;
           case 1:
             tb.getClass();
             p0.a(new pp(i1), new mn1(tb, i2), new mn1(tb, i1), new mn1(tb, 2), new pp(2));
             return;
           case 2:
             tb.getClass();
             tb.v(new qn1$a(), "explicit");
             return;
           case 3:
             tb.getClass();
             if ((ott2 = p0.b.m().get(p0.a)) != null) {
                if ((uoau2 = ott2.b()) != null) {
                   str = uoau2.q("context_uri");
                }
                if (str != null) {
                   an1 a = tb.w.a;
                   a.getClass();
                   wo3 owo3 = LiteInteraction.l();
                   owo3.f("lite/entity/context-menu");
                   owo3.h(tb.b().a);
                   owo3.g(str);
                   owo3.d("hit");
                   owo3.c(en6.e(i));
                   a.a.a(owo3.build());
                }
                zm1 ozm1 = new zm1();
                uBundle = new Bundle();
                uBundle.putParcelable(str3, k23.U(p0.b));
                uBundle.putParcelable(str2, a23.W(uoau2));
                ozm1.setArguments(uBundle);
                tb.v(ozm1, str1);
             }
             return;
             break;
           case 4:
             tb.getClass();
             tb.v(new qn1$c(), "offline");
             return;
           case 5:
             tb.getClass();
             tb.v(new qn1$b(), "forced");
             return;
           case 6:
             tb.getClass();
             String str4 = "lite:inProgress";
             i = p0.b().y(str4, i2);
             boolean b = p0.b().y("lite:error", i2);
             tb.L.c.d(p0);
             if (!p0.b().y("lite:error", i2) && (!p0.b().y(str4, i2) && (uoau2 = p0.b().m("toolbarmenu")) != null)) {
                str5 = new zm1();
                Bundle uBundle1 = new Bundle();
                uBundle1.putParcelable(str2, a23.W(uoau2));
                if ((oju2 = p0.e()) != null) {
                   uBundle1.putParcelable(str3, k23.U(oju2));
                }
                str5.setArguments(uBundle1);
             }else {
                str5 = str;
             }
             tb.F = str5;
             if ((uoaq6 = td7.d(tb.b().a)) != null) {
                tb.x.getClass();
                if ((bo3.q.contains(uoaq6.b) ^ i1)) {
                   uoaq6 = 1;
                label_011a :
                   if (uoaq6) {
                      str4 = ((f = tb.F) == null)? str: f.getArguments();
                      if (str4 != null) {
                         str = str4.getParcelable(str2);
                      }
                      uBundle = (str != null && str.q("delete_uri") == null)? 1: 0;
                      if (uBundle) {
                         uBundle = 1;
                      label_0141 :
                         if (tb.F == null) {
                            i1 = 0;
                         }
                         ToolbarSide eND = ToolbarSide.END;
                         tb.H.clear(eND);
                         if (i1) {
                            tb.H.addView(eND, tb.K, R.id.action_overflow);
                         }
                         if (uBundle) {
                            tb.H.addView(eND, tb.J, R.id.action_heart);
                         }
                         if (!i && (!b && ((p0 = p0.e()) != null && !TextUtils.isEmpty(p0.y().d())))) {
                            tb.H.setTitle(p0.y().d());
                         }
                         return;
                      }
                   }
                   uBundle = 0;
                   goto label_0141 ;
                }
             }
             Bundle arguments = 0;
             goto label_011a ;
             break;
           case 7:
             boolean b1 = p0.booleanValue();
             tb.J.setSelected(b1);
             qn1 j = tb.J;
             b1 = (b1)? sp6.Q: sp6.P;
             j.setIcon(b1);
             return;
             break;
           case 8:
             tb.w.a(tb.b(), tb.b(), 12);
             return;
           case 9:
             tb.w.a(tb.b(), tb.b(), i);
             tb.v(tb.F, str1);
             return;
           case 10:
             et0.d(tb.getActivity());
             return;
           case 11:
             tb.getClass();
             if (p0.a == null) {
                if ((p0 = p0.b) == null) {
                   tb.t.c(rv.a(R.string.entity_snackbar_song_queued).l());
                }else {
                   Object[] objArray = new Object[i2];
                   Logger.c(p0, "Error queuing", objArray);
                }
             }
             return;
             break;
           default:
             tb.t.c(rv.a(R.string.entity_menu_remove_from_playlist_failed).l());
             return;
       }
    }
}
