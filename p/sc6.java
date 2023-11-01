package p.sc6;
import p.ir0;
import com.spotify.litesettings.settings.SettingsActivity;
import java.lang.Object;
import p.yi4;
import java.lang.Class;
import p.p80;
import p.xj0;
import androidx.appcompat.app.a;
import java.lang.String;
import android.content.Context;
import p.qm0;
import p.lm0;
import p.yq5;
import p.mm0;
import p.wk7;
import p.an1;
import android.content.Intent;
import p.ab3;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.content.ComponentName;
import com.spotify.litesettings.settings.InAppMessagingDebugActivity;
import p.so0;
import p.ae2;
import androidx.fragment.app.k;
import androidx.fragment.app.o;
import androidx.fragment.app.f;
import java.lang.Boolean;
import java.util.ArrayList;
import p.zq5;
import p.fj3;
import java.lang.Throwable;
import p.yk5;
import p.u65;
import p.mo;
import java.lang.Long;
import android.text.format.Formatter;

public final class sc6 implements ir0	// class@002602 from classes.dex
{
    public final int a;
    public final SettingsActivity b;

    public void sc6(SettingsActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       int i3;
       SettingsActivity n0;
       sc6 tb = this.b;
       int i = -1;
       int i1 = 0;
       int i2 = 1;
       switch (this.a){
           case 0:
             tb.getClass();
             SettingsActivity z = tb.Z;
             if (p0.b.booleanValue()) {
                Object[] objArray = new Object[i2];
                objArray[i1] = tb.getString(p0.a.a);
                tb.j0.e = tb.getString(R.string.settings_audio_quality_subtitle, objArray);
                if ((i3 = z.x(tb.j0)) != i) {
                   z.h(i3);
                }else {
                   z.w(tb.i0, tb.j0);
                   z.a.d(z.x(tb.i0), z.d(), null);
                }
             }else if((i3 = z.x(tb.j0)) != i){
                z.v.remove(tb.j0);
                z.a.f(i3, i2);
             }
             return;
             break;
           case 1:
             n0 = tb.n0;
             i3 = (p0.booleanValue())? 0x7f120346: 0x7f120350;
             n0.e = tb.getString(i3);
             n0 = tb.Z;
             n0.h(n0.x(tb.n0));
             return;
             break;
           case 2:
             n0 = tb.l0;
             p0 = (p0 == yk5.a)? tb.getString(R.string.settings_account_description_premium): tb.getString(R.string.settings_account_description_free);
             n0.e = p0;
             n0 = tb.Z;
             n0.h(n0.x(tb.l0));
             return;
             break;
           case 3:
             n0 = tb.k0;
             p0 = (p0.booleanValue())? tb.getString(R.string.settings_explicit_content_disallowed): tb.getString(R.string.settings_explicit_content_allowed);
             n0.e = p0;
             n0 = tb.Z;
             n0.h(n0.x(tb.k0));
             return;
             break;
           case 4:
             tb.b0.e();
             return;
           case 5:
             p0 = tb.b0;
             _monitor_enter(p0);
             p0.b();
             _monitor_exit(p0);
             return;
           case 6:
             tb.getClass();
             if (!p0.booleanValue()) {
                n0 = tb.Z;
                if ((i3 = n0.x(tb.o0)) != i) {
                   n0.v.remove(tb.o0);
                   n0.a.f(i3, i2);
                }
             }
             return;
             break;
           case 7:
             tb.S.b(wk7.C, 17, "logout_button");
             so0.C(R.id.confirm_log_out, R.string.settings_logout_confirmation_title, R.string.settings_logout_confirmation_description, R.string.settings_logout_confirmation_positive_button, R.string.settings_logout_confirmation_negative_button).B(tb.y(), String.valueOf(R.id.confirm_log_out));
             return;
           case 8:
             i = 19;
             if (p0 == tb.h0) {
                tb.S.b(wk7.K, i, "cellular_settings_button");
                tb.startActivity(xj0.z0(tb, "spotify.intent.action.CELLULAR_SETTINGS"));
             }else if(p0 == tb.i0){
                tb.S.b(wk7.P, i, "storage_settings_button");
                tb.startActivity(xj0.z0(tb, "spotify.intent.action.STORAGE_SETTINGS"));
             }else if(p0 == tb.j0){
                tb.S.b(wk7.J, i, "audio_settings_button");
                tb.startActivity(xj0.z0(tb, "spotify.intent.action.AUDIO_SETTINGS"));
             }else if(p0 == tb.p0){
                tb.S.b(wk7.O, i, "private_settings_button");
                tb.startActivity(xj0.z0(tb, "spotify.intent.action.PRIVATE_SETTINGS"));
             }else if(p0 == tb.k0){
                tb.S.b(wk7.L, i, "explicit_settings_button");
                tb.startActivity(xj0.z0(tb, "spotify.intent.action.EXPLICIT_CONTENT_SETTINGS"));
             }else if(p0 == tb.n0){
                tb.S.b(wk7.M, i, "offline_settings_button");
                tb.startActivity(xj0.z0(tb, "spotify.intent.action.OFFLINE_SETTINGS"));
             }else if(p0 == tb.m0){
                tb.S.b(wk7.H, i, "about_settings_button");
                tb.startActivity(xj0.z0(tb, "spotify.intent.action.SETTINGS_ABOUT"));
             }else if(p0 == tb.l0){
                tb.S.b(wk7.I, i, "account_settings_button");
                tb.startActivity(xj0.z0(tb, "spotify.intent.action.ACCOUNT_SETTINGS"));
             }else if(p0 == tb.d0){
                p0 = tb.S.a;
                p0.getClass();
                wo3 owo3 = LiteInteraction.l();
                owo3.f("lite/settings");
                owo3.h("spotify:settings");
                owo3.g("market://details?id=com.spotify.music");
                owo3.d("hit");
                owo3.c("navigate-forward");
                owo3.e("spotify_music_button");
                p0.a.a(owo3.build());
                if ((p0 = tb.getPackageManager().getLaunchIntentForPackage("com.spotify.music")) == null) {
                   p0 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.spotify.music"));
                }
                tb.startActivity(p0);
             }else if(p0 == tb.g0){
                try{
                   Object[] objArray1 = new Object[]{"T024FA1UX","CACL1NMSR"};
                   p0 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("slack://channel?team=%s&id=%s", objArray1)));
                   if (p0.resolveActivity(tb.getPackageManager()) == null) {
                      p0 = new Intent("android.intent.action.VIEW", Uri.parse("https://spotify.slack.com/messages/CACL1NMSR"));
                   }
                   p0.addFlags(0x10000000);
                   tb.startActivity(p0);
                }catch(java.lang.RuntimeException e0){
                }
             }else if(p0 == tb.f0){
                tb.startActivity(new Intent("com.spotify.lite.debug.DEBUG_SETTINGS"));
             }else if(p0 == tb.o0){
                tb.startActivity(new Intent(tb, InAppMessagingDebugActivity.class));
             }
             return;
             break;
           case 9:
             tb.getClass();
             long l = p0.a + p0.b;
             Object[] objArray2 = new Object[i2];
             objArray2[i1] = xj0.s0(tb, l, xj0.r0(l));
             p0.e = tb.getString(R.string.settings_cellular_description, objArray2);
             n0 = tb.Z;
             n0.h(n0.x(tb.h0));
             return;
           default:
             Object[] objArray3 = new Object[i2];
             objArray3[i1] = Formatter.formatShortFileSize(tb, p0.longValue());
             tb.i0.e = tb.getString(R.string.settings_storage_description, objArray3);
             n0 = tb.Z;
             n0.h(n0.x(tb.i0));
             return;
       }
    }
}
