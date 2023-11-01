package p.u44;
import p.b74;
import p.vr0;
import p.pl5;
import p.l4;
import p.t16;
import p.rb0;
import p.bu0;
import p.es7;
import p.so5;
import p.nr6;
import p.ae1;
import java.lang.Object;
import android.os.Bundle;
import p.fn0;
import p.ag1;
import java.util.HashMap;
import android.os.Build$VERSION;
import p.b4;
import p.a4;
import android.support.v4.media.MediaMetadataCompat;
import p.or7;
import android.view.ContentInfo;
import java.lang.Class;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p.qo5;
import java.lang.String;
import p.co5;
import p.uw5;
import java.util.Set;
import android.view.View;
import android.view.ViewParent;
import p.rz;
import org.json.JSONObject;
import p.uc6;
import p.yy6;
import p.vj;
import p.vh4;
import p.x12;
import java.lang.System;
import java.util.Locale;
import android.graphics.Bitmap;
import p.wh6;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import p.tp2;
import android.os.Parcelable;
import android.os.BaseBundle;
import java.lang.CharSequence;
import java.nio.Buffer;
import p.e64;
import p.jg;
import p.ev6;
import p.w5;
import android.content.ClipData;
import p.rr0;
import androidx.viewpager2.widget.ViewPager2;
import p.uj7;
import p.lx;
import java.util.Map;
import p.v10;
import android.graphics.Canvas;
import p.j07;
import p.i77;
import p.wr;
import android.util.Log;
import p.tz0;
import java.lang.Exception;
import java.lang.Boolean;
import p.do5;
import p.ir2;
import androidx.profileinstaller.ProfileInstallReceiver;
import android.content.BroadcastReceiver;
import android.database.sqlite.SQLiteDatabase;
import p.u16;
import android.view.Window$Callback;
import android.view.Menu;
import android.graphics.Typeface;
import p.pi0;
import p.sb0;
import p.bv5;
import p.cx5;
import p.c90;
import p.zu5;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.StringBuilder;
import java.io.File;
import p.fu1;
import p.xt1;
import com.spotify.eventsender.FragmentsContainer;
import p.hs3;
import java.lang.Throwable;
import p.i80;
import p.h80;
import p.bc3;
import java.lang.Iterable;
import p.ab2;
import p.rp;
import p.jg2;
import p.y3;
import p.d3;
import p.yb6;
import java.util.Collection;
import java.util.Iterator;
import android.content.Context;
import p.sz1;
import p.vn;
import p.mj7;
import p.aj;
import p.b3;

public class u44 implements b74, vr0, pl5, l4, t16, rb0, bu0, es7, so5, nr6, ae1	// class@00283e from classes.dex
{
    public final int a;
    public final Object b;

    public void u44(int p0){
       this.a = p0;
       if (p0 != 6) {
          if (p0 != 11) {
             if (p0 != 23) {
                if (p0 != 24) {
                   super();
                   this.b = new Bundle();
                   return;
                }else {
                   super();
                   this.b = new fn0();
                   return;
                }
             }else {
                super();
                this.b = new ag1(0);
                return;
             }
          }else {
             super();
             this.b = new HashMap();
             return;
          }
       }else {
          super();
          this.b = (Build$VERSION.SDK_INT >= 26)? new b4(this): new a4(this);
          return;
       }
    }
    public void u44(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void u44(MediaMetadataCompat p0){
       this.a = 0;
       super();
       Bundle uBundle = new Bundle(p0.a);
       this.b = uBundle;
       or7.f(uBundle);
    }
    public void u44(ContentInfo p0){
       this.a = 5;
       super();
       p0.getClass();
       this.b = p0;
    }
    public void u44(StateListAnimatorButton p0){
       this.a = 28;
       super(28, p0);
    }
    public void u44(ByteBuffer p0){
       this.a = 7;
       super();
       this.b = p0;
       p0.order(ByteOrder.BIG_ENDIAN);
    }
    public void u44(qo5 p0){
       this.a = 26;
       co5.o(p0, "rateLimiterReportsDao");
       super();
       this.b = p0;
    }
    public void u44(uw5 p0){
       this.a = 4;
       super();
       this.b = p0;
    }
    public synchronized final Set A(){
       Set set = this.b.keySet();
       co5.l(set, "stateMap.keys");
       return set;
    }
    public final void B(View p0){
       if (p0.getParent() != null) {
          p0.setVisibility(8);
       }
       this.b.a(0);
       return;
    }
    public final uc6 C(JSONObject p0){
       JSONObject jSONObject1;
       vj v26;
       x12 ox12;
       long l1;
       String str7;
       long l3;
       JSONObject jSONObject = p0;
       String str = "settings_version";
       yy6 oyy6 = (jSONObject.getInt(str) != 3)? new yy6(15): new yy6(16);
       u44 b = this.b;
       String str1 = "expires_at";
       String str2 = "collect_reports";
       int i = 4;
       int i1 = 8;
       String str3 = "status";
       String str4 = "app";
       int i2 = 3600;
       String str5 = "cache_duration";
       int i3 = 0;
       switch (oyy6.a){
           case 15:
             jSONObject.optInt(str, i3);
             jSONObject1 = jSONObject.getJSONObject(str4);
             v26 = new vj(jSONObject1.getString(str3), jSONObject1.getString("url"), jSONObject1.getString("reports_url"), jSONObject1.getString("ndk_reports_url"), null, jSONObject1.optBoolean("update_required", i3), 0, 0);
             vh4 ovh4 = new vh4(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", i1), i);
             ox12 = new x12(jSONObject.getJSONObject("features").optBoolean(str2, true));
             long l = (long)jSONObject.optInt(str5, i2);
             if (jSONObject.has(str1)) {
                l1 = jSONObject.optLong(str1);
             }else {
                b.getClass();
                l1 = (l * 1000) + System.currentTimeMillis();
             }
             uc6 jSONObject2 = new uc6(l1, v26, ovh4, ox12);
             break;
           default:
             jSONObject.optInt(str, i3);
             int i4 = jSONObject.optInt(str5, i2);
             jSONObject1 = jSONObject.getJSONObject("fabric");
             JSONObject jSONObject3 = jSONObject.getJSONObject(str4);
             str5 = jSONObject3.getString(str3);
             str4 = jSONObject1.getString("bundle_id");
             String str6 = jSONObject1.getString("org_id");
             if ("new".equals(str5)) {
                str7 = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
                i = 1;
             }else {
                i = 1;
                Object[] objArray1 = new Object[i];
                objArray1[i3] = str4;
                str7 = String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", objArray1);
             }
             Locale uS = Locale.US;
             Object[] objArray = new Object[i];
             objArray[i3] = str4;
             String str8 = String.format(uS, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", objArray);
             objArray = new Object[i];
             objArray[i3] = str4;
             String str9 = String.format(uS, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", objArray);
             v26 = new vj(str5, str7, str8, str9, str6, jSONObject3.optBoolean("update_required", i3), jSONObject3.optInt("report_upload_variant", i3), jSONObject3.optInt("native_report_upload_variant", i3));
             vh4 ovh41 = new vh4(8, 4);
             ox12 = new x12(jSONObject.getJSONObject("features").optBoolean(str2, true));
             long l2 = (long)i4;
             if (jSONObject.has(str1)) {
                l3 = jSONObject.optLong(str1);
             }else {
                b.getClass();
                l3 = (l2 * 1000) + System.currentTimeMillis();
             }
             uc6 jSONObject4 = new uc6(l3, v30, ovh41, ox12);
       }
       return jSONObject;
    }
    public boolean D(int p0,int p1,Bundle p2){
       return false;
    }
    public final void E(String p0,Bitmap p1){
       pk t = MediaMetadataCompat.t;
       if (t.containsKey(p0) && t.getOrDefault(p0, null).intValue() != 2) {
          throw new IllegalArgumentException(tp2.m("The ", p0, " key cannot be used to put a Bitmap"));
       }
       this.b.putParcelable(p0, p1);
       return;
    }
    public final void F(String p0,long p1){
       pk t = MediaMetadataCompat.t;
       if (t.containsKey(p0) && t.getOrDefault(p0, null).intValue()) {
          throw new IllegalArgumentException(tp2.m("The ", p0, " key cannot be used to put a long"));
       }
       this.b.putLong(p0, p1);
       return;
    }
    public final void G(String p0,String p1){
       pk t = MediaMetadataCompat.t;
       if (t.containsKey(p0) && t.getOrDefault(p0, null).intValue() != 1) {
          throw new IllegalArgumentException(tp2.m("The ", p0, " key cannot be used to put a String"));
       }
       this.b.putCharSequence(p0, p1);
       return;
    }
    public final long H(){
       return ((long)this.b.getInt() & 0xffffffff);
    }
    public final void I(int p0){
       u44 tb = this.b;
       u44 ou44 = tb;
       ou44.position((tb.position() + p0));
    }
    public final float a(){
       return StateListAnimatorButton.b(this.b);
    }
    public final void b(e64 p0,boolean p1){
       w5 v;
       u44 tb = this.b;
       switch (this.a){
           case 1:
           default:
             if (p0 instanceof ev6) {
                p0.k().c(false);
             }
             if ((v = tb.v) != null) {
                v.b(p0, p1);
             }
             return;
       }
       tb.r(p0);
       return;
    }
    public final ClipData c(){
       return rr0.d(this.b);
    }
    public final boolean d(View p0){
       int i = p0.getCurrentItem() + 1;
       uj7 w = this.b.w;
       if (w.I != null) {
          w.c(i, 1);
       }
       return 1;
    }
    public final v10 e(String p0,lx p1,int p2,int p3,Map p4){
       if (p1 == lx.B) {
          return this.b.e("0".concat(String.valueOf(p0)), lx.x, p2, p3, p4);
       }
       throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(p1)));
    }
    public final void f(float p0){
       StateListAnimatorButton.f(this.b, p0);
    }
    public final void g(Canvas p0){
       StateListAnimatorButton.i(this.b, p0);
    }
    public final int getFlags(){
       return rr0.c(this.b);
    }
    public final void h(float p0){
       StateListAnimatorButton.g(this.b, p0);
    }
    public final void i(){
    }
    public final Object j(j07 p0){
       boolean b;
       switch (this.a){
           case 19:
           default:
             u44 tb = this.b;
             tb.getClass();
             if (p0.f()) {
                wr owr = p0.e();
                Log.isLoggable("FirebaseCrashlytics", 3);
                tb.b.b(owr.b);
                b = true;
             }else {
                p0.d();
                Log.isLoggable("FirebaseCrashlytics", 3);
                b = false;
             }
             return Boolean.valueOf(b);
       }
       return null;
    }
    public final ContentInfo k(){
       return this.b;
    }
    public final void l(int p0,Object p1){
       do5.z.l(p0, p1);
       this.b.setResultCode(p0);
    }
    public final int m(){
       return rr0.o(this.b);
    }
    public final float n(){
       return StateListAnimatorButton.c(this.b);
    }
    public final Object o(){
       this.b.beginTransaction();
       return null;
    }
    public final boolean p(e64 p0){
       Window$Callback uCallback;
       boolean b;
       w5 v;
       u44 tb = this.b;
       switch (this.a){
           case 1:
             if ((uCallback = tb.B()) != null) {
                uCallback.onMenuOpened(108, p0);
             }
             break;
           default:
             if (p0 != tb.c) {
                p0.A.getClass();
                if ((v = tb.v) != null) {
                   b = v.p(p0);
                label_0030 :
                   return b;
                }
             }
             b = false;
             goto label_0030 ;
       }
       return true;
    }
    public final void q(Typeface p0){
       u44 tb = this.b;
       pi0 b = tb.B;
       boolean b1 = true;
       if (b != null) {
          b.o = b1;
       }
       if (tb.x != p0) {
          tb.x = p0;
       }else {
          b1 = false;
       }
       if (b1) {
          tb.i(false);
       }
       return;
    }
    public final cx5 r(bv5 p0){
       zu5 ozu5;
       u44 tb = this.b;
       if (p0.a().j == null && p0.a().a == null) {
          return tb.r(p0);
       }
       return tb.r(p0);
    }
    public final void s(Disposable p0){
       co5.o(p0, "disposable");
       this.b.c(p0);
    }
    public final void t(){
       this.b.e();
    }
    public final String toString(){
       u44 tb = this.b;
       switch (this.a){
           case 5:
             return "ContentInfoCompat{"+tb+"}";
           case 18:
             return "Files.asByteSource\("+tb+"\)";
           default:
             return super.toString();
       }
    }
    public final xt1 u(fu1 p0){
       FragmentsContainer uFragmentsCo = FragmentsContainer.h();
       try{
          uFragmentsCo = FragmentsContainer.k(p0.f);
       }catch(p.rc3 e1){
          this.b.c("Error in parsing contexts.", e1);
       }
       fu1 d = p0.d;
       h80 oh80 = i80.c(d, 0, d.length);
       xt1 v9 = new xt1(p0.a, p0.c, oh80, p0.e, ab2.b(uFragmentsCo.i()).m(new rp(6)));
       return v9;
    }
    public y3 v(int p0){
       return null;
    }
    public y3 w(int p0){
       return null;
    }
    public synchronized final yb6 x(d3 p0){
       co5.o(p0, "accessTokenAppIdPair");
       return this.b.get(p0);
    }
    public synchronized final int y(){
       Iterator iterator = this.b.values().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + iterator.next().b();
       }
       return i;
    }
    public synchronized final yb6 z(d3 p0){
       yb6 oyb6;
       vn ovn;
       if ((oyb6 = this.b.get(p0)) == null) {
          Context uContext = sz1.a();
          if ((ovn = mj7.d(uContext)) != null) {
             oyb6 = new yb6(ovn, aj.b.n(uContext));
          }
       }
       if (oyb6 == null) {
          return null;
       }else {
          this.b.put(p0, oyb6);
          return oyb6;
       }
    }
}
