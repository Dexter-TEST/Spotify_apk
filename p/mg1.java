package p.mg1;
import p.ir0;
import java.lang.Object;
import p.l16;
import com.spotify.performance.viewloadtracking.events.proto.ViewLoadSequence;
import java.util.Iterator;
import java.util.ArrayList;
import p.r81;
import p.pi7;
import java.lang.Class;
import java.lang.String;
import com.google.protobuf.c;
import com.spotify.base.java.logging.Logger;
import p.ab3;
import p.tu1;
import java.lang.ref.WeakReference;
import p.q55;
import p.a65;
import java.lang.ref.Reference;
import p.ui7;
import p.w55;
import p.fj3;
import com.spotify.offline.NativeForegroundObserver;
import java.lang.Boolean;
import com.spotify.offline.NativeForegroundProvider;
import com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import java.util.HashSet;
import p.l83;
import p.b97;
import p.w73;
import com.spotify.messages.InAppMessageCreativeRequestEvent;
import com.google.protobuf.b;
import com.spotify.liteuser.account.LiteAccountObserver;
import p.ir6;
import p.gr6;
import p.t00;
import android.content.Context;
import android.content.Intent;
import p.xj0;
import p.gv3;
import p.ot3;
import com.spotify.liteui.login.LoginActivity;
import p.es;
import android.widget.EditText;
import java.lang.CharSequence;
import android.widget.TextView;
import p.rj2;
import p.ft0;
import p.tj;
import java.lang.Integer;
import p.wn6;
import p.tn6;
import p.co5;
import p.rn6;
import android.content.SharedPreferences$Editor;
import p.rj;
import androidx.fragment.app.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import p.qj;
import p.jp3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageView;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.rz;
import android.view.View;
import androidx.appcompat.app.a;
import p.mm6;
import p.hn7;
import android.view.View$OnClickListener;
import p.gg1;
import p.v25;
import p.bb0;
import p.qa0;
import p.u00;
import p.pa0;
import p.fs5;
import p.jc7;
import android.app.Activity;
import com.spotify.litesettings.settings.PrivateSettingsActivity;
import com.spotify.litesettings.settings.OfflineSettingsActivity;
import com.spotify.litesettings.settings.ExplicitContentSettingsActivity;
import com.spotify.litesettings.settings.ChangeOfflineModeActivity;
import com.spotify.litesettings.settings.AudioSettingsActivity;
import p.ro;
import java.util.Map;
import p.mm0;
import p.eo5;
import java.util.Set;
import java.util.Map$Entry;
import p.mo;
import p.qo;
import p.sm0;
import p.qm0;
import p.om0;
import android.content.res.Resources;
import java.util.List;
import p.lm0;
import com.spotify.litesettings.settings.AccountActivity;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import android.net.Uri;
import p.go1;
import p.n06;
import p.rz5;
import p.hv6;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Observer;

public final class mg1 implements ir0	// class@001e8b from classes.dex
{
    public final int a;
    public final Object b;

    public void mg1(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void accept(Object p0){
       mo key;
       Object[] objArray;
       PhoneNumberSignupActivity g0;
       ui7 oui7;
       mg1 tb = this.b;
       int i = 3;
       int i1 = 1;
       boolean b = false;
       switch (this.a){
           case 0:
             tb.w = p0;
             return;
           case 1:
             tb.w = p0;
             return;
           case 2:
             p0 = tb.T;
             p0.getClass();
             wo3 owo3 = LiteInteraction.l();
             owo3.f("lite/settings/account");
             owo3.h("spotify:settings:account");
             owo3.g("https://www.spotify.com/premium/?checkout=false");
             owo3.d("hit");
             owo3.c("upgrade-to-premium");
             owo3.e("upgrade_to_premium_button");
             p0.a.a(owo3.build());
             tb.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/premium/?checkout=false")));
             return;
           case 3:
             tb.getClass();
             ArrayList uArrayList = new ArrayList((p0.a.size() + 2));
             uArrayList.add(eo5.v(R.layout.audio_quality_header, b));
             Iterator iterator = p0.a.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                key = uEntry.getKey();
                uArrayList.add(new qo(tb.getString(key.a), tb.getString(key.b), uEntry.getValue().booleanValue(), key));
             }
             uArrayList.add(eo5.v(R.layout.data_warning, b));
             uArrayList.add(eo5.v(R.layout.divider, b));
             sm0 v6 = new sm0(999, 2, tb.getString(R.string.settings_audio_quality_data_saver), tb.getString(R.string.settings_audio_quality_data_saver_subtitle), p0.b);
             uArrayList.add(v6);
             if (tb.V != null) {
                uArrayList.add(eo5.v(R.layout.divider, b));
                qm0 oqm0 = new qm0(i, tb.getString(R.string.settings_equalizer));
                oqm0.e = tb.getString(R.string.settings_equalizer_description);
                uArrayList.add(oqm0);
             }
             uArrayList.add(eo5.v(R.layout.divider, b));
             objArray = new Object[i1];
             objArray[b] = Integer.valueOf(12);
             om0 i2 = new om0(tb.getString(R.string.settings_audio_quality_crossfade_title), tb.getString(R.string.settings_audio_quality_crossfade_subtitle), (p0.c / 1000), tb.getString(R.string.settings_audio_quality_crossfade_off), tb.getResources().getQuantityString(R.plurals.settings_audio_quality_crossfade_time_seconds, 12, objArray));
             uArrayList.add(i);
             uArrayList.add(eo5.v(R.layout.divider, b));
             sm0 i3 = new sm0(998, 5, tb.getString(R.string.settings_gapless_playback), tb.getString(R.string.settings_gapless_playback_subtitle), p0.d);
             uArrayList.add(i);
             uArrayList.add(eo5.v(R.layout.divider, b));
             i3 = new sm0(997, 6, tb.getString(R.string.settings_automix), tb.getString(R.string.settings_automix_subtitle), p0.e);
             uArrayList.add(i);
             uArrayList.add(eo5.v(R.layout.divider, b));
             sm0 i4 = new sm0(996, 7, tb.getString(R.string.settings_normalize_volume), tb.getString(R.string.settings_normalize_volume_subtitle), p0.f);
             uArrayList.add(i);
             tb.T.A(uArrayList);
             return;
             break;
           case 4:
             tb.finish();
             return;
           case 5:
             tb.finish();
             return;
           case 6:
             tb.finish();
             return;
           case 7:
             tb.finish();
             return;
           case 8:
             tb.finish();
             return;
           case 9:
             tb.accept(p0.a, p0.b);
             return;
           case 10:
             tb.setPhoneNumber(p0.a);
             return;
           case 11:
             tb.accept(p0.a);
             return;
           case 12:
             if ((g0 = tb.g0) != null) {
                g0.a(i);
             }
             objArray = new Object[i1];
             objArray[b] = p0;
             mm6 omm6 = mm6.f(0xea60, tb.findViewById(R.id.content), tb.getString(R.string.otp_paste_copied_code, objArray));
             tb.g0 = omm6;
             omm6.g(omm6.b.getText(R.string.otp_button_paste), new hn7(tb, i, p0));
             tb.U.getClass();
             gg1.g(tb.g0);
             tb.g0.i();
             return;
             break;
           case 13:
             p0 = tb.getChildFragmentManager();
             p0.getClass();
             a uoa = new a(p0);
             uoa.g(b, new qj(), qj.class.getSimpleName(), i1);
             uoa.e(b);
             p0 = tb.b;
             p0.getClass();
             jp3 ojp3 = LitePageView.i();
             ojp3.d("enter");
             ojp3.c("lite/app-rater");
             ojp3.e("spotify:app-rater");
             p0.a.a(ojp3.build());
             p0 = tb.c.w.edit();
             p0.a(tj.y, i1);
             p0.e();
             return;
           case 14:
             wn6 own6 = tb.w.edit();
             rn6 a = tj.A;
             own6.getClass();
             co5.o(a, "key");
             own6.a.putInt(a.a, p0.intValue());
             own6.g(4);
             own6.e();
             return;
           case 15:
             tb.b(p0);
             return;
           case 16:
             tb.T.d.setText(p0.A);
             return;
           case 17:
             tb.getClass();
             p0 = new Object[b];
             Logger.i("User logged out, relaunching application", p0);
             tb.b.onNext(new gr6());
             p0 = tb.c;
             p0.startActivity(xj0.r(p0));
             return;
           case 18:
             tb.getClass();
             w73 ow73 = InAppMessageCreativeRequestEvent.g();
             ow73.c(p0.F);
             p0 = ow73.build();
             tb.a.a(p0);
             return;
           case 20:
             tb.getClass();
             DisplayOrchestrator c = tb.c;
             if (p0.booleanValue()) {
                c.add("ADS_STATE_PAUSE_REASON");
             }else {
                c.remove("ADS_STATE_PAUSE_REASON");
             }
             return;
             break;
           case 21:
             NativeForegroundProvider.a(tb, p0);
             return;
           case 22:
             if (p0 instanceof a65 && (oui7 = tb.get()) != null) {
                _monitor_enter(oui7);
                oui7.f = p0.a.a;
                _monitor_exit(oui7);
             }
             return;
             break;
           case 23:
             Iterator iterator1 = tb.c.iterator();
             while (iterator1.hasNext()) {
                r81 or81 = iterator1.next();
                or81.getClass();
                Object[] objArray1 = new Object[i1];
                objArray1[b] = p0.toString();
                Logger.e("Received view load timer message: %s", objArray1);
                or81.a.a.a(p0);
             }
             return;
             break;
           default:
             tb.onError(p0);
             return;
       }
    }
}
